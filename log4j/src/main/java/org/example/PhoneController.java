package org.example;

import org.apache.log4j.Logger;

public class PhoneController {
    private PhoneService phoneService = new PhoneService();
    private Logger logger = Logger.getLogger(PhoneController.class);

    public void checkPhoneNumber(Phone phone) {
        logger.debug(String.format("checkPhoneNumber. Checking number = '%d' for id = '%d'", phone.getNumber(), phone.getId()));
        if (phone.getNumber() == null) {
            logger.error(String.format("checkPhoneNumber. Phone number is null for phone with id = {%d}", phone.getId()));
        } else {
            phoneService.checkPhoneNumber(phone.getNumber());
        }
    }
}

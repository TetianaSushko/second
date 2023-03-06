package org.example;

import org.apache.log4j.Logger;

public class PhoneService {
    private Logger logger = Logger.getLogger(PhoneService.class);
    public void checkPhoneNumber(Integer number) {
        logger.debug(String.format("checkPhoneNumber. Phone number for validation: %d", number));
        //some logic...
    }
}
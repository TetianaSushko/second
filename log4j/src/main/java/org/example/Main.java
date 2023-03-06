import org.example.Phone;
import org.example.PhoneController;

public class Main {
    public static void main(String[] args) {

        PhoneController phoneController = new PhoneController();
        Phone mobile = new Phone(1, "home", null);
        phoneController.checkPhoneNumber(mobile);
    }
}
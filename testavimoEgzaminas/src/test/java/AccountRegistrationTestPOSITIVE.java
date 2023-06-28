import org.junit.jupiter.api.Test;

import java.util.UUID;

public class AccountRegistrationTestPOSITIVE extends BaseTest{

    @Test

    void positiveRegistrationTest(){

        AccountRegistration accountRegistration = new AccountRegistration(driver);

        String username = "user" + UUID.randomUUID().toString().substring(0, 8);
        String password = "password123";

        accountRegistration.clickRegister();
        accountRegistration.setUsernameField(username);
        accountRegistration.setPassword(password);
        accountRegistration.setConfirmPassword(password);
        accountRegistration.submitForm();
    }
}

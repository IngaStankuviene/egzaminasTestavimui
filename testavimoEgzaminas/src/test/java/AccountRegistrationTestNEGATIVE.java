import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class AccountRegistrationTestNEGATIVE extends BaseTest {
    @Test
    void negativeRegistrationTest() {
        AccountRegistration accountRegistration = new AccountRegistration(driver);

        String username = "user" + UUID.randomUUID().toString().substring(0, 8);
        String password = "pass123";
        String confirmPassword = "pass456";

        accountRegistration.clickRegister();
        accountRegistration.setUsernameField(username);
        accountRegistration.setPassword(password);
        accountRegistration.setConfirmPassword(confirmPassword);
        accountRegistration.submitForm();

        /// Patikriname, ar rodoma klaida dėl netinkamų duomenų
        String errorText = accountRegistration.getErrorText();
        String expectedError = "Įvesti slaptažodžiai nesutampa";
        Assertions.assertEquals(expectedError, errorText, "Įvesti slaptažodžiai nesutampa");
    }
}

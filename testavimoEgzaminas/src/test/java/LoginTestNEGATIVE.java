import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTestNEGATIVE extends BaseTest{
    @Test
    void loginWithInvalidPassword() {
        LoginPage accountLoginPage = new LoginPage(driver);

        accountLoginPage.setInputUserName("Test");
        accountLoginPage.setInputPassword("invalid_password");
        accountLoginPage.setClickSubmitButton();

        // Patikriname, ar gauta klaida dėl neteisingo slaptažodžio
        String errorMessage = accountLoginPage.getErrorText();
        String expectedErrorMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        Assertions.assertEquals(expectedErrorMessage, errorMessage, "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi");
    }

}

import org.junit.jupiter.api.Test;

public class LoginTestPOSITIVE extends BaseTest{

    @Test

    void login(){
        LoginPage accountLoginPage = new LoginPage(driver);

        accountLoginPage.setInputUserName("Test");
        accountLoginPage.setInputPassword("123");
        accountLoginPage.setClickSubmitButton();
    }
}

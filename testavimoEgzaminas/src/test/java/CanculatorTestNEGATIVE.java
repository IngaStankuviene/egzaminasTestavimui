import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanculatorTestNEGATIVE extends BaseTest {
    @Test
    void performInvalidCalculation() {
        LoginPage accountLoginPage = new LoginPage(driver);
        CanculatorHomePage calculatorPage = new CanculatorHomePage(driver);

        int firstNumber = 5;
        int secondNumber = 0;
        String operation = "Dalyba";

        accountLoginPage.setInputUserName("Test");
        accountLoginPage.setInputPassword("123");
        accountLoginPage.setClickSubmitButton();

        calculatorPage.setInputFirstNumber(firstNumber);
        calculatorPage.setInputSecondNumber(secondNumber);
        calculatorPage.selectOperation(operation);
        calculatorPage.setClickSubmitButton();

        // Patikriname ar gautas klaidos pranešimas
        String errorMessage = calculatorPage.getErrorText();
        String expectedErrorMessage = "Whitelabel Error Page";
        Assertions.assertEquals(expectedErrorMessage, errorMessage, "Klaidos pranešimas neatitinka tikėtų rezultatų");
    }
}


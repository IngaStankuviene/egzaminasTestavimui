import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanculatorTestPOSITIVE extends BaseTest{
    @Test
    void performCalculation() {

        LoginPage accountLoginPage = new LoginPage(driver);
        CanculatorHomePage calculatorPage = new CanculatorHomePage(driver);

        int firstNumber = 5;
        int secondNumber = 3;
        String operation = "Sudėtis";

        accountLoginPage.setInputUserName("Test");
        accountLoginPage.setInputPassword("123");
        accountLoginPage.setClickSubmitButton();

        calculatorPage.setInputFirstNumber(firstNumber);
        calculatorPage.setInputSecondNumber(secondNumber);
        calculatorPage.selectOperation(operation);
        calculatorPage.setClickSubmitButton();

        // Čia patikriname rezultatą arba kito skaičiavimo rezultatus
        // Assertions.assertEquals(expectedResult, actualResult);

        // Patikriname ar atsirado naujas įrašas
        boolean isNewRecordDisplayed = calculatorPage.isNewRecordDisplayed();
        Assertions.assertTrue(isNewRecordDisplayed, "Naujas įrašas yra matomas");
    }
}

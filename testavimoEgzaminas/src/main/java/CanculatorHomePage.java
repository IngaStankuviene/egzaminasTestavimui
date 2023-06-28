import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CanculatorHomePage extends PageObject {
    @FindBy(id = "sk1")
    private WebElement inputFirstNumber;
    @FindBy(id = "sk2")
    private WebElement inputSecondNumber;
    @FindBy(xpath = "//*[@id=\"number\"]/select")
    private WebElement selectOperation;
    @FindBy(xpath = "//*[@id=\"number\"]/input[3]")
    private WebElement clickSubmitButton;

    @FindBy(xpath = "/html/body/h4")
    private WebElement newRecord;

    @FindBy(xpath = "/html/body/h1")
    private WebElement errorText;

    public CanculatorHomePage(WebDriver driver) {super(driver);}
    public void setInputFirstNumber(int firstNumber) {inputFirstNumber.sendKeys(String.valueOf(firstNumber));}
    public void setInputSecondNumber(int secondNumber) {inputSecondNumber.sendKeys(String.valueOf(secondNumber));}
    public void selectOperation(String operation) {
        Select operationDropdown = new Select(selectOperation);
        operationDropdown.selectByVisibleText(operation);
    }
    public void setClickSubmitButton() {
        clickSubmitButton.click();
    }
    public boolean isNewRecordDisplayed() { return newRecord.isDisplayed();}
    public String getErrorText() { return errorText.getText();}
}



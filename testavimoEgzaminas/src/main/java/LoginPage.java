import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    @FindBy(xpath = "/html/body/div/form/div/input[1]")
    private WebElement inputUserName;
    @FindBy(xpath = "/html/body/div/form/div/input[2]")
    private WebElement inputPassword;
    @FindBy(xpath = "/html/body/div/form/div/button")
    private WebElement clickSubmitButton;
    @FindBy (xpath ="/html/body/div/form/div/span[2]")
    private WebElement errorText;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setInputUserName(String userName) {
        inputUserName.sendKeys(userName);
    }
    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }
    public void setClickSubmitButton() { clickSubmitButton.click(); }

    public String getErrorText() {
        return errorText.getText();
    }
}

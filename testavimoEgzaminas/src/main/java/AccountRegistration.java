import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends PageObject {

    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    private WebElement clickRegister;
    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "passwordConfirm")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    private WebElement submitButton;
    @FindBy (id ="passwordConfirm.errors")
    private WebElement errorText;

    public AccountRegistration(WebDriver driver) {
        super(driver);
    }

    public void clickRegister(){
        clickRegister.click();
    }

    public void setUsernameField(String username) {
        usernameField.sendKeys(username);
    }

    public void setPassword(String password) { passwordField.sendKeys(password); }

    public void setConfirmPassword(String confirmPassword) { confirmPasswordField.sendKeys(confirmPassword);}

    public void submitForm() {
        submitButton.click();
    }

    public String getErrorText() {
        return errorText.getText();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
    @FindBy(xpath = "//button[@data-testid='enter-mail-primary']")
    private WebElement buttonLogInToAccount;
    @FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    private WebElement iframe;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement fieldLogin;
    @FindBy(xpath = "//button[@data-test-id='next-button']")
    private WebElement buttonGoToPassword;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private WebElement buttonSubmit;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickButtonLogInToAccount() {
        buttonLogInToAccount.click();
        return this;
    }

    public LoginPage goToFrame() {
        driver.switchTo().frame(iframe);
        return this;
    }

    public LoginPage fillFieldLogin(String login) {
        fieldLogin.sendKeys(login);
        return this;
    }

    public LoginPage clickButtonGoToPassword() {
        buttonGoToPassword.click();
        return this;
    }

    public LoginPage fillFieldPassword(String password) {
        fieldPassword.sendKeys(password);
        return this;
    }

    public LoginPage clickButtonSubmit() {
        buttonSubmit.click();
        return this;
    }

    public LoginPage goToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }

}

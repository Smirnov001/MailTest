package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SendMessagePage extends BasePage {
    @FindBy(xpath = "//div[@data-testid='whiteline-account']")
    private WebElement userProfile;
    @FindBy(xpath = "//span[@class='compose-button__wrapper']")
    private WebElement buttonWriteMessage;
    @FindBy(xpath = "//input[@class='container--H9L5q size_s--3_M-_']")
    private WebElement fieldAddressee;
    @FindBy(xpath = "//*[@class='subject__wrapper--2mk6m']//*[@class='container--H9L5q size_s--3_M-_']")
    private WebElement fieldTopic;
    @FindBy(xpath = "//*[@role='textbox']")
    private WebElement fieldTextMessage;
    @FindBy(xpath = "//button[@data-test-id='send']")
    private WebElement buttonSendMessage;

    public SendMessagePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SendMessagePage clickButtonWriteMessage() {
        buttonWriteMessage.click();
        return this;
    }

    public SendMessagePage fillFieldAddressee(String emailAddress) {
        fieldAddressee.sendKeys(emailAddress);
        return this;
    }

    public SendMessagePage fillFieldTopic(String topic) {
        fieldTopic.sendKeys(topic);
        return this;
    }

    public SendMessagePage fillFieldTextMessage(String messageText) {
        fieldTextMessage.sendKeys(messageText);
        return this;
    }

    public SendMessagePage clickButtonSendMessage() {
        buttonSendMessage.click();
        return this;
    }

    public String getUserEmail() {
        return userProfile.getAttribute("aria-label");

    }


}


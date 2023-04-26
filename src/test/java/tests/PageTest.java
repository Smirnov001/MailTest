package tests;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SendMessagePage;


public class PageTest extends BaseTest {
    public static final String LOGIN = "number1mail82@mail.ru";
    public static final String PASSWORD = "Samo222333wr!";
    public static final String EMAIL_ADDRESS = "number1mail82@mail.ru";
    public static final String TOPIC = "Test";
    public static final String MESSAGE_TEXT = "Hello World!";

    @Test
    public void pageTest() {
        new BasePage(driver).gotoUrl();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonLogInToAccount()
                .goToFrame()
                .fillFieldLogin(LOGIN)
                .clickButtonGoToPassword()
                .fillFieldPassword(PASSWORD)
                .clickButtonSubmit()
                .goToDefaultContent();


        SendMessagePage sendMessagePage = new SendMessagePage(driver);
        Assertions.assertEquals(EMAIL_ADDRESS, sendMessagePage.getUserEmail());
        sendMessagePage.clickButtonWriteMessage()
                .fillFieldAddressee(EMAIL_ADDRESS)
                .fillFieldTopic(TOPIC)
                .fillFieldTextMessage(MESSAGE_TEXT)
                .clickButtonSendMessage();
    }
}


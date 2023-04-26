package pages;

import org.openqa.selenium.WebDriver;

import static constants.Constant.Login.url;


public class BasePage {
    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoUrl() {
        driver.get(url);
    }

}
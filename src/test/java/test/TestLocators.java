package test;

import baseWebDriver.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.loginPage.LoginPage;

import static pages.testData.Constant.PASS;
import static pages.testData.Constant.STANDART_USER;

public class TestLocators extends BaseTest {
    @Test
    public void test() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton();

        String title = driver.getTitle();
        Assertions.assertEquals("123", title);
    }
}

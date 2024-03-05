package test;

import baseWebDriver.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.loginPage.LoginPage;

import static pages.testData.Constant.*;

 class LoginTest extends BaseTest {
    @Test
     void testLogin () {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton();

        Assertions.assertEquals(driver.getCurrentUrl(), MAIN_PAGE_URL);
    }

    @Test
     void noLogin() {
        new LoginPage()
                .openLoginPage()
                .enterPassword(PASS)
                .pressLoginButton();

        Assertions.assertTrue(new LoginPage().displayedError());
    }

    @Test
     void noPassword() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .pressLoginButton();

        Assertions.assertTrue(new LoginPage().displayedError());
    }

    @Test
     void noData() {
        new LoginPage()
                .openLoginPage()
                .pressLoginButton();
        Assertions.assertTrue(new LoginPage().displayedError());
    }
}

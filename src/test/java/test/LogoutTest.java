package test;

import baseWebDriver.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.burgerMenu.BurgerMenu;
import pages.loginPage.LoginPage;
import pages.mainPage.MainPage;
import pages.mainPage.header.Header;

import static pages.testData.Constant.*;

public class LogoutTest extends BaseTest {
    /**
     * Протестувати logout з магазину
     */
    
    @Test
    void logoutSystem() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton()
                .openBurgerMenu()
                .logout();

        Assertions.assertEquals(LOGIN_PAGE_URL, driver.getCurrentUrl());
    }
}

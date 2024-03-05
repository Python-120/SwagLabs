package test;

import baseWebDriver.BaseTest;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import pages.loginPage.LoginPage;
import pages.mainPage.MainPage;

import static pages.testData.Constant.*;

class TestMainPage extends BaseTest {

    /**
     * Перевірка що всі товари відображаються
     */

    @Test
    void productsIsDisplayedOnPage() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton()
                .getCountElements();

        Assertions.assertTrue(new MainPage().getCountElements() > 0, "Товары не отображаются на странице.");
    }

    /**
     * Відсортувати товари за ціною і перевірити що вони правильно відсортовані
     */
    @Test
    void checkLowSortProduct() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton()
                .selectFilter(PRICE_LOW_TO_HIGH);

        Assertions.assertTrue(new MainPage().verifySort(), "Товары не отсортированы по цене.");
    }
}
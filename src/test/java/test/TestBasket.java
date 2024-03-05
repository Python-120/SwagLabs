package test;

import baseWebDriver.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.basket.BasketPage;
import pages.loginPage.LoginPage;

import java.util.Arrays;

import static pages.testData.Constant.*;

class TestBasket extends BaseTest {

    /**
     * Додати декілька товарів в корзину і перевірити їх відображення в корзині
     */
    @Test
     void addProduct() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton()
                .addProduct("Sauce Labs Bike Light")
                .openBasket();

        Assertions.assertEquals(false, new BasketPage().emptyBasket(), "В корзине нет товаров");
    }

    /**
     * Додати декілька товарів в корзину і перевірити їх відображення в корзині
     */

    @Test
    void addProducts() {
        new LoginPage()
                .openLoginPage()
                .enterLogin(STANDART_USER)
                .enterPassword(PASS)
                .pressLoginButton()
                .addProduct("Sauce Labs Backpack")
                .addProduct("Sauce Labs Bike Light")
                .openBasket();

        Assertions.assertEquals("Sauce Labs Backpack", new BasketPage().productInBasket(0));
        Assertions.assertEquals("Sauce Labs Bike Light", new BasketPage().productInBasket(1));
    }

}

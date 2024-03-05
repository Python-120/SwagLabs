package pages.mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.basePageClass.BasePage;
import pages.basket.BasketPage;
import pages.burgerMenu.BurgerMenu;
import pages.loginPage.LoginPage;
import pages.mainPage.header.Header;
import pages.mainPage.item.InventoryItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPage extends BasePage {
    @FindBy(className = "product_sort_container")
    private WebElement sortSelector;
    public MainPage () {
        PageFactory.initElements(driver, this);
    }
    public String getPrice(int idProduct) {
        return new InventoryItem().getProductsPrice().get(idProduct).getText();
    }
    public int getCountElements() {
        return new InventoryItem().getProductsPrice().size();
    }
    public MainPage selectFilter(String filter) {
        Select sortPrice = new Select(sortSelector);
        sortPrice.selectByValue(filter);
        return this;
    }

    public MainPage addProduct(String productName) {
        switch (productName) {
            case "Sauce Labs Backpack": new InventoryItem().addBackPackButton.click();
            break;
            case "Sauce Labs Bike Light" : new InventoryItem().addBikeButton.click();
            break;
            default: break;
        }

        return this;
    }
    public MainPage openBurgerMenu() {
        new BurgerMenu().burgerMenuButton.click();
        return this;
    }

    public LoginPage logout() {
        new BurgerMenu().logoutButton.click();
        return new LoginPage();
    }

    public void openBasket() {
    new Header().basket.click();
        new BasketPage();
    }

    public boolean verifySort() {

        List<WebElement> products = new InventoryItem().getProductsPrice();
        List<Double> prices = new ArrayList<>();

        for (WebElement product : products) {
            String priceStr = product.getText().replaceAll("[^0-9.]", "");
            double price = Double.parseDouble(priceStr);
            prices.add(price);
        }

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);

        return prices.equals(sortedPrices);
    }

}
package pages.mainPage.item;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

import java.util.List;

public class InventoryItem extends BasePage {
    @FindBy(className = "inventory_item")
    private List<WebElement> products;
    @FindBy(className = "inventory_item_price")
    private List<WebElement> productsPrice;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addBackPackButton;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeButton;

    public List<WebElement> getProducts() {
        return products;
    }

    public List<WebElement> getProductsPrice() {
        return productsPrice;
    }

    public InventoryItem() {
        PageFactory.initElements(driver, this);
    }

}
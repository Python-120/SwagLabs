package pages.basket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

import java.util.List;

public class BasketPage extends BasePage {
    @FindBy(className = "cart_item")
    private List<WebElement> cartContainer;
    @FindBy(className = "cart_list")
    private WebElement cartList;
    @FindBy(className = "cart_item")
    private WebElement cartItem;
    @FindBy(className = "inventory_item_name")
    private WebElement productName;

    public WebElement getCartList() {
        return cartList;
    }

    public BasketPage() {
    PageFactory.initElements(driver, this);
}
    public boolean emptyBasket() {
        return !cartItem.isDisplayed();
    }
    public String productInBasket(int index) {
        String result = cartContainer.get(index).findElement(By.className("inventory_item_name")).getText();
        return result;
    }
}
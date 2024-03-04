package pages.mainPage.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;
import pages.basket.BasketPage;

public class Header extends BasePage {
    @FindBy(id = "menu_button_container")
    private WebElement burgerMenu;
    @FindBy(id = "shopping_cart_container")
    private WebElement basket;
    public Header() {
        PageFactory.initElements(driver, this);
    }
    public Header clickMenuButton() {
        new Header()
                .burgerMenu
                .click();
        return this;
    }
    public BasketPage clickBasketButton() {
        new Header()
                .basket
                .click();
        return new BasketPage();
    }
}

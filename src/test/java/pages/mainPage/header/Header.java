package pages.mainPage.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;
import pages.basket.BasketPage;

public class Header extends BasePage {
    @FindBy(id = "menu_button_container")
    public WebElement burgerMenu;
    @FindBy(id = "shopping_cart_container")
    public WebElement basket;
    public Header() {
        PageFactory.initElements(driver, this);
    }

}
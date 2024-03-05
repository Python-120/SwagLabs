package pages.burgerMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

public class BurgerMenu extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerMenuButton;
    @FindBy(id = "inventory_sidebar_link")
    public WebElement allItemsButton;
    @FindBy(id = "about_sidebar_link")
    public WebElement aboutButton;
    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutButton;
    @FindBy(id = "reset_sidebar_link")
    public WebElement resetAppStateButton;
    @FindBy(id = "react-burger-cross-btn")
    public WebElement closeBurgerMenuButton;
    public BurgerMenu() {
        PageFactory.initElements(driver, this);
    }
}

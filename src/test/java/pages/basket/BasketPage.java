package pages.basket;

import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

public class BasketPage extends BasePage {


public BasketPage() {
    PageFactory.initElements(driver, this);
}
}

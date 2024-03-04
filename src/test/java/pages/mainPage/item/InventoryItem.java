package pages.mainPage.item;

import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

public class InventoryItem extends BasePage {

    public InventoryItem () {
        PageFactory.initElements(driver, this);
    }

}

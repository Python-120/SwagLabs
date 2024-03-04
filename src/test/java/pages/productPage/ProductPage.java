package pages.productPage;

import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

public class ProductPage extends BasePage {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
}

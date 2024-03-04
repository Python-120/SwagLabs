package pages.mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;

public class MainPage extends BasePage {

    public MainPage () {
        PageFactory.initElements(driver, this);
    }

}
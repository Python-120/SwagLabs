package pages.loginPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.basePageClass.BasePage;
import pages.mainPage.MainPage;

import static org.openqa.selenium.support.PageFactory.*;
import static pages.testData.Constant.*;

public class LoginPage extends BasePage {
@FindBy(id = "user-name")
private WebElement userNameField;
@FindBy(id = "password")
private WebElement passwordField;
@FindBy(id = "login-button")
private WebElement loginButton;

public LoginPage(){
    initElements(driver, this);
}
    public LoginPage openLoginPage() {
        driver.get(LOGIN_PAGE_URL);
        return new LoginPage();
    }
protected LoginPage clearField(WebElement webElement) {
    webElement.clear();
    return this;
}
    public LoginPage enterLogin(String user) {
        clearField(userNameField);
        new LoginPage()
                .userNameField.sendKeys(user);
    return this;
    }

    public LoginPage enterPassword(String pass) {
        new LoginPage()
                .passwordField
                .sendKeys(pass);
        return this;
    }

    public MainPage pressLoginButton () {
        new LoginPage()
                .loginButton
                .click();
        return new MainPage();
    }

}

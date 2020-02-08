package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterHome extends CommonAPI {

    @FindBy(name = "session[username_or_email]")
    public WebElement emailField;

    @FindBy(css = "input[name='session[password]'")
    public WebElement passwordField;

    @FindBy(xpath = "//div/div[@dir='auto']/span/span[text()='Log in']")
    public WebElement loginButton;

    public void logIn(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}

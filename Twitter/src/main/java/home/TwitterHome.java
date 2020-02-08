package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TwitterHome extends CommonAPI {

//    @FindBy(name = "session[username_or_email]")
//    public WebElement emailField;
//
//    @FindBy(css = "input[name='session[password]'")
//    public WebElement passwordField;

//    @FindBy(xpath = "//div/div[@dir='auto']/span/span[text()='Log in']")
//    public WebElement loginButton;
    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[2]/a/span")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[1]/span")
    public WebElement aboutButton;

//    public void logIn(String email, String password) {
//        emailField.sendKeys(email);
//        passwordField.sendKeys(password);
//        loginButton.click();
//    }

    public void login () {
        loginEmail.sendKeys("kingkimochi305@gmail.com");
        loginPassword.sendKeys("kimochi305");
        loginButton.click();
    }
    public void clickOnAboutButton() {
        aboutButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnForgotPasswordButton() {
        forgotPasswordButton.click();
        Assert.assertEquals(driver.getTitle(), "");
    }
}

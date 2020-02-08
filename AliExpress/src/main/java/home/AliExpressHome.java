package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AliExpressHome extends CommonAPI {

    @FindBy(id = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='fm-login-id']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@id='fm-login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//form[@id='login-form']//button[@type='submit']")
    public WebElement loggingIn;

    //public static WebElement getSignIn() {return SigningIn;}

}


package home;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class AliExpressHome extends CommonAPI {

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;


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


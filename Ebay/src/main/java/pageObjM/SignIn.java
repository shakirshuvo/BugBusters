package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {


    @FindBy(linkText = "Sign in")
    public static WebElement signIn;

    @FindBy(css = "input#userid")
    public static WebElement typeUserName;

    @FindBy(css = "input#pass")
    public static WebElement typePassword;

    @FindBy(xpath = "//button[@id='sgnBt']")
    public static WebElement clickSignIn;


    public static WebElement getSignIn() {
        return signIn;
    }
    public static WebElement getUserName(){
        return typeUserName;
    }
    public static WebElement getPassword(){
        return typePassword;
    }
    public static WebElement getClickSignIn(){
        return clickSignIn;
    }

    public void clickOnSignOn() { getSignIn ().click (); }
    public void userName(){ getUserName ().sendKeys ("JohnDoe"); }
    public void password(){ getPassword ().sendKeys ("peopleNtech"); }
    public void clickSignInButton(){ getClickSignIn ().click (); }
}


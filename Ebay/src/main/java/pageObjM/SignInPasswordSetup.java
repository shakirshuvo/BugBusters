package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPasswordSetup extends CommonAPI {

    SignIn signIn = new SignIn ();

    @FindBy(css = "a[id='otpanch']")
    public static WebElement temporaryPassword;

    @FindBy(css = "input#userid_otp")
    public static WebElement enterUserName;

    @FindBy(css = "button#otp-btn")
    public static WebElement enterContinue ;

    @FindBy(xpath = "/html//a[@id='inflowfyp']")
    public static WebElement resetPassword;

    @FindBy(css ="button#text-continue-btn")
    public static WebElement typeUserName;

    @FindBy(css ="button#text-continue-btn")
    public static WebElement clickContinue;


    public static WebElement getTemporaryPassword(){ return temporaryPassword;}
    public static  WebElement getEnterUserName(){
        return  enterUserName;
    }
    public static  WebElement getEnterContinue(){
        return  enterContinue;
    }
    public static WebElement getResetPassword(){ return resetPassword; }
    public static WebElement getTypeUserName(){
        return typeUserName;
    }
    public static WebElement getClickContinue(){return clickContinue;}


    public void clickTemporaryPassword() { getTemporaryPassword ().click (); }
    public void enterUserName() { getEnterUserName ().sendKeys ("JohnDoe"); }
    public void enterContinue() {getEnterContinue ().click ();}
    public void clickResetPassword() { getResetPassword ().click (); }
    public void typeUserName(){getTypeUserName ().sendKeys ();}
    public void enterContinueButton() { getEnterContinue ().click (); }
}

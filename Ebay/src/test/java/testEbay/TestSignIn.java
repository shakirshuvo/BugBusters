package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjM.SignIn;

public class TestSignIn extends CommonAPI {

    @Test(enabled = true)
    public void validateSignInButton() {
        SignIn signIn = PageFactory.initElements (driver, SignIn.class);
        signIn.clickOnSignOn ();
    }
    @Test
    public void validateUsername(){
        SignIn signIn = PageFactory.initElements (driver,SignIn.class);
        signIn.userName ();
    }
    @Test
    public void validatePassword(){
        SignIn signIn = PageFactory.initElements (driver,SignIn.class);
        signIn.password ();
    }
    @Test
    public void validateSignIn() {
        SignIn signIn = PageFactory.initElements (driver, SignIn.class);
        signIn.clickSignInButton ();
    }
}







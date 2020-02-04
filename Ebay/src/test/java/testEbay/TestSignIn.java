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
        signIn.userName ();
        signIn.password ();
        signIn.clickSignInButton ();
    }
}







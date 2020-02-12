package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.SignIn;
import pageObjM.SignInPasswordSetup;

public class TestSignInPasswordSetup extends CommonAPI {

    SignIn signIn = new SignIn ();

    @Test(priority = 1)
    public void validateTemporaryPassword(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.clickTemporaryPassword ();
    }
    @Test(priority = 2)
    public void validateEnterUserName(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.enterUserName ();
    }

    @Test(priority = 3)
    public void validateEnterContinue(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.enterContinue ();
    }

    @Test(priority = 4)
    public void validateResetPassword(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.clickResetPassword ();
    }

    @Test(priority = 5)
    public void validateTyperUserName(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.typeUserName ();
    }

    @Test(priority = 6)
    public void validateEnterButton(){
        SignInPasswordSetup signInPasswordSetup = PageFactory.initElements (driver,SignInPasswordSetup.class);
        signInPasswordSetup.enterContinueButton ();
    }
}

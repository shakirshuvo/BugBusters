package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLoginPageTest extends CommonAPI {


// This positive test tests user can log in successfully with valid credentials.
    @Test
    public void amazonLogIn() {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
        amazonLoginPage.signInSecurely.click();
        amazonLoginPage.enterSignInEmailAddress();
        amazonLoginPage.clickOnContinueSignIn();
        amazonLoginPage.enterSignInPassword();
        amazonLoginPage.clickOnSignIn();
//        Assert.assertEquals(amazonLoginPage.displayHelloShakir(), true);
        Assert.assertEquals(amazonLoginPage.hiShakir.isDisplayed(), true);

    }
}

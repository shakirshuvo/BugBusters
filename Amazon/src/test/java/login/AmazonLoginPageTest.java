package login;

import base.CommonAPI;
import home.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLoginPageTest extends CommonAPI {

    @Test
    public void todaysDealsTab() {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
        amazonLoginPage.clickOnHelloSignIn();
        amazonLoginPage.enterSignInEmailAddress();
        amazonLoginPage.clickOnContinueSignIn();
        amazonLoginPage.enterSignInPassword();
        amazonLoginPage.clickOnSignIn();
        boolean shakirsDisplayed = amazonLoginPage.displayHelloShakir();
        Assert.assertEquals(shakirsDisplayed, true);


    }
}

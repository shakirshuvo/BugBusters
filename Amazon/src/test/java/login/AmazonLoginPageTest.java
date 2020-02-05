package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AmazonLoginPageTest extends CommonAPI {


    // Tests the title of the Sign-In page.
    @Test
    public void testAmazonLogInPageTitle() {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonLoginPage.getAmazonSignInPageTitle();
    }

    // This positive test tests user can log in successfully with valid credentials.
    @Test
    public void amazonLogIn() {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonLoginPage.signInSecurely.click();
        amazonLoginPage.enterSignInEmailAddress();
        amazonLoginPage.clickOnContinueSignIn();
        amazonLoginPage.enterSignInPassword();
        amazonLoginPage.clickOnSignIn();
//        Assert.assertEquals(amazonLoginPage.displayHelloShakir(), true);
        Assert.assertEquals(amazonLoginPage.hiShakir.isDisplayed(), true);

    }

}

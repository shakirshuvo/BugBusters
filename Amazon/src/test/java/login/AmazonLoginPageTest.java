package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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

    // This test tests that multiple users can successfully log in.
    @Test(dataProvider = "validLogins")
    public void twoUsersCanLogInSuccessfully(String email, String password) {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonLoginPage.signIn(email, password);
    }
    @DataProvider(name = "validLogins")
    public static Object[][] twoLoginsCredentials() {
        return new Object[][]{{"masood.57@xhanimatedm.com", "BugBusters"},
                {"ciara105@xhanimatedm.com", "BugBusters"}};
    }
}

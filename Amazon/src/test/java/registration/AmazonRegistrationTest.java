package registration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import search.AmazonSearchPage;


public class AmazonRegistrationTest extends CommonAPI {

    /* To register, passwords must match. This negative test tests the error message
    "Passwords must match" when different passwords are entered during Sign Up.
     */
    @Test
    public void searchItems() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.clickOnHelloSignIn();
        amazonRegistrationPage.clickOnCreateYourAmazonAccount();
        amazonRegistrationPage.enterCreateAccountName();
        amazonRegistrationPage.enterCreateAccountEmail();
        amazonRegistrationPage.enterCreateAccountPassword();
        amazonRegistrationPage.enterCreateAccountReEnterUnmatchedPassword();
        amazonRegistrationPage.clickOnCreateYourAmazonAccountFinal();
        boolean passwordsMustMatchIsDisplayed = amazonRegistrationPage.alertPasswordMustMatch.isDisplayed();
        Assert.assertEquals(passwordsMustMatchIsDisplayed, true);
    }

}

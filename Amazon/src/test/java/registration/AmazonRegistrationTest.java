package registration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AmazonRegistrationTest extends CommonAPI {

    /* To register, passwords must match. This negative test tests the error message
    "Passwords must match" when different passwords are entered during Sign Up.
     */
    @Test
    public void createAccountFailWithPasswordMisMatch() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.helloSignIn.click();
        amazonRegistrationPage.clickOnCreateYourAmazonAccount();
        amazonRegistrationPage.enterCreateAccountName();
        amazonRegistrationPage.enterCreateAccountEmail();
        amazonRegistrationPage.enterCreateAccountPassword();
        amazonRegistrationPage.enterCreateAccountReEnterUnmatchedPassword();
        amazonRegistrationPage.clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(amazonRegistrationPage.getAlertPasswordMustMatchIcon.isDisplayed(), true);
    }

    /* To register, valid password must be used. This negative test tests the error message
"Passwords must match" when different passwords are entered during Sign Up.
 */
    @Test
    public void createAccountFailWithInvalidEmail() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.helloSignIn.click();
        amazonRegistrationPage.clickOnCreateYourAmazonAccount();
        amazonRegistrationPage.enterCreateAccountName();
        amazonRegistrationPage.enterCreateAccountInvalidEmail();
        amazonRegistrationPage.enterCreateAccountPassword();
        amazonRegistrationPage.enterCreateAccountReEnterPassword();
        amazonRegistrationPage.clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(amazonRegistrationPage.getAlertPasswordMustMatchIcon.isDisplayed(), true);
    }

}

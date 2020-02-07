package registration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class AmazonRegistrationTest extends CommonAPI {

    /* To register, passwords must match. This negative test tests the error message
    "Passwords must match" when different passwords are entered during Sign Up.
     */
    @Test
    public void testCreateAccountFailWithPasswordMisMatch() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithPasswordMisMatch();
    }

    /* To register, valid password must be used. This negative test tests the error message
"Passwords must match" when different passwords are entered during Sign Up.
 */
    @Test
    public void testCreateAccountFailWithInvalidEmail() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithInvalidEmail();
    }

}

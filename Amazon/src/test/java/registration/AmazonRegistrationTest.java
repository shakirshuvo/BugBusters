package registration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class AmazonRegistrationTest extends CommonAPI {

    //This test tests that the Registration page is loaded by verifying the title.
    @Test
    public void testCreateYourAccountPageTitle() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createYourAccountPageTitle();
    }

    /* To register, a name must be entered. This negative test tests the error message
    "Enter your name" when no name is entered.
     */
    @Test
    public void testCreateAccountFailWithoutYourName() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithoutYourName();
    }

    /* To register, password must be entered twice. This negative test tests error
    message "Type your password again" when password is not entered the second time.
     */
    @Test
    public void testCreateAccountFailWithPasswordNotReEntered() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithPasswordNotReEntered();
    }

    /* To register, passwords must match. This negative test tests the error message
    "Passwords must match" when different passwords are entered during Sign Up.
     */
    @Test
    public void testCreateAccountFailWithPasswordMisMatch() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithPasswordMisMatch();
    }

    /* To register, passwords must be at least 6 characters long. This negative test
    tests the error massage "Passwords must be at least 6 characters" during Sign Up.
     */
    @Test
    public void testCreateAccountFailWithPasswordLessThanSixCharacters() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithPasswordLessThanSixCharacters();
    }

    /* To register, valid email must be used. This negative test tests the error message
    "Enter a valid email address" when an invalid email is entered during Sign Up.
    */
    @Test
    public void testCreateAccountFailWithInvalidEmail() {
        AmazonRegistrationPage amazonRegistrationPage = PageFactory.initElements(driver, AmazonRegistrationPage.class);
        amazonRegistrationPage.createAccountFailWithInvalidEmail();
    }

}

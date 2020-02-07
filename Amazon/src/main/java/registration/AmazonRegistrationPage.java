package registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class AmazonRegistrationPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public WebElement helloSignIn;

    @FindBy(how = How.ID, using = "createAccountSubmit")
    public static WebElement createYourAmazonAccount;

    @FindBy(how = How.CSS, using = "input[id='ap_customer_name']")
    public static WebElement createAccountName;

    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement createAccountEmail;

    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement createAccountPassword;

    @FindBy(how = How.ID, using = "ap_password_check")
    public static WebElement createAccountReEnterPassword;

    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public static WebElement createYourAmazonAccountFinal;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-password-mismatch-alert\"]/div/div")
    public WebElement alertPasswordMustMatch;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-password-mismatch-alert\"]/div/i")
    public WebElement getAlertPasswordMustMatchIcon;

    @FindBy(xpath = "//*[@id=\"auth-email-invalid-email-alert\"]/div/div")
    public WebElement invalidEmailAlert;

    //    public static WebElement getHelloSignIn () {
//        return helloSignIn;
//    }
    public static WebElement getCreateYourAmazonAccount() {
        return createYourAmazonAccount;
    }

    public static WebElement getCreateAccountName() {
        return createAccountName;
    }

    public static WebElement getCreateAccountEmail() {
        return createAccountEmail;
    }

    public static WebElement getCreateAccountPassword() {
        return createAccountPassword;
    }

    public static WebElement getCreateAccountReEnterPassword() {
        return createAccountReEnterPassword;
    }

    public static WebElement getCreateYourAmazonAccountFinal() {
        return createYourAmazonAccountFinal;
    }

    //
//    public void clickOnHelloSignIn() {
//        getHelloSignIn().click();
//    }
    public void clickOnCreateYourAmazonAccount() {
        getCreateYourAmazonAccount().click();
    }

    public void enterCreateAccountName() {
        getCreateAccountName().sendKeys("John Doe");
    }

    public void enterCreateAccountEmail() {
        getCreateAccountEmail().sendKeys("john.doe2sf8@gmail.com");
    }

    public void enterCreateAccountInvalidEmail() {
        getCreateAccountEmail().sendKeys("john.doe2sf8@");
    }

    public void enterCreateAccountPassword() {
        getCreateAccountPassword().sendKeys("BugBusters");
    }

    public void enterCreateAccountPassword5Char() {
        getCreateAccountPassword().sendKeys("BugBu");
    }

    public void enterCreateAccountReEnterPassword() {
        getCreateAccountReEnterPassword().sendKeys("BugBusters");
    }

    public void enterCreateAccountReEnterUnmatchedPassword() {
        getCreateAccountReEnterPassword().sendKeys("BugBoomers");
    }

    public void enterCreateAccountReEnterPassword5Char() {
        getCreateAccountReEnterPassword().sendKeys("BugBu");
    }

    public void clickOnCreateYourAmazonAccountFinal() {
        getCreateYourAmazonAccountFinal().click();
    }

    public void goToCreateYourAccountPage() {
        helloSignIn.click();
        clickOnCreateYourAmazonAccount();
    }

    public void createAccountFailWithPasswordMisMatch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        enterCreateAccountName();
        enterCreateAccountEmail();
        enterCreateAccountPassword();
        enterCreateAccountReEnterUnmatchedPassword();
        clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(getAlertPasswordMustMatchIcon.isDisplayed(), true);
    }

    public void createAccountFailWithInvalidEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        enterCreateAccountName();
        enterCreateAccountInvalidEmail();
        enterCreateAccountPassword();
        enterCreateAccountReEnterPassword();
        clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(invalidEmailAlert.isDisplayed(), true);
    }
}

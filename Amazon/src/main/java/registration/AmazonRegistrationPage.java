package registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonRegistrationPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public static WebElement helloSignIn;

    @FindBy(how = How.ID, using = "createAccountSubmit")
    public static WebElement createYourAmazonAccount;

    @FindBy(how = How.ID, using = "p_customer_name")
    public static WebElement createAccountName;

    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement createAccountEmail;

    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement createAccountPassword;

    @FindBy(how = How.ID, using = "ap_password_check")
    public static WebElement createAccountReEnterPassword;

    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public static WebElement createYourAmazonAccountFinal;

    @FindBy(how = How.CLASS_NAME, using = "//*[@id=\"auth-password-mismatch-alert\"]/div/div")
    public static WebElement alertPasswordMustMatch;

    public static WebElement getHelloSignIn () {
        return helloSignIn;
    }
    public static WebElement getCreateYourAmazonAccount () {
        return createYourAmazonAccount;
    }
    public static WebElement getCreateAccountName () {
        return createAccountName;
    }
    public static WebElement getCreateAccountEmail () {
        return createAccountEmail;
    }
    public static WebElement getCreateAccountPassword () {
        return createAccountPassword;
    }
    public static WebElement getCreateAccountReEnterPassword () {
        return createAccountReEnterPassword;
    }
    public static WebElement getCreateYourAmazonAccountFinal () {
        return createYourAmazonAccountFinal;
    }

    public void clickOnHelloSignIn() {
        getHelloSignIn().click();
    }
    public void clickOnCreateYourAmazonAccount() {
        getCreateYourAmazonAccount().click();
    }
    public void enterCreateAccountName() {
        getCreateAccountName().sendKeys("John Doe");
    }
    public void enterCreateAccountEmail() {
        getCreateAccountEmail().sendKeys("john.doe2sf8@gmail.com");
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
}

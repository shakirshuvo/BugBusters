package registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;
import static base.CommonAPI.driver;

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

    @FindBy(xpath = "//*[@id=\"auth-password-invalid-password-alert\"]/div/div")
    public WebElement passwordMustBe6CharactersAlert;

    @FindBy(xpath = "//*[@id=\"auth-customerName-missing-alert\"]/div/div")
    public WebElement enterYourNameAlert;

    @FindBy(xpath = "//*[@id=\"auth-passwordCheck-missing-alert\"]/div/div")
    public WebElement typeYourPasswordAgainAlert;

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

    public void clickOnCreateYourAmazonAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateYourAmazonAccount().click();
    }

    public void enterCreateAccountName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountName().sendKeys("John Doe");
    }

    public void enterCreateAccountEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountEmail().sendKeys("john.doe2sf8@gmail.com");
    }

    public void enterCreateAccountInvalidEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountEmail().sendKeys("john.doe2sf8@");
    }

    public void enterCreateAccountPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountPassword().sendKeys("BugBusters");
    }

    public void enterCreateAccountPassword5Char() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountPassword().sendKeys("BugBu");
    }

    public void enterCreateAccountReEnterPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountReEnterPassword().sendKeys("BugBusters");
    }

    public void enterCreateAccountReEnterUnmatchedPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountReEnterPassword().sendKeys("BugBoomers");
    }

    public void enterCreateAccountReEnterPassword5Char() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateAccountReEnterPassword().sendKeys("BugBu");
    }

    public void clickOnCreateYourAmazonAccountFinal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateYourAmazonAccountFinal().click();
    }

    public void goToCreateYourAccountPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helloSignIn.click();
        clickOnCreateYourAmazonAccount();
    }

    public void createYourAccountPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        Assert.assertEquals(driver.getTitle(), "Amazon Registration");
    }

    public void createAccountFailWithoutYourName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        enterCreateAccountEmail();
        enterCreateAccountPassword();
        enterCreateAccountReEnterPassword();
        clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(enterYourNameAlert.isDisplayed(), true);
    }

    public void createAccountFailWithPasswordNotReEntered() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        enterCreateAccountName();
        enterCreateAccountEmail();
        enterCreateAccountPassword();
        clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(typeYourPasswordAgainAlert.isDisplayed(), true);
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

    public void createAccountFailWithPasswordLessThanSixCharacters() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goToCreateYourAccountPage();
        enterCreateAccountName();
        enterCreateAccountEmail();
        enterCreateAccountPassword5Char();
        enterCreateAccountReEnterPassword5Char();
        clickOnCreateYourAmazonAccountFinal();
        Assert.assertEquals(passwordMustBe6CharactersAlert.isDisplayed(), true);
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

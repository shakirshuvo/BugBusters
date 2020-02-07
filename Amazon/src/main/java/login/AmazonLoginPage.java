package login;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class AmazonLoginPage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public static WebElement helloSignIn;

    @FindBy(xpath = "//*[@id=\"nav-signin-tooltip\"]/a/span")
    private WebElement signInPopUpButton;

    @FindBy(how = How.ID, using = "a-autoid-0-announce")
    public static WebElement signInSecurely;

    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement signInEmailAddress;

    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public static WebElement continueSignIn;

    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement signInPassword;

    @FindBy(how = How.ID, using = "signInSubmit")
    public static WebElement signIn;

    @FindBy(how = How.CLASS_NAME, using = "a-alert-heading")
    public static WebElement invalidEmailSignIn;

    @FindBy(how = How.CSS, using = "//span[text()='Hello, Shakir']")
    public static WebElement helloShakir;

    @FindBy(xpath = "//h2[text()='Hi, Shakir']")
    public WebElement hiShakir;

    @FindBy(id = "nav-your-amazon-text")
    public WebElement shakirsAmazonCom;

    @FindBy(xpath = "//*[@id=\"cvf-page-content\"]/p[1]")
    public WebElement captcha;

    @FindBy(xpath = "//h4[text()='There was a problem']")
    public WebElement invalidEmailAlert;

    public static WebElement getHelloSignIn() {
        return helloSignIn;
    }

    public static WebElement getSignInEmailAddress() {
        return signInEmailAddress;
    }

    public static WebElement getContinueSignIn() {
        return continueSignIn;
    }

    public static WebElement getSignInPassword() {
        return signInPassword;
    }

    public static WebElement getSignIn() {
        return signIn;
    }

    public static WebElement getInvalidEmailSignIn() {
        return invalidEmailSignIn;
    }

    public static WebElement getHelloShakir() {
        return helloShakir;
    }

    public void clickOnHelloSignIn() {
        getHelloSignIn().click();
    }

    public void enterSignInEmailAddress() {
        getSignInEmailAddress().sendKeys("shakir.jahangir83@gmail.com");
    }

    public void clickOnContinueSignIn() {
        getContinueSignIn().click();
    }

    public void enterSignInPassword() {
        getSignInPassword().sendKeys("BugBusters");
    }

    public void clickOnSignIn() {
        getSignIn().click();
    }

    public void displayInvalidEmailSignIn() {
        getInvalidEmailSignIn();
    }

    public boolean displayHelloShakir() {
        return getHelloShakir().isDisplayed();
    }

    public void clickOnSignInPopUpButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(this.signInPopUpButton));
        this.signInPopUpButton.click();
    }

    public void signIn(String email, String password) {
        clickOnSignInPopUpButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.signInEmailAddress.sendKeys(email);
        this.continueSignIn.click();
        this.signInPassword.sendKeys(password);
        this.signIn.click();
    }

    public void signInWithShakirJahangir83(){
        signIn("shakir.jahangir83@gmail.com", "BugBusters");
        Assert.assertEquals(captcha.isDisplayed(), true);
    }

    public void getAmazonSignInPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSignInPopUpButton();
        String expectedTitle = "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void signInWithInvalidEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSignInPopUpButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.signInEmailAddress.sendKeys("shakirshuvo2343897@hotmail.com");
        this.continueSignIn.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        invalidEmailAlert.isDisplayed();
        Assert.assertEquals(invalidEmailAlert.isDisplayed(), true);
    }
}

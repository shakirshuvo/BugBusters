package login;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonLoginPage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]/span[1]")
    public static WebElement helloSignIn;

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

    @FindBy(how = How.CSS, using ="//span[text()='Hello, Shakir']")
    public static WebElement helloShakir;

    @FindBy(xpath = "//h2[text()='Hi, Shakir']")
    public WebElement hiShakir;

    @FindBy(id = "nav-your-amazon-text")
    public WebElement shakirsAmazonCom;


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
}

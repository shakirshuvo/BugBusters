package login;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

public class NetflixLoginChocolate extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@href='/login']")
    public static WebElement signInChoWebElement;

    @FindBy(how = How.XPATH, using = "//div[@class='nfEmailPhoneControls']//input[@name='userLoginId']")
    public static WebElement signInEmail;

    @FindBy(how = How.XPATH, using = "//div[@class='nfPasswordControls']//input[@name='password']")
    public static WebElement signInPassword;

    @FindBy(how = How.CLASS_NAME, using = "login-button")
    public static WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//a[@class='profile-link']//span[contains(text(),'Chocolate')]")
    public static WebElement profileIconChocolate;

    public static WebElement getSignInChoWebElement() {return signInChoWebElement;}

    public static WebElement getSignInEmail() {return signInEmail;}

    public static WebElement getSignInPassword() {return signInPassword;}

    public static WebElement getSignInButton() {return signInButton;}

    public static WebElement getProfileIconChocolate() {return profileIconChocolate;}

    public void clickSignInCho() {getSignInChoWebElement().click();}

    public  void typeSignInEmail() {getSignInEmail().sendKeys("hassanbhuiyan@aol.com");}

    public void typeSignInPassword() {getSignInPassword().sendKeys("semp1990");}

    public void clickOnSignInButton() {getSignInButton().click();}

    public void clickOnprofileIconChocolate() {getProfileIconChocolate().click();}

    public void getNetflixSignInTitle() {
        clickSignInCho();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String expectedTitle = "Netflix";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
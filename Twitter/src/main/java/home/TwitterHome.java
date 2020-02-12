package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TwitterHome extends CommonAPI {

//    @FindBy(name = "session[username_or_email]")
//    public WebElement emailField;
//
//    @FindBy(css = "input[name='session[password]'")
//    public WebElement passwordField;

//    @FindBy(xpath = "//div/div[@dir='auto']/span/span[text()='Log in']")
//    public WebElement loginButton;
    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[2]/a/span")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[1]/span")
    public WebElement aboutButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[2]/span")
    public WebElement helpCenterButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[3]/span")
    public WebElement termsButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[4]/span")
    public WebElement privacyAndPolicyButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[5]/span")
    public WebElement cookiesButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[6]/span")
    public WebElement adsInfoButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[7]/span")
    public WebElement blogButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[8]/span")
    public WebElement statusButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[9]/span")
    public WebElement jobsButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[10]/span")
    public WebElement brandButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[11]/span")
    public WebElement advertiseButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[12]/span")
    public WebElement marketingButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[13]/span")
    public WebElement businessButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[14]/span")
    public WebElement developersButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[15]/span")
    public WebElement directoryButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/nav/a[16]/span")
    public WebElement settingsButton;

//    public void logIn(String email, String password) {
//        emailField.sendKeys(email);
//        passwordField.sendKeys(password);
//        loginButton.click();
//    }

    public void login () {
        loginEmail.sendKeys("kingkimochi305@gmail.com");
        loginPassword.sendKeys("kimochi305");
        loginButton.click();
    }
    public void clickOnAboutButton() {
        aboutButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnForgotPasswordButton() {
        forgotPasswordButton.click();
        Assert.assertEquals(driver.getTitle(), "Password Reset");
    }

    public void clickOnHelpCenterButton() {
        helpCenterButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnTermsButton() {
        termsButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnPrivacyAndPolicyButton() {
        privacyAndPolicyButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnCookiesButton() {
        cookiesButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnAdsInfoButton() {
        adsInfoButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnBlogButton() {
        blogButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnStatusButton() {
        statusButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnJobsButton() {
        jobsButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnBrandButton() {
        brandButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnAdvertiseButton() {
        advertiseButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnMarketingButton() {
        marketingButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnBusinessButton() {
        businessButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnDevelopersButton() {
        developersButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnDirectoryButton() {
        directoryButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");
    }

    public void clickOnSettingsButton() {
        settingsButton.click();
        Assert.assertEquals(driver.getTitle(), "Twitter");
    }


}

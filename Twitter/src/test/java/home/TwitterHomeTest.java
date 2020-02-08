package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TwitterHomeTest extends CommonAPI {

//    @Test (priority = 1)
//    public void testUserCanLoginToTwitterWithValidCredentials() {
//        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
//        th.logIn("kingkimochi305@gmail.com", "kimochi305");
//        String expectedUrl = "https://twitter.com/home";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    @Test (priority = 2)
//    public void testUserCannotLogInToTwitterWithInvalidCredentials() {
//        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
//        th.logIn("ererer", "7890");
//        String expectedUrl = "https://twitter.com/login/error?username_or_email=ererer&redirect_after_login=%2F";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    @Test (priority = 3)
//    public void testUserImplementsWrongPassword() {
//        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
//        th.logIn("kingkimochi305@gmail.com", "wrongpass");
//        String expectedUrl = "https://twitter.com/login/error?username_or_email=kingkimochi305%40gmail.com&redirect_after_login=%2F";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }

    @Test
    public void loginTest() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.login();
    }

    @Test
    public void clickAboutButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnAboutButton();
    }

    @Test
    public void clickForgotPasswordButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnForgotPasswordButton();
    }

    @Test
    public void clickHelpCenterButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnHelpCenterButton();
    }

    @Test
    public void clickTermsButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnTermsButton();
    }

    @Test
    public void clickPrivacyAndPolicyButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnPrivacyAndPolicyButton();
    }

    @Test
    public void clickCookiesButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnCookiesButton();
    }

    @Test
    public void clickAdsInfoButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnAdsInfoButton();
    }

    @Test
    public void clickBlogButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnBlogButton();
    }

    @Test
    public void clickStatusButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnStatusButton();
    }

    @Test
    public void clickJobsButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnJobsButton();
    }

    @Test
    public void clickBrandButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnBrandButton();
    }

    @Test
    public void clickAdvertiseButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnAdvertiseButton();
    }

    @Test
    public void clickMarketingButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnMarketingButton();
    }

    @Test
    public void clickBusinessButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnBusinessButton();
    }

    @Test
    public void clickDevelopersButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnDevelopersButton();
    }

    @Test
    public void clickDirectoryButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnDirectoryButton();
    }

    @Test
    public void clickSettingsButton() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.clickOnSettingsButton();
    }
}

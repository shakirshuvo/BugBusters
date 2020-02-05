package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AmazonHomePageTest extends CommonAPI {


    @Test(priority = 1)
    public void amazonHomePageTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test(priority = 2)
    public void todaysDealsTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnTodaysDealsTab();
        Assert.assertEquals(amazonHomePage.dealsAndPromotionsText.isDisplayed(), true);
    }

    @Test(priority = 3)
    public void helpTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnHelpTab();
        Assert.assertEquals(amazonHomePage.checkIfGetHelpText(), true);

    }

    @Test(priority = 4)
    public void registryTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnRegistryTab();
        Assert.assertEquals(amazonHomePage.registerWithAmazonPic.isDisplayed(), true);
    }

    @Test(priority = 5)
    public void giftCardsTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnGiftCardsTab();
        Assert.assertEquals(amazonHomePage.giftCardsPic.isDisplayed(), true);
    }

    @Test(priority = 6)
    public void sellTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnSellTab();
        Assert.assertEquals(amazonHomePage.startSellingPic.isDisplayed(), true);
    }

    @Test(priority = 7)
    public void yourAmazonComTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnYourAmazonComTab();
        Assert.assertEquals(amazonHomePage.signInText.isDisplayed(), true);
    }

    @Test(priority = 8)
    public void returnsAndOrderTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnReturnsAndOrderTab();
        Assert.assertEquals(amazonHomePage.signInText.isDisplayed(), true);
    }

    @Test(priority = 9)
    public void cartTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnCartTab();
        Assert.assertEquals(amazonHomePage.yourShoppingCartIsEmptyText.isDisplayed(), true);
    }

    @Test(priority = 10)
    public void musicLink() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickMusic();
        Assert.assertEquals(amazonHomePage.amazonMusicLogo.isDisplayed(), true);
    }

}

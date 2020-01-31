package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends CommonAPI {


    @Test (priority = 1)
    public void amazonHomePageTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test (priority = 2)
    public void todaysDealsTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnTodaysDealsTab();
        Assert.assertEquals(amazonHomePage.dealsAndPromotionsText.isDisplayed(), true);
    }

    @Test (priority = 3)
    public void helpTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnHelpTab();
        Assert.assertEquals(amazonHomePage.checkGetHelpText(), true);

    }

    @Test (priority = 4)
    public void registryTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnRegistryTab();
    }

    @Test (priority = 5)
    public void giftCardsTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnGiftCardsTab();
    }

    @Test (priority = 6)
    public void sellTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnSellTab();
    }

    @Test (priority = 7)
    public void yourAmazonComTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnYourAmazonComTab();
    }

    @Test (priority = 8)
    public void returnsAndOrderTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnReturnsAndOrderTab();
    }

    @Test (priority = 9)
    public void cartTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnCartTab();
    }

    @Test (priority = 10)
    public void musicLink() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickMusic();
    }

}

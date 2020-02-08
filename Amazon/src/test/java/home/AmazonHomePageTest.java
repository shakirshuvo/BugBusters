package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AmazonHomePageTest extends CommonAPI {


    @Test(priority = 1)
    public void testAmazonHomePageTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.getAmaonHomePageTitle();
    }

    @Test(priority = 2)
    public void testTodaysDealsTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnTodaysDealsTab();
    }

    @Test(priority = 3)
    public void testHelpTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnHelpTab();
    }

    @Test(priority = 4)
    public void testRegistryTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.registryTitle();
    }

    @Test(priority = 4)
    public void testRegistryTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.registryTab();
    }

    @Test(priority = 5)
    public void testGiftCardsTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.giftCardsTitle();
    }

    @Test(priority = 6)
    public void testSellTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.sellTitle();
    }

    @Test(priority = 7)
    public void testGetYourAccountTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getYourAccountTitle();
    }

    @Test(priority = 8)
    public void testReturnsAndOrderTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnReturnsAndOrderTab();
    }

    @Test(priority = 9)
    public void testCartTab() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickOnCartTab();
    }

    @Test(priority = 10)
    public void testMusicLink() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomePage.clickMusic();
    }

    @Test
    public void testChangeCountryToCanada() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.changeCountryToCanada();
    }

    @Test
    public void testChangeCurrencyToTurkishLira() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.changeCurrencyToTurkishLira();
    }

    @Test
    public void testClickOnAmazonAdvertising() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnAmazonAdvertising();
    }

    @Test
    public void testClickOnAmazonDrive() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.clickOnAmazonDrive();
    }

    @Test
    public void testDisplaySixPM(){
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displaySixPM();
    }

    @Test
    public void testDisplayAbeBooks() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAbeBooks();
    }

    @Test
    public void testDisplayACX() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayACX();
    }

    @Test
    public void testDisplayAlexa() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAlexa();
    }

    @Test
    public void testDisplaySellOnAmazon() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displaySellOnAmazon();
    }

    @Test
    public void testDisplayAmazonBusiness() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonBusiness();
    }

    @Test
    public void testGetAmazonBusinessTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getAmazonBusinessTitle();
    }

    @Test
    public void testDisplayAmazonGlobal() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonGlobal();
    }

    @Test
    public void testAmazonGlobalTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getAmazonGlobalTitle();
    }

    @Test
    public void testDisplayAmazonHomeServices() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonHomeServices();
    }

    @Test
    public void testAmazonHomeServicesTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getAmazonHomeServicesTitle();
    }

    @Test
    public void testDisplayAmazonIgnite() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonIgnite();
    }

    @Test
    public void testDisplayAmazonRapid() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonRapid();
    }

    @Test
    public void testGetAmazonRapidTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getAmazonRapidTitle();
    }

    @Test
    public void testDisplayAmazonWebServices() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayAmazonWebServices();
    }

    @Test
    public void testDisplayBookDepository() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayBookDepository();
    }

    @Test
    public void testBoxOfficeMojo() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayBoxOfficeMojo();
    }

    @Test
    public void testDisplayComiXology() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayComiXology();
    }

    @Test
    public void testCreateSpace() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayCreateSpace();
    }

    @Test
    public void testDPReview() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayDPReview();
    }

    @Test
    public void testEastDance() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayEastDance();
    }

    @Test
    public void testDisplayFabric() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayFabric();
    }

    @Test
    public void testDisplayGoodreads() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayGoodreads();
    }

    @Test
    public void testDisplayIMDB() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayIMDB();
    }

    @Test
    public void testDisplayIMDBpro() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayIMDBpro();
    }

    @Test
    public void testDisplayKindleDirectPublishing() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayKindleDirectPublishing();
    }

    @Test
    public void testDisplayPrimeVideoDirect() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayPrimeVideoDirect();
    }

    @Test
    public void testGetPrimeVideoDirectTitle() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.getPrimeVideoDirectTitle();
    }

    @Test
    public void testDisplayShopbop() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        amazonHomePage.displayShopbop();
    }
}

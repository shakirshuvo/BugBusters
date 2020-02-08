package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;


public class AmazonHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[1]")
    public static WebElement todaysDealsWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement helpWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Registry']")
    public static WebElement registryWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Gift Cards']")
    public static WebElement giftCardsWebElement;

    @FindBy(xpath = "//img[@alt='acswidget-carousel__title']")
    public WebElement giftCardsText;

    @FindBy(xpath = "//title[contains(text(),'Amazon.com Gift Cards')]")
    public WebElement giftCardsTitle;

    @FindBy(xpath = "//div[@id='contentGrid_327145']//img")
    public WebElement giftCardsPic;

    @FindBy(className = "sign-in-tooltip-link")
    public WebElement giftCardsLocator;

    @FindBy(how = How.XPATH, using = "//a[text()='Sell']")
    public static WebElement sellWebElement;

    @FindBy(how = How.ID, using = "nav-your-amazon")
    public static WebElement yourAmazonComlsWebElement;

    @FindBy(how = How.XPATH, using = "//span[text()='Hello, Sign in']")
    public static WebElement helloSignInWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-orders\"]/span[1]")
    public static WebElement returnAndOrdersWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-cart\"]/span[1]")
    public static WebElement cartWebElement;

    @FindBy(xpath = "//b[text()='Deals and Promotions']")
    public WebElement dealsAndPromotionsText;

    @FindBy(xpath = "//h1[contains(text(),'Hello. What can we help you with?')]")
    public WebElement helpText;

    @FindBy(xpath = "//a[text()='Amazon Music']")
    public static WebElement music;

    @FindBy(xpath = "//*[@id=\"contentGrid_336610\"]/div/div[1]/div/div/div/img")
    public WebElement registerWithAmazonPic;

    @FindBy(xpath = "//h3[text()='Registry discounts, rewards and bonus gifts']")
    public WebElement registryDiscountText;

    @FindBy(xpath = "//*[@id=\"eventColor\"]/div[3]/div/div/div[1]/div/div[1]/div[3]/div/div/a")
    public WebElement startSellingPic;

    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
    public WebElement signInText;

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/h1[1]")
    public WebElement yourShoppingCartIsEmptyText;

    @FindBy(xpath = "//*[@id=\"amazonMusicLogo\"]")
    public WebElement amazonMusicLogo;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[1]/a")
    public WebElement yourAccount;

    @FindBy(xpath = "//*[@id=\"icp-touch-link-country\"]/span[2]")
    public WebElement country;

    @FindBy(className = "a-dropdown-prompt")
    public WebElement countryDropDown;

    @FindBy(xpath = "//*[@id=\"icp-selected-country_2\"]/div/div/div[2]/span")
    public WebElement canada;

    @FindBy(xpath = "//*[@id=\"a-popover-1\"]/div/div[2]/span[2]/span/span/input")
    public WebElement submitCanada;

    @FindBy(xpath = "//*[@id=\"icp-touch-link-cop\"]")
    public WebElement currency;

    @FindBy(id = "a-autoid-0-announce")
    public WebElement currencyDropdown;

    @FindBy(id = "icp-sc-dropdown_62")
    public WebElement turkishLira;

    @FindBy(xpath = "//*[@id=\"icp-btn-save\"]/span/input")
    public WebElement submitCurrencyChange;

    @FindBy(xpath = "//span[text()='TRY']")
    public WebElement currencyTurkishConfirmation;

    @FindBy(xpath = "//a[text()='Amazon Advertising']")
    public WebElement amazonAdvertizing;

    @FindBy(xpath = "//a[text()='Amazon Drive']")
    public WebElement amazonDriveLink;

    @FindBy(xpath = "//h1[text()='Amazon Drive']")
    public WebElement amazonDrive;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[7]/a")
    public WebElement sixPM;

    @FindBy(xpath = "//a[text()='AbeBooks']")
    public WebElement abeBooks;

    @FindBy(xpath = "//a[text()='ACX ']")
    public WebElement acx;

    @FindBy(xpath = "//a[text()='Alexa']")
    public WebElement alexa;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[3]/a")
    public WebElement sellOnAmazon;

    @FindBy(xpath = "//span[text()=' Your Business']")
    public WebElement amazonBusiness;

    @FindBy(xpath = "//a[text()='AmazonGlobal']")
    public WebElement amazonGlobal;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[9]/a")
    public WebElement amazonHomeServices;

    @FindBy(xpath = "//a[text()='Amazon Ignite']")
    public WebElement amazonIgnite;

    @FindBy(xpath = "//a[text()='Amazon Rapids']")
    public WebElement amazonRapid;

    @FindBy(xpath = "//a[text()='Amazon Web Services']")
    public WebElement amazonWebServices;

    @FindBy(xpath = "//a[text()='Audible']")
    public WebElement amazonAudible;

    @FindBy(xpath = "//a[text()='Book Depository']")
    public WebElement amazonBookDepository;

    @FindBy(xpath = "//a[text()='Box Office Mojo']")
    public WebElement boxOfficeMojo;

    @FindBy(xpath = "//a[text()='ComiXology']")
    public WebElement comiXology;

    @FindBy(xpath = "//a[text()='CreateSpace']")
    public WebElement createSpace;

    @FindBy(xpath = "//a[text()='DPReview']")
    public WebElement dpReview;

    @FindBy(xpath = "//a[text()='East Dane']")
    public WebElement eastDance;

    @FindBy(xpath = "//a[text()='Fabric']")
    public WebElement fabric;

    @FindBy(xpath = "//a[text()='Goodreads']")
    public WebElement goodreads;

    @FindBy(xpath = "//a[text()='IMDb']")
    public WebElement imdb;

    @FindBy(xpath = "//a[text()='IMDbPro']")
    public WebElement imdbPro;

    @FindBy(xpath = "//a[text()='Kindle Direct Publishing']")
    public WebElement kindleDirectPublishing;

    @FindBy(xpath = "//a[text()='Prime Video Direct']")
    public WebElement primeVideoDirect;

    @FindBy(xpath = "//a[text()='Shopbop']")
    public WebElement shopbop;

    @FindBy(xpath = "//a[text()='Woot!']")
    public WebElement woot;

    @FindBy(xpath = "//a[text()='Zappos']")
    public WebElement zappos;

    @FindBy(xpath = "//a[text()='Ring']")
    public WebElement ring;

    @FindBy(xpath = "//a[text()='eero WiFi']")
    public WebElement eeroWifi;

    @FindBy(xpath = "//a[text()='Neighbors App ']")
    public WebElement neighborsApp;

    @FindBy(xpath = "//a[text()='Subscribe with Amazon']")
    public WebElement subscribeWithAmazon;

    @FindBy(xpath = "//a[text()='PillPack']")
    public WebElement pillPack;

    @FindBy(xpath = "//a[text()='Amazon Second Chance']")
    public WebElement amazonSecondChance;

    @FindBy(xpath = "//a[text()='Conditions of Use']")
    public WebElement conditionsOfUse;

    @FindBy(xpath = "//a[text()='Privacy Notice']")
    public WebElement privacyNotice;

    @FindBy(xpath = "//a[text()='Interest-Based Ads']")
    public WebElement interestBasedAds;

    @FindBy(xpath = "//a[text()='Careers']")
    public WebElement careers;

    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement blog;

    @FindBy(xpath = "//a[text()='About Amazon']")
    public WebElement aboutAmazon;

    @FindBy(xpath = "//a[text()='Investor Relations']")
    public WebElement investorRelations;

    @FindBy(xpath = "//a[text()='Amazon Devices']")
    public WebElement amazonDevices;

    public static WebElement getMusic() {
        return music;
    }

    public static WebElement getTodaysDealsWebElement() {
        return todaysDealsWebElement;
    }

    public static WebElement getHelpWebElement() {
        return helpWebElement;
    }

    public static WebElement getRegistryWebElement() {
        return registryWebElement;
    }

    public static WebElement getGiftCardsWebElement() {
        return giftCardsWebElement;
    }

    public static WebElement getSellWebElement() {
        return sellWebElement;
    }

    public static WebElement getYourAmazonComWebElement() {
        return yourAmazonComlsWebElement;
    }

    public static WebElement getHelloSignInWebElementWebElement() {
        return helloSignInWebElement;
    }

    public static WebElement getReturnAndOrdersWebElement() {
        return returnAndOrdersWebElement;
    }

    public static WebElement getCartWebElement() {
        return cartWebElement;
    }

    public WebElement getHelpText() {
        return helpText;
    }

    public WebElement getRegisterWithAmazonPic() {
        return registerWithAmazonPic;
    }

    public boolean checkIfGetHelpText() {
        return getHelpText().isDisplayed();
    }

    public void getAmazonHomePageTitle() {

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    public void clickOnTodaysDealsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTodaysDealsWebElement().click();
        Assert.assertEquals(dealsAndPromotionsText.isDisplayed(), true);
    }

    public void clickOnHelpTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getHelpWebElement().click();
        Assert.assertEquals(checkIfGetHelpText(), true);
    }

    public void clickOnRegistryTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getRegistryWebElement().click();
    }

    public void clickOnGiftCardsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getGiftCardsWebElement().click();
    }

    public void clickOnSellTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSellWebElement().click();
    }

    public void clickOnYourAmazonComTab() {
        getYourAmazonComWebElement().click();
    }

    public void clickOnHelloSignInTab() {
        getHelloSignInWebElementWebElement().click();
    }

    public void clickOnReturnsAndOrderTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getReturnAndOrdersWebElement().click();
        Assert.assertEquals(signInText.isDisplayed(), true);
    }

    public void clickOnCartTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCartWebElement().click();
        Assert.assertEquals(yourShoppingCartIsEmptyText.isDisplayed(), true);
    }

    public void clickMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMusic().click();
        Assert.assertEquals(amazonMusicLogo.isDisplayed(), true);
    }

    public boolean checkIfregisterWithAmazonPic() {
        return getRegisterWithAmazonPic().isDisplayed();
    }

    public void registryTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registryWebElement.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: : Registry");
    }

    public void registryTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnRegistryTab();
        Assert.assertEquals(registryDiscountText.isDisplayed(), true);
    }

    public void giftCardsTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnGiftCardsTab();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Amazon.com Gift Cards");
    }

    public void sellTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnSellTab();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Sell Products Online with Selling on Amazon.");
    }

    public void getYourAccountTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        yourAccount.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Your Account");
    }

    public void changeCountryToCanada() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        country.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        countryDropDown.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        canada.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(submitCanada.isDisplayed(), true);
    }

    public void changeCurrencyToTurkishLira() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        currency.click();
        currencyDropdown.click();
        turkishLira.click();
        submitCurrencyChange.click();
        Assert.assertEquals(currencyTurkishConfirmation.isDisplayed(), true);
    }

    public void clickOnAmazonAdvertising() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAdvertizing.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Advertising");
    }

    public void clickOnAmazonDrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonDriveLink.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Amazon Drive");
    }

    public void displaySixPM() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(sixPM.isDisplayed(), true);
    }

    public void displayAbeBooks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(abeBooks.isDisplayed(), true);
    }

    public void displayACX() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(acx.isDisplayed(), true);
    }

    public void displayAlexa() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(alexa.isDisplayed(), true);
    }

    public void displaySellOnAmazon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(sellOnAmazon.isDisplayed(), true);
    }

    public void displayAmazonBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonBusiness.isDisplayed(), true);
    }

    public void getAmazonBusinessTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonBusiness.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Business");
    }

    public void displayAmazonGlobal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonGlobal.isDisplayed(), true);
    }

    public void getAmazonGlobalTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonGlobal.click();
        Assert.assertEquals(driver.getTitle(), "Amazon International shopping and shipping made easy");
    }

    public void displayAmazonHomeServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonHomeServices.isDisplayed(), true);
    }

    public void getAmazonHomeServicesTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonHomeServices.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Home & Business Services");
    }

    public void displayAmazonIgnite() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonIgnite.isDisplayed(), true);
    }

    public void displayAmazonRapid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonRapid.isDisplayed(), true);
    }

    public void getAmazonRapidTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonRapid.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Rapids");
    }

    public void displayAmazonWebServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonWebServices.isDisplayed(), true);
    }

    public void displayAmazonAudible() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonAudible.isDisplayed(), true);
    }

    public void displayBookDepository() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonBookDepository.isDisplayed(), true);
    }

    public void displayBoxOfficeMojo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(boxOfficeMojo.isDisplayed(), true);
    }

    public void displayComiXology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(comiXology.isDisplayed(), true);
    }

    public void displayCreateSpace() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(createSpace.isDisplayed(), true);
    }

    public void displayDPReview() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(dpReview.isDisplayed(), true);
    }

    public void displayEastDance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(eastDance.isDisplayed(), true);
    }

    public void displayFabric() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(fabric.isDisplayed(), true);
    }

    public void displayGoodreads() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(goodreads.isDisplayed(), true);
    }

    public void displayIMDB() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(imdb.isDisplayed(), true);
    }

    public void displayIMDBpro() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(imdbPro.isDisplayed(), true);
    }

    public void displayKindleDirectPublishing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(kindleDirectPublishing.isDisplayed(), true);
    }

    public void displayPrimeVideoDirect() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(primeVideoDirect.isDisplayed(), true);
    }

    public void getPrimeVideoDirectTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        primeVideoDirect.click();
        Assert.assertEquals(driver.getTitle(), "Prime Video Direct");
    }

    public void displayShopbop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(shopbop.isDisplayed(), true);
    }

    public void displayWoot() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(woot.isDisplayed(), true);
    }

    public void displayZappos() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(zappos.isDisplayed(), true);
    }

    public void displayRing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(ring.isDisplayed(), true);
    }

    public void displayEeroWifi() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(eeroWifi.isDisplayed(), true);
    }

    public void displayNeighborApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(neighborsApp.isDisplayed(), true);
    }

    public void displaySubscribeWithAmazon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(subscribeWithAmazon.isDisplayed(), true);
    }

    public void getSubscribeWithAmazonTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        subscribeWithAmazon.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Subscription Boxes – Choose from over 200 boxes");
    }

    public void displayPillPack() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(pillPack.isDisplayed(), true);
    }

    public void displayAmazonSecondChance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonSecondChance.isDisplayed(), true);
    }

    public void getAmazonSecondChanceTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonSecondChance.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Second Chance");
    }

    public void displayConditionsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(conditionsOfUse.isDisplayed(), true);
    }

    public void getConditionsOfUseTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        conditionsOfUse.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Help: Conditions of Use");
    }

    public void displayPrivacyNotice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(privacyNotice.isDisplayed(), true);
    }

    public void getPrivacyNoticeTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyNotice.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Help: Amazon.com Privacy Notice");
    }

    public void displayInterestBasedAds() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(interestBasedAds.isDisplayed(), true);
    }

    public void getInterestBasedAdsTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        interestBasedAds.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Help");
    }

    public void displayCareers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(careers.isDisplayed(), true);
    }

    public void getCareersTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        careers.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.jobs: Help us build Earth’s most customer-centric company.");
    }

    public void displayBlog() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(blog.isDisplayed(), true);
    }

    public void displayAboutAmazon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(aboutAmazon.isDisplayed(), true);
    }

    public void getAboutAmazonTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aboutAmazon.click();
        Assert.assertEquals(driver.getTitle(), "About Amazon");
    }

    public void displayInvestorRelations() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(investorRelations.isDisplayed(), true);
    }

    public void getInvestorRelationsTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        investorRelations.click();
        Assert.assertEquals(driver.getTitle(), "Investor Relations | Amazon.com, Inc. - IR");
    }

    public void displayAmazonDevices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(amazonDevices.isDisplayed(), true);
    }

    public void getAmazonDevicesTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonDevices.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Devices - Official Site - Kindle, Fire, Echo devices");
    }

}

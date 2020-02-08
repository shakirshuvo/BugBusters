package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
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

    public void getAmaonHomePageTitle() {

        AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    public void clickOnTodaysDealsTab() {
        getTodaysDealsWebElement().click();
        Assert.assertEquals(dealsAndPromotionsText.isDisplayed(), true);
    }

    public void clickOnHelpTab() {
        getHelpWebElement().click();
        Assert.assertEquals(checkIfGetHelpText(), true);
    }

    public void clickOnRegistryTab() {
        getRegistryWebElement().click();
    }

    public void clickOnGiftCardsTab() {
        getGiftCardsWebElement().click();
    }

    public void clickOnSellTab() {
        getSellWebElement().click();
    }

    public void clickOnYourAmazonComTab() {
        getYourAmazonComWebElement().click();
    }

    public void clickOnHelloSignInTab() {
        getHelloSignInWebElementWebElement().click();
    }

    public void clickOnReturnsAndOrderTab() {
        getReturnAndOrdersWebElement().click();
        Assert.assertEquals(signInText.isDisplayed(), true);
    }

    public void clickOnCartTab() {
        getCartWebElement().click();
        Assert.assertEquals(yourShoppingCartIsEmptyText.isDisplayed(), true);
    }

    public void clickMusic() {
        getMusic().click();
        Assert.assertEquals(amazonMusicLogo.isDisplayed(), true);
    }

    public boolean checkIfregisterWithAmazonPic() {
        return getRegisterWithAmazonPic().isDisplayed();
    }

    public void registryTitle() {
        registryWebElement.click();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(driver.getTitle(), "Amazon.com: : Registry");
    }

    public void registryTab() {
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


}

package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonCartPage extends CommonAPI {

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(id = "nav-cart-count")
    public WebElement cartTab;

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/h1[1]")
    public WebElement yourShoppingCartIsEmptyTest;

    @FindBy(id = "a-autoid-1-announce")
    public WebElement qtyDropdown;

    @FindBy(name = "proceedToRetailCheckout")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//a[text()='Shop now']")
    public WebElement shopNowTab;

    @FindBy(xpath = "//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")
    public WebElement westernDigital2TBElementsHD;

    @FindBy(css = "input[value='Delete']")
    public WebElement deleteFromCart;

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/h1[1]")
    public WebElement emptyShoppingCart;

    @FindBy(xpath = "//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
    public WebElement cartButton;

    @FindBy(xpath = "//a[text()='Computers']")
    public WebElement shopNowComputerTab;

    @FindBy(id = "sort")
    public WebElement sortDropDown;

    @FindBy(xpath = "//a[text()='Price: Low to High']")
    public WebElement sortPriceLowToHigh;

    public void navigateToCartPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cartTab.click();
        Assert.assertEquals(yourShoppingCartIsEmptyTest.isDisplayed(), true);
    }

    public void getCartPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cartTab.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");
    }

    public void addWD2TBElementsHDToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopNowTab.click();
        shopNowComputerTab.click();
        westernDigital2TBElementsHD.click();
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        cartButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");
    }

    public void deleteWD2TBElementsHDToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopNowTab.click();
        shopNowComputerTab.click();
        westernDigital2TBElementsHD.click();
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        cartButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        deleteFromCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(emptyShoppingCart.isDisplayed(), true);
    }

    public void checkoutWD2TBElementsHD() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopNowTab.click();
        shopNowComputerTab.click();
        westernDigital2TBElementsHD.click();
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        cartButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        proceedToCheckout.click();
        Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
    }

    public void getQtyDropdown() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        addWD2TBElementsHDToCart();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> element = getListOfWebElementsById("a-autoid-1-announce");
        List<String> listOfText = getListOfString(element);
        for (String st : listOfText) {
            System.out.println(st);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}

package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class AmazonCartPage extends CommonAPI {

    @FindBy(id = "nav-cart-count")
    public WebElement cartTab;

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/h1[1]")
    public WebElement yourShoppingCartIsEmptyTest;

    public void navigateToCartPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cartTab.click();
        Assert.assertEquals(yourShoppingCartIsEmptyTest.isDisplayed(), true);
    }

    public void getCartPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cartTab.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");
    }
}

package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonCartPageTest extends CommonAPI {

    @Test (priority = 1)
    public void testCartTab() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.navigateToCartPage();
    }

    @Test (priority = 2)
    public void testCartPageTitle() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.getCartPageTitle();
    }

    // This test tests adding WD 2TB Elements Portable External Hard Drive to Amazon cart
    @Test (priority = 3)
    public void testAddWD2TBElementsHDToCart() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.addWD2TBElementsHDToCart();
    }

    @Test (priority = 4)
    public void testCheckoutWD2TBElementsHDToCart() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.checkoutWD2TBElementsHD();
    }

    @Test(priority = 5)
    public void testDeleteWD2TBElementsHDToCart() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.deleteWD2TBElementsHDToCart();
    }

    @Test (priority = 6)
    public void testQtyDropdown() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.getQtyDropdown();
    }
}

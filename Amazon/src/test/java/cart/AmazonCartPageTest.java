package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonCartPageTest extends CommonAPI {

//    @Test
//    public void testCartTab() {
//        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
//        amazonCartPage.navigateToCartPage();
//    }
//
//    @Test
//    public void testCartPageTitle() {
//        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
//        amazonCartPage.getCartPageTitle();
//    }
//
//    // This test tests adding WD 2TB Elements Portable External Hard Drive to Amazon cart
//    @Test
//    public void testAddWD2TBElementsHDToCart() {
//        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
//        amazonCartPage.addWD2TBElementsHDToCart();
//    }
//
//    @Test
//    public void testCheckoutWD2TBElementsHDToCart() {
//        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
//        amazonCartPage.checkoutWD2TBElementsHD();
//    }

    @Test
    public void testQtyDropdown() {
        AmazonCartPage amazonCartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazonCartPage.getQtyDropdown();
    }
}

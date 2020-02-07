package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonCartPageTest extends CommonAPI {

    @Test
    public void testCartTab() {
        AmazonCartPage amazoncartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazoncartPage.navigateToCartPage();
    }

    @Test
    public void testCartPageTitle() {
        AmazonCartPage amazoncartPage = PageFactory.initElements(driver, AmazonCartPage.class);
        amazoncartPage.getCartPageTitle();
    }
}

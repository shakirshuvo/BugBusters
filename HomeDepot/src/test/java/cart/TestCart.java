package cart;

import base.CommonAPI;
import home.HomeDepotHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends CommonAPI {

    @Test
    public void testCartButton() {
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.cartWebElement.click();
        Assert.assertEquals(cart.cartWebElement.isDisplayed(), true);
    }
}

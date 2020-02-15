package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckout extends CommonAPI {

    @Test
    public void testCartButton() {
        Checkout cart = PageFactory.initElements(driver, Checkout.class);
        cart.cartWebElement.click();
        Assert.assertEquals(cart.cartWebElement.isDisplayed(), true);

    }
}

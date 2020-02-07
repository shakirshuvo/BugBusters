package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPaypal extends CommonAPI {
    @Test
    public void testCartButton() {
        CheckoutPaypal cart = PageFactory.initElements(driver, CheckoutPaypal.class);
        cart.PaymentWebElement.click();
        Assert.assertEquals(cart.PaymentWebElement.isDisplayed(), true);

    }
}
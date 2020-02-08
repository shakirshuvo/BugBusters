package creditServices;

import base.CommonAPI;
import cart.Checkout;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreditServices extends CommonAPI {

    @Test
    public void testCartButton() {
        Credit creditServices = PageFactory.initElements(driver, Credit.class);
        creditServices.PaymentWebElement.click();
        Assert.assertEquals(creditServices.PaymentWebElement.isDisplayed(), true);

    }

}

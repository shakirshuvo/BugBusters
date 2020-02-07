package forThePro;

import base.CommonAPI;
import cart.Cart;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForThePro extends CommonAPI {

    @Test
    public void testCartButton() {
        ForThePro forThePro = PageFactory.initElements(driver, ForThePro.class);
        forThePro.ProWebElement.click();
        Assert.assertEquals(forThePro.ProWebElement.isDisplayed(), true);

    }
}

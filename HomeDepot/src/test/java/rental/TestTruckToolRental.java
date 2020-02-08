package rental;

import base.CommonAPI;
import cart.Cart;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTruckToolRental extends CommonAPI {

    @Test
    public void testCartButton() {
        TruckToolRental rental = PageFactory.initElements(driver, TruckToolRental.class);
        TruckToolRental.ToolWebElement.click();
        Assert.assertEquals(TruckToolRental.ToolWebElement.isDisplayed(), true);


    }
}


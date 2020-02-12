package protection;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BuysProtectionTest extends CommonAPI {

    @Test
    public void aliExpressBP() {
        BuysProtection buysProtection = PageFactory.initElements(driver, BuysProtection.class);
        buysProtection.clickOnBuyProtection();

    }
}

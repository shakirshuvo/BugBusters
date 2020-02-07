package signIN;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import signin.SignIN;

public class TestSiGnIn extends CommonAPI {

    @Test
    public void testStoreFinderButton() {
        SignIN siGnIn = PageFactory.initElements(driver, SignIN.class);
        siGnIn.toolWebElement.click();
        Assert.assertEquals(siGnIn.toolWebElement.isDisplayed(), true);
    }
}

package localAd;

import base.CommonAPI;
import localAds.LocalAds;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLocalAds extends CommonAPI {

    @Test
    public void testCartButton() {
        LocalAds localAds = PageFactory.initElements(driver, LocalAds.class);
        LocalAds.localAdsWebElement.click();
        Assert.assertEquals(LocalAds.localAdsWebElement.isDisplayed(), true);


    }
}

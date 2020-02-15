package localAds;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocalAds extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div[4]/div/ul/li[6]/a")
    public static WebElement localAdsWebElement;

}

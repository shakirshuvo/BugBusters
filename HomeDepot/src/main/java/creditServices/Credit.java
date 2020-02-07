package creditServices;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Credit extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[5]/a")
    public static WebElement PaymentWebElement;
}

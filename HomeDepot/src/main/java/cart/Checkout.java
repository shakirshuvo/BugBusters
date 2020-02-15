package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends CommonAPI {

    @FindBy(xpath = "//*[@id=root]/article/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/form/button")
    public static WebElement cartWebElement;
}

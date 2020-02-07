package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"root\"]/article/div/div[3]/div/div/div/div/div[1]/div[6]/form/button/span")
    public static WebElement cartWebElement;
}

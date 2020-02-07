package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPaypal extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"headerCart\"]/div[1]/span[1]")
    public static WebElement PaymentWebElement;

}



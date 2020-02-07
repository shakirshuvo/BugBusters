package signin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIN extends CommonAPI {

    @FindBy(xpath = "/html/body/div[4]/list-root/div[2]/div[1]/list-summary/div/div[1]/span/a/span")
    public static WebElement toolWebElement;


}

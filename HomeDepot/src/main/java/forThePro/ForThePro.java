package forThePro;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForThePro extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"taskLinkPro\"]")
    public static WebElement ProWebElement;
}

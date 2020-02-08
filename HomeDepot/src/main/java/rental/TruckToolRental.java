package rental;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TruckToolRental extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[2]/a")
    public static WebElement ToolWebElement;

}

package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeDepotHomePage extends CommonAPI {



    @FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
    public static WebElement myAccountWebElement;

}
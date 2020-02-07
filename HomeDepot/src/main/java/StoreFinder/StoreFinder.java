package StoreFinder;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class StoreFinder extends CommonAPI {



        @FindBy(xpath = "//*[@id=\"myStore\"]/a/span[2]")
        public static WebElement StoreLocatorWebElement;
}

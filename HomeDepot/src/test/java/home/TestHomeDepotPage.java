package home;

import base.CommonAPI;
import home.HomeDepotHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeDepotPage extends CommonAPI {

    @Test
    public void testMyAccountButton() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.myAccountWebElement.click();
        Assert.assertEquals(homeDepotHomePage.myAccountWebElement.isDisplayed(), true);
    }
}


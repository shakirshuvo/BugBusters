package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;

public class AmazonSearchPageTest extends CommonAPI {

    @Test
    public void searchItems() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.clearTypeAndClickOnSearch();
        Assert.assertNotNull(amazonSearchPage.getItems(), "watch");
        Assert.assertNotNull(amazonSearchPage.getItems(), "Rage Against The Machine");
    }

    @Test
    public void searchItemsIphone() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.testProductSearch();
        Assert.assertNotNull("iPhone");
    }
}

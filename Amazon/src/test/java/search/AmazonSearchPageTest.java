package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AmazonSearchPageTest extends CommonAPI {

    // Tests hardcoded search item
    @Test
    public void searchItemsHardcoded() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.clearTypeAndClickOnSearch();
        Assert.assertNotNull(amazonSearchPage.getItems(), "watch");
        Assert.assertNotNull(amazonSearchPage.getItems(), "Rage Against The Machine");
    }

    @Test
    public void searchItemsIphone() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.doProductSearch();
        Assert.assertNotNull("iPhone");
    }

    // Tests data from MySQL database
    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        AmazonSearchPage searchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

    @Test
    public void allDropDown() {
        List<WebElement> element = getListOfWebElementsById("searchDropdownBox");
        List<String> listOfText = getListOfString(element);
        for (String st : listOfText) {
            System.out.println(st);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }

}

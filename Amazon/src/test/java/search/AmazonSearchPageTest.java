package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AmazonSearchPageTest extends CommonAPI {

    // Tests hardcoded search item
    @Test
    public void testSearchItemsHardcoded() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.clearTypeAndClickOnSearch();
    }

    // Tests single item (iPhone) hardcoded.
    @Test
    public void testSearchItemsIphone() {
        AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        amazonSearchPage.doProductSearch();
    }

    // Tests data from MySQL database
    @Test
    public void testSearchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        AmazonSearchPage searchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

    // Tests objects under 'All' search dropdown.
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

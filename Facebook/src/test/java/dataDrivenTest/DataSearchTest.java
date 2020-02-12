package dataDrivenTest;

import base.CommonAPI;
import dataDriven.DataDrivenSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DataSearchTest extends CommonAPI {
    // Tests hardcoded search item
    @Test
    public void testSearchItemsHardcoded() {
        DataDrivenSearch search = PageFactory.initElements(driver, DataDrivenSearch.class);
   search.logInFacebook("marjanasiu@gmail.com","Atlyfe@2002");
    }

    // Tests single item (iPhone) hardcoded.
    @Test
    public void testSearchItemsIphone() {
        DataDrivenSearch search = PageFactory.initElements(driver, DataDrivenSearch.class);
        search.logInFacebook("marjanasiu@gmail.com","Atlyfe@2002");
        search.doProductSearch();
    }

    // Tests data from MySQL database
    @Test
    public void testSearchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        DataDrivenSearch searchPage = PageFactory.initElements(driver, DataDrivenSearch.class);
        searchPage.logInFacebook("marjanasiu@gmail.com","Atlyfe@2002");
        searchPage.searchItemsAndSubmitButton();
    }

    // Tests objects under 'All' search dropdown.
    @Test
    public void allDropDown() {
        DataDrivenSearch searchPage = PageFactory.initElements(driver, DataDrivenSearch.class);
        searchPage.logInFacebook("marjanasiu@gmail.com","Atlyfe@2002");
        List<WebElement> element = getListOfWebElementsById("searchBox");
        List<String> listOfText = getListOfString(element);
        for (String st : listOfText) {
            System.out.println(st);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }

}

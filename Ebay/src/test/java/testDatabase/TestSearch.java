package testDatabase;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.EbaySearch;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearch extends CommonAPI {
    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        EbaySearch searchPage = PageFactory.initElements(driver,EbaySearch.class);
        searchPage.searchItemsAndSubmitButton();
    }
}

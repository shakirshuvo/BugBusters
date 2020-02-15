import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchPage;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonAPI {

    // This test tests Data Driven.
    @Test
    public void testMySQLsearchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage searchPage = PageFactory.initElements (driver, SearchPage.class);
        searchPage.searchItemsAndSubmit();
    }
}

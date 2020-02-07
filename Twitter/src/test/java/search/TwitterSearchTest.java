package search;

import base.CommonAPI;
import home.TwitterHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TwitterSearchTest extends CommonAPI {

    @Test
    public void searchMemeTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        twitterSearch.searchMemes();
    }
}

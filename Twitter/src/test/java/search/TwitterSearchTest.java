package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TwitterSearchTest extends CommonAPI {

    @Test
    public static void searchFor() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        twitterSearch.logIn("kingkimochi305@gmail.com", "kimochi305");
        twitterSearch.searchFor();


    }

//    @Test
//    public void searchMemeTest() {
//        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
//        twitterSearch.searchMemes();
//    }
}

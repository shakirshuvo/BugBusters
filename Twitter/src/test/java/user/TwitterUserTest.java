package user;

import base.CommonAPI;
import home.TwitterHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.TwitterSearch;

public class TwitterUserTest extends CommonAPI {

    @Test
    public void testUserClicksOnHomeButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tu.clickOnHomeButton();
    }

    @Test
    public void testUserClicksOnTweetButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tu.clickOnTweetButton();
    }

//    @Test
//    public void testUserClicksOnNotificationsButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnNotificationsButton();
//    }

//    @Test
//    public void testUserClicksOnMessagesButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnMessagesButton();
//
//    }
//
//    @Test
//    public void testUserClicksOnBookmarkButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnBookmarkButton();
//
//    }
//
//    @Test
//    public void testUserClicksOnListsButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnListsButton();
//
//    }
//
//    @Test
//    public void testUserClicksOnProfileButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnProfileButton();
//
//    }
//
//    @Test
//    public void testUserClicksOnExploreButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnExploreButton();
//
//    }
//
//    @Test
//    public void testUserClicksOnTrendsSettingButton() {
//        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        tu.clickOnTrendsSettingButton();
//
//    }

}

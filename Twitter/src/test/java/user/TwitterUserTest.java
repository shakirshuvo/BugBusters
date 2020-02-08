package user;

import base.CommonAPI;
import home.TwitterHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TwitterUserTest extends CommonAPI {

    @Test
    public void testUserClicksOnHomeButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(tu.homeButtonWebElement.isDisplayed(), true);

    }

    @Test
    public void testUserClicksOnTweetButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/compose/tweet";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Test
    public void testUserClicksOnNotificationsButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/notifications";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testUserClicksOnMessagesButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/messages";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testUserClicksOnBookmarkButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/i/bookmarks";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testUserClicksOnListsButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/KhanKimochi/lists";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testUserClicksOnProfileButton() {
        TwitterUser tu = PageFactory.initElements(driver, TwitterUser.class);
        String expectedUrl = "https://twitter.com/KhanKimochi";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}

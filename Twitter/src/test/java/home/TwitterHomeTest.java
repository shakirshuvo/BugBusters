package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterHomeTest extends CommonAPI {

    @Test
    public void testUserCanLoginToTwitterWithValidCredentials() {
        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
        th.logIn("roflcopter6@hotmail.com", "kennygotkilled");
        String expectedUrl = "https://twitter.com/home";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testUserCannotLogInToTwitterWithInvalidCredentials() {
        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
        th.logIn("ererer", "7890");
        String expectedUrl = "https://twitter.com/login/error?username_or_email=ererer&redirect_after_login=%2F";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}

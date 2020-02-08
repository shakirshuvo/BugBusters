package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterHomeTest extends CommonAPI {

    @Test (priority = 1)
    public void testUserCanLoginToTwitterWithValidCredentials() {
        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
        th.logIn("kingkimochi305@gmail.com", "kimochi305");
        String expectedUrl = "https://twitter.com/home";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test (priority = 2)
    public void testUserCannotLogInToTwitterWithInvalidCredentials() {
        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
        th.logIn("ererer", "7890");
        String expectedUrl = "https://twitter.com/login/error?username_or_email=ererer&redirect_after_login=%2F";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test (priority = 3)
    public void testUserImplementsWrongPassword() {
        TwitterHome th = PageFactory.initElements(driver, TwitterHome.class);
        th.logIn("kingkimochi305@gmail.com", "wrongpass");
        String expectedUrl = "https://twitter.com/login/error?username_or_email=kingkimochi305%40gmail.com&redirect_after_login=%2F";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}

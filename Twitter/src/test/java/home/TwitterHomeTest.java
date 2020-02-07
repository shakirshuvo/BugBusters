package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TwitterHomeTest extends CommonAPI {

    @Test
    public void loginTest() {
        TwitterHome twitterHome = PageFactory.initElements(driver, TwitterHome.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterHome.login();
    }
}

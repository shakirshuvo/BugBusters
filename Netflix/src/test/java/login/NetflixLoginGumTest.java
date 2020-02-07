package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NetflixLoginGumTest extends CommonAPI {

    @Test
    public void testNetflixLoginTitle() {
        NetflixLoginGum netflixLoginGum = PageFactory.initElements(driver, NetflixLoginGum.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixLoginGum.getNetflixSignInTitle();
    }
    @Test
    public void netflixLogINGum(){
        NetflixLoginGum netflixLoginGum = PageFactory.initElements(driver, NetflixLoginGum.class);
        netflixLoginGum.clickSignIN();
        netflixLoginGum.typeSignInEmail();
        netflixLoginGum.typeSignInPassword();
        netflixLoginGum.clickOnSignInButton();
        netflixLoginGum.clickOnprofileIconGum();
    }
}

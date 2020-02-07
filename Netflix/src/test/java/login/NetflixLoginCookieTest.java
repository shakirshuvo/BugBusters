package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NetflixLoginCookieTest  extends CommonAPI {
    @Test
    public void testNetflixLoginTitle() {
        NetflixLoginCookie netflixLogInCookie = PageFactory.initElements(driver, NetflixLoginCookie.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixLogInCookie.getNetflixSignInTitle();
    }
    @Test
    public void netflixLogINCookie(){
        NetflixLoginCookie netflixLoginCookie = PageFactory.initElements(driver, NetflixLoginCookie.class);
        netflixLoginCookie.clickSignINC();
        netflixLoginCookie.typeSignInEmail();
        netflixLoginCookie.typeSignInPassword();
        netflixLoginCookie.clickOnSignInButton();
        netflixLoginCookie.clickOnprofileIconCookie();


    }
}

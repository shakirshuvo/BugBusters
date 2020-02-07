package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NetflixLoginHassanTest extends CommonAPI {
    @Test
    public void testNetflixLoginTitle() {
        NetflixLogInHassan netflixLogInHassan = PageFactory.initElements(driver, NetflixLogInHassan.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixLogInHassan.getNetflixSignInTitle();
    }
    @Test
    public void netflixLogIN(){
        NetflixLogInHassan netflixLogInHassan = PageFactory.initElements(driver, NetflixLogInHassan.class);
        netflixLogInHassan.clickSignIN();
        netflixLogInHassan.typeSignInEmail();
        netflixLogInHassan.typeSignInPassword();
        netflixLogInHassan.clickOnSignInButton();
        netflixLogInHassan.clickOnprofileIconHassan();
    }
}

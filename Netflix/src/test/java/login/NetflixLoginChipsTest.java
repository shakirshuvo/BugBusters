package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NetflixLoginChipsTest extends CommonAPI {

    @Test
    public void testNetflixLoginTitle() {
        NetflixLoginChips netflixLoginChips = PageFactory.initElements(driver, NetflixLoginChips.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixLoginChips.getNetflixSignInTitle();
    }
    @Test
    public void netflixLogINChips(){
        NetflixLoginChips netflixLoginChips = PageFactory.initElements(driver, NetflixLoginChips.class);
        netflixLoginChips.clickSignINCh();
        netflixLoginChips.typeSignInEmail();
        netflixLoginChips.typeSignInPassword();
        netflixLoginChips.clickOnSignInButton();
        netflixLoginChips.clickOnprofileIconChips();
    }
}

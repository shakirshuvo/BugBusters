package login;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NetflixLoginChocolateTest extends CommonAPI {

    @Test
    public void testNetflixLoginChocolateTitle() {
        NetflixLoginChocolate netflixLoginChocolate = PageFactory.initElements(driver, NetflixLoginChocolate.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixLoginChocolate.getNetflixSignInTitle();
    }
    @Test
    public void netflixLogIN(){
        NetflixLoginChocolate netflixLoginChocolate = PageFactory.initElements(driver, NetflixLoginChocolate.class);
        netflixLoginChocolate.clickSignInCho();
        netflixLoginChocolate.typeSignInEmail();
        netflixLoginChocolate.typeSignInPassword();
        netflixLoginChocolate.clickOnSignInButton();
        netflixLoginChocolate.clickOnprofileIconChocolate();
    }
}

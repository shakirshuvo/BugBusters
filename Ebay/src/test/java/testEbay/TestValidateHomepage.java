package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.SignIn;
import pageObjM.ValidateHomePage;

public class TestValidateHomepage extends CommonAPI {


    @Test(enabled = true)
    public void checkDailydeals() {
        ValidateHomePage validateHomePage = PageFactory.initElements (driver, ValidateHomePage.class);
        validateHomePage.validateDailyDeals ();
    }
    @Test(enabled = true)
    public void checkBrandOutlet() {
        ValidateHomePage validateHomePage = PageFactory.initElements (driver, ValidateHomePage.class);
        validateHomePage.validateBrandOutlet ();
    }
    @Test(enabled = true)
    public void checkGetElement() {
        ValidateHomePage validateHomePage = PageFactory.initElements (driver, ValidateHomePage.class);
        validateHomePage.validateSearchPageDisplayed ();
    }
    @Test
    public void checkDropDown() throws InterruptedException {
        ValidateHomePage validateHomePage =PageFactory.initElements (driver, ValidateHomePage.class);
        validateHomePage.validateTestDropDown ();
    }
}

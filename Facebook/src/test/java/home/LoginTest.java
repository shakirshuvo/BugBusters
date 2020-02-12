package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {
    @Test
    public void testUserCanLogInToFacebook() {
       LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
       loginPage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
    }
}

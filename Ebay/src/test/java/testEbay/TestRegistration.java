package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.Registration;

public class TestRegistration extends CommonAPI {
    @Test
    public void validateRegistration(){
        Registration registration = PageFactory.initElements (driver,Registration.class);
        Registration.clickRegistration();
        Registration.FirstName ();
        Registration.LastName();
        Registration.Email();
        Registration.getPassword ();
        Registration.getCheckBox ();
        Registration.getCreateAccountButton ();
    }
}

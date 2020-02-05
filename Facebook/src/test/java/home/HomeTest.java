package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://facebook.com");
        HomePage hp = new HomePage();
        hp.login("sheulyahmed4@gmail.com","Atlyfe@2019");
    }
}

//https://github.com/shakirshuvo/BugBusters.git












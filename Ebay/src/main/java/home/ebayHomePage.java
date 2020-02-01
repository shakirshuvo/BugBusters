package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ebayHomePage extends CommonAPI {


    @Test(enabled = false)
    public void searchItem() {

        System.out.println (driver.getTitle ());

        clickOnElement ("//input[@type='text']");
        typeOnElementNEnter ("//input[@type='text']", "iphone11");
        clickOnElement ("//input[@type='submit']");
    }
    //push recent code

    @Test(enabled = false)

    public void logIn() {

        clickOnElement ("//a[contains(text(),'Sign in')]");
        typeOnElement ("/a[contains(text(),'Sign in')]", "sarah.kh");
        typeOnElement ("//input[@id='pass']", "peoplentech");
        clickOnElement ("//button[@id='sgnBt']");
    }

    @Test
    public void registration() {
        //System.out.println (driver.getTitle ());

          clickOnElement ("span#gh-ug-flex > a");

          typeOnElement ("input[name='firstname']", "John");
          typeOnElement ("input[name='lastname']", "Doe");
          typeOnElement ("input[name='email']", "jdoe12399100@yahoo.com");
          typeOnElement ("input[name='reg_email_confirmation__']", "jdoe12399100@yahoo.com");
          typeOnElement ("input#PASSWORD", "peopleNtech");
          clickOnElement ("//input[@aria-label='Show password']");
          clickOnElement ("button[id='ppaFormSbtBtn']");
    }
}



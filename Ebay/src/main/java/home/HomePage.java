package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test(enabled = false)
    public void searchItem(){

        System.out.println (driver.getTitle ());

        clickOnElement ("//input[@type='text']");
        typeOnElementNEnter ("//input[@type='text']","iphone11");
        clickOnElement ("//input[@type='submit']");
    }
    //push recent code

    @Test(enabled = true)

    public void logIn(){

        clickOnElement ("//a[contains(text(),'Sign in')]");
        typeOnElement ("/a[contains(text(),'Sign in')]","sarah.kh");
        typeOnElement ("//input[@id='pass']","peoplentech");
        clickOnElement ("//button[@id='sgnBt']");
    }
}



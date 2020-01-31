package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class EbayHome extends CommonAPI {

    @Test
    public void searchItem(){

        System.out.println (driver.getTitle ());

        clickOnElement ("//input[@type='text']");
        typeOnElementNEnter ("//input[@type='text']","iphone11");
        clickOnElement ("//input[@type='submit']");
    }
    //push recent code

}

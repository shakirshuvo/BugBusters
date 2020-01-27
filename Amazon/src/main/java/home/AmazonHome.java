package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class AmazonHome extends CommonAPI {

    @Test
    public void amazonSearchEngineTest() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("twotabsearchtextbox", "matcha green tea");
        clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");
        Thread.sleep(2000);
    }
}

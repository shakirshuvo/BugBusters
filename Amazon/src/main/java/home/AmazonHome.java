package home;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AmazonHome extends CommonAPI {

    @Test
    public void amazonSearchEngineTest() throws InterruptedException {
        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearField("twotabsearchtextbox");
            typeOnElement("twotabsearchtextbox", list.get(i));
            clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");
        }
        Thread.sleep(1000);

    }

    public List<String> getItems() {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("green tea kit kat");
        itemsList.add("godiva dark chocolate");
//        itemsList.add("samsung galaxy s10");
//        itemsList.add("gopro");
//        itemsList.add("headphone");

        return itemsList;

    }
}

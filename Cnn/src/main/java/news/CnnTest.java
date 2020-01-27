package news;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CnnTest extends CommonAPI {

    @Test
    public void newsUpdate() throws InterruptedException {
        clickOnElement("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[4]/a");
        Thread.sleep(2000);
    }
}

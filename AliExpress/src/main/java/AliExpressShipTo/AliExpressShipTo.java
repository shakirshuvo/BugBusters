package AliExpressShipTo;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class AliExpressShipTo extends CommonAPI {
    @Test
    public void testUntitledTestCase1() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.linkText("United States")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("Afghanistan")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[2]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase3() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("Albania")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[3]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase4() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("Albania")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[4]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase5() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("Alderney")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[4]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase6() throws Exception {
        driver.get("https://ar.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span/i")).click();
        driver.findElement(By.linkText("Algeria")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div/div/div/ul/li[6]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase7() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/a/span/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[7]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase8() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("Andorra")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[8]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase9() throws Exception {
        driver.get("https://pt.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.linkText("Angola")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[11]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase10() throws Exception {
        driver.get("https://es.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.linkText("Argentina")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[20]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase11() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("Bangladesh")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[20]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase12() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("Curacao")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[60]/span/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase13() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("Guyana")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[96]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase14() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("India")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[159]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }

}

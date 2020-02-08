package ChangeCurrency;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AliExpressCurrency extends CommonAPI {

    @Test
    public void aliexpresscurrency1() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[2]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }

    @Test
    public void aliexpresscurrency2() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void aliexpresscurrency3() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void aliexpresscurrency4() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[5]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void aliexpresscurrency5() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[5]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[6]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void aliexpresscurrency6() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[5]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[6]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("XCD ( East Carribean Dollar )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[7]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void aliexpresscurrency7() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[5]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[6]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("XCD ( East Carribean Dollar )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[7]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[8]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.close();
    }
    @Test
    public void aliexpresscurrency8() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[5]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[6]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("XCD ( East Carribean Dollar )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[7]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[8]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/span")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[9]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.close();
    }
    @Test
    public void testUntitledTestCase9() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.linkText("EGP ( Egyptian Pound )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[14]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase10() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.linkText("BDT ( Bangladeshi Taka )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[14]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase11() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.linkText("PKR ( Pakistan Rupee )")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[3]/div/ul/li[109]/a/em")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }



}

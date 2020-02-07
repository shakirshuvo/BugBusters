package ChangeLanguage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class AliExpressChangeLanguage extends CommonAPI {

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Русский")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get("https://aliexpress.ru/home.htm");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[4]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Português")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase3() throws Exception {
        driver.get("https://pt.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Español")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();

    }
    @Test
    public void testUntitledTestCase4() throws Exception {
        driver.get("https://es.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Français")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase5() throws Exception {
        driver.get("https://fr.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Polskie")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase6() throws Exception {
        driver.get("https://pl.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[5]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("עברית")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase7() throws Exception {
        driver.get("https://he.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Italiano")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase8() throws Exception {
        driver.get("https://it.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[4]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Türkçe")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase9() throws Exception {
        driver.get("https://tr.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("Deutsch")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase10() throws Exception {
        driver.get("https://de.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[4]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("한국어")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase11() throws Exception {
        driver.get("https://ko.aliexpress.com/");
        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("العربية")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    @Test
    public void testUntitledTestCase12() throws Exception {
        driver.get("https://ar.aliexpress.com/");
        driver.findElement(By.xpath("//a[@id='switcher-info']/span[3]")).click();
        driver.findElement(By.xpath("//div[@id='nav-global']/div[3]/div/div/div/div[2]/div/span")).click();
        driver.findElement(By.linkText("English")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
}

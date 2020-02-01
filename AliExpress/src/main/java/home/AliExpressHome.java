package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class AliExpressHome extends CommonAPI {

    @Test
    public void testUntitledTestCase1() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("search-key")).click();
        driver.findElement(By.id("search-key")).clear();
        driver.findElement(By.id("search-key")).sendKeys("final fantasy");

    }

    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("search-key")).click();
        driver.findElement(By.id("search-key")).clear();
        driver.findElement(By.id("search-key")).sendKeys("Lighters");

    }

}
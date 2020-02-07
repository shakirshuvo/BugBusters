package AliExpressSignIn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInAliExpress extends CommonAPI {

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
        driver.findElement(By.id("fm-login-id")).click();
        driver.findElement(By.id("fm-login-id")).clear();
        driver.findElement(By.id("fm-login-id")).sendKeys("ShadowGunner92@gmail.com");
        driver.findElement(By.id("fm-login-password")).click();
        driver.findElement(By.id("fm-login-password")).clear();
        driver.findElement(By.id("fm-login-password")).sendKeys("American92");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

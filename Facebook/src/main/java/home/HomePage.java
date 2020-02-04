package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test(enabled = false)
    public void login(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }

}






















package home;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class AliExpressHome extends CommonAPI {

    @FindBy(id = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='fm-login-id']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@id='fm-login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//form[@id='login-form']//button[@type='submit']")
    public WebElement loggingIn;

public void signInOnAliExpress () {
    signIn.click();
    passwordInput.sendKeys("ShadowGunner92@gmail.com");
}






    @Test
    public void HomeTest1() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("search-key")).click();
        driver.findElement(By.id("search-key")).clear();
        driver.findElement(By.id("search-key")).sendKeys("final fantasy");

    }

    @Test
    public void HomeTest2 () throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.id("search-key")).click();
        driver.findElement(By.id("search-key")).clear();
        driver.findElement(By.id("search-key")).sendKeys("Lighters");

    }

}


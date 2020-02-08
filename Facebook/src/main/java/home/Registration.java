package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Registration extends CommonAPI {

    @Test
    public void registration() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Sheuly");
        driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Ahmed");
        driver.findElement(By.name("reg_email__")).sendKeys("sheulyahmed4@gmail.com");
        driver.findElement(By.xpath("//input[@id='u_0_10']")).sendKeys("Atlyfe@2019");
    
    }
}




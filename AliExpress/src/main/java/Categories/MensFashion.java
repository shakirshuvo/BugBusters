package Categories;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MensFashion extends CommonAPI {

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.xpath("//div[@id='home-firstscreen']/div[2]/div/div[2]/div/div/span")).click();
        driver.findElement(By.linkText("Men's Fashion")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase2() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.xpath("//div[@id='home-firstscreen']/div[2]/div/div[2]/div/div/span")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Hot Sale")).click();

    }

    @Test
    public void testUntitledTestCase3() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Hoodies & Sweatshirts')])[2]")).click();
        driver.findElement(By.xpath("//div[@id='home-firstscreen']/div[2]/div/div[2]/div/div/span")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//a[contains(text(),'Hoodies & Sweatshirts')])[2]")).click();
    }

    @Test
    public void testUntitledTestCase4() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.linkText("Men's Fashion")).click();
        driver.findElement(By.linkText("Tops & Tees")).click();

    }

    @Test
    public void testUntitledTestCase5() throws Exception {
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.linkText("x")).click();
        driver.findElement(By.linkText("Men's Fashion")).click();
        driver.findElement(By.linkText("Tops & Tees")).click();
        driver.findElement(By.xpath("//div[@id='home-firstscreen']/div[2]/div/div[2]/div/div/span")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sweaters')])[2]")).click();
    }
}

package home;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class NetflixHome extends CommonAPI {

@Test
    public void netflixFirstPage() throws InterruptedException {
    System.out.println(driver.getTitle());
    clickOnElement(".redButton");
    getCurrentPageUrl();
    typeOnElement("#id_userLoginId", "hassanbhuiyan@aol.com");
    typeOnElement("#id_password", "semp1990");
    clickOnElement(".login-button");
    Thread.sleep(2000);
    clickByXpath("//div[@class='profile-icon']");
    sleepFor(3);
    clickByXpath("//a[@href='/browse/genre/83']");
    clickByXpath("//a[@href='/browse/genre/34399']");
    clickByXpath("//a[@href='/latest']");
    sleepFor(3);
    clickOnElement("//a[@href='/browse/my-list']");
    clickOnElement("//span[@class='icon-search']");









}








}
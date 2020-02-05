package home;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CnnHomePageTest extends CommonAPI {

    @Test (priority = 1)
    public void cnnHomePageTitle() {
        CnnHomePage amazonHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        Assert.assertEquals(driver.getTitle(), "CNN - Breaking News, Latest News and Videos");
    }

    @Test
    public void usTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnUsTab();
    }
    @Test
    public void worldTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnWorldTab();
    }
    @Test
    public void politicsTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnPoliticsTab();
    }
    @Test
    public void businessTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnBusinessTab();
    }
    @Test
    public void opinionTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }
    @Test
    public void healthTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
    }
    @Test
    public void entertainmentTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnEntertainmentTab();
    }
    @Test
    public void styleTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnStyleTab();
    }
    @Test
    public void travelTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnTravelTab();
    }
    @Test
    public void sportsTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnSportsTab();
    }
    @Test
    public void videoTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnVideoTab();
    }


}

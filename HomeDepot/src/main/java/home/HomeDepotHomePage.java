package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomeDepotHomePage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
    public static WebElement myAccountWebElement;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div[4]/div/ul/li[1]/a")
    public static WebElement allDepartment;

    @FindBy(xpath = "//*[@id=\"TasklinkList\"]/li[1]/a")
    public static WebElement storeLocator;

    @FindBy(id = "headerSearch")
    public static WebElement searchField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement getSearchField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement SearchField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement getGetSearchField;

    @FindBy(xpath = "#headerSearch")
    public static WebElement gettablesawSearchField;

    @FindBy(xpath = "#headerSearch")
    public static WebElement getLightBulbsSearchField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement SearchBedField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement SearchWireField;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement SearchSmartHome;

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    public static WebElement SearchMirrors;

    @FindBy(xpath = "#headerSearch")
    public static WebElement getHeatersSearchField;

    @FindBy(xpath = "#container > div:nth-child(6) > div > div:nth-child(2) > div > div > p:nth-child(2) > a")
    public static WebElement Battery;

    @FindBy(xpath = "//*[@id=\"topnavCore\"]/div/h1/span[2]")
    public static WebElement searchBattery;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
    public static WebElement searchClocks;

    @FindBy(xpath = "//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li[1]/a")
    public static WebElement getsearchAppliances;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchBath;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchWindowTreatment;

    @FindBy(xpath = "//*[@id=\"container\"]/div[4]/div[1]/div/h1")
    public static WebElement searchBuildingMaterials;

    @FindBy(xpath = "//*[@id=\"breadcrumb\"]/ul/li[2]/a")
    public static WebElement searchHomeDecor;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchDoorsandWindows;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchElectrical;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchFlooring;

    @FindBy(xpath = "//*[@id=\"container\"]/div[4]/div[1]/div/h1")
    public static WebElement searchHardware;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchHeatingandCooling;

    @FindBy(xpath = "//*[@id=\"container\"]/div[4]/div[1]/div/h1")
    public static WebElement searchKitchen;

    @FindBy(xpath = "//*[@id=\"headerCrumb\"]/li[2]")
    public static WebElement searchLighting;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
    public static WebElement searchClocks1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
    public static WebElement searchClocks2;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
    public static WebElement searchClocks3;

//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/div[3]/div/div/h1")
//    public static WebElement searchClocks;


    public void displaySearch() {
        Assert.assertTrue(searchField.isDisplayed());
    }

    public void clickOnAllDepartment() {
        allDepartment.click();
        Assert.assertEquals(driver.getTitle(), "SiteMap");
    }

    public void displayAllDepartment() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(allDepartment.isDisplayed());
    }

    public void displayStoreLocator() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(storeLocator.isDisplayed());
    }

    public void DisplaySearchField() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(searchField.isDisplayed());
    }


    public void searchFishingRod() {
        searchField.sendKeys("FishingRod");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchFan() {
        searchField.sendKeys("Fan");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/?";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchWatch() {
        searchField.sendKeys("Watch");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchTableSaw() {
        searchField.sendKeys("TableSaw");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }


    public void searchLightBulbs() {
        searchField.sendKeys("LightBulbs");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void setSearchBedField() {
        searchField.sendKeys("Bed");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void setSearchWireField() {
        searchField.sendKeys("Wire");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void setSearchSmartHomeField() {
        searchField.sendKeys("Smart home");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void setSearchMirrorsField() {
        searchField.sendKeys("Mirrors");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void setSearchTileField() {
        searchField.sendKeys("Tile");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void setSearchHeatersField() {
        searchField.sendKeys("Heaters");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void Battery() {
        searchField.sendKeys("Battery");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchBattery() {
        searchField.sendKeys("Battery");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchClocks() {
        searchField.sendKeys("Clocks");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchAppliances() {
        searchField.sendKeys("Appliances");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }


    public void SearchBath() {
        searchField.sendKeys("Bath");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchWindowTreatment() {
        searchField.sendKeys("Window Treatment");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchBuildingMaterials() {
        searchField.sendKeys("Building Mateials");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchHomeDecor() {
        searchField.sendKeys("Home Decor");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchDoorsandWindows() {
        searchField.sendKeys("DoorsandWindows");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchElectrical() {
        searchField.sendKeys("Electrical");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchFlooring() {
        searchField.sendKeys("FLooring");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchHeatingandCooling() {
        searchField.sendKeys("HeatingandCooling");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchHardware() {
        searchField.sendKeys("Hardware");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchKitchen() {
        searchField.sendKeys("Kitchen");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchGardenCenter() {
        searchField.sendKeys("Garden Center");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/?";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public static void SearchLighting() {
        searchField.sendKeys("Lighting");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public static void SearchClocks1() {
        searchField.sendKeys("Clocks1");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void SearchClock2() {
        searchField.sendKeys("Clock2");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }


    public void SearchClock3() {
        searchField.sendKeys("Clock3");
        searchField.submit();
        String expectedUrl = "https://www.homedepot.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}

//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//    public void SearchAppliances() {
//        searchField.sendKeys("Appliances");
//        searchField.submit();
//        String expectedUrl = "https://www.homedepot.com";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//    }
//
//
//
//
//
//
//}

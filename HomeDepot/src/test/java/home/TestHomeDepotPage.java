package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeDepotPage extends CommonAPI {

    @Test
    public void testMyAccountButton() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        HomeDepotHomePage.myAccountWebElement.click();
        Assert.assertTrue(HomeDepotHomePage.myAccountWebElement.isDisplayed());
    }

    @Test
    public void testClickOnAllDepartment() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.clickOnAllDepartment();
    }

    @Test
    public void testDisplayAllDepartment() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.displayAllDepartment();
    }

    @Test
    public void testDisplayStoreLocator() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.displayStoreLocator();
    }

    @Test
    public void testDisplaySearchField() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.displaySearch();
    }

    @Test
    public void testsearchFan() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.searchFan();
    }


    @Test
    public void testsearchWatch() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.searchWatch();
    }

    @Test
    public void testsearchTableSaw() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.searchTableSaw();

    }

    @Test
    public void testsearchLightBulbs() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.searchLightBulbs();
    }

    @Test
    public void testsearchBed() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchBedField();
    }


    @Test
    public void testsearchWire() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchWireField();

    }

    @Test
    public void testsearchSmartHome() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchSmartHomeField();

    }

    @Test
    public void testsearchMirrors() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchMirrorsField();

    }

    @Test
    public void testsearchTile() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchTileField();
    }

    @Test
    public void testsearchHeaters() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.setSearchHeatersField();
    }

    @Test
    public void testBattery() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchBattery();

    }

    @Test
    public void searchClocks() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchClocks();

    }

    @Test
    public void searchAppliances() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchBath();

    }

    @Test
    public void searchBath() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchBath();

    }

    @Test
    public void SearchAppliances() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchBath();

    }

    @Test
    public void SearchBuildingMaterials() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchBuildingMaterials();

    }

    @Test
    public void SearchHomeDecor() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchHomeDecor();

    }

    @Test
    public void SearchDoorsandWindows() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchDoorsandWindows();

    }

    @Test
    public void SearchElectrical() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchElectrical();

    }

    @Test
    public void SearchFlooring() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchFlooring();

    }

    @Test
    public void SearchHardware() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchHardware();

    }

    @Test
    public void SearchHeathlandCooling() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchHeatingandCooling();
    }

    @Test
    public void SearchKitchen() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        TestHomeDepotPage HomeDepotHomePage;
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchKitchen();


    }


    @Test
    public void SearchGardenCenter() {
        HomeDepotHomePage homeDepotHomePage1 = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage1.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage1.SearchGardenCenter();
    }


    @Test
    public void SearchLighting() {
        HomeDepotHomePage homeDepotHomePage1 = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage1.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        home.HomeDepotHomePage.SearchLighting();
    }


    @Test
    public void searchClocks1 () {
        HomeDepotHomePage HomeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        HomeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        home.HomeDepotHomePage.SearchClocks1();
    }

    @Test
    public void searchClocks2() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchClock2();
    }
    @Test
    public void searchClocks3() {
        HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);
        homeDepotHomePage.getClass().getSimpleName();
        convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName());
        homeDepotHomePage.SearchClock3();

    }
}

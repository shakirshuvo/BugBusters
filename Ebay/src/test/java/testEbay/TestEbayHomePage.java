package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.EbayHomePage;

public class TestEbayHomePage extends CommonAPI {

    @Test(enabled = true)
    public void testSearchButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSreachButton ();
    }
    @Test(enabled = true)
    public void testSearchItem() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSearchItem ();
    }
    @Test(enabled = true)
    public void testSearchBar() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSearchBar ();
    }
    @Test(enabled = true)
    public void testMotorsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateMotorsOptionDisplayed ();
    }
    @Test(enabled = true)
    public void clickOnMotorsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateMotorsOptionClickAble ();
    }
    @Test(enabled = true)
    public void testOnFashionButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateFashionOptionDisplayed ();
    }

    @Test(enabled = true)
    public void clickOnFashionButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validatedFashionOptionClickable ();
    }
    @Test(enabled = true)
    public void testOnElectronicsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateElectronicsOptionDisplayed ();
    }

    @Test(enabled = true)
    public void clickOnElectronicsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateElectronicsOptionClikable ();
    }

    @Test(enabled = true)
    public void testOnFindPartsAndAccessories() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateFindPartsAndAccessoriesButtonDisplayed ();
    }

    @Test(enabled = true)
    public void clickOnFindPartsAndAccessories() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateFindPartsAndAccessoriesButtonClickable ();
    }

    @Test(enabled = true)
    public void testOnShopByCategoryButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateShopByCategoryButtonDisplayed ();
    }

    @Test(enabled = true)
    public void clickOnShopByCategoryButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateShopByCategoryButtonClickable ();
    }

    @Test(enabled = true)
    public void testOnExtraCouponOnTopButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateExtraCouponOnBrandsDisplayed ();
    }

    @Test(enabled = true)
    public void testCollectiblesAndAr() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateCollectiblesAndArtClickable ();
    }

    @Test(enabled = true)
    public void testHomeAndGarden() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateHomeAndGardenClickable ();
    }

    @Test(enabled = true)
    public void testSportingGood() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateHomeAndGardenClickable ();
    }

    @Test(enabled = true)
    public void testToys() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateToysClickable ();
    }

    @Test(enabled = true)
    public void testBusinessAndIndustrial() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateBusinessAndIndustrial ();
    }
}

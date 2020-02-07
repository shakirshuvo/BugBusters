package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.EbayHomePage;

public class TestEbayHomePage extends CommonAPI {

    @Test(enabled = false)
    public void testSearchButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSreachButton ();
    }

    @Test(enabled = false)
    public void testSearchItem() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSearchItem ();
    }

    @Test(enabled = false)
    public void testSearchBar() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateSearchBar ();
    }

    @Test(enabled = false)
    public void testMotorsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateMotorsOptionDisplayed ();
    }

    @Test(enabled = false)
    public void clickOnMotorsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateMotorsOptionClickAble ();
    }

    @Test(enabled = false)
    public void testOnFashionButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateFashionOptionDisplayed ();
    }

    @Test(enabled = false)
    public void clickOnFashionButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validatedFashionOptionClickable ();
    }

    @Test(enabled = false)
    public void testOnElectronicsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateElectronicsOptionDisplayed ();
    }

    @Test(enabled = false)
    public void clickOnElectronicsButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateElectronicsOptionClikable ();
    }

    @Test(enabled = false)
    public void testOnFindPartsAndAccessories() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateFindPartsAndAccessoriesButtonDisplayed ();
    }

    @Test(enabled = false)
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

    @Test(enabled = false)
    public void testOnExtraCouponOnTopButton() {
        EbayHomePage ebayHomePage = PageFactory.initElements (driver, EbayHomePage.class);
        ebayHomePage.validateExtraCouponOnBrandsDisplayed ();
    }
}

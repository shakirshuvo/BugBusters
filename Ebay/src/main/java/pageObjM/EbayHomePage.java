package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EbayHomePage extends CommonAPI {

    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement searchButton;

    public void validateSreachButton(){
        Assert.assertEquals (searchButton.isDisplayed (),true);
        searchButton.click ();
    }
    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement typedOnSearchButton;

    public void validateSearchItem(){
        Assert.assertEquals (typedOnSearchButton.isDisplayed (),true);
        typedOnSearchButton.sendKeys ("iphone11"); }

    @FindBy(xpath = "\"//input[@id='gh-btn']\"")
    public static WebElement clickOnSearchBar;

    public void validateSearchBar(){
        Assert.assertEquals (clickOnSearchBar.isDisplayed (),true);
        clickOnSearchBar.click ();
    }
    @FindBy(linkText = "Motors")
    public static WebElement Motors;


    public void validateMotorsOptionDisplayed() {
        Assert.assertEquals(Motors.isDisplayed(), true);
    }
    public void validateMotorsOptionClickAble() {
        Motors.click();
        Assert.assertEquals(FindPartsAndAccessories.isDisplayed(), true);
    }
    @FindBy(linkText = "Fashion")
    public static WebElement Fashion;

    public void validateFashionOptionDisplayed(){
        Assert.assertEquals (Fashion.isDisplayed (), true);
    }
    public void validatedFashionOptionClickable()
    {
        Fashion.click ();
        Assert.assertEquals(ExtraCouponOnTopBrands.isDisplayed(), true);
    }
    @FindBy(linkText = "Electronics")
    public static WebElement Electronics;

    public void validateElectronicsOptionDisplayed(){
        Assert.assertEquals (Electronics.isDisplayed (), true);
    }
    public void validateElectronicsOptionClikable(){
        Electronics.click ();
        Assert.assertEquals (ShopByCategory.isDisplayed (),true);
    }
    @FindBy(xpath ="//h2[@class='b-promobanner__info-title']")
    public static WebElement ExtraCouponOnTopBrands;

    public void validateExtraCouponOnBrandsDisplayed(){
        Assert.assertEquals (ExtraCouponOnTopBrands.isDisplayed (),true);
    }
    public void validateExtraCouponOnTopBrandsClickable(){
        ExtraCouponOnTopBrands.click ();
        Assert.assertEquals (ExtraCouponOnTopBrands.isSelected (),true);
    }
    @FindBy(xpath = "//h2[contains(text(),'Find Parts & Accessories')]")
    public static WebElement FindPartsAndAccessories;

    public void validateFindPartsAndAccessoriesButtonDisplayed(){
        Assert.assertEquals (FindPartsAndAccessories.isDisplayed (),true);
    }
    public void validateFindPartsAndAccessoriesButtonClickable(){
        FindPartsAndAccessories.click ();
        Assert.assertEquals (FindPartsAndAccessories.isSelected (),true);
    }
    @FindBy(css = "button#gh-shop-a")
    public static WebElement ShopByCategory;

    public void validateShopByCategoryButtonDisplayed(){
        Assert.assertEquals (ShopByCategory.isDisplayed (),true);
    }
    public void validateShopByCategoryButtonClickable() {
        ShopByCategory.click ();
        Assert.assertEquals (ShopByCategory.isDisplayed (), true);
    }

    @FindBy(linkText = "Collectibles & Art")
    public static WebElement CollectiblesAndArt;

    public void validateCollectiblesAndArtDisplayed(){
        Assert.assertEquals (CollectiblesAndArt.isDisplayed (),true);
    }
    public void validateCollectiblesAndArtClickable(){
        CollectiblesAndArt.click ();
        Assert.assertEquals (CollectiblesAndArt.isDisplayed (),true);
    }

    @FindBy(linkText = "Home & Garden")
    public static WebElement HomeAndGarden;

    public void validateHomeAndGardenDisplayed(){
        Assert.assertEquals (HomeAndGarden.isDisplayed (),true);
    }
    public void validateHomeAndGardenClickable(){
        HomeAndGarden.click ();
        Assert.assertEquals (HomeAndGarden.isDisplayed (),true);
    }

    @FindBy(linkText = "Sporting Goods")
    public static WebElement SportingGoods;

    public void validateSportingGoodsDisplayed(){
        Assert.assertEquals (SportingGoods.isDisplayed (),true);
    }
    public void validateSportingGoodsClickable(){
        SportingGoods.click ();
        Assert.assertEquals (SportingGoods.isDisplayed (),true);
    }

    @FindBy(linkText = "Toys")
    public static WebElement toys;

    public void validateToys(){
        Assert.assertEquals (toys.isDisplayed (),true);
    }
    public void validateToysClickable(){
        toys.click ();
        Assert.assertEquals (toys.isDisplayed (),true);
    }
}


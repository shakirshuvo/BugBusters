package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static com.sun.tools.xjc.util.DOMUtils.getElement;

public class ValidateHomePage extends CommonAPI {

    @FindBy(css = "li:nth-of-type(2) > .gh-p")
    public static WebElement dailyDeals;

    @FindBy( linkText= "Brand Outlet" )
    public static WebElement brandOutlet;

    @FindBy(xpath = "//i[@id='gh-shop-ei']")
    public static WebElement getElement;

    @FindBy (xpath = "//select[@id='gh-cat']")
    public static WebElement getItems;

    public static WebElement getDailyDeals() {
        return dailyDeals;
    }
    public static WebElement getBrandOutlet(){
        return brandOutlet;
    }
    public static WebElement getGetElement(){
        return getElement;
    }
    public static WebElement getItems(){
        return  getItems;
    }
    public void validateDailyDeals() {
        getDailyDeals ().click ();
        Assert.assertEquals(dailyDeals.isDisplayed(), true);
    }
    public void validateBrandOutlet(){
        getBrandOutlet ().click ();
        Assert.assertEquals (brandOutlet.isDisplayed (),true);
    }
    public void validateSearchPageDisplayed(){
        WebElement element = getElement;
        Assert.assertEquals (element.isDisplayed (),true);
        element.click ();
        TestLogger.log ("Search item displayed");
    }
    public void validateTestDropDown() throws InterruptedException {
        WebElement itemsFromTheList = getItems();
        Select select = new Select(itemsFromTheList);
        select.selectByIndex(4);
        sleepFor(5);
        //homePage.clickSearchButton ();
    }
}



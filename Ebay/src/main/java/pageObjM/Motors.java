package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static pageObjM.ValidateHomePage.getItems;

public class Motors extends CommonAPI {

    @FindBy(linkText = "Motors")
    WebElement Motors;

    @FindBy(linkText = "Find Parts for My Vehicles")
    WebElement findPartsForVehicles;

    @FindBy(linkText = "All Parts & Accessories")
    WebElement allPartsAndAccessories;

    @FindBy(linkText = "Car & Truck Parts")
    WebElement carAndTruckParts;

    @FindBy(linkText = "Motorcycle Parts")
    WebElement motorcycleParts;

    @FindBy(linkText = "Commercial Truck Parts")
    WebElement commercialTruckParts;

    @FindBy(linkText = "Automotive Tools & Supplies")
    WebElement automotiveToolsAndSupplies;

    @FindBy(linkText = "Exotic Cars")
    WebElement exoticCars;

    @FindBy(css = ".motors-finder.vehicles > .motors-finder__body.tabs > form[role='tabpanel'] select[name='Make']")
    WebElement getItems;

    @FindBy(linkText = "Motors Daily Deals")
    WebElement motorsDailyAndDeals;

    @FindBy(linkText = "Send us a suggestion")
    WebElement suggestionButton;

    public void clickOnMotor() {
        Motors.click ();
    }
    public void clickFindPartsForVehicles() {
        findPartsForVehicles.click ();
    }
    public void clickAllPartsAndAccessories() {
        allPartsAndAccessories.click ();
    }
    public void clickCarAndTruckParts() {
        carAndTruckParts.click ();
    }
    public void clickMotorcycleParts() {
        motorcycleParts.click ();
    }
    public void clinicCommercialTruckParts()
    {
        commercialTruckParts.click ();
    }
    public void clickAutomotiveToolsAndSupplies() {
        automotiveToolsAndSupplies.click ();
    }
    public void clickExoticCars() {
        exoticCars.click ();
    }
    public void clickMotorsDailyAndDeals() {
        motorsDailyAndDeals.click ();
    }
    public void clickSuggestionButton(){
        suggestionButton.click ();
    }
    public void validateScrollWebPage() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
        sleepFor(10);
    }
    public void validateTestDropDown() throws InterruptedException {
        WebElement itemsFromTheList = getItems ();
        Select select = new Select (itemsFromTheList);
        select.selectByIndex (4);
    }
}

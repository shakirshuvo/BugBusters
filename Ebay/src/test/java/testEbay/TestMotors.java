package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.Motors;

public class TestMotors extends CommonAPI {
    @Test
    public void testMotors() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickOnMotor ();
    }
    @Test
    public void testFindPartsForVehicles() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickFindPartsForVehicles ();
    }
    @Test
    public void testAllPartsAndAccessories() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickAllPartsAndAccessories ();
    }
    @Test
    public void testAutomotiveToolsAndSupplies() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickAutomotiveToolsAndSupplies ();
    }
    @Test
    public void testExoticCars() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickExoticCars ();
    }
    @Test
    public void testMotorcycleParts() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickMotorcycleParts ();
    }
    @Test
    public void testCarAndTruckParts() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickCarAndTruckParts ();
    }
    @Test
    public void userCanNavigateToSelfPublishPageTest() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickMotorsDailyAndDeals ();
    }
    @Test
    public void userCanNavigateToAdvertisementPageTest() {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickSuggestionButton ();
    }
    @Test
    public void testScrollWebPage() throws InterruptedException {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.validateScrollWebPage ();
    }
    @Test
    public void testDropDown() throws InterruptedException {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.validateTestDropDown ();
    }
    @Test
    public void testCommercialTruckParts() throws InterruptedException {
        Motors motors = PageFactory.initElements(driver,Motors.class);
        motors.clickCommercialTruckParts ();
    }
}

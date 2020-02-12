package AliExpressShipTo;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class AliExpressShipTo extends CommonAPI {

    @FindBy(how = How.ID, using = "switcher-info")
    public static WebElement switchToUnitedStates;
    @FindBy(how = How.LINK_TEXT, using = "United States")
    public static WebElement UnitedStates;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li")
    public static WebElement getShipToUnitedStates;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public static WebElement shippedToUnitedStates;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span[3]")
    public static WebElement switchToAfghanistan;
    @FindBy(how = How.LINK_TEXT, using = "Afghanistan")
    public static WebElement Afghanistan;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[2]/span/span")
    public static WebElement getShipToAfghanistan;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public static WebElement shippedToAfghanistan;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span[3]")
    public static WebElement switchToAlbania;
    @FindBy(how = How.LINK_TEXT, using = "Albania")
    public static WebElement Albania;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[3]")
    public static WebElement getShipToAlbania;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public static WebElement shippedToAlbania;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span[5]")
    public static WebElement switchToAlderney;
    @FindBy(how = How.LINK_TEXT, using = "Alderney")
    public static WebElement Alderney;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[4]/span/span")
    public static WebElement getShipToAlderney;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public static WebElement shippedToAlderney;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span/i")
    public static WebElement switchToAlgeria;
    @FindBy(how = How.LINK_TEXT, using = "Algeria")
    public static WebElement Algeria;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[3]/div/div/div/div/div/div/ul/li[6]/span/span")
    public static WebElement getShipToAlgeria;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public static WebElement shippedToAlgeria;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span[3]")
    public WebElement switchToAndorra;
    @FindBy(how = How.LINK_TEXT, using = "Andorra")
    public WebElement Andorra;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[8]")
    public WebElement shipToAndorra;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement shippedToAndora;


    @FindBy(how = How.ID, using = "switcher-info")
    public WebElement switchToAngola;
    @FindBy(how = How.LINK_TEXT, using = "Angola")
    public WebElement Angola;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[11]")
    public WebElement getshipToAngola;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement shippedToAngola;


    @FindBy(how = How.ID, using = "switcher-info")
    public WebElement switchToArgentina;
    @FindBy(how = How.LINK_TEXT, using = "Argentina")
    public WebElement Argentina;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[20]/span/span")
    public WebElement getShipToArgentina;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement shippedToArgentina;


    @FindBy(how = How.XPATH, using = "//a[@id='switcher-info']/span[5]")
    public WebElement switchToBangladesh;
    @FindBy(how = How.LINK_TEXT, using = "Bangladesh")
    public WebElement Bangladesh;
    @FindBy(how = How.XPATH, using = "//div[@id='nav-global']/div[4]/div/div/div/div/div/div/ul/li[20]/span/span")
    public WebElement getShipToBangladesh;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement shippedToBangladesh;
}



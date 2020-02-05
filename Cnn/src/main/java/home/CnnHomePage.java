package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CnnHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"footer-nav-container\"]/div[2]/div/div/nav/ul/li[1]/a")
    public static WebElement usWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[4]/ul/a/h2")
    public static WebElement worldWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[9]/ul/a/h2")
    public static WebElement politicsWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[4]/a")
    public static WebElement businessWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a")
    public static WebElement opinionWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[6]/a")
    public static WebElement healthWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[7]/a")
    public static WebElement entertainmentWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[8]/a")
    public static WebElement styleWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[9]/a")
    public static WebElement travelWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[10]/a")
    public static WebElement sportsWebElement;

    @FindBy(how = How.NAME, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[11]/a")
    public static WebElement videosWebElement;

    public static WebElement getUsWebElement() {
        return usWebElement;
    }

    public static WebElement getWorldWebElement() {
        return worldWebElement;
    }

    public static WebElement getPoliticsWebElement() {
        return politicsWebElement;
    }

    public static WebElement getBusinessWebElement() {
        return businessWebElement;
    }

    public static WebElement getOpinionWebElement() {
        return opinionWebElement;
    }

    public static WebElement getHealthWebElement() {
        return healthWebElement;
    }

    public static WebElement getEntertainmentWebElement() {
        return entertainmentWebElement;
    }

    public static WebElement getStyleWebElement() {
        return styleWebElement;
    }

    public static WebElement getTravelWebElement() {
        return travelWebElement;
    }

    public static WebElement getSportsWebElement() {
        return sportsWebElement;
    }

    public static WebElement getVideosWebElement() {
        return videosWebElement;
    }

    public void clickOnUsTab() {
        getUsWebElement().click();
    }

    public void clickOnWorldTab() {
        getWorldWebElement().click();
    }

    public void clickOnPoliticsTab() {
        getPoliticsWebElement().click();
    }

    public void clickOnBusinessTab() {
        getBusinessWebElement().click();
    }

    public void clickOnOpinionTab() {
        getOpinionWebElement().click();
    }

    public void clickOnHealthTab() {
        getHealthWebElement().click();
    }

    public void clickOnEntertainmentTab() {
        getEntertainmentWebElement().click();
    }

    public void clickOnStyleTab() {
        getStyleWebElement().click();
    }

    public void clickOnTravelTab() {
        getTravelWebElement().click();
    }

    public void clickOnSportsTab() {
        getSportsWebElement().click();
    }

    public void clickOnVideoTab() {
        getVideosWebElement().click();
    }
}

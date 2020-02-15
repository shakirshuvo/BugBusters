package keywordDriven;

import base.CommonAPI;
import home.HomeDepotHomePage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {

    HomeDepotHomePage homeDepotHomePage = PageFactory.initElements(driver, HomeDepotHomePage.class);

    public void searchFishingRod(WebDriver driver1) throws InterruptedException {
        homeDepotHomePage.searchFishingRod();
    }

    public void searchFan(WebDriver driver1) throws InterruptedException {
        homeDepotHomePage.searchFan();
    }

    public void searchWatch(WebDriver driver1) throws InterruptedException {
        homeDepotHomePage.searchWatch();
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "FishingRod":
                searchFishingRod(driver1);
                break;
            case "Fan":
                searchFan(driver1);
                break;
            case "Watch":
                searchWatch(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver) throws IOException, InterruptedException {
        KeywordSearchPage searchItems = new KeywordSearchPage();
        String[] testSteps = KeywordSearchPage.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }

}

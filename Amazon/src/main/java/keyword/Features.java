package keyword;

import base.CommonAPI;
import home.AmazonHomePage;
import login.AmazonLoginPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import search.AmazonSearchPage;

import java.io.IOException;

public class Features extends CommonAPI {

    AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
    AmazonLoginPage amazonLoginPage = PageFactory.initElements(driver, AmazonLoginPage.class);
    AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);

    public void getAmazonHomePageTitle (WebDriver driver1) throws InterruptedException {
        amazonHomePage.getAmazonHomePageTitle();
    }

    public void signInWithShakirJahangir83(WebDriver driver1) throws InterruptedException {
        amazonLoginPage.signInWithShakirJahangir83();
    }

    public void doProductSearch(WebDriver driver1) throws InterruptedException {
        amazonSearchPage.doProductSearch();
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "title":
                getAmazonHomePageTitle(driver1);
                break;
            case "signIn":
                signInWithShakirJahangir83 (driver1);
                break;
            case "search":
                doProductSearch (driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver) throws IOException, InterruptedException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] testSteps = itemsToBeSearched.getDataFromExcelFile();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }
}

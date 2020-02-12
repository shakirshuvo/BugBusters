package keywordDriven;

import base.CommonAPI;
import home.EbayHomePage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {

    EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
//    SignUpPage sigUp = PageFactory.initElements(driver, SignUpPage.class);
//    SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);

    public void searchItems(WebDriver driver1) throws InterruptedException {
        ebayHomePage.searchItem ("iphone11");
    }

    public void logInEbay(WebDriver driver1) throws InterruptedException {
        ebayHomePage.logIn ("sarah.kh", "peoplentech");
    }

    public void registrationEbay(WebDriver driver1) throws InterruptedException {
        ebayHomePage.registration ("John","Doe","jdoe12399100@yahoo.com","jdoe12399100@yahoo.com","peopleNtech");
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "search":
                searchItems(driver1);
                break;
            case "logIn":
                logInEbay (driver1);
                break;
            case "registration":
                registrationEbay (driver1);
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

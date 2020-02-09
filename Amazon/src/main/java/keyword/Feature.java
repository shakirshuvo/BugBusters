package keyword;

import base.CommonAPI;
import home.AmazonHomePage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import search.AmazonSearchPage;

import java.io.IOException;

public class Feature extends CommonAPI {

    AmazonHomePage amazonHomePage = PageFactory.initElements(driver, AmazonHomePage.class);
    AmazonSearchPage amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);

    public void select(String titleNSearch, WebDriver driver1) {
        switch (titleNSearch) {
            case "getTitle":
                amazonHomePage.getAmazonHomeServicesTitle();
                break;
            case "search":
                amazonSearchPage.searchItemsHardcoded();
                break;
            default:
                throw new InvalidArgumentException("Invalid choice");
        }
    }

    public void getTitleNSearch(WebDriver driver) throws IOException, InterruptedException {
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage();
        String[] testSteps = amazonSearchPage.getItems().toArray(new String[0]);
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }
}

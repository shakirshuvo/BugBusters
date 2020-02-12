package keyword;

import base.CommonAPI;
import home.HomePage;
import home.LoginPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Feature extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch(featureName){
            case "feedback":
                homePage.clickOnQuickHelpIcon();
                break;
            case "signInNegative":
                homePage.clickOnDropDownIcon();
                break;
            case "perfectFeedback":
                loginPage.logInFacebook("marjanasiu@gmail.com","Atlyfe@2002");
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver)throws IOException, InterruptedException{
        SearchByName searchByName = new SearchByName();
        String [] testSteps = searchByName.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }
    //code
}
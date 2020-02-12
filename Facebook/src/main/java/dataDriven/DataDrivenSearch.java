package dataDriven;

import base.CommonAPI;
import datasupply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataDrivenSearch extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_4f\"]")
    WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"js_4f\"]/form/button")
    WebElement searchBtn;
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement logInBtn;

    public void clearInputBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.clear();
    }

    public void typeItemName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()+ ": "+ value));
        searchBox.sendKeys(value);
    }

    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBtn.click();
    }
    public void logInFacebook(String email, String password) {
        this.navigateToFacebook();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        logInBtn.click();
    }
    public void navigateToFacebook() {
        driver.get("https://facebook.com");
    }

    public void clearTypeAndClickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearInputBox();
            typeItemName(list.get(i));
            clickOnSearch();
        }
    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }
    }

    public List<String> getItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<>();
        itemsList.add("cnn");
        itemsList.add("Banglar rannaghor");

        return itemsList;
    }

    public List<String> searchItemsHardcoded() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<>();
        itemsList.add("");
        itemsList.add("Tanjina");

        return itemsList;
    }

    public void doProductSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        typeItemName("Samina");
        clickOnSearch();
        //Assert.assertNotNull(Samina");
    }

}

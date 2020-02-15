package search;

import base.CommonAPI;
import datasupply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(how = How.ID, using = "headerSearch")
    public static WebElement searchInput;

    @FindBy(how = How.CLASS_NAME, using = "SearchBox__buttonIcon")
    public static WebElement searchSubmit;

    public static WebElement getSearchInput() {
        return searchInput;
    }

    public static WebElement getSearchSubmit() {
        return searchSubmit;
    }

    public void typeItemName(String value) {
        getSearchInput().sendKeys(value);
    }

    public void clickOnSearch() {
        getSearchSubmit().click();
    }

    public void clearInputBox() {
        getSearchInput().clear();
    }

    public void searchItemsAndSubmit() throws Exception, IOException, ClassNotFoundException {
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();

        }
    }

}


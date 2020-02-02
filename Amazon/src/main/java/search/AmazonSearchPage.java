package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitWebElement() {
        return submitWebElement;
    }

    public void clearInputBox() {
        getSearchInputWebElement().clear();
    }

    public void typeItemName(String value) {
        getSearchInputWebElement().sendKeys(value);
    }

    public void clickOnSearch() {
        getSubmitWebElement().click();
    }

    public void clearTypeAndClickOnSearch() {
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearInputBox();
            typeItemName(list.get(i));
            clickOnSearch();
        }
    }

    public List<String> getItems() {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("watch");
        itemsList.add("Rage Against The Machine");

        return itemsList;
    }

    public void doProductSearch() {
        typeItemName("iPhone");
        clickOnSearch();
    }

}

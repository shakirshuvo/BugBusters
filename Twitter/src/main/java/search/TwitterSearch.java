package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class TwitterSearch  extends CommonAPI {

    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div[2]/input")
    public WebElement searchField;


    public void login () {
        loginEmail.sendKeys("kingkimochi305@gmail.com");
        loginPassword.sendKeys("kimochi305");
        loginButton.click();
        Assert.assertEquals(searchField.isDisplayed(), true);
    }

    public void searchMemes() {
        login();
        searchField.sendKeys("memes");
        searchField.submit();
    }
}

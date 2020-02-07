package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterHome extends CommonAPI {

    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    public void login () {
        loginEmail.sendKeys("kingkimochi305@gmail.com");
        loginPassword.sendKeys("kimochi305");
        loginButton.click();
    }
}

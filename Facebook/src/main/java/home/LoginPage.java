package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement logInBtn;

    public void navigateToFacebook() {
        driver.get("https://facebook.com");
    }

    public void logInFacebook(String email, String password) {
        this.navigateToFacebook();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        logInBtn.click();
    }


//    public void home() {
//        homeIcon.click();
//    }
//
//    public void goToFacebookHome() {
//        homeTab.click();
//    }
//
//    public void writeSomethingOnSearchBar(String name) {
//        searchBar.sendKeys(name);
//        clickonSearchBtn.click();
//    }
}

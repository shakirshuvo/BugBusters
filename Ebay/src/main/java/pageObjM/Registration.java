package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends CommonAPI {

    @FindBy( css= "span#gh-ug-flex > a")
    public static WebElement clickOnRegistration;

    @FindBy(css = "input#firstname")
    public static WebElement typeFirstName;

    @FindBy(css = "input#lastname")
    public static WebElement typeLastName;

    @FindBy(css = "input#email")
    public static WebElement typeEmail;

    @FindBy(css = "input#PASSWORD")
    public static WebElement typePassword;

    @FindBy(css = " input[name='checkbox-default']")
    public static WebElement clickCheckBox;

    @FindBy(css = "button#ppaFormSbtBtn")
    public static WebElement clickCreateAccount;


    public static WebElement getRegistrationButton() {
        return clickOnRegistration;
    }
    public static WebElement getFirstName(){
        return typeFirstName;
    }
    public static WebElement getLastName(){
        return typeLastName;
    }

    public static WebElement getEmail(){
        return typeEmail;
    }

    public static WebElement getPassword(){
        return typePassword;
    }

    public static WebElement getCheckBox(){
        return clickCheckBox;
    }

    public static WebElement getCreateAccountButton(){
        return clickCreateAccount;
    }

    public static void clickRegistration() {
        getRegistrationButton ().click ();
    }
    public static void FirstName(){
        getFirstName ().sendKeys ("John");
    }
    public static void LastName(){
        getLastName ().sendKeys ("Doe");
    }
    public static void Email(){
        getEmail ().sendKeys ("jdoe12399100@yahoo.com");
    }
    public void password(){
        getPassword ().sendKeys ("peopleNtech");
    }

    public void clickCheckBox(){
        getCheckBox ().click ();
    }

    public void clickCreateAccountButton(){
       getCreateAccountButton ().click ();
    }

}

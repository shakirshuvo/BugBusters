package cart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.openqa.selenium.By.xpath;

public class Cart extends CommonAPI {



      @FindBy(xpath = "//*[@id=\"headerCart\"]/div[1]/span[1]")
      public static WebElement cartWebElement;
    public static By submit;
    public static By search;
    public static By cart;
    public static By tracking;
    public static By tracknumber;
    public static By email;
    private static By alldept;


    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.homedepot.com/mycart/home");
        driver.findElement(xpath("//*[@id=\"headerCart\"]")).click();
        WebElement cartWebelement;

    }
//    By alldept = By.xpath ("//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a");
//    By search = By.id ("headerSearch");
//    By cart = By.id ("headerCart");
//    By tracking = By.id ("headerOrderStatus");
//    By tracknumber = By.xpath ("//input[@name='order']");
//    By email = By.xpath ("//input[@name='email']");
//    By submit = By.xpath ("//*[@id=\"orders_root\"]/div/div[2]/div[1]/div[2]/form/div[3]/button/span");

    public static WebElement AllDept(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (alldept);}

    public static WebElement SearchBox(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (search);}

    public static WebElement ShoppingCart(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (cart);}

    public static WebElement Track(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (tracking);}

    public static WebElement OrderNumber(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (tracknumber);}

    public static WebElement EmailAddress(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (email);}

    public static WebElement SubmitBttn(){
        TestLogger.log(Cart.class.getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.findElement (submit);}



    public static void TrackPage3() {
        Track ().click ();
        OrderNumber ().sendKeys ("W565477687");
        EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
        SubmitBttn ().click ();
    }

    public static void ShoppingCartPage3() {
        ShoppingCart ().click ();
    }

    public void TrackOrders() {
        AllDept ().click ();
    }
    public static void SearchBar() {
        SearchBox ().sendKeys ("plumbing", Keys.ENTER);
    }
    public static void ShoppingCartPage() {
        ShoppingCart ().click ();
    }
    public static void TrackOrders3() {
        AllDept ().click ();
    }

    public static void TrackPage() {
        Track ().click ();
        OrderNumber ().sendKeys ("W565477687");
        EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
        SubmitBttn ().click ();

    }
    public static void TrackOrders2() {
        AllDept ().click ();
    }

    public void ShoppingCartPage2() {
        ShoppingCart ().click ();
    }
    public static void TrackPage2() {
        Track ().click ();
        OrderNumber ().sendKeys ("W565477687");
        EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
        SubmitBttn ().click ();

    }
    public static void SearchBar2() {
        SearchBox ().sendKeys ("wrench", Keys.ENTER);
    }
    public static void SearchBar3() {
        SearchBox ().sendKeys ("bathtub", Keys.ENTER);
    }
    public static void SearchBar4() {
        SearchBox ().sendKeys ("refrigerator", Keys.ENTER);
    }
    public static void SearchBar5() {
        SearchBox ().sendKeys ("windows", Keys.ENTER);
    }
    public static void SearchBar6() {
        SearchBox ().sendKeys ("lights", Keys.ENTER);
    }
    public static void SearchBar7() {
        SearchBox ().sendKeys ("bugspray", Keys.ENTER);
    }
    public static void SearchBar8() {
        SearchBox ().sendKeys ("lawn", Keys.ENTER);
    }
    public static void SearchBar9() {
        SearchBox ().sendKeys ("gardening", Keys.ENTER);
    }
    public static void SearchBar10() {
        SearchBox ().sendKeys ("hammer", Keys.ENTER);
    }
    public static void SearchBar11() {
        SearchBox ().sendKeys ("garbage bags", Keys.ENTER);
    }
    public static void SearchBar12() {
        SearchBox ().sendKeys ("nails", Keys.ENTER);
    }
    public static void SearchBar13() {
        SearchBox ().sendKeys ("paint", Keys.ENTER);
    }
    public static void SearchBar14() {
        SearchBox ().sendKeys ("flooring", Keys.ENTER);
    }
    public static void SearchBar15() {
        SearchBox ().sendKeys ("cabinets", Keys.ENTER);
    }
    public static void SearchBar16() {
        SearchBox ().sendKeys ("carpet", Keys.ENTER);
    }
    public static void SearchBar17() {
        SearchBox ().sendKeys ("tapes", Keys.ENTER);
    }
    public static void SearchBar18() {
        SearchBox ().sendKeys ("grill", Keys.ENTER);
    }
    public static void SearchBar19() {
        SearchBox ().sendKeys ("faucet", Keys.ENTER);
    }
    public static void SearchBar20() {
        SearchBox ().sendKeys ("fans", Keys.ENTER);
    }

}


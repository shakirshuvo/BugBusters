package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends CommonAPI {

    @Test
    public void testCartButton() {
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.cartWebElement.click();
        Assert.assertEquals(cart.cartWebElement.isDisplayed(), true);
    }
    @Test
    public void TestTrackPage3() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.TrackPage3 ();
    }

    @Test
    public void TestTitle() {
        String title = driver.getTitle ();
        System.out.println ("Webpage Title: " + driver.getTitle ());
        Assert.assertEquals (title, "The Home Depot");
    }

    @Test
    public void TrackOrders() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        cart.TrackOrders ();
    }

    @Test
    public void TestSearchBar(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar ();
    }
    @Test
    public void TrackOrders2() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.TrackOrders2 ();
    }
    @Test
    public void TestShoppingCart() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.ShoppingCartPage ();
    }
    @Test
    public void TestTrackPage() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.TrackPage ();
    }

    @Test
    public void TestShoppingCart2() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        cart.ShoppingCartPage2 ();
    }
    @Test
    public void TestTrackPage2() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.TrackPage2 ();
    }
    @Test
    public void TrackOrders3() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.TrackOrders3 ();
    }
    @Test
    public void TestShoppingCart3() {
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.ShoppingCartPage3 ();
    }
    @Test
    public void TestSearchBar2(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar2 ();
    }
    @Test
    public void TestSearchBar3(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar3 ();
    }
    @Test
    public void TestSearchBar4(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar4 ();
    }
    @Test
    public void TestSearchBar5(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar5 ();
    }
    @Test
    public void TestSearchBar6(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar6 ();
    }
    @Test
    public void TestSearchBar7(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar7 ();
    }
    @Test
    public void TestSearchBar8(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar8 ();
    }
    @Test
    public void TestSearchBar9(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar9 ();
    }
    @Test
    public void TestSearchBar10(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar10 ();
    }
    @Test
    public void TestSearchBar11(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar11 ();
    }
    @Test
    public void TestSearchBar12(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar12 ();
    }
    @Test
    public void TestSearchBar13(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar13 ();
    }
    @Test
    public void TestSearchBar14(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar14 ();
    }
    @Test
    public void TestSearchBar15(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar15 ();
    }
    @Test
    public void TestSearchBar16(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar16 ();
    }
    @Test
    public void TestSearchBar17(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar17 ();
    }
    @Test
    public void TestSearchBar18(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar18 ();
    }
    @Test
    public void TestSearchBar19(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar19 ();
    }
    @Test
    public void TestSearchBar20(){
        Cart cart = PageFactory.initElements (driver, Cart.class);
        Cart.SearchBar20 ();
    }
}



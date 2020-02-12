package testEbay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjM.Fashion;

public class TestFashion extends CommonAPI {

    @Test
    public void testMenClothing() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkMenClothing ();
    }
    @Test
    public void testWomenCloth() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkWomenCloth ();
    }
    @Test
    public void testSalesAndEvents() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkSalesAndEvents ();
    }
    @Test
    public void testJewellery() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkJewellery ();
    }
    @Test
    public void testWatches(){
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkWatches ();
    }

    @Test
    public void testShoes() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkShoes ();
    }

    @Test
    public void testVintage() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkVintage ();
    }
    @Test
    public void testAdidas() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkAdidas ();
    }
    @Test
    public void testWomenTrend() {
        Fashion fashion = PageFactory.initElements (driver,Fashion.class);
        fashion.checkWomenTrends ();
    }
}

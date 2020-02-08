package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TwitterSearchTest extends CommonAPI {

//    @Test
//    public static void searchFor() {
//        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
//        twitterSearch.logIn("kingkimochi305@gmail.com", "kimochi305");
//        twitterSearch.searchFor();
//    }

//    @Test
//    public void searchMemeTest() {
//        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
//        twitterSearch.searchMemes();
//    }
    @Test
    public void searchMemeTest() {
    TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    twitterSearch.searchMemes();
}
    @Test
    public void searchCookiesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCookies();
    }
    @Test
    public void searchWeatherTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchWeather();
    }
    @Test
    public void searchCakeTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCake();
    }
    @Test
    public void searchPieTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPie();
    }
    @Test
    public void searchIceCreamTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchIceCream();
    }
    @Test
    public void searchBrowniesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchBrownies();
    }
    @Test
    public void searchPuddingTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPudding();
    }
    @Test
    public void searchYogurtTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchYogurt();
    }
    @Test
    public void searchCupcakesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCupcakes();
    }
    @Test
    public void searchGelatoTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchGelato();
    }
    @Test
    public void searchPancakesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPancakes();
    }
    @Test
    public void searchSushiTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSushi();
    }
    @Test
    public void searchChickenTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchChicken();
    }
    @Test
    public void searchSteakTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSteak();
    }
    @Test
    public void searchHotDogTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchHotDog();
    }
    @Test
    public void searchCheeseTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCheese();
    }
    @Test
    public void searchCoffeeTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCoffee();
    }
    @Test
    public void searchBananasTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchBananas();
    }
    @Test
    public void searchSeafoodTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSeafood();
    }
    @Test
    public void searchAvocadoTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchAvocado();
    }
    @Test
    public void searchPastaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPasta();
    }
    @Test
    public void searchBurgersTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchBurgers();
    }
    @Test
    public void searchRamenTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchRamen();
    }
    @Test
    public void searchFrenchFriesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchFrenchFries();
    }
    @Test
    public void searchCerealTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCereal();
    }
    @Test
    public void searchMilkshakesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchMilkshakes();
    }
    @Test
    public void searchSodaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSoda();
    }
    @Test
    public void searchLatteTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchLatte();
    }
    @Test
    public void searchBobaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchBoba();
    }
    @Test
    public void searchTeaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchTea();
    }
    @Test
    public void searchPuppiesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPuppies();
    }
}

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
//
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
    @Test
    public void searchKittensTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchKittens();
    }
    @Test
    public void searchLlamasTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchLlamas();
    }
    @Test
    public void searchRhinosTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchRhinos();
    }
    @Test
    public void searchHorsesTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchHorses();
    }
    @Test
    public void searchGiraffeTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchGiraffe();
    }
    @Test
    public void searchZebraTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchZebra();
    }
    @Test
    public void searchWolfTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchWolf();
    }
    @Test
    public void searchKoalaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchKoala();
    }
    @Test
    public void searchSlothTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSloth();
    }
    @Test
    public void searchLionTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchLion();
    }
    @Test
    public void searchTigerTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchTiger();
    }
    @Test
    public void searchCheetahTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCheetah();
    }
    @Test
    public void searchHyenaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchHyena();
    }
    @Test
    public void searchCoyoteTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCoyote();
    }
    @Test
    public void searchPumaTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPuma();
    }
    @Test
    public void searchParrotTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchParrot();
    }
    @Test
    public void searchMouseTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchMouse();
    }
    @Test
    public void searchMooseTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchMoose();
    }
    @Test
    public void searchHippoTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchHippo();
    }
    @Test
    public void searchAttackOnTitanTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchAttackOnTitan();
    }
    @Test
    public void searchCodeGeassTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchCodeGeass();
    }
    @Test
    public void searchDeathNoteTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchDeathNote();
    }
    @Test
    public void searchFairyTailTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchFairyTail();
    }
    @Test
    public void searchMyHeroTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchMyHeroAcademia();
    }
    @Test
    public void searchNoGameTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchNoGameNoLife();
    }
    @Test
    public void searchPokemonTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchPokemon();
    }
    @Test
    public void searchDigimonTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchDigimon();
    }
    @Test
    public void searchOnePunchManTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchOnePunchMan();
    }
    @Test
    public void searchAngelBeatsTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchAngelBeats();
    }
    @Test
    public void searchKingdomHeartsTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchKingdomHearts();
    }
    @Test
    public void searchDestinyTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchDestiny();
    }
    @Test
    public void searchHaloTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchHalo();
    }
    @Test
    public void searchFinalFantasyTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchFinalFantasy();
    }
    @Test
    public void searchApexTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchApexLegends();
    }
    @Test
    public void searchWarframeTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchWarframe();
    }
    @Test
    public void searchSlimeRancherTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchSlimeRancher();
    }
    @Test
    public void searchMinecraftTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchMinecraft();
    }
    @Test
    public void searchGodOfWarTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchGodOfWar();
    }
    @Test
    public void searchLastOfUsTest() {
        TwitterSearch twitterSearch = PageFactory.initElements(driver, TwitterSearch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterSearch.searchLastOfUs();
    }
}

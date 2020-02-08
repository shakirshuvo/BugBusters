package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TwitterSearch extends CommonAPI {

//    @FindBy(css = "input[enterkeyhint='search']")
//     static WebElement searchField;
//
//    public static void searchFor() {
//        searchField.sendKeys("cookies");
//        searchField.submit();
//    }
//    @FindBy(name = "session[username_or_email]")
//    public WebElement emailField;
//
//    @FindBy(css = "input[name='session[password]'")
//    public WebElement passwordField;
//
//    @FindBy(xpath = "//div/div[@dir='auto']/span/span[text()='Log in']")
//    public WebElement loginButton;
//
//    public void logIn(String email, String password) {
//        emailField.sendKeys(email);
//        passwordField.sendKeys(password);
//        loginButton.click();
//    }
    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div[2]/input")
    public WebElement searchField;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/div/div/div[2]/input")
    public WebElement memesInSearchField;




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
        Assert.assertEquals(memesInSearchField.isDisplayed(), true);
    }

    public void searchCookies() {
        login();
        searchField.sendKeys("cookies");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=cookies&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchWeather() {
        login();
        searchField.sendKeys("weather");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=weather&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchCake() {
        login();
        searchField.sendKeys("cake");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=cake&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchPie() {
        login();
        searchField.sendKeys("pie");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=pie&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchIceCream() {
        login();
        searchField.sendKeys("ice cream");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=ice%20cream&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchBrownies() {
        login();
        searchField.sendKeys("brownies");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=brownies&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchPudding() {
        login();
        searchField.sendKeys("pudding");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=pudding&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchYogurt() {
        login();
        searchField.sendKeys("yogurt");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=yogurt&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchCupcakes() {
        login();
        searchField.sendKeys("cupcakes");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=cupcakes&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchGelato() {
        login();
        searchField.sendKeys("gelato");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=gelato&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchPancakes() {
        login();
        searchField.sendKeys("pancakes");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=pancakes&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchSushi() {
        login();
        searchField.sendKeys("sushi");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=sushi&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchChicken() {
        login();
        searchField.sendKeys("chicken");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=chicken&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchSteak() {
        login();
        searchField.sendKeys("steak");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=steak&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchHotDog() {
        login();
        searchField.sendKeys("hot dog");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=hot%20dog&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchCheese() {
        login();
        searchField.sendKeys("cheese");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=cheese&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchCoffee() {
        login();
        searchField.sendKeys("coffee");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=coffee&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchBananas() {
        login();
        searchField.sendKeys("bananas");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=bananas&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchSeafood() {
        login();
        searchField.sendKeys("seafood");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=seafood&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchAvocado() {
        login();
        searchField.sendKeys("avocado");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=avocado&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchPasta() {
        login();
        searchField.sendKeys("pasta");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=pasta&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchBurgers() {
        login();
        searchField.sendKeys("burgers");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=burgers&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchRamen() {
        login();
        searchField.sendKeys("ramen");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=ramen&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchFrenchFries() {
        login();
        searchField.sendKeys("french fries");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=french%20fries&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchCereal() {
        login();
        searchField.sendKeys("cereal");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=cereal&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchMilkshakes() {
        login();
        searchField.sendKeys("milkshakes");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=milkshakes&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchSoda() {
        login();
        searchField.sendKeys("soda");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=soda&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchLatte() {
        login();
        searchField.sendKeys("latte");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=latte&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchBoba() {
        login();
        searchField.sendKeys("boba");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=boba&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchTea() {
        login();
        searchField.sendKeys("tea");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=tea&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchPuppies() {
        login();
        searchField.sendKeys("puppies");
        searchField.submit();
        String expectedUrl = "https://twitter.com/search?q=puppies&src=typed_query";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}

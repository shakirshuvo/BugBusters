package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class NetflixHome extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@href='/SwitchProfile?tkn=AKLJTDT7LBHBTGAJKWET2W3REY'")
    public static WebElement hassanProfileWebElement;

    @FindBy(how = How.XPATH, using = "//a[@href='/browse/genre/83']")
    public static WebElement tvShowsWebElement;

    @FindBy(how = How.XPATH, using = "//a[@href='/browse/genre/34399']")
    public static WebElement moviesWebElement;

    @FindBy(how = How.XPATH, using = "//a[@href='/latest']")
    public static WebElement latestWebElement;

    @FindBy(how = How.XPATH, using = "//a[@href='/browse/my-list']")
    public static WebElement myListWebElement;

    public static WebElement getHassanProfileWebElement() {return hassanProfileWebElement;}

    public static WebElement getTvShowsWebElement() {return tvShowsWebElement;}

    public static WebElement getMoviesWebElement() {return moviesWebElement;}

    public static WebElement getLatestWebElement() {return latestWebElement;}

    public static WebElement getMyListWebElement() {return myListWebElement;}

    public void clickHassanProfile() {getHassanProfileWebElement();}

    public void clickTvShows() {getTvShowsWebElement();}

    public void clickMovies() {getMoviesWebElement();}

    public void clickLatest() {getLatestWebElement();}

    public void clickMyList() {getMyListWebElement();}















//
//    clickByXpath("//div[@class='profile-icon']");
//    sleepFor(3);
//    clickByXpath("//a[@href='/browse/genre/83']");
//    clickByXpath("//a[@href='/browse/genre/34399']");
//    clickByXpath("//a[@href='/latest']");
//    sleepFor(3);
//    clickByXpath("//a[@href='/browse/my-list']");
//    clickOnElement("//div[@class='nav-element']");
//    sleepFor(3);
//    typeOnInputBox(".searchBox", "You");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'You Me Her')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Your Name')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Young Sheldon')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Young Guns')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Young and Dangerous')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'The Young Pope')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Young Justice')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Young Frankenstein')]");
//    clickByXpath("//div[@class='ptrack-content']//a[contains(text(), 'Younger')]");
//    sleepFor(200);
//}
}









package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

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
}









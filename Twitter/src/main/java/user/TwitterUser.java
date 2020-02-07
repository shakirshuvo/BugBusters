package user;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterUser extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[1]/div")
    public static WebElement homeButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[3]/a/div")
    public static WebElement tweetButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[3]/div/div[2]/span")
    public static WebElement notificationsButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[4]/div/div[2]/span")
    public static WebElement messagesButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[5]/div/div[2]/span")
    public static WebElement bookmarksButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[6]/div/div[2]/span")
    public static WebElement listsButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[7]/div/div[2]/span")
    public static WebElement profileButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[2]/div/div[2]/span")
    public static WebElement exploreButtonWebElement;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/main/div/div/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/section/div/div/div/div/div[1]/h2/div[2]/a/div/svg")
    public static WebElement trendsSettingsButtonWebElement;


    public static WebElement getHomeButtonWebElement() {return homeButtonWebElement;}

    public static WebElement getTweetButtonWebElement() {return tweetButtonWebElement;}

    public static WebElement getNotificationsButtonWebElement() {return notificationsButtonWebElement;}

    public static WebElement getMessagesButtonWebElement() {return messagesButtonWebElement;}

    public static WebElement getBookmarksButtonWebElement() {return bookmarksButtonWebElement;}

    public static WebElement getListsButtonWebElement() {return listsButtonWebElement;}

    public static WebElement getProfileButtonWebElement() {return profileButtonWebElement;}

    public static WebElement getExploreButtonWebElement() {return exploreButtonWebElement;}

    public static WebElement getTrendsSettingsButtonWebElement() {return trendsSettingsButtonWebElement;}

    public void browse() {
        homeButtonWebElement.click();
        tweetButtonWebElement.click();
        notificationsButtonWebElement.click();
        messagesButtonWebElement.click();
        bookmarksButtonWebElement.click();
        listsButtonWebElement.click();
        profileButtonWebElement.click();
        exploreButtonWebElement.click();
        trendsSettingsButtonWebElement.click();
    }


}

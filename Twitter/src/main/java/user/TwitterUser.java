package user;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TwitterUser extends CommonAPI {

    @FindBy(css = "input[name='session[username_or_email]']")
    public WebElement loginEmail;

    @FindBy(css = "input[name='session[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/form/div/div[3]/div/div/span/span")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[1]/div")
    public static WebElement homeButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[3]/a/div")
    public static WebElement tweetButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[2]/nav/a[3]/div/div[1]/svg")
    public static WebElement notificationsButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[4]/div/div[2]/span")
    public static WebElement messagesButton;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[2]/nav/a[5]/div/div[2]/span")
    public static WebElement bookmarksButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[6]/div/div[2]/span")
    public static WebElement listsButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[7]/div/div[2]/span")
    public static WebElement profileButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/header/div/div/div/div/div[2]/nav/a[2]/div/div[2]/span")
    public static WebElement exploreButton;

    @FindBy(xpath = "//*[@id=\'react-root\']/div/div/div/main/div/div/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/section/div/div/div/div/div[1]/h2/div[2]/a/div/svg")
    public static WebElement trendsSettingsButton;

    public void login () {
        loginEmail.sendKeys("kingkimochi305@gmail.com");
        loginPassword.sendKeys("kimochi305");
        loginButton.click();
    }

    public void clickOnHomeButton() {
        login();
        homeButton.click();
        Assert.assertEquals(homeButton.isDisplayed(), true);
    }

    public void clickOnTweetButton() {
        login();
        tweetButton.click();
        String expectedUrl = "https://twitter.com/compose/tweet";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnNotificationsButton() {
        login();
        notificationsButton.click();
        String expectedUrl = "https://twitter.com/notifications";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnMessagesButton() {
        login();
        messagesButton.click();
        String expectedUrl = "https://twitter.com/messages";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnBookmarkButton() {
        login();
        bookmarksButton.click();
        String expectedUrl = "https://twitter.com/i/bookmarks";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnListsButton() {
        login();
        listsButton.click();
        String expectedUrl = "https://twitter.com/KhanKimochi/lists";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnProfileButton() {
        login();
        profileButton.click();
        String expectedUrl = "https://twitter.com/KhanKimochi";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnExploreButton() {
        login();
        exploreButton.click();
        String expectedUrl = "https://twitter.com/explore";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnTrendsSettingButton() {
        login();
        trendsSettingsButton.click();
        String expectedUrl = "https://twitter.com/settings/trends";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }



//    public static WebElement getHomeButtonWebElement() {return homeButtonWebElement;}
//
//    public static WebElement getTweetButtonWebElement() {return tweetButtonWebElement;}
//
//    public static WebElement getNotificationsButtonWebElement() {return notificationsButtonWebElement;}
//
//    public static WebElement getMessagesButtonWebElement() {return messagesButtonWebElement;}
//
//    public static WebElement getBookmarksButtonWebElement() {return bookmarksButtonWebElement;}
//
//    public static WebElement getListsButtonWebElement() {return listsButtonWebElement;}
//
//    public static WebElement getProfileButtonWebElement() {return profileButtonWebElement;}
//
//    public static WebElement getExploreButtonWebElement() {return exploreButtonWebElement;}
//
//    public static WebElement getTrendsSettingsButtonWebElement() {return trendsSettingsButtonWebElement;}
//
//    public void browse() {
//        homeButtonWebElement.click();
//        tweetButtonWebElement.click();
//        notificationsButtonWebElement.click();
//        messagesButtonWebElement.click();
//        bookmarksButtonWebElement.click();
//        listsButtonWebElement.click();
//        profileButtonWebElement.click();
//        exploreButtonWebElement.click();
//        trendsSettingsButtonWebElement.click();
//    }



}

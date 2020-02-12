package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class HomeTest extends CommonAPI {


    @Test
    public void testUserCanLogInToFacebook() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
    }

    @Test
   public void testUsergoToFacebookHome() {
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);
       homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
       homePage.goToFacebookHome();
   }

    @Test
    public void testUserWriteSomethingOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.writeSomethingOnSearchBar("News Feed");
    }

    @Test
    public void testUserCanFindFriends() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.canFindFriends();
    }

        @Test
    public void testUserClickOnCreateTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnCreateTab();
    }
    @Test
    public void testUsergetMessageUsingMessenger() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.getMessageUsingMessenger();
    }
    @Test
    public void testUserclickOnFindFriendsIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.getFriends();
    }
    @Test
    public void testUserclickOnHomeTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnHomeTab();
    }
    @Test
    public void testUserclickOnQuickHelpIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnQuickHelpIcon();
    }
    @Test
    public void testUserclickOnHelpCenterTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnQuickHelpIcon();
        homePage.clickOnHelpCenterTab();
    }
    @Test
    public void testUserwriteInHelpCenterSearchBox() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnQuickHelpIcon();
        homePage.clickOnHelpCenterTab();
        homePage.writeInHelpCenterSearchBox(" Acoount Security ");
    }
    @Test
    public void testUserClickOnHelpCenterSearchBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnQuickHelpIcon();
        homePage.clickOnHelpCenterTab();
        homePage.writeInHelpCenterSearchBox(" Acoount Security ");
        homePage.clickOnHelpCenterSearchBtn();
    }
    @Test
    public void testUserCanClickOnHomeTab() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        Thread.sleep(3000);
        homePage.home();
    }
    @Test
    public void testUserclickOnNotificationsIcon() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        Thread.sleep(3000);
        homePage.clickOnNotificationsIcon();
    }
    @Test
    public void testUserGoToNotificationsSettings() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnNotificationsIcon();
        homePage.goToNotificationsSettings();
    }
    @Test
    public void testUsernotificationsSeeAllInfo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.clickOnNotificationsIcon();
        homePage.notificationsSeeAllInfo();
    }
    @Test
    public void testUserUseQuickHelpTabCanGetPrivacyShortcutsInfo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.InQuickHelpTabCanGetPrivacyShortcutsInfo();
    }
    @Test
    public void testUserUseQuickHelpTabCanGetSupportInboxInfo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.InQuickHelpTabSupportInboxInfo();
}
        @Test
        public void testUsercanGetReportProblemsCancelBtn () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetReportProblemsCancelBtn();
        }
        @Test
        public void InMessangerOptionHasCreateNewGroupTab () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.getMessageUsingMessenger();
            homePage.createNewGroupForMessaging();
        }
        @Test
        public void testUserCancanSearchForPeopleToAdd () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.getMessageUsingMessenger();
            homePage.createNewGroupForMessaging();
            homePage.canSearchForPeopleToAdd("Sheuly");
        }
        @Test
        public void testUserCanSeeSelected () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.getMessageUsingMessenger();
            homePage.createNewGroupForMessaging();
            homePage.canSearchForPeopleToAdd("Sheuly");
            homePage.ItShowsSelected();
        }
        @Test
        public void testUserDontWantToAddPeopleInTheGroup () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.getMessageUsingMessenger();
            homePage.createNewGroupForMessaging();
            homePage.canSearchForPeopleToAdd("Sheuly");
            homePage.ItShowsSelected();
            homePage.IfYouDontWantToAddPeopleInTheGroup();
        }
        @Test
        public void testUserCanUseDropDownIcon () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.clickOnDropDownIcon();
        }

       @Test
       public void testUserCanGetMoreOptions () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
           homePage.canGetMoreOptions();
       }
       @Test
        public void testUsercanHaveFriendLists () {
          HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
           homePage.canGetMoreOptions();
            homePage.canHaveFriendLists();
       }
       @Test
       public void testUserCanHaveGames () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
           homePage.canGetMoreOptions();
            homePage.canHaveGames();
       }
       @Test
       public void testUserCanHaveWeatherInfo () {
           HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.canHaveWeather();
       }
       @Test
       public void testUserCanHaveJobsInfo () {
           HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
           homePage.canGetMoreOptions();
           homePage.canHaveJobsInfo();
      }
       @Test
       public void testUserSearchJobsOnFb () {
           HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
           homePage.canGetMoreOptions();
            homePage.canHaveJobsInfo();
            homePage.searchJobsOnFb("Automation Jobs");
       }
        @Test
        public void testUserCanUseJobSearchBtn () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.canHaveJobsInfo();
            homePage.searchJobsOnFb("Automation Jobs");
            homePage.JobSearchBtn();
        }
        @Test
        public void testUserhavePartTimeJobCheckBox () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.canHaveJobsInfo();
            homePage.havePartTimeJobCheckBox();
        }
        @Test
        public void testUserhaveEventsInfo () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canHaveEvents();
        }
       @Test
       public void testUserhasDiscoverInfo () {
          HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canHaveEvents();
           homePage.hasDiscoverInfo();
        }
        @Test
        public void testUserclickOnComedyCheckBox () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canHaveEvents();
            homePage.hasDiscoverInfo();
            homePage.clickOnComedyCheckBox();
        }
        @Test
        public void testUsercalenderInfo () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canHaveEvents();
            homePage.calenderInfo();
        }
        @Test
        public void testUserhostingInfo () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Nynew2018");
            homePage.canHaveEvents();
            homePage.hostingInfo();
        }
        @Test
        public void testUsergamingVideoInfo () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.gamingVideoInfo();
        }
        @Test
        public void testUserCanGetsavedInfo () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.savedInfo();
        }
        @Test
        public void testUserCanGetNewCollection () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
            homePage.canGetMoreOptions();
            homePage.savedInfo();
            homePage.canGetNewCollection();
        }
    public void testUsercanCreateAnyCollectionsName() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.logInFacebook("marjanasiu@gmail.com", "Atlyfe@2002");
        homePage.canGetMoreOptions();
        homePage.savedInfo();
        homePage.canGetNewCollection();
        homePage.canCreateAnyCollectionsName("Moyna");
    }
}





















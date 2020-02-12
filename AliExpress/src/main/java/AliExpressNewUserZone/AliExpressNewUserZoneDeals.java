package AliExpressNewUserZone;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class AliExpressNewUserZoneDeals extends CommonAPI {

    @FindBy(id = "New User Zone")
    public WebElement newUserDeals;

    @FindBy(xpath = "//div[2]/span[@class='button-item']")
    public WebElement clickOnCoupon;

    @FindBy(className = "coupon-words")
    public WebElement clickOnCouponDeal;


    public void clickOnNewUserDeals() {newUserDeals.click();}
    public void setClickOnCoupons() {clickOnCoupon.click();}
    public void clickonCouponDeals() {clickOnCouponDeal.click();}



        }



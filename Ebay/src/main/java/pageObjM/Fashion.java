package pageObjM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fashion extends CommonAPI {
    @FindBy(css = "li:nth-of-type(1) > .b-accordion-handler.b-textlink.b-textlink--parent > .b-accordion-text")
    WebElement womensClothing;

    @FindBy(xpath = "//div[@id='leftnav']//div[@class='dialog__cell']/section[1]/ul/li[2]/button[@class='b-accordion-handler b-textlink b-textlink--parent']/span[@class='b-accordion-text']")
    WebElement mensClothing;

    @FindBy(css = "li:nth-of-type(3) > .b-accordion-handler.b-textlink.b-textlink--parent > .b-accordion-text")
    WebElement shoes;

    @FindBy(xpath = "//div[@id='leftnav']//div[@class='dialog__cell']/section[1]/ul/li[4]/button[@class='b-accordion-handler b-textlink b-textlink--parent']/span[@class='b-accordion-text']")
    WebElement jewellery ;

    @FindBy(css = "li:nth-of-type(5) > .b-accordion-handler.b-textlink.b-textlink--parent > .b-accordion-text")
    WebElement watches;

    @FindBy(css = "li:nth-of-type(10) > .b-accordion-handler.b-textlink.b-textlink--parent > .b-accordion-text")
    WebElement vintage;

    @FindBy(linkText = "Sales & Events")
    WebElement salesAndEvents;

    @FindBy(linkText = "adidas")
    WebElement adidas;

    @FindBy(linkText = "Women's Trends")
    WebElement womenTrends;

    public void checkWomenCloth() {
        womensClothing.click();
    }
    public void checkMenClothing(){
        mensClothing.click();
    }
    public void checkShoes() {
        shoes.click();
    }
    public void checkJewellery() {
        jewellery.click();
    }
    public void checkWatches() {
         watches.click();
    }
    public void checkVintage() {
        vintage.click();
    }
    public void checkSalesAndEvents() {
        salesAndEvents.click();
    }
    public void checkAdidas() {
        adidas.click();
    }
    public void checkWomenTrends() {
        womenTrends.click();
    }
}

package protection;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuysProtection extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//div[@class='ng-item ng-bp']//a[contains(text(),'Buyer Protection')]")
    public static WebElement buyProtection;

    public static WebElement getBuyProtection() {
        return buyProtection;
    }

    public void clickOnBuyProtection() {
        getBuyProtection().click();
    }
}

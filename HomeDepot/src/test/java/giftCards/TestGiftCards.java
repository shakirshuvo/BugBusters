package giftCards;

import base.CommonAPI;
import forThePro.ForThePro;
import giftCard.GiftCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftCards extends CommonAPI {

    @Test
    public void testCartButton() {
        GiftCards giftCards = PageFactory.initElements(driver, GiftCards.class);
        giftCards.PaymentWebElement.click();
        Assert.assertEquals(giftCards.PaymentWebElement.isDisplayed(), true);

    }
}

package keyword;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeywordTest extends CommonAPI {
    @Test
    public void testKeyword() throws InterruptedException, IOException {
        Features feature = PageFactory.initElements(driver, Features.class);
        feature.selectFeatures(driver);
    }
}

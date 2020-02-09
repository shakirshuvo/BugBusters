package keyword;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeywordTest extends CommonAPI {
    @Test
    public void testKeyword() throws InterruptedException, IOException {
        Feature feature = PageFactory.initElements(driver, Feature.class);
        feature.getTitleNSearch(driver);
    }
}

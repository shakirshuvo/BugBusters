package home;

import base.CommonAPI;
import com.sun.xml.fastinfoset.sax.Features;
import keyword.Feature;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestkeyWord extends CommonAPI {
    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        Feature features = PageFactory.initElements(driver, Feature.class);
        features.selectFeatures(driver);
    }

}

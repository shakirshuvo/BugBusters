package AliExpressSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AliExpressSearch extends CommonAPI {

    @FindBy(xpath = "/html//input[@id='search-key']")
    public WebElement searchField;

    public static void IceCreamScooper() {
    }

    public void searchIceCreamScooper() {
        searchField.sendKeys("Ice Scream Scooper");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=SB_20200209004832&SearchText=ice+cream+scooper";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void FlipFlops() {
        searchField.sendKeys("Flip Flops");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=flip+flops";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void CatToys() {
        searchField.sendKeys("Cat Toys");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Cat+Toys";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void Flashlight() {
        searchField.sendKeys("Flashlight");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=flashlight";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ActionFigure() {
        searchField.sendKeys("Action Figure");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Action+Figure";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void MenSnapback() {
        searchField.sendKeys("Men Snapback");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Men+Snapback";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ChineseHat() {
        searchField.sendKeys("Chinese Hat");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Chinese+Hat";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void MensBoxers() {
        searchField.sendKeys("Mens Boxers");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Mens+Boxers";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void BillyJoel() {
        searchField.sendKeys("Billy Joel");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Billy+Joel";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void LinkinPark() {
        searchField.sendKeys("Linkin Park");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Linkin+Park";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void JotaroKujo() {
        searchField.sendKeys("Jotaro Kujo");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Jotaro+Kujo";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void GiornoGiovanna() {
        searchField.sendKeys("Giorno Giovanna");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Giorno+Giovanna";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ThePolice() {
        searchField.sendKeys("The Police");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=The+Police";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void DioBrando() {
        searchField.sendKeys("Dio Brando");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Dio+Brando";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void NoDoubt() {
        searchField.sendKeys("No Doubt");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=No+Doubt";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ResidentEvil() {
        searchField.sendKeys("Resident Evil");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Resident+Evil";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void UnsolvedMysteries() {
        searchField.sendKeys("Unsolved Mysteries");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Unsolved+Mysteries";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void FamilyMatters() {
        searchField.sendKeys("Family Matters");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Family+Matters";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void MetalGear() {
        searchField.sendKeys("Metal Gear");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Metal+Gear";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void SuperMario() {
        searchField.sendKeys("Super Mario");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Super+Mario";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void BangladeshFlag() {
        searchField.sendKeys("Bangladesh Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Bangladesh+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void PakistanFlag() {
        searchField.sendKeys("Pakistan Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Pakistan+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void IndianFlag() {
        searchField.sendKeys("Indian Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Indian+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void FranceFlag() {
        searchField.sendKeys("France Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=France+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ZimbabweFlag() {
        searchField.sendKeys("Zimbabwe Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Zimbabwe+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void StupidFlag() {
        searchField.sendKeys("Stupid Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Stupid+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void NepalFlag() {
        searchField.sendKeys("Nepal Flag");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Nepal+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void GwenStefani() {
        searchField.sendKeys("Gwen Stefani");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Gwen+Stefani";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void DogToys() {
        searchField.sendKeys("Dog Toys");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Dog+Toys";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void GlassPipe() {
        searchField.sendKeys("Glass Pipe");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Glass+Pipe";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void TheBeatles() {
        searchField.sendKeys("The Beatles");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=The+Beatles";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void PrayingMantis() {
        searchField.sendKeys("Praying Mantis");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Praying+Mantis";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void CowboyHat() {
        searchField.sendKeys("Cowboy Hat");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Cowboy+Hat";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void FunnyHat() {
        searchField.sendKeys("Funny Hat");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Funny+Hat";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void BaseballBat() {
        searchField.sendKeys("Baseball Bat");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Baseball+Bat";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void CricketBat() {
        searchField.sendKeys("Cricket Bat");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Cricket+Bat";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void TacticalGloves() {
        searchField.sendKeys("Tactical Gloves");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Tactical+Gloves";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void JolyneCujoh() {
        searchField.sendKeys("Jolyne Cujoh");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Jolyne+Cujoh";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void TheWatchmen() {
        searchField.sendKeys("The Watchmen");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=The+Watchmen";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void RubberChicken() {
        searchField.sendKeys("Rubber Chicken");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Pakistan+flag";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void CleanBandit() {
        searchField.sendKeys("Clean Bandit");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Clean+Bandit";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void HomerSimpson() {
        searchField.sendKeys("Homer Simpson");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Homer+Simpson";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void PeterGriffin() {
        searchField.sendKeys("Peter Grifffin");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Peter+Griffin";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void SpikeSpiegel() {
        searchField.sendKeys("Spike Spiegel");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Spike+Spiegel";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void PaulMcCartney() {
        searchField.sendKeys("Paul McCartney");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Paul+McCartney";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void JohnLennon() {
        searchField.sendKeys("John Lennon");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=John+Lennon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void RingoStarr() {
        searchField.sendKeys("Ringo Starr");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Ringo+Starr";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void GeorgeHarrison() {
        searchField.sendKeys("George Harrison");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=George+Harrison";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void JillValentine() {
        searchField.sendKeys("Jill Valentine");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Jill+Valentine";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void ChrisRedfield() {
        searchField.sendKeys("Chris Redfield");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Chris+Redfield";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void AlbertWesker() {
        searchField.sendKeys("Albert Wesker");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Albert+Wesker";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }

    public void BarryBurton() {
        searchField.sendKeys("Barry Burton");
        searchField.submit();
        String exptectedUrl = "https://www.aliexpress.com/wholesale?catId=0&initiative_id=AS_20200209004834&SearchText=Barry+Burton";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptectedUrl, actualUrl);
    }
}

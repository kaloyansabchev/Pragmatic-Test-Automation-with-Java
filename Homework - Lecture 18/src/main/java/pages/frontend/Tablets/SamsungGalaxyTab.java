package pages.frontend.Tablets;

import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class SamsungGalaxyTab extends Base {
    private static String homePageURL = "http://shop.pragmatic.bg/";
    private static final By TABLETS_BUTTON = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]");
    private static final By All_TABLETS_BUTTON = By.xpath("//*[@id=\"menu\"]//li[4]/div/a");
    private static final By SAMSUNG_GALAXY_TAB_NAME_XPATH = By.xpath("//*[@id=\"content\"]//div[2]//h4/a");

    public static void open() {
        Browser.driver.get(homePageURL);
    }

    public static void goToAllTabletsPage(){
        click(TABLETS_BUTTON);
        click(All_TABLETS_BUTTON);
    }

    public static void verifyAvailability(String expectedSamsunsGalaxyTab, String messageOnFailure) {
        String actualSamsungGalaxyTab = getText(SAMSUNG_GALAXY_TAB_NAME_XPATH);
        Assert.assertEquals(actualSamsungGalaxyTab, expectedSamsunsGalaxyTab, messageOnFailure);
    }

}

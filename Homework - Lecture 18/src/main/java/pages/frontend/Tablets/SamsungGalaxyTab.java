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

    /**
     * Opens the URL of shop.pragmatic.bg/Tablets
     */
    public static void open() {
        Browser.driver.get(homePageURL);
    }

    /**
     * Clicks on the "Tablets" from the header options
     * and that click on the "Show all tablets" from the dropdown menu
     */
    public static void goToAllTabletsPage(){
        click(TABLETS_BUTTON);
        click(All_TABLETS_BUTTON);
    }

    /**
     * Asserts if the provide tablet name matches the expected tablet name as the expected
     * @param expectedSamsungGalaxyTab the name of the tablet that we expect to be shown
     * @param messageOnFailure the message that will appear in your reports in case if test failure
     */
    public static void verifyAvailability(String expectedSamsungGalaxyTab, String messageOnFailure) {
        String actualSamsungGalaxyTab = getText(SAMSUNG_GALAXY_TAB_NAME_XPATH);
        Assert.assertEquals(actualSamsungGalaxyTab, expectedSamsungGalaxyTab, messageOnFailure);
    }

}

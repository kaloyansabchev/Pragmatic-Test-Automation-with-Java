package pages.frontend.PhonePage;

import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class PhonesPage extends Base {

    private static String phonePageURL = "http://shop.pragmatic.bg/index.php?route=product/category&path=24";

    public static void open() {
        Browser.driver.get(phonePageURL);
    }

//    private static final By HTC_NAME_XPATH = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
//
//    public static void verifyHTCAvailability(String expectedHTC, String messageOnFailure) {
//        String actualHTC = getText(HTC_NAME_XPATH);
//        Assert.assertEquals(actualHTC, expectedHTC, messageOnFailure);
//    }



}

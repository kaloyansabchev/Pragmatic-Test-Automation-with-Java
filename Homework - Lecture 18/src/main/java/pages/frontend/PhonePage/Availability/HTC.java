package pages.frontend.PhonePage.Availability;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.frontend.PhonePage.PhonesPage;

public class HTC extends PhonesPage {
    private static final By HTC_NAME_CSS = By.cssSelector("#content > div:nth-child(3) > div:nth-child(1) h4 > a");

    public static void verifyAvailability(String expectedHTC, String messageOnFailure) {
        String actualHTC = getText(HTC_NAME_CSS);
        Assert.assertEquals(actualHTC, expectedHTC, messageOnFailure);
    }
}

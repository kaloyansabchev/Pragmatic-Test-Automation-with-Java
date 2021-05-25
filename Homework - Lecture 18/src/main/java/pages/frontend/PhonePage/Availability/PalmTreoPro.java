package pages.frontend.PhonePage.Availability;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.frontend.PhonePage.PhonesPage;

public class PalmTreoPro extends PhonesPage {
    private static final By PalmTreoPro_NAME_CSS = By.cssSelector("#content > div:nth-child(3) > div:nth-child(3) h4 > a");

    /**
     * Asserts if the provide phone name matches the expected phone name as the expected
     * @param expectedPalmTreoPro the name of the phone that we expect to be shown in the first option
     * @param messageOnFailure the message that will appear in your reports in case if test failure
     */
    public static void verifyAvailability(String expectedPalmTreoPro, String messageOnFailure) {
        String actualHTC = getText(PalmTreoPro_NAME_CSS);
        Assert.assertEquals(actualHTC, expectedPalmTreoPro, messageOnFailure);
    }
}


package pages.frontend.PhonePage.Availability;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.frontend.PhonePage.PhonesPage;

public class PalmTreoPro extends PhonesPage {
    private static final By PalmTreoPro_NAME_XPATH = By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[1]/h4/a");

    public static void verifyAvailability(String expectedHTC, String messageOnFailure) {
        String actualHTC = getText(PalmTreoPro_NAME_XPATH);
        Assert.assertEquals(actualHTC, expectedHTC, messageOnFailure);
    }
}


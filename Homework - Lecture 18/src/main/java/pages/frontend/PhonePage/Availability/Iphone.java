package pages.frontend.PhonePage.Availability;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.frontend.PhonePage.PhonesPage;

public class Iphone extends PhonesPage {
    private static final By Iphone_NAME_XPATH = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a");

    public static void verifyAvailability(String expectedHTC, String messageOnFailure) {
        String actualHTC = getText(Iphone_NAME_XPATH);
        Assert.assertEquals(actualHTC, expectedHTC, messageOnFailure);
    }
}

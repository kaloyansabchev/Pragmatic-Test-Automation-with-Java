package frontend.positive.phones.availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.PalmTreoPro;
import pages.frontend.PhonePage.PhonesPage;

public class PalmTreoProTest extends BaseTest {
    @Test
    public void palmTreoProAvailability(){
        PhonesPage.open();
        PalmTreoPro.verifyAvailability("Palm Treo Pro", "You were unable to find the Palm Treo Pro Phone!");

    }
}

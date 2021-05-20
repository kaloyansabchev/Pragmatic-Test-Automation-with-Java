package frontend.negative;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.PalmTreoPro;

public class PalmTreoProTest extends BaseTest {

    @Test
    public void palmTreoProAvailability(){
        PalmTreoPro.open();
        PalmTreoPro.verifyAvailability("Palm Treo pro", "You were unable to find the Palm Treo Pro Phone!");

    }
}

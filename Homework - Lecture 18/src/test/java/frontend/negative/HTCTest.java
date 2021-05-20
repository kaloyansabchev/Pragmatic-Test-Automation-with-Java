package frontend.negative;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.HTC;

public class HTCTest extends BaseTest {

    @Test
    public void htcAvailability(){
        HTC.open();
        HTC.verifyAvailability("HTC Touch hd", "You were unable to find the HTC Phone!");

    }
}

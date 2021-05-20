package frontend.positive.phones.Availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.HTC;
import pages.frontend.PhonePage.PhonesPage;

public class HTCTest extends BaseTest{

    @Test
    public void htcAvailability(){
        HTC.open();
        HTC.verifyAvailability("HTC Touch HD", "You were unable to find the HTC Phone!");

    }



}

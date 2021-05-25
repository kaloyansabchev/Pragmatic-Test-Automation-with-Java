package frontend.positive.phones.availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.HTC;

public class HTCTest extends BaseTest{

    @Test
    public void htcAvailability(){
        HTC.open();
        HTC.verifyAvailability("HTC Touch HD", "You were unable to find the HTC Phone!");

    }



}

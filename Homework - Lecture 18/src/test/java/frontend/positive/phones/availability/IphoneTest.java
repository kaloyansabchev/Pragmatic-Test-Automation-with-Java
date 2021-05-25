package frontend.positive.phones.availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.Iphone;

public class IphoneTest extends BaseTest {
    @Test
    public void iphoneAvailability(){
        Iphone.open();
        Iphone.verifyAvailability("iPhone", "You were unable to find the iPhone!");

    }
}

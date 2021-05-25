package frontend.negative.phones.availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.PhonePage.Availability.Iphone;

public class IphoneTest extends BaseTest {

    @Test
    public void iphoneavailability(){
        Iphone.open();
        Iphone.verifyAvailability("Iphone", "You were unable to find the iPhone!");

    }
}

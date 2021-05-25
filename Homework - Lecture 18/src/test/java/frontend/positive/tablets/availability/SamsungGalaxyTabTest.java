package frontend.positive.tablets.availability;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.Tablets.SamsungGalaxyTab;

public class SamsungGalaxyTabTest extends BaseTest {
    @Test
    public void samsungGalaxyTabAvailability(){
        SamsungGalaxyTab.open();
        SamsungGalaxyTab.goToAllTabletsPage();
        SamsungGalaxyTab.verifyAvailability("Samsung Galaxy Tab 10.1", "You were unable to find the Samsung Galaxy Tab 10.1!");
    }
}

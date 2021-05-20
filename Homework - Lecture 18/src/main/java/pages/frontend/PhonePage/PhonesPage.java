package pages.frontend.PhonePage;

import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class PhonesPage extends Base {

    private static String phonePageURL = "http://shop.pragmatic.bg/index.php?route=product/category&path=24";

    public static void open() {
        Browser.driver.get(phonePageURL);
    }

}

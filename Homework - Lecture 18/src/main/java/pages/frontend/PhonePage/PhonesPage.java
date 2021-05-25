package pages.frontend.PhonePage;

import core.Base;
import utils.Browser;

public class PhonesPage extends Base {

    private static String phonePageURL = "http://shop.pragmatic.bg/index.php?route=product/category&path=24";

    /**
     * Opens the URL of shop.pragmatic.bg/Phones & PDAs
     */
    public static void open() {
        Browser.driver.get(phonePageURL);
    }

}

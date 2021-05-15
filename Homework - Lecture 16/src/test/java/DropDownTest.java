import org.openqa.selenium.WebDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropDownTest {

    WebDriver driver;

    @BeforeTest
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shop.pragmatic.bg/admin");
    }

    @Test
    public void test() {
        driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("parola123!");
        driver.findElement(By.cssSelector(".btn-primary")).click();

        driver.findElement(By.id("menu-sale")).click();
        driver.findElement(By.linkText("Orders")).click();

        String[] expectedOrderStatus = {
                "",
                "Missing Orders",
                "Canceled",
                "Canceled Reversal",
                "Chargeback",
                "Complete",
                "Denied",
                "Expired",
                "Failed",
                "Pending",
                "Processed",
                "Processing",
                "Refunded",
                "Reversed",
                "Shipped",
                "Voided"};

        Select actualOrderStatus = new Select(driver.findElement(By.name("filter_order_status_id")));
        List<String> actualValues = new ArrayList<>();
        List<WebElement> allDropdownElements = actualOrderStatus.getOptions();

        for (WebElement curDropdownElement : allDropdownElements) {
            actualValues.add(curDropdownElement.getText());
        }

        Assert.assertEquals(expectedOrderStatus, actualValues.toArray());

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}

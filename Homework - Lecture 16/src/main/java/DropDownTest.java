import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownTest {

    WebDriver driver;

    @BeforeTest
    public void startUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shop.pragmatic.bg/admin");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("parola123!");
        driver.findElement(By.cssSelector(".btn-primary")).click();

        driver.findElement(By.id("menu-sale")).click();
        driver.findElement(By.linkText("Orders")).click();

        Select orderStatusDropDown = new Select(driver.findElement(By.id("input-order-status")));

        String[] expectedValues = {
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
                "Voided" };

        List<String> actualValues = new ArrayList<>();

        List<WebElement> allDropdownElements = orderStatusDropDown.getOptions();

        for (WebElement curDropdownElement : allDropdownElements) {
            actualValues.add(curDropdownElement.getText());
        }

        Assert.assertEquals(expectedValues, actualValues.toArray());

    }

}

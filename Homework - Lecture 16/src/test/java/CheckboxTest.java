import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckboxTest {
    WebDriver driver;

    @BeforeTest
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }

    @Test
    public void test() {
        WebElement airBags = this.driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p[3]/input[2]"));
        WebElement parkingSensor = this.driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p[3]/input[3]"));

        Actions builder = new Actions(driver);

        builder
                .click(airBags)
                .click(parkingSensor)
                .perform();

        boolean isBagsAreSelected = airBags.isSelected();
        boolean isSensorsAreSelected = airBags.isSelected();
        Assert.assertTrue(isBagsAreSelected);
        Assert.assertTrue(isSensorsAreSelected);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ExplicitWaitTest {
    WebDriver driver;

    @BeforeTest
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.takeaway.com/bg");
    }

    @Test
    public void test() throws InterruptedException {
        WebElement searchBar = this.driver.findElement(By.xpath("//*[@id=\"imysearchstring\"]"));
        searchBar.click();
        searchBar.sendKeys("ulitsa \"akad. Rumen Tsanev\", Sofia");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(new ExpectedCondition<Boolean>() {
            @Nullable
            @Override
            public Boolean apply(@Nullable WebDriver webDriver) {
                return driver.findElement(By.cssSelector("#iautoCompleteDropDownContent > a.lp__place.notranslate.selected")).getText().contains("Rumen Tsanev");
            }
        });

        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        Actions builder = new Actions(driver);
        builder.click(driver
                .findElement(By.xpath("//*[@id=\"input_0\"]")))
                .sendKeys("Burger Box")
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(1500);
        String burger = driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/section/div[1]/div/div[2]/div[2]/div[1]/a/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/h3")).getText();
        assertTrue(burger.contains("Burger"));


    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
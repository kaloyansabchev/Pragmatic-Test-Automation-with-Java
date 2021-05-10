import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestThatFails {
    WebDriver driver;

    @BeforeTest
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shop.pragmatic.bg/admin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logging() {
        driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("admi");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]")).sendKeys("parola123");
        driver.findElement(By.cssSelector(".btn-primary")).click();

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Dashboard"), "You did not login successfully!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

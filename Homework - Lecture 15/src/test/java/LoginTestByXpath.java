import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestByXpath {
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
        driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("parola123!");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Dashboard"),"We have a problem!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

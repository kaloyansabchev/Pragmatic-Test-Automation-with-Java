import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTestByXpath {
    WebDriver driver;

    @Before
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shop.pragmatic.bg/admin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logging() {
        driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("parola123!");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();

        Assert.assertEquals("You did not login successfully", "Dashboard", driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.annotation.Nullable;

import static org.testng.Assert.assertTrue;

public class CloneTest {
    WebDriver driver;

    @BeforeTest
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kallo\\Desktop\\Pragmatic - March\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.takeaway.com/bg");
    }

    @Test
    public void test() throws InterruptedException {
        WebElement searchBar = this.driver.findElement(By.xpath("//*[@id=\"imysearchstring\"]"));
        Thread.sleep(3000);
        searchBar.click();
        searchBar.sendKeys(Keys.CONTROL + "A");
        searchBar.clear();
        Thread.sleep(3000);
        searchBar.sendKeys("Христо Спиридонов 3, 5400 Севлиево", Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(new ExpectedCondition<Boolean>() {
            @Nullable
            @Override
            public Boolean apply(@Nullable WebDriver webDriver) {
                return driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/div[2]/div/span/span")).getText().contains("Христо Спиридонов 3, 5400 Севлиево");
            }
        });

        Actions builder = new Actions(driver);
        builder.doubleClick(driver
                .findElement(By.xpath("//*[@id=\"input_0\"]")))
                .sendKeys("White")
                .click()
                .perform();

        String allRestaurantsText = driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/section/div[1]/div/div[2]/div[2]/div[1]/a/div/div/div/div/div[2]/div/div/div[1]/div[1]/div")).getText();

        assertTrue(allRestaurantsText.contains("The White Horse Restaurant|Ресторант Бялото Конче"));

    }

//    @AfterMethod
//    public void quit() {
//        driver.quit();
//    }
}

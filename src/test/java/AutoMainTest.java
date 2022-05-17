import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoMainTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    void surfTest() {
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
        //actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1" +
          //      "]/img"))).click().perform();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product_reference\"]/span")));
        //Expected URL: http://automationpractice.com/index.php?id_product=6&controller=product
        Assertions.assertTrue(driver.getCurrentUrl().contains("6&controller"));
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).isDisplayed(), true);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}

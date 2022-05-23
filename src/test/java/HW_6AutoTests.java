import HW_6.LoggerHW7;
import HW_6.NavigationBlock;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class HW_6AutoTests {
    WebDriver driver;
    //NavigationBlock navigationBlock;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new EventFiringDecorator(new LoggerHW7()).decorate(new ChromeDriver());
        //driver = new ChromeDriver();
        //navigationBlock = new NavigationBlock(driver);
    }

    @Test
    @Feature("Карточка товара")
    @Story("Произвольный поиск товара")
    void surfTest() {
        driver.get("http://automationpractice.com/index.php");
        new NavigationBlock(driver)
                .clickDressesButton()
                .clickSummerDressesElement()
                .clickSummerDress();

        Assertions.assertAll(
                () -> Assertions.assertTrue(driver.getCurrentUrl().contains("6&controller")),
                () -> Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span")).isDisplayed(), true)
        );


    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

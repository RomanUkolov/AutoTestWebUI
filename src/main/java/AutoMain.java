import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AutoMain {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox = new FirefoxDriver();
        firefox.get("http://automationpractice.com");

        Thread.sleep(5000);

        firefox.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        Thread.sleep(5000);
        firefox.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a")).click();
        Thread.sleep(5000);
        Actions actions = new Actions(firefox);
        actions.moveToElement(firefox.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")));
        Thread.sleep(3000);
        actions.moveToElement(firefox.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1" +
                        "]"))).click().perform();
        //Thread.sleep(5000);
        //firefox.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")).click();
        Thread.sleep(5000);
        firefox.findElement(By.xpath("//*[@title=\"Close window\"]")).click();
        Thread.sleep(5000);
        firefox.findElement(By.xpath("//*[@title=\"View my shopping cart\"]"));

        Thread.sleep(5000);
        firefox.quit();
    }
}

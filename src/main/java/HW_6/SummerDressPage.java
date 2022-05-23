package HW_6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SummerDressPage extends BaseView{
    public SummerDressPage(WebDriver driver) {
        super(driver);
    }
    private  final static String SUMMER_DRESS_XPATH_LOCATOR = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img";

    @FindBy(xpath = SUMMER_DRESS_XPATH_LOCATOR )
    private WebElement summerDress;

    @Step("Выбор платья")
    public void clickSummerDress() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUMMER_DRESS_XPATH_LOCATOR)));
        summerDress.click();
    }
}

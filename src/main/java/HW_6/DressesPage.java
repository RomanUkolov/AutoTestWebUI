package HW_6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DressesPage extends BaseView{
    public DressesPage(WebDriver driver) {
        super(driver);
    }
    private  final static String SUMMER_DRESSES_XPATH_LOCATOR = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a";


    @FindBy(xpath = SUMMER_DRESSES_XPATH_LOCATOR )
    private WebElement summerDressesElement;

    @Step("Выбор категории'Summer Dresses'")
    public SummerDressPage clickSummerDressesElement() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUMMER_DRESSES_XPATH_LOCATOR)));
        summerDressesElement.click();
        return new SummerDressPage(driver);
    }


}

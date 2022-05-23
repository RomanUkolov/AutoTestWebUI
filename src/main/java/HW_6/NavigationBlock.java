package HW_6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationBlock extends BaseView {
    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    private final static String DRESSES_BUTTON_XPATH_LOCATOR = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";

    @FindBy(xpath = DRESSES_BUTTON_XPATH_LOCATOR)
    private WebElement dressesButton;

    @Step("Клик по кнопке 'Dresses' на панели навмгации")
    public DressesPage clickDressesButton() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DRESSES_BUTTON_XPATH_LOCATOR)));
        dressesButton.click();
        return new DressesPage(driver);
    }

}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class  HomePageElements {

    WebDriver driver;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
    }

    // Локатор всех вопросов "Вопросы о важном"
    private String dropDownItems = ".//div[@id='accordion__heading-%d']";

    // Локатор всех выпадающих ответов на "Вопросы о важном"
    private String dropDownText = ".//div[@id='accordion__panel-%d']";

    // Локатор для кнопки "Cookie" на домашней странице
    private static final By COOKIE_BUTTON_HOME_PAGE = By.xpath(".//button[@id='rcc-confirm-button']");

    // Локатор для прокрутки до первого элемента "Вопросы о важном"
    private static final By FIRST_DROP_DOWN_ITEM = By.xpath(".//div[@id='accordion__heading-0']");

    // Метод для всех вопросов "Вопросы о важном"
    public void clickOneDropDownItems(int itemIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Явное ожидание сек
        // Ожидание элемента dropDownItems
        WebElement dropDownItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(dropDownItems, itemIndex))));
        // Клик по элементу
        dropDownItem.click();
    }

    // Метод выпадающих ответов на "Вопросы о важном"
    public String getCorrectTextFromDropItems(int itemIndex) {
        return driver.findElement(By.xpath(String.format(dropDownText, itemIndex))).getText();
    }

    // Метод для доступа к кнопке "Куки"
    public void clickCookieButtonHomePage() {
        driver.findElement(COOKIE_BUTTON_HOME_PAGE);
    }

    // Метод для доступа к первому вопросу "Вопросы о важном"
    public WebElement scrollFirstDropDownItem() {
        return driver.findElement(FIRST_DROP_DOWN_ITEM);

    }

}
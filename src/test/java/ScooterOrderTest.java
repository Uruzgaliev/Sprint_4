import Elements.OrderPageElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ScooterOrderTest {

    WebDriver driver;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;
    private final String comment;


    public ScooterOrderTest(String firstName, String lastName, String address,  String phoneNumber, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Иван", "Иванов", "На углу", "+79999999999", "Спасибо!"},
                {"Семен", "Семенов", "За углом", "+7888888888", "Побыстрее!"},
        };
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
    }

    // Тест верхней кнопки "Заказать"
    @Test
    public void testScooterOrderButtonTop() {
        driver.findElement(OrderPageElements.getOrderButtonTop()).click();
        driver.findElement(OrderPageElements.getNameField()).sendKeys(firstName);
        driver.findElement(OrderPageElements.getSurnameField()).sendKeys(lastName);
        driver.findElement(OrderPageElements.getOrderAddressField()).sendKeys(address);
        driver.findElement(OrderPageElements.getMetroStationField()).click();
        driver.findElement(OrderPageElements.getSelectedStation()).click();
        driver.findElement(OrderPageElements.getPhoneNumberField()).sendKeys(phoneNumber);
        driver.findElement(OrderPageElements.getCookieButton()).click();
        driver.findElement(OrderPageElements.getNextButton()).click();
        driver.findElement(OrderPageElements.getDeliveryDateField()).click();
        driver.findElement(OrderPageElements.getDeliveryDate()).click();
        driver.findElement(OrderPageElements.getRentalPeriodField()).click();
        driver.findElement(OrderPageElements.getDropdownPeriodList()).click();
        driver.findElement(OrderPageElements.getColorBlackField()).click();
        driver.findElement(OrderPageElements.getCommentField()).sendKeys(comment);
        driver.findElement(OrderPageElements.getButtonOrderAboutRent()).click();
        driver.findElement(OrderPageElements.getButtonConfirmOrder()).click();
        assertTrue(driver.findElement(OrderPageElements.getOrderTitle()).getText().contains("Заказ оформлен"));
    }

    // Тест кнопки "Заказать" в середине страницы
    @Test
    public void testScooterOrderButtonMiddle() {
        WebElement element = driver.findElement(OrderPageElements.getOrderButtonMiddle());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        driver.findElement(OrderPageElements.getNameField()).sendKeys(firstName);
        driver.findElement(OrderPageElements.getSurnameField()).sendKeys(lastName);
        driver.findElement(OrderPageElements.getOrderAddressField()).sendKeys(address);
        driver.findElement(OrderPageElements.getMetroStationField()).click();
        driver.findElement(OrderPageElements.getSelectedStation()).click();
        driver.findElement(OrderPageElements.getPhoneNumberField()).sendKeys(phoneNumber);
        driver.findElement(OrderPageElements.getCookieButton()).click();
        driver.findElement(OrderPageElements.getNextButton()).click();
        driver.findElement(OrderPageElements.getDeliveryDateField()).click();
        driver.findElement(OrderPageElements.getDeliveryDate()).click();
        driver.findElement(OrderPageElements.getRentalPeriodField()).click();
        driver.findElement(OrderPageElements.getDropdownPeriodList()).click();
        driver.findElement(OrderPageElements.getColorGreyField()).click();
        driver.findElement(OrderPageElements.getCommentField()).sendKeys(comment);
        driver.findElement(OrderPageElements.getButtonOrderAboutRent()).click();
        driver.findElement(OrderPageElements.getButtonConfirmOrder()).click();
        assertTrue(driver.findElement(OrderPageElements.getOrderTitle()).getText().contains("Заказ оформлен"));
    }

    @After
    public void cleanUp() {
        driver.close();
    }

}

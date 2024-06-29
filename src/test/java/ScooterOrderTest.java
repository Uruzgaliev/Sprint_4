import elements.OrderPageElements;
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
        OrderPageElements orderPageElements = new OrderPageElements(driver);
        orderPageElements.clickOrderButtonTop();
        orderPageElements.enterFirstName(firstName);
        orderPageElements.enterLastName(lastName);
        orderPageElements.enterOrderAddressField(address);
        orderPageElements.clickMetroStationField();
        orderPageElements.selectedStation();
        orderPageElements.enterPhoneNumberField(phoneNumber);
        orderPageElements.clickCookieButton();
        orderPageElements.clickNextButton();
        orderPageElements.clickDeliveryDateField();
        orderPageElements.clickDeliveryDate();
        orderPageElements.clickRentalPeriodField();
        orderPageElements.clickDropdownPeriodList();
        orderPageElements.clickColorBlackField();
        orderPageElements.enterCommentField(comment);
        orderPageElements.clickButtonOrderAboutRent();
        orderPageElements.clickButtonConfirmOrder();
        assertTrue(orderPageElements.textOrderTitle().contains("Заказ оформлен"));
    }

    // Тест кнопки "Заказать" в середине страницы
    @Test
    public void testScooterOrderButtonMiddle() {
        OrderPageElements orderPageElements = new OrderPageElements(driver);
        orderPageElements.clickCookieButtonHomePage();
        WebElement element = orderPageElements.clickOrderButtonMiddle();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        orderPageElements.enterFirstName(firstName);
        orderPageElements.enterLastName(lastName);
        orderPageElements.enterOrderAddressField(address);
        orderPageElements.clickMetroStationField();
        orderPageElements.selectedStation();
        orderPageElements.enterPhoneNumberField(phoneNumber);
        orderPageElements.clickNextButton();
        orderPageElements.clickDeliveryDateField();
        orderPageElements.clickDeliveryDate();
        orderPageElements.clickRentalPeriodField();
        orderPageElements.clickDropdownPeriodList();
        orderPageElements.clickColorBlackField();
        orderPageElements.enterCommentField(comment);
        orderPageElements.clickButtonOrderAboutRent();
        orderPageElements.clickButtonConfirmOrder();
        assertTrue(orderPageElements.textOrderTitle().contains("Заказ оформлен"));

    }

    @After
    public void cleanUp() {
        driver.close();
    }

}

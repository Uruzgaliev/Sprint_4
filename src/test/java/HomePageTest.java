import Elements.HomePageElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Parameterized.class)
public class HomePageTest {

    private static WebDriver driver;
    int itemIndex;
    String expectedText;

    public HomePageTest(int itemIndex, String expectedText) {
        this.itemIndex = itemIndex;
        this.expectedText = expectedText;

    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
        WebElement element = driver.findElement(HomePageElements.getFirstDropDownItem());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(HomePageElements.getCookieButtonHomePage()).click();
    }

    @Test
    public void testItemText() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.clickOneDropDownItems(itemIndex);
        String actualText = homePageElements.getCorrectTextFromDropItems(itemIndex);
        Assert.assertEquals("Выпадающий текст не соответствует ", expectedText, actualText);

    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
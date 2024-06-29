package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPageElements {

       WebDriver driver;

        public OrderPageElements(WebDriver driver) {
                this.driver = driver;
        }

        // Локатор кнопки "Заказать" в шапке страницы
        private final By ORDER_BUTTON_TOP = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");

        // Локатор для кнопки "Cookie" на домашней странице
        private final By COOKIE_BUTTON_HOME_PAGE = By.xpath(".//button[@id='rcc-confirm-button']");

        // Локатор кнопки "Заказать" в середине страницы
        private final By ORDER_BUTTON_MIDDLE = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

        // Локатор поля "Имя"
        private final By NAME_FIELD = By.xpath(".//input[@placeholder='* Имя']");

        // Локатор поля "Фамилия"
        private final By SURNAME_FIELD = By.xpath(".//input[@placeholder='* Фамилия']");

        // Локатор поля "Адрес: куда привезти заказ"
        private final By ORDER_ADDRESS_FIELD = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

        // Локатор поля "Станция метро"
        private final By METRO_STATION_FIELD = By.xpath(".//input[@placeholder='* Станция метро']");

        // Локатор выбора станции
        private final By SELECTED_STATION = By.xpath(".//div[contains(text(), 'Бульвар Рокоссовского')]");

        // Локатор поля "Телефон: на него позвонит курьер"
        private final By PHONE_NUMBER_FIELD = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

        // Локатор кнопки куки на странице "Для кого самокат"

        private final By COOKIE_BUTTON = By.xpath(".//button[@id='rcc-confirm-button']");

        // Локатор кнопки "Далее"
        private final By NEXT_BUTTON = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");

        // Локатор поля "Когда привезти самокат"
        private final By DELIVERY_DATE_FIELD = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

        // Локатор для даты в которую нужно привезти самокат
        private final By DELIVERY_DATE = By.xpath(".//div[text()='24']");

        // Локатор поля "Срок аренды"
        private final By RENTAL_PERIOD_FIELD = By.xpath(".//div[@class='Dropdown-placeholder']");

        // Локатор выпадающего списка срока аренды
        private final By DROPDOWN_PERIOD_LIST = By.xpath(".//div[text()='сутки']");

        // Локатор поля "Черный цвет"
        private final By COLOR_BLACK_FIELD = By.xpath(".//input[@id='black']");

        // Локатор поля "Серый цвет"
        private final By COLOR_GREY_FIELD = By.xpath(".//input[@id='grey']");

        // Локатор поля "Комментарий для курьера"
        private final By COMMENT_FIELD = By.xpath(".//input[@placeholder='Комментарий для курьера']");

        // Локатор кнопки "Заказать" на экране "Про аренду"
        private static final By BUTTON_ORDER_ABOUT_RENT = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

        // Локатор кнопки подтверждения заказа
        private final By BUTTON_CONFIRM_ORDER = By.xpath(".//button[text()='Да']");

        // Локатор заголовка подтверждения заказа "Заказ оформлен"
        private final By ORDER_TITLE = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");


        // Метод доступа к локатору кнопки "Заказать" в шапке страницы
        public void clickOrderButtonTop() {
                driver.findElement(ORDER_BUTTON_TOP).click();
        }

        // Метод доступа к локатору кнопки "Заказать" в середине страницы
        public WebElement clickOrderButtonMiddle() {
            return driver.findElement(ORDER_BUTTON_MIDDLE);
        }

        // Метод для доступа к кнопке "Куки"
        public void clickCookieButtonHomePage() {
                driver.findElement(COOKIE_BUTTON_HOME_PAGE).click();
        }

        // Метод доступа к локатору поля "Имя"
        public void enterFirstName(String firstName) {
                driver.findElement(NAME_FIELD).sendKeys(firstName);
        }

        // Метод доступа к локатору поля "Фамилия"
        public void enterLastName(String lastName) {
                driver.findElement(SURNAME_FIELD).sendKeys(lastName);
        }

        // Метод доступа к локатору поля "Адрес: куда привезти заказ"
        public void enterOrderAddressField(String address) {
                driver.findElement(ORDER_ADDRESS_FIELD).sendKeys(address);
        }

        // Метод доступа к локатору поля "Станция метро"
        public void clickMetroStationField() {
                driver.findElement(METRO_STATION_FIELD).click();
        }

        // Метод доступа к локатору выбора станции
        public void selectedStation() {
                driver.findElement(SELECTED_STATION).click();
        }

        // Метод доступа к локатору поля "Телефон: на него позвонит курьер"
        public void enterPhoneNumberField(String phoneNumber) {
               driver.findElement(PHONE_NUMBER_FIELD).sendKeys(phoneNumber);
        }

        // Метод доступа к локатору кнопки "Куки"
        public void clickCookieButton() {
               driver.findElement(COOKIE_BUTTON).click();
        }

        // Метод доступа к локатору кнопки "Далее"
        public void clickNextButton() {
               driver.findElement(NEXT_BUTTON).click();
        }

        // Метод доступа к локатору поля "Когда привезти самокат"
        public void clickDeliveryDateField() {
               driver.findElement(DELIVERY_DATE_FIELD).click();
        }

        // Метод доступа к дате, когда привезти самокат
        public void clickDeliveryDate() {
                driver.findElement(DELIVERY_DATE).click();
        }

        // Метод доступа к локатору поля "Срок аренды"
        public void clickRentalPeriodField() {
                driver.findElement(RENTAL_PERIOD_FIELD).click();
        }

        // Метод доступа к локатору выпадающего списка срока аренды
        public void clickDropdownPeriodList() {
                driver.findElement(DROPDOWN_PERIOD_LIST).click();
        }

        // Метод доступа к локатору поля "Черный цвет"
        public void clickColorBlackField() {
               driver.findElement(COLOR_BLACK_FIELD).click();
        }

        // Метод доступа к локатору поля "Серый цвет"
        public void clickColorGreyField() {
                driver.findElement(COLOR_GREY_FIELD).click();
        }

        // Метод доступа к локатору поля "Комментарий для курьера"
        public void enterCommentField(String comment) {
                driver.findElement(COMMENT_FIELD).sendKeys(comment);
        }

        // Метод доступа к локатору кнопки "Заказать" на экране "Про аренду"
        public void clickButtonOrderAboutRent() {
                driver.findElement(BUTTON_ORDER_ABOUT_RENT).click();
        }

        // Метод доступа к локатору кнопки подтверждения заказа
        public void clickButtonConfirmOrder() {
                driver.findElement(BUTTON_CONFIRM_ORDER).click();
        }

        // Метод доступа к локатору заголовка подтверждения заказа
        public String textOrderTitle() {
               return driver.findElement(ORDER_TITLE).getText();
        }

}


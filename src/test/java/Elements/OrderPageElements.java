package Elements;

import org.openqa.selenium.By;

public class OrderPageElements {

        // Локатор кнопки "Заказать" в шапке страницы
        private static final By orderButtonTop = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");

        // Локатор кнопки "Заказать" в середине страницы
        private static final By orderButtonMiddle = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

        // Локатор поля "Имя"
        private static final By nameField = By.xpath(".//input[@placeholder='* Имя']");

        // Локатор поля "Фамилия"
        private static final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");

        // Локатор поля "Адрес: куда привезти заказ"
        private static final By orderAddressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

        // Локатор поля "Станция метро"
        private static final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

        // Локатор выбора станции
        private static final By selectedStation = By.xpath(".//div[contains(text(), 'Бульвар Рокоссовского')]");

        // Локатор поля "Телефон: на него позвонит курьер"
        private static final By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

        // Локатор кнопки куки на странице "Для кого самокат"

        private static final By CookieButton = By.xpath(".//button[@id='rcc-confirm-button']");

        // Локатор кнопки "Далее"
        private static final By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");

        // Локатор поля "Когда привезти самокат"
        private static final By deliveryDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

        // Локатор для даты в которую нужно привезти самокат
        private static final By deliveryDate = By.xpath(".//div[text()='24']");

        // Локатор поля "Срок аренды"
        private static final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");

        // Локатор выпадающего списка срока аренды
        private static final By dropdownPeriodList = By.xpath(".//div[text()='сутки']");

        // Локатор поля "Черный цвет"
        private static final By colorBlackField = By.xpath(".//input[@id='black']");

        // Локатор поля "Серый цвет"
        private static final By colorGreyField = By.xpath(".//input[@id='grey']");

        // Локатор поля "Комментарий для курьера"
        private static final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

        // Локатор кнопки "Заказать" на экране "Про аренду"
        private static final By buttonOrderAboutRent = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

        // Локатор кнопки подтверждения заказа
        private static final By buttonConfirmOrder = By.xpath(".//button[text()='Да']");

        // Локатор заголовка подтверждения заказа "Заказ оформлен"
        private static final By orderTitle = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");


        // Метод доступа к локатору кнопки "Заказать" в шапке страницы
        public static By getOrderButtonTop() {
                return orderButtonTop;
        }

        // Метод доступа к локатору кнопки "Заказать" в середине страницы
        public static By getOrderButtonMiddle() {
                return orderButtonMiddle;
        }

        // Метод доступа к локатору поля "Имя"
        public static By getNameField() {
                return nameField;
        }

        // Метод доступа к локатору поля "Фамилия"
        public static By getSurnameField() {
                return surnameField;
        }

        // Метод доступа к локатору поля "Адрес: куда привезти заказ"
        public static By getOrderAddressField() {
                return orderAddressField;
        }

        // Метод доступа к локатору поля "Станция метро"
        public static By getMetroStationField() {
                return metroStationField;
        }

        // Метод доступа к локатору выбора станции
        public static By getSelectedStation() {
                return selectedStation;
        }

        // Метод доступа к локатору поля "Телефон: на него позвонит курьер"
        public static By getPhoneNumberField() {
                return phoneNumberField;
        }

        // Метод доступа к локатору кнопки "Куки"
        public static By getCookieButton() {
                return CookieButton;
        }

        // Метод доступа к локатору кнопки "Далее"
        public static By getNextButton() {
                return nextButton;
        }

        // Метод доступа к локатору поля "Когда привезти самокат"
        public static By getDeliveryDateField() {
                return deliveryDateField;
        }

        // Метод доступа к дате, когда привезти самокат
        public static By getDeliveryDate(){
                return deliveryDate;
        }

        // Метод доступа к локатору поля "Срок аренды"
        public static By getRentalPeriodField() {
                return rentalPeriodField;
        }

        // Метод доступа к локатору выпадающего списка срока аренды
        public static By getDropdownPeriodList() {
                return dropdownPeriodList;
        }

        // Метод доступа к локатору поля "Черный цвет"
        public static By getColorBlackField() {
                return colorBlackField;
        }

        // Метод доступа к локатору поля "Серый цвет"
        public static By getColorGreyField() {
                return colorGreyField;
        }

        // Метод доступа к локатору поля "Комментарий для курьера"
        public static By getCommentField() {
                return commentField;
        }

        // Метод доступа к локатору кнопки "Заказать" на экране "Про аренду"
        public static By getButtonOrderAboutRent() {
                return buttonOrderAboutRent;
        }

        // Метод доступа к локатору кнопки подтверждения заказа
        public static By getButtonConfirmOrder() {
                return buttonConfirmOrder;
        }

        // Метод доступа к локатору заголовка подтверждения заказа
        public static By getOrderTitle() {
                return orderTitle;
        }

}


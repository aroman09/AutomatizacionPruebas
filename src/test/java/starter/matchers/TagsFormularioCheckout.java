package starter.matchers;

import org.openqa.selenium.By;

public class TagsFormularioCheckout {
    public static By CHECKOUT = By.xpath("//a[contains(@class, 'btn-primary') " +
            "and text()='Checkout']");
    public static By GUEST = By.xpath("//input[@type='radio' " +
            "and @value='guest']");
    public static By CONTINUE_GUEST = By.id("button-account");

    public static By FIRST_NAME = By.id("input-payment-firstname");
    public static By LAST_NAME = By.id("input-payment-lastname");
    public static By EMAIL = By.id("input-payment-email");
    public static By TELEPHONE = By.id("input-payment-telephone");
    public static By ADDRESS = By.id("input-payment-address-1");
    public static By CITY = By.id("input-payment-city");
    public static By POSTCODE = By.id("input-payment-postcode");
    public static By COUNTRY = By.id("input-payment-country");
    public static By ZONE = By.id("input-payment-zone");
    public static By CONTINUE_FORM= By.id("button-guest");

    // public static By COMENTARY = By.name("comment");
    public static By CONTINUE_SHIPPING= By.xpath("//input[@id='button-shipping-method']");
    public static By CONTINUE_PAYMENT= By.xpath("//input[@id='button-payment-method']");
    public static By AGREE_TERMS = By.name("agree");
    public static By CONFIRM_ORDER = By.id("button-confirm");

}

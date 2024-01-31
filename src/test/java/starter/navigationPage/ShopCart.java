package starter.navigationPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://opencart.abstracta.us/")
public class ShopCart extends PageObject{

    @FindBy(name="search")
    private WebElementFacade searchProduct;
    @FindBy(name="go")
    private WebElementFacade searchButton;

}
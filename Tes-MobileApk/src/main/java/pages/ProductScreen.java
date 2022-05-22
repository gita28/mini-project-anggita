package pages;

import Base.BasepageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductScreen extends BasepageObject {

    private By Buttonbuyfield() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    private By Shoppingcartfield() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"1\"])");
    }


    @Step
    public void iClickSelectButtonBuyProduct() {
        onClick(Buttonbuyfield());
    }

    @Step
    public void clickShoppingcartButton() {
        onClick(Shoppingcartfield());
    }

}


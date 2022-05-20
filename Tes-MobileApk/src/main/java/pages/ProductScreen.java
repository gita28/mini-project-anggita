package pages;

import Base.BasepageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductScreen extends BasepageObject {

    private By Produkfield(){
        return MobileBy.xpath("  ");
    }

    private By Buttonbuyfield() {
        return MobileBy.xpath("   "); }

    private By Shoppingcartfield(){
        return MobileBy.xpath("   "); }

    private By Buttonratingfield (){
        return MobileBy.xpath("   "); }


        @Step
        public void iamOnTheProductPage ()
        {open();}

        @Step
         public void iClickSelectButtonBuyProduct ()
        {$(Buttonbuyfield()).click(); }

        @Step
        public void clickShoppingcartButton()
        {$(Shoppingcartfield()).click();}

        @Step
        public void clickButtonShoppingCar()
        {$(Produkfield()).isDisplayed();}

        @Step
        public void iGoToTransaksiPage()
        { $(Buttonratingfield()).isDisplayed();}


            }



package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Productpage extends PageObject {

    private By Produkfield(){
        return MobileBy.xpath("//*[@id=1468]");
    }

    private By Buttonbuyfield(){ return MobileBy.xpath("   "       ); }

    private By Shoppingcartfield(){return MobileBy.xpath("   "       ); }

    private By Buttonratingfield (){return MobileBy.xpath("   "       ); }


        @Step
        public void openPage(){open();}

        @Step
         public void clickbuyField () {$(Buttonbuyfield()).click(); }

        @Step
        public void clickShoppingcartButton() {$(Shoppingcartfield()).click();}

        @Step
        public void validateOnProdukfield(){
        $(Produkfield()).isDisplayed();}

        @Step
        public void clickratingfield() { $(Buttonratingfield()).isDisplayed();}


            }



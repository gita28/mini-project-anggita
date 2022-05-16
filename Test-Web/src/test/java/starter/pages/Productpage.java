package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Productpage extends PageObject {

    private By Produkfield(){
        return By.xpath("//*[@id=app]/div[1]/header/div");
    }

    private By Buttonbuyfield(){ return By.xpath("//*[@id=\"1468\"]/div/div[3]/div[2]/button[1]/span"); }

    private By Shoppingcartfield(){return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]/span/span/i"); }

    private By Buttonratingfield (){return By.xpath("//*[@id=\"1468\"]/div/div[3]/div[2]/button[1]/span"); }


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



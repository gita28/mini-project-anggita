package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Transaksipage extends PageObject {

    private By SetItemfield() {
        return By.xpath("//*[@id=\"order-1468\"]/div[2]/button[1]/span");
    }

    private By ButtonTransactionfield() {
        return By.xpath("//*[@id=\"button-bayar\"]");
    }

    @Step
    public void openPage() {
        open();
    }
    @Step
    public void clickSetItem () {$(SetItemfield()).click(); }

    @Step
    public void clickButtonTransaction() { $(ButtonTransactionfield()).click();
    }

    @Step
    public boolean validateOnTransaksiPage() {
        return $(ButtonTransactionfield()).isDisplayed();

    }
}



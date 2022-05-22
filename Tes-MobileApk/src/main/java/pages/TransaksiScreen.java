package pages;

import Base.BasepageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransaksiScreen extends BasepageObject {

    private By ButtonTransactionfield() {
        return MobileBy.xpath("\"(//android.widget.Button[@content-desc=\\\"Beli\\\"])[2]\" ");
    }


    @Step
    public void cliktransaksiButton() {
        onClick(ButtonTransactionfield());
    }
}



package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Ratingpage extends PageObject {

    private By Ratingfield() {
        return By.xpath("//*[@id=1468]");
    }

    @Step
    public void validateOnRatingPage(){
        $(Ratingfield()).isDisplayed();
    }

}
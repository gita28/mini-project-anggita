package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Ratingpage extends PageObject {

    private By Ratingfield() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div/p[1]");
    }

    @Step
    public void validateOnRatingPage(){
        $(Ratingfield()).isDisplayed();
    }

}
package pages;

import Base.BasepageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RatingScreen extends BasepageObject {

    private By Ratingfield() {
        return MobileBy.xpath("//*[@id=1468]");
    }

    @Step
    public void validateOnRatingPage(){
        $(Ratingfield()).isDisplayed();
    }

}
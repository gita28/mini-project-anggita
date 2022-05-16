package starter.pages;

import net.serenitybdd.screenplay.actions.Scroll;

import io.cucumber.java.an.E;
import net.serenitybdd.core.pages.SerenityActions;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    private By emailField(){
        return By.xpath("//*[label[text()='Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text()='password']]/input");
    }

    private By loginButton(){
        return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']/span[text() = 'Login']");
    }


    @Step public void openPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String Email){
        $(emailField()).type(Email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

}



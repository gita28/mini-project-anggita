package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public void verifyDisplayed {
        Assertions.assertTrue(isDisplayed(Productpage));


    private By emailField(){
        return By.xpath("//*[label[text()='Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text()='password']]/input");
    }

    private By loginButton(){
        return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']/span[text() = 'Login']");
    }



    public void inputEmail(String Email){
        $(emailField()).type(Email);
    }


    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    public void clickLoginButton(){
        $(loginButton()).click();
    }

}



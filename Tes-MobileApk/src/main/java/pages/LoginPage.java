package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    private By emailField() {
        return By.id("textInputEditTextEmail");

    }

    private By password() {
        return By.id("textInputEditTextPassword");

    }

    private By LoginButton() {
        return By.id("textInputEditTextPassword");
    }
   @Step
    public boolean isLoginPage(){
        onType(emailField(), email);

   }
    @Step
    public boolean InputPassword(String password){
        onType(passwordField(), email);
}








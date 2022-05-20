package pages;

import Base.BasepageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import javax.swing.*;

public class LoginScreen extends BasepageObject {

    private By emailField() {
        return MobileBy.id("textInputEditTextEmail");

    }

    private By PasswordField() {
        return By.id("textInputEditTextPassword");

    }
    private By LoginButton() {
        return By.id(" ");
    }
   }
   @Step
    public void iAmOnTheLoginPage() {
       return waitUntilVisible(LoginButton()).isDisplayed();
   }
   @Step
    public void iInputValidEmail(String email) {
        onType(emailField(),email);
   }
   @Step
   public void iInputValidPassword(String password)
     onType (PasswordField(),password);
   }
   @Step
   public void clickLoginButton(){
     onClick(LoginButton());

   }

}






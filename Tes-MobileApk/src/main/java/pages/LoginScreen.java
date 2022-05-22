package pages;

import Base.BasepageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import javax.swing.*;

public class LoginScreen extends BasepageObject {


    private By emailField() {
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    }

    private By passwordField() {
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    }
    private By LoginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    }

   @Step
    public void iInputValidEmailLogin(String email) {
        onType(emailField(),email);
   }
   @Step
   public void iInputValidPasswordLogin(String password){
     onType(passwordField(),password);
   }
   @Step
   public void clickLoginButtonLogin(){
     onClick(LoginButton());

   }

}






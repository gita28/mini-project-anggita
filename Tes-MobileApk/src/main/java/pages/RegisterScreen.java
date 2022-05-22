package pages;

import Base.BasepageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterScreen extends BasepageObject {

    private By UsernameField() {
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By emailFieldregister() {
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By passwordFieldregister() {
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    private By ButtonRegisterField() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }


    @Step
    public void iInputValidUsernameRegister(String username) {
        onType(UsernameField(),username);
    }

    @Step
    public void iInputValidEmailRegister(String emailregister) {
        onType(emailFieldregister(), emailregister);
    }

    @Step
    public void inputPasswordRegister(String passwordRegister) {
        onType(passwordFieldregister(), passwordRegister);
    }

    @Step
    public void clickLoginButtonRegister() {
        onClick(ButtonRegisterField());


    }

}










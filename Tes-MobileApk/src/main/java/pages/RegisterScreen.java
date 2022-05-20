package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterScreen extends BasePageObject {
    public String name = createRandomName();

    public String password ="password!2";

    private By UsernameField() {
        return MobileBy.xpath("textInputEditTextUsername");
    }

    private By emailField() {
        return MobileBy.xpath(" ");
    }

    private By passwordField() {
        return MobileBy.xpath("L ");}

    private By ButtonRegisterField() {
        return MobileBy.xpath(" ");
    }

    @Step
    public void inputNameField() {
        Faker faker= new Faker();
        name = faker.name().fristName();
        dfonType(inputNameField(), name)
    }

    @Step
    public boolean inputEmailField(){
        return $(emailField(), name + "@gmail.com");
    }

    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }

}







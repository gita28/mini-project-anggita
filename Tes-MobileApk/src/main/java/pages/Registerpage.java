package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Registerpage extends BasePageObject {


    private By UsernameField() {
        return MobileBy.xpath("textInputEditTextUsername");
    }

    private By EmailField() {
        return MobileBy.xpath(" ");
    }

    private By PaswordField() {
        return MobileBy.xpath("L ");}

    private By ButtonRegisterField() {
        return By.xpath(" ");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(ButtonRegisterField()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(PaswordField()).type(password);
    }
    @Step
    public void clickRegisterButton(){
        $(ButtonRegisterField()).click();
    }
}







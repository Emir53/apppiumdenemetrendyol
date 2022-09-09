import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class LoginPage extends CommonFunctions{


    public LoginPage(AppiumDriver driver) {
        super(driver);
    }


    @FindBy(id = "trendyol.com:id/editTextEmail")
    public WebElement typeEmail;

    @FindBy(id = "trendyol.com:id/editTextPassword")
    public WebElement typePassword;

    @FindBy(id = "trendyol.com:id/buttonLogin")
    public WebElement loginButton;

    @FindBy(id = "trendyol.com:id/textViewForgotPassword")
    public WebElement forgotPassword;

    @FindBy(id = "trendyol.com:id/buttonFacebookLogin")
    public WebElement loginViaFacebook;

    @FindBy(id = "trendyol.com:id/buttonGoogleLogin")
    public WebElement loginViaGoodle;

    @FindBy(id = "trendyol.com:id/textViewRegister")
    public WebElement registerButton;


    public void typeEmail(String yourEmaıl){

        type((By) typeEmail,yourEmaıl);
    }
    public void typePassword(String yourPassword){

        type((By) typePassword,yourPassword);
    }

    public void clickLogİnButton(){
        click((By) loginButton);
    }

    public void clickLoginViaFacebook(){

        click((By) loginViaFacebook);
    }

    public void clickLoginViaGoogle(){
        click((By) loginViaGoodle);
    }

    public void clickForgotMyPassword(){
        click((By) forgotPassword);
    }

    public void clickRegisterButton(){
        click((By) registerButton);
    }

    public void checkİfOnLoginPage(){

        isDisplayed((By) loginButton);
    }


}

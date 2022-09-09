import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonFunctions{

    @FindBy(id = "trendyol.com:id/buttonRegister")
    public WebElement registerButton;

    @FindBy(id = "trendyol.com:id/editTextEmailOnRegister")
    public WebElement emailBox;

    @FindBy(id = "trendyol.com:id/editTextPasswordOnRegister")
    public WebElement passwordBox;

    @FindBy(id = "trendyol.com:id/genderSelectorWoman")
    public WebElement womanGenderSelector;

    @FindBy(id = "trendyol.com:id/genderSelectorMan")
    public WebElement manGenderSelector;

    @FindBy(id = "trendyol.com:id/checkboxNewCoPrivacyStatementForTy")
    public WebElement firstCheckBox;

    @FindBy(id = "trendyol.com:id/checkBoxElectronicMessageConsent")
    public WebElement secondCheckBox;

    @FindBy(id = "trendyol.com:id/checkBoxClarificationMessageConsent")
    public WebElement thirdCheckBox;

    @FindBy(id = "trendyol.com:id/buttonFacebookLogin")
    public WebElement registerViaFacebook;

    @FindBy(id = "trendyol.com:id/buttonGoogleLogin")
    public WebElement registerViaGoogle;

    @FindBy(id = "trendyol.com:id/buttonLogin")
    public WebElement loginİfRegisteredAlreadyButton;

    public RegisterPage(AppiumDriver driver) {
        super(driver);
    }


    public void typeEmail(String email){
        type((By) emailBox,email);
    }

    public void typePassword(String password){
        type((By) passwordBox,password);
    }

    public void selectWomanAsGender(){
        click((By) womanGenderSelector);
    }

    public void selectManAsGender(){
        click((By) manGenderSelector);
    }

    public void acceptAllCheckBoxes(){
        click((By) firstCheckBox);
        click((By) secondCheckBox);
        click((By) thirdCheckBox);
    }

    public void clickRegisterButton(){
        click((By) registerButton);
    }


    public void clickRegisterViaFacebook(){
        click((By) registerViaFacebook);
    }


    public void clickRegisterViaGoogle(){
        click((By) registerViaGoogle);
    }


    public void clickLoginİfAlreadyRegisteredButton(){

        click((By) loginİfRegisteredAlreadyButton);
    }


    public void registerANewMaleAccount(String email,String password){

        typeEmail(email);
        typePassword(password);
        selectManAsGender();
        acceptAllCheckBoxes();
        clickRegisterButton();

    }

    public void registerANewFemaleAccount(String email,String password){

        typeEmail(email);
        typePassword(password);
        selectWomanAsGender();
        acceptAllCheckBoxes();
        clickRegisterButton();

    }

    public void registerWithoutGender(String email,String password){
        typeEmail(email);
        typePassword(password);
        acceptAllCheckBoxes();
        clickRegisterButton();

    }

    public void checkİfOnRegisterPAge(){

        isDisplayed((By) registerButton);
    }





}

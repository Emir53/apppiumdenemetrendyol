import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



    public void typeEmail(String yourEmaıl){

        type((By) typeEmail,yourEmaıl);
    }
    public void typePassword(String yourPassword){

        type((By) typePassword,yourPassword);
    }

    public void clickLogİnButton(){
        click((By) loginButton);
    }


}

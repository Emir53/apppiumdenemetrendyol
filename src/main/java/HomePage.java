import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonFunctions{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }



    @FindBy(id = "trendyol.com:id/tab_account")
    public WebElement myAccount;




    public void goToMyAccount(){
        click((By) myAccount);
    }
}

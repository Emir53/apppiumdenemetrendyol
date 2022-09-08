import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectUntilHomePage extends CommonFunctions{


    public selectUntilHomePage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "trendyol.com:id/textViewCountryName")
    public WebElement selectTurkiye;

    @FindBy(id = "trendyol.com:id/buttonDismiss")
    public WebElement dismissButton;


    public void goUntilhomePage(){

        click((By) selectTurkiye);
        click((By) dismissButton);
    }





}

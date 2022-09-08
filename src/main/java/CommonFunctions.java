import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonFunctions {

    AppiumDriver driver;

    public  CommonFunctions(AppiumDriver driver){
        this.driver=driver;
    }





    public WebElement find(By locator){
        return driver.findElement(locator);
    }



    public void click(By Locator){
        find(Locator).click();
    }

    public void type(By locator,String text){
        find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }



}

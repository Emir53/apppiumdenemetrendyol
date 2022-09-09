import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonFunctions{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }



    @FindBy(id = "trendyol.com:id/tab_account")
    public WebElement myAccountTab;

    @FindBy(id = "trendyol.com:id/tab_basket")
    public WebElement myBasketTab;

    @FindBy(id = "trendyol.com:id/tab_home")
    public WebElement homeTab;

    @FindBy(id="trendyol.com:id/tab_second")
    public WebElement trendyolGoTab;

    @FindBy(id = "trendyol.com:id/tab_favorites")
    public WebElement myFavoritesTab;

    @FindBy(id = "trendyol.com:id/frameLayoutNotificationContainer")
    public WebElement notificationContainer;

    @FindBy(id = "trendyol.com:id/edittext_search_view")
    public WebElement searchBox;

    @FindBy(id = "trendyol.com:id/imageview_action_start")
    public WebElement searchBoxİcon;

    @FindBy(id = "trendyol.com:id/textViewHomepageTab")
    public WebElement discoverCategory;






    public void goToMyAccount(){
        click((By) myAccountTab);
    }

    public void goToMyBAseket(){
        click((By) myBasketTab);
    }

    public void goToMyFavorites(){
        click((By) myFavoritesTab);
    }

    public void goToTrendyolGo(){
        click((By) trendyolGoTab);
    }

    public void goToHomeTab(){
        click((By) homeTab);
    }

    public void serachAnItem(String text){
        type((By) searchBox,text);
        click((By) searchBoxİcon);

    }

    public void clickOnSearchButton(){
        click((By) searchBoxİcon);
    }
}

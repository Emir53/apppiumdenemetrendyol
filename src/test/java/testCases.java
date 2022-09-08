import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;

public class testCases extends BaseTest{
    CommonFunctions commonFunctions;
    HomePage homePage;
    LoginPage loginPage;
    selectUntilHomePage SelectUntilHomePage;


    @Test
    public void login(){
        SelectUntilHomePage.goUntilhomePage();
        homePage.goToMyAccount();
        loginPage.typeEmail("your e-mail here");
        loginPage.typePassword("your password here");
        loginPage.clickLogİnButton();


    }


}

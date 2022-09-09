import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;

public class testCases extends BaseTest{
    CommonFunctions commonFunctions;
    HomePage homePage;
    LoginPage loginPage;
    selectUntilHomePage SelectUntilHomePage;
    RegisterPage registerPage;


    @Test
    public void login(){
        SelectUntilHomePage.goUntilhomePage();
        homePage.goToMyAccount();
        loginPage.typeEmail("your e-mail here");
        loginPage.typePassword("your password here");
        loginPage.clickLogİnButton();


    }


    @Test
    public void registerNewFemaleUser(String yourEmail,String yourPassword){
        SelectUntilHomePage.goUntilhomePage();
        homePage.goToMyAccount();
        loginPage.clickRegisterButton();
        registerPage.registerANewFemaleAccount(yourEmail,yourPassword);

    }

    @Test
    public void registerNewMaleUser(String yourEmail,String yourPassword){
        SelectUntilHomePage.goUntilhomePage();
        homePage.goToMyAccount();
        loginPage.clickRegisterButton();
        registerPage.registerANewMaleAccount(yourEmail,yourPassword);

    }

    @Test
    public void registerNewUserWithoutGender(String yourEmail,String yourPassword){
        SelectUntilHomePage.goUntilhomePage();
        homePage.goToMyAccount();
        loginPage.clickRegisterButton();
        registerPage.registerWithoutGender(yourEmail,yourPassword);

    }


}

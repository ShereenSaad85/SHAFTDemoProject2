package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainMenuPage {
    private SHAFT.GUI.WebDriver driver;

    //    ===================Locators===================
    private final By loginSignUp=By.xpath("//a[@href='/login']");
        private final By deleteButton=By.xpath("//a[@href='/delete_account']");


    //    ---------METHODS of Actions----------
    public MainMenuPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public MainMenuPage LoginSignUpLinkFromHome(){
        driver.element().click(loginSignUp);
        return this;
    }

    public MainMenuPage ClickOnDeleteButton(){
        driver.element().click(deleteButton);
        return this;
    }

    ////    =======================Variables of Locators in Assertions=================
     private final By loggedInUser=By.xpath("(//ul[@class ='nav navbar-nav']//a)[10]");

    //    ---------METHODS of Assertions----------

        public MainMenuPage LoggedInAsUsernameIsVisible(String expected){
        String actualLoggedInUser=driver.element().getText(loggedInUser);
        Assert.assertEquals(actualLoggedInUser,expected);
        return this;
    }


}

package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     SHAFT.GUI.WebDriver driver;





    //    =======================Variables of Locators in Assertions=================
    private final By signUpTitle=By.xpath("//div[@class='signup-form']/h2");

    //    ---------METHODS of Actions----------
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public HomePage NavigateTo(String url){
        driver.browser().navigateToURL(url);
        return this;
    }
    public HomePage HomePageIsVisiableAssertion(String expectedPageTitle){
//        Assert.assertEquals(driver.getTitle().trim(), expectedPageTitle);
//        driver.browser().getCurrentWindowTitle().trim()
        driver.browser().assertThat().title().equals(expectedPageTitle);
        return this;
    }
//    public void LoginSignUpLinkFromHome(){
//        driver.findElement(loginSignUp).click();
//    }

}

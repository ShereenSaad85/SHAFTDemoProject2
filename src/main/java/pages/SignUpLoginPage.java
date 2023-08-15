package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLoginPage {
    private SHAFT.GUI.WebDriver driver;

    //    =======================Variables of Locators in Assertions=================
        private final By signUpName=By.xpath("//input[@data-qa='signup-name']");
    private final By signUpEmail=By.xpath("//input[@data-qa='signup-email']");
    private final By signupbutton=By.xpath("//button[@data-qa='signup-button']");

    //    ---------METHODS of Actions----------
    public SignUpLoginPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public SignUpLoginPage SignUpWithNameAndEmail(String name,String email){
        driver.element().type(signUpName,name);
        driver.element().type(signUpEmail,email);
        driver.element().click(signupbutton);
        return this;
    }
}

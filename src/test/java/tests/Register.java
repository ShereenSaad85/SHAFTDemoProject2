package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class Register {

    SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test
    public void RegisterUser() {
        new HomePage(driver)
                .NavigateTo("http://automationexercise.com");

        new MainMenuPage(driver)
                .LoginSignUpLinkFromHome();

        new SignUpLoginPage(driver)
                .SignUpWithNameAndEmail("Shereen", "shereen101@gmail.com");

        new SignUpPage(driver)
//                .EnterAccountInformationIsVisible("ENTER ACCOUNT INFORMATION")
                .FillAccountInformation("12345", "4", "5", "2000")
                .CheckBoxes()
                .FillAddressInformation("Shereen", "Saad", "VOIS", "Dallah", "Smart Village", "Canada", "Giza", "hadayek alahram", "122456", "01116281020");

        new ContinuePage(driver)
                .AccountCreatedIsVisible("ACCOUNT CREATED!")
                .ClickOnContinueButton();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

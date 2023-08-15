package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinuePage {
    private SHAFT.GUI.WebDriver driver;

    //    =======================Variables of Locators in Assertions=================
    private final By continueButton=By.xpath("//a[@data-qa='continue-button']");

    //    ---------METHODS of Actions----------

    public ContinuePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
        public ContinuePage ClickOnContinueButton(){
        driver.element().click(continueButton);
        return this;
    }

    ////    =======================Variables of Locators in Assertions=================
    private final By createdAcc=By.xpath("//h2[@data-qa='account-created']");


    //    ---------METHODS of Assertions----------
        public ContinuePage AccountCreatedIsVisible(String expected){
//        String actualCreatedAcc=driver.element().getText(createdAcc);
//        Assert.assertEquals(actualCreatedAcc,expected);
            driver.element().getText(createdAcc).equals(expected);
            return this;
    }
}

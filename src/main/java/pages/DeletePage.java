package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
    private SHAFT.GUI.WebDriver driver;


    ////    =======================Variables of Locators in Assertions=================
    private final By deleteAcc=By.xpath("//h2[@data-qa='account-deleted']");

   //    ---------METHODS of Assertions----------

    public DeletePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public DeletePage AccountDeletedIsVisible(){
//        String actualDeleteAcc=driver.findElement(deleteAcc).getText();
//        Assert.assertEquals(actualDeleteAcc,"ACCOUNT DELETED!");
        driver.element().getText(deleteAcc).equals("ACCOUNT DELETED!");

        return this;
    }
}

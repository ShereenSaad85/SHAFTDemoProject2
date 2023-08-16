package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private SHAFT.GUI.WebDriver driver;

    //    =======================Variables of Locators in Assertions=================
    private final By selectGender=By.id("id_gender2");
    private final By password=By.id("password");
    private final By chooseDay=By.id("days");
    private final By chooseMonth=By.xpath("//select[@id='months']");
    private final By chooseYear=By.xpath("//select[@id='years']");
    private final By newsLetterBox=By.id("newsletter");
    private final By optin=By.id("optin");
    private final By firstName=By.id("first_name");
    private final By lastName=By.id("last_name");
    private final By company=By.id("company");
    private final By firstAddress=By.id("address1");
    private final By secondAddress=By.id("address2");
    private final By country=By.id("country");
    private final By state=By.id("state");
    private final By city=By.id("city");
    private final By zipCode=By.id("zipcode");
    private final By mobileNumber=By.id("mobile_number");
    private final By createAccountButton=By.xpath("//button[@data-qa='create-account']");

    ////    =======================Variables of Locators in Assertions=================
//    private final By accInfo=By.xpath("//div[@class='login-form']/h2/b");
    //    ---------METHODS of Actions----------

    public SignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage FillAccountInformation(String pass,String day, String month, String year){
        driver.element().click(selectGender);
        driver.element().type(password,pass);
//        driver.findElement(chooseDay).click();

        driver.element().select(chooseDay,day);
        driver.element().select(chooseMonth,month);
        driver.element().select(chooseYear,year);
        return this;

    }
    public SignUpPage CheckBoxes(){
        driver.element().click(newsLetterBox);
        driver.element().click(optin);
        return this;
    }

    public SignUpPage FillAddressInformation(String fname,String lname, String comp,String faddress,String saddress,String con,String stat,String citty,String zipcpde,String mobilenum){
        driver.element().type(firstName,fname);
        driver.element().type(lastName,lname);
        driver.element().type(company,comp);
        driver.element().type(firstAddress,faddress);
        driver.element().type(secondAddress,saddress);
        driver.element().select(country,con);
        driver.element().type(state,stat);
        driver.element().type(city,citty);
        driver.element().type(zipCode,zipcpde);
        driver.element().type(mobileNumber,mobilenum);
        driver.element().click(createAccountButton);
        return this;
    }
    //    ---------METHODS of Assertions----------

//    public SignUpPage EnterAccountInformationIsVisible(String expected){
////        String actualAccInfo=driver.element().getText(accInfo);
////        Assert.assertEquals(actualAccInfo,expected);
//        driver.element().getText(accInfo).equals(expected);
//        return this;
//    }
}

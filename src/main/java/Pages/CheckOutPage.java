package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private WebDriver driver;
    //elements
    By emailField= By.xpath("//input[@type=\"email\"]");
    By firstNameField=By.id("PRQRB8B");
    By secondNameField=By.id("G637IDH");
    By cityField=By.id("WE2U6L5");
    By nationDropDown=By.id("J25TS6G");
    By addressField=By.id("VHX53P6");
    By phoneField=By.id("N5BHLCB");
    public CheckOutPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setFirstNameField(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setSecondNameField(String secondName){
        driver.findElement(secondNameField).sendKeys(secondName);
    }
    public void setCityField(String city){
        driver.findElement(cityField).sendKeys(city);
    }
    public void setNationDropDown(String value){
        Select select=new Select(driver.findElement(nationDropDown));
        select.selectByValue(value);
    }
    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void setPhoneField(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
}

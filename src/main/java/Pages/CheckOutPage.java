package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private WebDriver driver;
    //elements
    By emailField= By.xpath("//input[@type=\"email\"]");
    By firstNameField=By.id("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/div[2]/div/input");
    By secondNameField=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/div[3]/div/input");
    By cityField=By.id("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/div[6]/div/input");
    By nationDropDown=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/div[4]/div/select");
    By addressField=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/fieldset/div/div/div/input");
    By phoneField=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[6]/div[1]/div/li/div/div/form[2]/div/div[7]/div/input");
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

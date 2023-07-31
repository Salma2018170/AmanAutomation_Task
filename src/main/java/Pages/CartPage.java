package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    private By checkOutButton= By.xpath("//span[text()=\"ابدأ في تتفيذ الطلب\"]");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public CheckOutPage goToCheckOutPage(){
        driver.findElement(checkOutButton).click();
        return new CheckOutPage(driver);
    }
}

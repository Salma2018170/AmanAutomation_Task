package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage( WebDriver driver){
        this.driver=driver;
    }
    //element
    By beautyImg= By.xpath("//img[@alt=\"care\"]");
    public CarePage chooseBeautyCategory(){
        driver.findElement(beautyImg).click();
        return new CarePage(driver);
    }
}

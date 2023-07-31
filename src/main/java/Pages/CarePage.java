package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarePage {
    private WebDriver driver;
    //Element
    private By item1= By.xpath("//a[text()=\"فرشاة تصفيف الشعر S3 من راش براش - لون ذهبي وردي\"]");
    private By cartButton=By.id("product-addtocart-button");
    public CarePage(WebDriver driver){
        this.driver=driver;
    }
    public void selectItem(){
        driver.findElement(item1).click();
    }
    public CartPage addItemToCart(){
     driver.findElement(cartButton).click();
     return new CartPage(driver);
    }
}

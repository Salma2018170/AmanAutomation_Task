package basics;

import Pages.CarePage;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    WebDriver driver;
    //Pages
   protected HomePage homePage;
   protected CarePage carePage;
   protected CartPage cartPage;
   protected CheckOutPage checkOutPage;
    protected Properties properties=new Properties();
    @BeforeClass
    public void setUp() throws IOException {
        File file = new File("src/main/resources/properties/config.properties");
        FileInputStream stream = new FileInputStream(file);
        properties.load(stream);
        if(properties.getProperty("browserName").equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        else if(properties.getProperty("browserName").equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(properties.getProperty("URL"));
        homePage=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

package testcases;

import basics.Base;
import org.testng.annotations.Test;

import java.util.Properties;

public class E2ETestCase extends Base {
    //Data
    private String email="salma@gmail.com";
    private String firstName="Salma";
    private String secondName="Mohamed";
    private String address="maadi";
    private String city="cairo";
    private String nation="القاهرة";
    private String phone="01159328594";

    @Test(description = "choose beauty category")
    public void TC01(){
        carePage=homePage.chooseBeautyCategory();
    }
    @Test(description = "select item and add it to cart")
    public void TC02(){
        carePage.selectItem();
       cartPage= carePage.addItemToCart();
    }
    @Test(description = "go to check out page ")
    public void TC03(){
         checkOutPage=cartPage.goToCheckOutPage();

    }
    @Test(description = "fill data")
    public void TC04(){
        checkOutPage.setEmailField(email);
        checkOutPage.setFirstNameField(firstName);
        checkOutPage.setSecondNameField(secondName);
        checkOutPage.setAddressField(address);
        checkOutPage.setCityField(city);
        checkOutPage.setNationDropDown(nation);
        checkOutPage.setPhoneField(phone);
    }
}

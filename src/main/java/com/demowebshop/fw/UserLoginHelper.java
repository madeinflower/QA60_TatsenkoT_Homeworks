package com.demowebshop.fw;

import com.demowebshop.models.UserLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginHelper extends BaseHelper {

    public UserLoginHelper(WebDriver driver) {
        super(driver);
    }

    public void fillLoginForm(UserLogin userLogin) {
        type(By.name("Email"), userLogin.getEmail());
        type(By.name("Password"), userLogin.getPassword());
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@value='Log in']"));
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[normalize-space()='Log in']"));
    }



    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//a[normalize-space()='Log out']"));
    }

    public boolean isReturningCustomerElPresent() {
        return isElementPresent(By.xpath("//strong[normalize-space()='Returning Customer']"));
    }





}

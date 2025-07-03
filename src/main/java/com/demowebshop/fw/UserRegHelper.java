package com.demowebshop.fw;

import com.demowebshop.models.UserReg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserRegHelper extends BaseHelper {

    public UserRegHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterUpperButton() {
        click(By.xpath("//a[normalize-space()='Register']"));
    }

    public boolean isRegisterTitlePresent() {
        return isElementPresent(By.xpath("//h1[normalize-space()='Register']"));
    }

    public void fillRegistrationForm(UserReg userReg) {
        click(By.id("gender-female"));
        type(By.id("FirstName"), userReg.getFirstName());
        type(By.id("LastName"), userReg.getLastName());
        type(By.id("Email"), userReg.getEmail());
        type(By.id("Password"), userReg.getPassword());
        type(By.id("ConfirmPassword"), userReg.getConfirmPassword());
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public boolean isRegistrationCompleted() {
        return isElementPresent(By.xpath("//div[contains(text(),'Your registration completed')]"));
    }

    public boolean isContinueButtonPresent() {
        return isElementPresent(By.xpath("//input[@value='Continue']"));
    }

    public void clickOnContinueButton(){
        click(By.xpath("//input[@value='Continue']"));
    }

    public String generateRandomEmail() {
        return "user" + System.currentTimeMillis() + "@test.com";
    }

}






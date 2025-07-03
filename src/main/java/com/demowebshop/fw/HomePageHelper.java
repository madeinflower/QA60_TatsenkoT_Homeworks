package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnSecondItemIcon() {
        click(By.xpath("//a[contains(text(),'14.1-inch Laptop')]"));
    }

    public void clickOnAddToCartButton() {
        click(By.id("add-to-cart-button-31"));
    }

    public void clickOnShoppingCartLink() {
        click(By.xpath("//span[normalize-space()='Shopping cart']"));
    }

    public boolean isSecondItemTitlePresent() {
        return isElementPresent(By.xpath("//a[@class='product-name' and normalize-space()='14.1-inch Laptop']"));
    }

}

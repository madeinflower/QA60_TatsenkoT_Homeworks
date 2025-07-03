package com.separateHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindByCssSelectorsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementsByCssSelectors(){
        WebElement element = driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        System.out.println("Logo size: " + element.getSize());

        WebElement element1 = driver.findElement(By.cssSelector("input[value=\"Search\"]"));
        System.out.println("Search button size: " + element1.getSize());

        WebElement element2 = driver.findElement(By.cssSelector(".ico-register"));
        System.out.println("Register link size: " + element2.getSize());

        WebElement element3 = driver.findElement(By.cssSelector(".ico-login"));
        System.out.println("Login link size: " + element3.getSize());

        WebElement element4 = driver.findElement(By.cssSelector("a[class='ico-cart'] span[class='cart-label']"));
        System.out.println("Shopping cart link size: " + element4.getSize());

        WebElement element5 = driver.findElement(By.cssSelector("a[class='ico-wishlist'] span[class='cart-label']"));
        System.out.println("Wishlist link size: " + element5.getSize());

        WebElement element6 = driver.findElement(By.cssSelector("#small-searchterms"));
        System.out.println("Search input field size: " + element6.getSize());

        WebElement element7 = driver.findElement(By.cssSelector("#newsletter-subscribe-button"));
        System.out.println("Subscribe button size: " + element7.getSize());

        WebElement element8 = driver.findElement(By.cssSelector("#newsletter-email"));
        System.out.println("Newsletter input field size: " + element8.getSize());

        WebElement element9 = driver.findElement(By.cssSelector("div[class='block block-category-navigation'] strong"));
        System.out.println("Categories title size: " + element9.getSize());

    }
}

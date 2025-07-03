package com.demowebshop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ApplicationManager {

    String browser;
    WebDriver driver;

    UserLoginHelper userLogin;
    UserRegHelper userReg;
    HomePageHelper homePage;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("safari")){
            driver=new SafariDriver();
        }


        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        userLogin= new UserLoginHelper(driver);
        userReg = new UserRegHelper(driver);
        homePage = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserLoginHelper getUserLogin() {
        return userLogin;
    }

    public UserRegHelper getUserReg() {
        return userReg;
    }

    public HomePageHelper getHomePage() {
        return homePage;
    }

}

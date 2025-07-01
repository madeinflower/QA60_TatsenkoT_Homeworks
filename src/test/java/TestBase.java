import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver =new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnRegisterButton() {
        click(By.xpath("//a[normalize-space()='Register']"));
    }

    public void type(By locator, String text) {
        if (text != null && isElementPresent(locator)) {
            WebElement element = driver.findElement(locator);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void assertElementPresent(By locator, String message) {
        Assert.assertTrue(isElementPresent(locator), message);
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
        click(By.id("gender-female"));
        type(By.id("FirstName"), firstName);
        type(By.id("LastName"), lastName);
        type(By.id("Email"), email);
        type(By.id("Password"), password);
        type(By.id("ConfirmPassword"), password);
    }

    public void fillLoginForm(String email, String password) {
        type(By.name("Email"), email);
        type(By.name("Password"), password);
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@value='Log in']"));
    }

    public String generateRandomEmail() {
        return "user" + System.currentTimeMillis() + "@test.com";
    }


}

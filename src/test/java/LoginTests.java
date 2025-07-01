import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        click(By.xpath("//a[normalize-space()='Log in']"));
        assertElementPresent(By.xpath("//strong[normalize-space()='Returning Customer']"), "Returning Customer");
        fillLoginForm("tatsenko.tetiana@gmail.com", "1234567890");
        clickOnLoginButton();
        assertElementPresent(By.xpath("//a[normalize-space()='Log out']"), "Logout not found");
    }
}

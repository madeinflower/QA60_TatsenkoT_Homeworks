import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        clickOnRegisterButton();
        assertElementPresent(By.xpath("//h1[normalize-space()='Register']"), "Register page not shown");
        String email = generateRandomEmail();
        fillRegistrationForm("Tetiana", "Tatsenkot", email, "1234567890");
        click(By.id("register-button"));
        assertElementPresent(By.xpath("//div[contains(text(),'Your registration completed')]"), "No success message");
        assertElementPresent(By.xpath("//input[@value='Continue']"), "No Continue button");
        click(By.xpath("//input[@value='Continue']"));
        assertElementPresent(By.xpath("//a[normalize-space()='Log out']"), "Logout not found");
    }
}

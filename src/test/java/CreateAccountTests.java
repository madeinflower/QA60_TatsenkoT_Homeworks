import com.demowebshop.models.UserReg;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        //int i=(int)((System.currentTimeMillis()/1000)%3600);

        app.getUserReg().clickOnRegisterUpperButton();
        app.getUserReg().isRegisterTitlePresent();
        app.getUserReg().fillRegistrationForm(new UserReg().setFirstName("Ann")
                        .setLastName("Tatsenko")
                        .setEmail("ann.tatsenko@gmail.com")
                        .setPassword("1234567890")
                        .setConfirmPassword("1234567890"));
        app.getUserReg().clickOnRegisterButton();
        app.getUserReg().isRegistrationCompleted();
        app.getUserReg().isContinueButtonPresent();
        app.getUserReg().clickOnContinueButton();
        app.getUserLogin().isLogOutButtonPresent();
    }
}

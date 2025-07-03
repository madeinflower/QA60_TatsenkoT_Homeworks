import com.demowebshop.models.UserLogin;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        app.getUserLogin().clickOnLoginLink();
        app.getUserLogin().isReturningCustomerElPresent();
        app.getUserLogin().fillLoginForm(new UserLogin().setEmail("ann.tatsenko@gmail.com")
                .setPassword("1234567890"));
        app.getUserLogin().clickOnLoginButton();
        app.getUserLogin().isLogOutButtonPresent();
    }
}

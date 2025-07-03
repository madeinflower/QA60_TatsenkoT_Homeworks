import com.demowebshop.fw.BaseHelper;
import com.demowebshop.models.UserLogin;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{

    @Test
    public void addItemToCartPositiveTest(){
        app.getUserLogin().clickOnLoginLink();
        app.getUserLogin().isReturningCustomerElPresent();
        app.getUserLogin().fillLoginForm(new UserLogin().setEmail("ann.tatsenko@gmail.com")
                .setPassword("1234567890"));
        app.getUserLogin().clickOnLoginButton();
        app.getUserLogin().isLogOutButtonPresent();

        app.getHomePage().clickOnSecondItemIcon();
        app.getHomePage().clickOnAddToCartButton();
        app.getHomePage().clickOnShoppingCartLink();
        app.getHomePage().isSecondItemTitlePresent();
    }
}

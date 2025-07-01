import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{

    @Test
    public void addItemToCartPositiveTest(){
        click(By.linkText("14.1-inch Laptop"));
        click(By.id("add-to-cart-button-31"));
        click(By.xpath("//span[normalize-space()='Shopping cart']"));
        assertElementPresent(By.xpath("//a[@class='product-name' and normalize-space()='14.1-inch Laptop']"),
                "14.1-inch Laptop' is not displayed");
    }
}

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{

    @Test
    public void addItemToCartPositiveTest(){
        click(By.xpath("//a[normalize-space()='Books']"));
        click(By.xpath("//input[@value='Add to cart']"));
        click(By.xpath("//span[normalize-space()='Shopping cart']"));
        assertElementPresent(By.xpath("//a[@class='product-name' and normalize-space()='Computing and Internet']"),
                "The product link 'Computing and Internet' is not displayed");
    }
}

package TestCasePages;

import Utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class ShoppingCartPage1 extends Utility {
    String ItemPrice;

//    @Test(priority = 6)
    public void CartPage1() throws InterruptedException, IOException {
        Thread.sleep(5000);
        String ActualURL4 = driver.getCurrentUrl();
        System.out.print("The Current Web URL in ShoppingCartPage1 is " + ActualURL4);
        System.out.print("\n");
    }

    public String CartPage11() throws InterruptedException, IOException {

        ItemPrice = driver.findElement(By.xpath(Utility.fetchLocatorValue("PriceLabel"))).getText();
        System.out.println("Book price is " + ItemPrice);
        return ItemPrice;
    }

    public void CartIconClick() throws InterruptedException, IOException {

        driver.findElement(By.id(Utility.fetchLocatorValue("Cart"))).click();
        System.out.print("Cart icon Click Successful");
        System.out.print("\n");
        Thread.sleep(10000);

    }
}

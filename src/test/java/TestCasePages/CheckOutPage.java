package TestCasePages;
import Utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CheckOutPage extends Utility  {
//    String ProductName;
//    public static String ProductName;

//    @Test(priority = 4)
    public void HardCover() throws IOException, InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(Utility.fetchLocatorValue("hardCover"))).click();
        System.out.print("HardCore icon Click Successful");
        System.out.print("\n");

    }

//    @Test(priority = 5)
    public String TitleDetails() throws IOException{

        String ProductName = driver.findElement(By.xpath(Utility.fetchLocatorValue("ProductName"))).getText();
        System.out.println("Product Name is " + ProductName);
        return ProductName;

    }



    public void TitleLength() throws IOException{

        String ProductName = driver.findElement(By.xpath(Utility.fetchLocatorValue("ProductName"))).getText();
        int ProductLength = ProductName.length();
        System.out.println("Product Length  is " + ProductLength);
//        return ProductLength;
    }
    public ShoppingCartPage1 AddToCartClick() throws IOException, InterruptedException {

        driver.findElement(By.id(Utility.fetchLocatorValue("AddToCart"))).click();
        System.out.println("Click Add to Cart Successfully");
        Thread.sleep(10000);
        return new ShoppingCartPage1();

    }
}

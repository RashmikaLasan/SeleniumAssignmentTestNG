package TestCasePages;

import Utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartPage2 extends Utility {
    Public ItemPrice;

//    @Test(priority = 7)
    public void CartPage2() throws InterruptedException, IOException {
        Thread.sleep(5000);
        String ActualURL5 = driver.getCurrentUrl();
        System.out.print("The Current Web URL in CartPage2 is " + ActualURL5);
        System.out.print("\n");


        String BookNameCart2 = driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Cart2BookName"))).getText();
        System.out.println("Book Name  is " + BookNameCart2);


        String ItemPrice2 = driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Cart2BookPrice"))).getText();
        System.out.println("Book price is " + ItemPrice2);

//        CheckOutPage se = new CheckOutPage();
////        se.TitleDetails();
//
//
//        assertEquals(ProductName, BookNameCart2);
//        System.out.println("The Book Name Assertion Success");
//
//
//        assertEquals(ItemPrice, ItemPrice2);
//        System.out.println("The Book Price Assertion Success");

    }
//    @Test(priority = 8)
    public void Quantity() throws IOException {
        String Units= driver.findElement(By.cssSelector(Utility.fetchLocatorValue("Quantity"))).getText();
        int BooksQuantity = Integer.parseInt(Units);

        if (BooksQuantity>0) {
            System.out.println("The Books Quantity is "+ BooksQuantity);
        }
        else {

            System.out.println("Quantity is not sufficient to proceed");
        }
    }

//    @Test(priority = 9)
    public void TotalAssertion() throws IOException, InterruptedException {

        String CartSubtotal = driver.findElement(By.xpath(Utility.fetchLocatorValue("CheckOutSubTotal"))).getText();
        String CheckOutSubtotal = driver.findElement(By.xpath(Utility.fetchLocatorValue("ProceedSubTotal"))).getText();
        System.out.println("CartSubtotal value is "+ CartSubtotal + " and CheckOutSubtotal value is "+ CheckOutSubtotal);
        assertEquals(CartSubtotal, CheckOutSubtotal);
        System.out.println("The CheckOutSubTotal and  ProceedSubTotal values are Equal");

        driver.findElement(By.name(Utility.fetchLocatorValue("ProceedToCheckOut"))).click();
        System.out.print("Click ProceedToCheckOut Button Successfully ");
        System.out.print("\n");

        String ActualURL = driver.getCurrentUrl();
        System.out.print("The Current Web URL in ShoppingCartPage2 is " + ActualURL);
        System.out.print("\n");

        Thread.sleep(10000);
    }
}
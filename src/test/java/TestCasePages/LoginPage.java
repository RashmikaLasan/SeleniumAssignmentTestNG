package TestCasePages;

import Utility.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends Utility {

//    @Test(priority = 10)
//    @Parameters({"UserName","Email","Password"})
    public void LoginUser(String UserName, String Email, String Password) throws InterruptedException, IOException {

        driver.findElement(By.id(Utility.fetchLocatorValue("CreateAccount"))).click();
        System.out.println("Click CreateAccount Button Successful ");
        Thread.sleep(5000);

        driver.findElement(By.id(Utility.fetchLocatorValue("Name"))).sendKeys(UserName);
        System.out.println("User Name Entered Click Successful");

        driver.findElement(By.id(Utility.fetchLocatorValue("Email"))).sendKeys(Email);
        System.out.println("Email Entered Successful");

        driver.findElement(By.id(Utility.fetchLocatorValue("Password"))).sendKeys(Password);
        System.out.println("Password Entered Successful");

        driver.findElement(By.id(Utility.fetchLocatorValue("ReenterPassword"))).sendKeys(Password);
        System.out.println("Password ReEntered Successful");
        Thread.sleep(5000);


        driver.findElement(By.id(Utility.fetchLocatorValue("AmazonAccountCreate"))).click();
        System.out.println("Click 'Create your Amazon account' button Successful");
        Thread.sleep(5000);

    }
}

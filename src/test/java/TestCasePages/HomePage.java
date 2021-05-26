package TestCasePages;

import Base.DriverInstance;
import Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Utility {

    public void ClickMainDrop() throws InterruptedException, IOException {
        driver.findElement(By.xpath(Utility.fetchLocatorValue("MainDropDown"))).click();
        System.out.println("Main DropDown Click Successful");
        Thread.sleep(5000);

        WebElement testDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(4);
        Select dropdown1 = new Select(testDropDown);
        dropdown1.selectByIndex(5);
        System.out.println("Books Selected Successful");
        Thread.sleep(10000);
    }

    @Parameters({"BookName"})
    public void BookNameEnter(String BookName) throws InterruptedException, IOException {

        driver.findElement(By.id(Utility.fetchLocatorValue("searchBox"))).sendKeys(BookName);
        System.out.println("Book Name Entered Successful");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Utility.fetchLocatorValue("clickSearch"))).click();
        System.out.println("Click Search Icon Successful");
        Thread.sleep(5000);


    }

}
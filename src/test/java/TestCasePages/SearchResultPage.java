package TestCasePages;

import Utility.Utility;
import org.openqa.selenium.By;
import java.io.IOException;

public class SearchResultPage extends Utility  {

//    public void BookSelect() throws IOException, InterruptedException {
    public CheckOutPage BookSelect() throws IOException, InterruptedException {
    String ActualURL1 = driver.getCurrentUrl();
        System.out.print("The Current Web URL in SearchResultPage is " + ActualURL1);
        System.out.print("\n");

        driver.findElement(By.xpath(Utility.fetchLocatorValue("checkBoxBookSeries"))).click();
        System.out.println("CheckBox Selected Successfully");
        Thread.sleep(5000);

        driver.findElement(By.xpath(Utility.fetchLocatorValue("BookClick"))).click();
        System.out.println("Book Selected Successfully");
        Thread.sleep(5000);

        String ActualURL2 = driver.getCurrentUrl();
        System.out.print("The Current Web URL is " + ActualURL2);
        System.out.print("\n");

        return new CheckOutPage();

    }

}

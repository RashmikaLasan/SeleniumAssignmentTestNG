package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Utility {

    public static WebDriver driver;

    public static Object fetchPropertyValue(String key) throws IOException {

        FileInputStream file = new FileInputStream("E:\\LearningMe\\AssignmentCG\\src\\test\\java\\Config\\Config.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key);
    }

    public static String fetchLocatorValue(String key) throws IOException {

        FileInputStream file = new FileInputStream("E:\\LearningMe\\AssignmentCG\\src\\test\\java\\Config\\Elements.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }

    public void initialDriverInstance() throws IOException, InterruptedException {
        if (driver == null) {

            if (Utility.fetchPropertyValue("browser").toString().equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\ChromeDriver87\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (Utility.fetchPropertyValue("browser").toString().equals("firefox")) {
                driver = new FirefoxDriver();
            } else if (Utility.fetchPropertyValue("browser").toString().equals("ie")) {
                driver = new InternetExplorerDriver();
            }

            driver.get(Utility.fetchPropertyValue("URL").toString());
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            String ActualURL = driver.getCurrentUrl();
            System.out.print("The Current Web URL is " + ActualURL);
            System.out.print("\n");

            String ExpectedURL = "https://www.amazon.com/";
            assertEquals(ActualURL, ExpectedURL);
            System.out.println("The Page URL Assertion Success");


        }

    }

}

import io.github.bonigarcia.wdm.WebDriverManager;
import  org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    WebDriver driver;

    @Before
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void stopBrowser() {
        driver.quit();
    }

    @Test
    public void openPage(){
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}

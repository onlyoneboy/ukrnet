
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DriverSettings {

    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty(HomeTest.HOME, HomeTest.PATH);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closeInstance() {
        driver.quit();
    }
}

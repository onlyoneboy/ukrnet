import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest extends DriverSettings {
    public final String LOGIN = "";
    public final String PASSWORD = "";

    @Test
    public void firstTest() {


        driver.manage().window().maximize();
        driver.get("https://ukr.net/");
        TitleCheck();
        Login(LOGIN,PASSWORD);
    }

    public void TitleCheck() {
        String title = driver.getTitle();
        Assert.assertEquals(HomeTest.TITLE,title);
    }

    public void Login(String name, String pass) {
        driver.findElement(By.xpath(HomeTest.LOGIN_BOX)).sendKeys(name);
        driver.findElement(By.xpath(HomeTest.PASS_BOX)).sendKeys(pass);
        driver.findElement(By.xpath(HomeTest.LOGIN_BUTTON)).click();
    }
}

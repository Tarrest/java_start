import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
        capabilitiesFirefox.setCapability("marionette", true);
        System.setProperty("webdriver.gecko.driver", "c:\\Geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver(capabilitiesFirefox);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String login, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("LoginForm")).click();
    }

    @Test
    public void testGroupCreation() {
        createNewGroup();
        fillAndSubmitGroupForm("Evan Warner", "test1", "test2");
        returnToGroupPage();
    }

    private void returnToGroupPage() {
        driver.findElement(By.linkText("GROUPS")).click();
    }

    private void fillAndSubmitGroupForm(String name, String header, String footer) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(name);
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(header);
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(footer);
        driver.findElement(By.name("submit")).click();
    }

    private void createNewGroup() {
        driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        driver.findElement(By.linkText("GROUPS")).click();
        driver.findElement(By.name("new")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

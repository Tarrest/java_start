package com.chisw.start.addressbook.appmanager;

import com.chisw.start.addressbook.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;

    public void init() {
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
        driver.findElement(By.xpath(".//*[@id='LoginForm']/input[3]")).click();
    }

    public void goToGroupPage() {
        driver.findElement(By.linkText("GROUPS")).click();
    }

    public void fillAndSubmitGroupForm(GroupDate groupDate) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupDate.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
        driver.findElement(By.name("submit")).click();
        //driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void createNewGroup() {
        driver.findElement(By.linkText("GROUPS")).click();
        driver.findElement(By.name("new")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void stop() {
        driver.close();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}

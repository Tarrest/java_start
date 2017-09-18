package com.chisw.start.addressbook.appmanager;

import com.chisw.start.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void fillAndSubmitGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
        click(By.name("submit"));
    }

    public void createNewGroup() {
        click(By.linkText("GROUPS"));
        click(By.name("new"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }
}

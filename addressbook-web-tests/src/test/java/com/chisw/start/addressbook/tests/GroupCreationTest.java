package com.chisw.start.addressbook.tests;

import com.chisw.start.addressbook.model.GroupDate;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.createNewGroup();
        app.fillAndSubmitGroupForm(new GroupDate("Evan Warner", "test1", "test2"));
        app.goToGroupPage();
    }

}

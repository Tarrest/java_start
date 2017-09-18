package com.chisw.start.addressbook.tests;

import com.chisw.start.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillAndSubmitGroupForm(new GroupData("Evan Warner", "test1", "test2"));
        app.getNavigationHelper().goToGroupPage();
    }

}

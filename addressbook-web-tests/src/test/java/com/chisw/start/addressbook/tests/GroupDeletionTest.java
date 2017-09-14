package com.chisw.start.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.goToGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.goToGroupPage();
    }

}
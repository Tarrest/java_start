package com.chisw.start.addressbook.tests;

import com.chisw.start.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setup() {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}

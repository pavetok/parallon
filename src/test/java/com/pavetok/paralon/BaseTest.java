package com.pavetok.paralon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.pavetok.paralon.Configuration.acquireHost;
import static com.pavetok.paralon.Configuration.releaseHost;

public class BaseTest {
    private String host;
    Application app;

    @BeforeClass
    public void classSetUp() {
        host = acquireHost();
        app = new Application(host);
    }

    @AfterClass
    public void classTearDown() {
        releaseHost(host);
    }
}

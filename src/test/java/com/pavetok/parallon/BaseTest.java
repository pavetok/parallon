package com.pavetok.parallon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pavetok.parallon.Config.acquireHost;
import static com.pavetok.parallon.Config.releaseHost;

@ContextConfiguration("classpath:context.xml")
public class BaseTest extends AbstractTestNGSpringContextTests {

    private String host;

    @Autowired
    protected Application app;

    @BeforeClass
    public void classSetUp() {
        host = acquireHost();
        app.setHost(host);
        Logger.getLogger("com.codeborne.selenide").setLevel(Level.WARNING);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "classSetUp", app));
    }

    @AfterClass
    public void classTearDown() {
        releaseHost(host);
    }
}

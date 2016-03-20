package com.pavetok.paralon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

import static com.pavetok.paralon.Configuration.releaseHost;
import static com.pavetok.paralon.Configuration.takeHost;

public class BaseTest {

    private ThreadLocal<String> host = new ThreadLocal<>();
    Application app;

    @BeforeClass
    public void classSetUp() {
        host.set(takeHost());
        app = new Application(host.get());
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), new Date().getTime(), host.get()));
    }

    @AfterClass
    public void classTearDown() {
        releaseHost(host.get());
    }
}

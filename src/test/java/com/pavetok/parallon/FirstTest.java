package com.pavetok.parallon;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test11() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test11", app));
    }

    @Test
    public void test12() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test12", app));
    }
}

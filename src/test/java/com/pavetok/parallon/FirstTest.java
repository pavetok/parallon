package com.pavetok.parallon;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test11() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test11", app));
    }

    @Test
    public void test12() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test12", app));
    }
}

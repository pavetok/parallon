package com.pavetok.parallon;

import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void test21() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test21", app));
    }

    @Test
    public void test22() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test22", app));
    }

    @Test
    public void test23() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test23", app));
    }

    @Test
    public void test24() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test24", app));
    }
}

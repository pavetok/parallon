package com.pavetok.paralon;

import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void test21() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test21", app));
    }

    @Test
    public void test22() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test22", app));
    }

    @Test
    public void test23() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test23", app));
    }

    @Test
    public void test24() throws Exception {
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test24", app));
    }
}

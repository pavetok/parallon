package com.pavetok.parallon;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    @Test
    public void test31() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test31", app));
    }

    @Test
    public void test32() throws Exception {
        Thread.sleep(100);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test32", app));
    }

}

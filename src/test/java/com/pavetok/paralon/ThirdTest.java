package com.pavetok.paralon;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    @Test
    public void test31() throws Exception {
        Thread.sleep(2000);
        System.out.println(String.format("%s, %s, %s", Thread.currentThread().getName(), "test31", app));
    }

    @Test
    public void test32() throws Exception {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " test32");
    }

}

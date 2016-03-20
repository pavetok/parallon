package com.pavetok.parallon;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest extends BaseTest {

    @Test
    public void openOneHost() {
        open("/");
    }
}

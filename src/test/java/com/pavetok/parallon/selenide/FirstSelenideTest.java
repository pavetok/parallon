package com.pavetok.parallon.selenide;

import com.pavetok.parallon.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest extends BaseTest {
    @Test
    public void openOneHost() {
        open(app.getUrl());
    }
}

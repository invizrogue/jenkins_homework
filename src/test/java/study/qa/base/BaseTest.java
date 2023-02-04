package study.qa.base;

import com.codeborne.selenide.Configuration;

abstract public class BaseTest {

    protected void setUp() {
        Configuration.browser = "chrome";
//        Configuration.browserSize = "1920x1080";
        Configuration.browserSize = "1366x768";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }
}

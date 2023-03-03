package com.browserstack.app.pages;

import com.browserstack.test.utils.MobileHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.percy.appium.AppPercy;

public class BasePage {
    protected AppiumDriver<?> driver;
    protected MobileHelper mobileHelper;
    protected static AppPercy percy;
    public BasePage(AppiumDriver<?> driver) {
        this.driver = driver;
        percy = new AppPercy(driver);
        this.mobileHelper = new MobileHelper(driver);
        PageFactory.initElements(driver, this);
    }
}

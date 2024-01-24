package org.TwozoTest;

import org.TwozoBase.Driver.Impl.AutomationDriverImpl;
import org.TwozoBase.WebBrowser.Impl.WebBrowser;
import org.TwozoBase.enums.Browser;
import org.TwozoBase.enums.Locators;
import org.testng.annotations.Test;

public class LogIn {

    private final WebBrowser browser = WebBrowser.getInstance();

    @Test
    public void launchBrowser() {
        browser.setUp(Browser.EDGE,"https://app.thelaunchclub.in/");
    }

    @Test(priority = 1)
    public void enterMail() {
        browser.getDriver().findElement(Locators.ID,":r0:").sendKeys("gdsrea");
    }
}

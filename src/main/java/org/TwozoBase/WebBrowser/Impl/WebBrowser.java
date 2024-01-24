package org.TwozoBase.WebBrowser.Impl;

import org.TwozoBase.Driver.Impl.AutomationDriverImpl;
import org.TwozoBase.Driver.Service.AutomationDriver;
import org.TwozoBase.WebBrowser.Service.BrowserApI;
import org.TwozoBase.enums.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser implements BrowserApI {

    private static AutomationDriver driver = null;
    private static WebBrowser webBrowser;

    private WebBrowser() {
    }

    public static WebBrowser getInstance() {

        if (webBrowser == null) {
            webBrowser = new WebBrowser();
        }

        return webBrowser;
    }

    @Override
    public void setUp(final Browser browserName, final String url) {
        switch (browserName) {
            case CHROME:
                driver = new AutomationDriverImpl(new ChromeDriver());
                break;

            case EDGE:
                driver = new AutomationDriverImpl(new EdgeDriver());
                break;

            case FIREFOX:
                driver = new AutomationDriverImpl(new FirefoxDriver());
                break;

            default:
                System.out.println("Browser is not defined");
                break;
        }

        driver.get(url);
    }

    public AutomationDriver getDriver(){
        return driver;
    }
}

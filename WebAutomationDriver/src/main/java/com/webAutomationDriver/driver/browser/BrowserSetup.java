package com.webAutomationDriver.driver.browser;

import com.webAutomationDriver.driver.impl.AutomationDriverImpl;
import com.webAutomationDriver.driver.service.AutomationDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public final class BrowserSetup {

    private BrowserSetup() {
    }

    /**
     * Retrieves the singleton instance of BrowserController.
     * Lazily initializes the instance if it is null and returns the instance.
     * Ensures thread safety in a multi-thread environment.
     *
     * @return The singleton instance of BrowserController.
     */
    public static BrowserSetup getInstance() {

        // if (browserSetup == null) {
        // }
        return new BrowserSetup();
    }

    /**
     * Sets up and returns an instance of AutomationDriver configured for the specified browser.
     *
     * @param browser The type of browser to be configured.
     * @return An instance of AutomationDriver configured for the specified browser.
     */
    public AutomationDriver build(final Browser browser) {
        return new AutomationDriverImpl(create(browser));
    }

    /**
     * Creates and returns a RemoteWebDriver instance based on the specified browser type.
     *
     * @param browser The type of browser for which to create the driver.
     * @return A RemoteWebDriver instance configured for the specified browser.
     */
    public RemoteWebDriver create(final Browser browser) {
        return switch (browser) {
            case CHROME -> new ChromeDriver();
            case EDGE -> new EdgeDriver();
            case FIREFOX -> new FirefoxDriver();
        };
    }
}




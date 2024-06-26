package com.webAutomationDriver.element.locator.target_locator.service;

import com.webAutomationDriver.alert.service.WebAlert;
import com.webAutomationDriver.driver.service.AutomationDriver;
import com.webAutomationDriver.element.locator.target_locator.impl.TargetLocatorImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;



/**
 * Set of methods for locating targets within a web page.
 *
 * @Author  [Navin Jones]
 * @Version  1.0
 */

public interface TargetLocator {

    static TargetLocator getInstance(final WebDriver.TargetLocator targetLocator, final WebDriver webDriver) {
        return new TargetLocatorImpl(targetLocator, webDriver);
    }

    /**
     * Locates the window with the specified name.
     *
     * @param name The name of the window to locate.
     * @return An AutomationDriver instance representing the located window.
     */
    AutomationDriver window(final String name);

    /**
     * Opens a new window with the specified type.
     *
     * @param windowType The type of window to open.
     * @return An AutomationDriver instance representing the new window.
     */
    AutomationDriver newWindow(final WindowType windowType);

    /**
     * Retrieves the alert present on the web page.
     *
     * @return An Alerts instance representing the alert.
     */
    WebAlert alert();
}


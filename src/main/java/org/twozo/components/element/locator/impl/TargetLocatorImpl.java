package org.twozo.components.element.locator.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.twozo.components.driver.impl.AutomationDriverImpl;
import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.alerts.AlertsImpl;
import org.twozo.components.alerts.Alerts;
import org.twozo.components.element.locator.service.TargetLocator;

/**
 * To provide functionality for switching between different browsing contexts,
 * such as windows and frames, and interacting with browser alerts.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class TargetLocatorImpl implements TargetLocator {

    private final WebDriver.TargetLocator targetLocator;
    private final WebDriver driver;

    public TargetLocatorImpl(final WebDriver.TargetLocator targetLocator, final WebDriver driver) {
        this.targetLocator = targetLocator;
        this.driver = driver;
    }

    /**
     * Switches to the window with the specified name.
     *
     * @param name The name of the window to switch to.
     * @return An instance of AutomationDriver representing the switched window.
     */
    @Override
    public AutomationDriver window(final String name) {
        return new AutomationDriverImpl(targetLocator.window(name));
    }

    /**
     * Opens a new window with the specified type and switches to it.
     *
     * @param windowType The type of window to open.
     * @return An instance of AutomationDriver representing the new window.
     */
    @Override
    public AutomationDriver newWindow(WindowType windowType) {
        return new AutomationDriverImpl(targetLocator.newWindow(windowType));
    }

    /**
     * Switches to the currently displayed alert.
     *
     * @return An instance of Alerts for interacting with the alert.
     */
    @Override
    public Alerts alert() {
        return new AlertsImpl(driver.switchTo().alert());
    }
}


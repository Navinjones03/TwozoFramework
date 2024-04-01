package com.webAutomationDriver.tabs.impl;

import com.webAutomationDriver.tabs.service.TabHandler;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

/**
 * Identifies browser window handles and the current window handle.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see TabHandler
 */
public final class TabHandlerImpl implements TabHandler {

    private final WebDriver driver;

    public TabHandlerImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A collection of window handles.
     */
    @Override
    public Collection<String> getTabHandles() {
        return driver.getWindowHandles();
    }

    /**
     * {@inheritDoc}
     *
     * @return The current window handle.
     */
    @Override
    public String getTabHandle() {
        return driver.getWindowHandle();
    }
}


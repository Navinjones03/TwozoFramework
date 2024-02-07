package org.twozo.components.tabs.impl;

import org.openqa.selenium.WebDriver;
import org.twozo.components.tabs.service.TabHandler;

import java.util.Collection;

/**
 * The WindowIdentifierImpl class implements the WindowIdentifier interface to provide functionality
 * for identifying browser window handles and the current window handle.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class TabHandlerImpl implements TabHandler {

    // The WebDriver instance associated with the WindowIdentifier
    private final WebDriver driver;

    /**
     * Constructs a new instance of WindowIdentifierImpl with the specified WebDriver instance.
     *
     * @param driver The WebDriver instance associated with the WindowIdentifier.
     */
    public TabHandlerImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Retrieves a collection of all available window handles.
     *
     * @return A collection of window handles.
     */
    @Override
    public Collection<String> getTabHandles() {
        return driver.getWindowHandles();
    }

    /**
     * Retrieves the current window handle.
     *
     * @return The current window handle.
     */
    @Override
    public String getTabHandle() {
        return driver.getWindowHandle();
    }
}


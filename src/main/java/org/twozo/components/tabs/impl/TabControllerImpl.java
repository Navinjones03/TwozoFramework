package org.twozo.components.tabs.impl;

import org.openqa.selenium.WebDriver;
import org.twozo.components.tabs.service.TabInfoProvider;

/**
 * The WindowHandlerImpl class implements the WindowHandler interface to provide functionality
 * for handling browser window operations, such as maximizing, minimizing, and toggling fullscreen mode.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class TabControllerImpl implements TabInfoProvider {

    private final WebDriver.Window window;

    /**
     * Constructs a new instance of WindowHandlerImpl with the specified WebDriver.Window instance.
     *
     * @param window The WebDriver.Window instance used for handling browser window operations.
     */
    public TabControllerImpl(final WebDriver.Window window) {
        this.window = window;
    }

    /**
     * Maximizes the browser window.
     */
    @Override
    public void maximize() {
        window.maximize();
    }

    /**
     * Minimizes the browser window.
     */
    @Override
    public void minimize() {
        window.minimize();
    }

    /**
     * Toggles fullscreen mode for the browser window.
     */
    @Override
    public void fullscreen() {
        window.fullscreen();
    }
}


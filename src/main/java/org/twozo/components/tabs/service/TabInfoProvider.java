package org.twozo.components.tabs.service;

/**
 * Interface: WindowHandler
 * Description: This interface defines a set of methods for handling the browser window.
 * Author: [Navin Jones]
 * Version: 1.0
 */

public interface TabInfoProvider {

    /**
     * Maximizes the browser window.
     */
    void maximize();

    /**
     * Minimizes the browser window.
     */
    void minimize();

    /**
     * Sets the browser window to fullscreen mode.
     */
    void fullscreen();
}


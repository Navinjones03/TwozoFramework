package org.twozo.components.driver.service;

import org.twozo.components.element.finders.service.ElementFinder;
import org.twozo.components.element.locator.service.TargetLocator;
import org.twozo.components.pages.service.PageInformation;
import org.twozo.components.pages.service.PageNavigator;
import org.twozo.components.tabs.service.TabInfoProvider;
import org.twozo.components.tabs.service.TabHandler;

/**
 * Interface: AutomationDriver
 * Description: This interface defines a set of methods for automating interactions with a web browser.
 * @Author [Navin Jones]
 * @Version 1.0
 */

public interface AutomationDriver {

    /**
     * Closes the current window or tab.
     */
    void close();

    /**
     * Quits the browser, closing all windows and ending the session.
     */
    void quit();

    /**
     * Returns a Finder instance to locate elements within the web page.
     *
     * @return A Finder instance for element location.
     */
    ElementFinder find();

    /**
     * Returns an Information instance to retrieve additional information about the web page.
     *
     * @return An Information instance for retrieving additional information.
     */
    PageInformation inform();

    /**
     * Returns a PageNavigator instance for navigating through pages.
     *
     * @return A PageNavigator instance for page navigation.
     */
    PageNavigator navigator();

    /**
     * Returns a TargetLocator instance for locating targets within the web page.
     *
     * @return A TargetLocator instance for locating targets.
     */
    TargetLocator targetLocator();

    /**
     * Returns a WindowHandler instance for handling windows and tabs.
     *
     * @return A WindowHandler instance for window and tab management.
     */
    TabInfoProvider window();

    /**
     * Returns a WindowIdentifier instance for identifying and managing tabs.
     *
     * @return A WindowIdentifier instance for tab identification and management.
     */
    TabHandler tabs();
}




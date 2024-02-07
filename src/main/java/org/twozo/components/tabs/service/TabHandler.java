package org.twozo.components.tabs.service;

import java.util.Collection;

/**
 * Interface: TabIdentifier
 * Description: This interface defines a set of methods for identifying and managing browser tabs.
 * Author: [Navin Jones]
 * Version: 1.0
 */

public interface TabHandler {

    /**
     * Retrieves the handles of all open browser windows or tabs.
     *
     * @return A collection of window handles.
     */
    Collection<String> getTabHandles();

    /**
     * Retrieves the handle of the current browser window or tab.
     *
     * @return The handle of the current window or tab.
     */
    String getTabHandle();
}


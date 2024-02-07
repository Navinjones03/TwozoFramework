package org.twozo.components.pages.service;

import org.openqa.selenium.WebDriver;
import org.twozo.components.pages.impl.PageNavigatorImpl;

/**
 * Defines a set of methods for navigating through web pages.
 * @Author [Navin Jones]
 * @Version 1.0
 */

public interface PageNavigator {

    static PageNavigator getInstance(final WebDriver.Navigation navigation){
        return new PageNavigatorImpl(navigation);
    }

    /**
     * Navigates back to the previous web page in the browsing history.
     */
    void back();

    /**
     * Navigates forward to the next web page in the browsing history.
     */
    void forward();

    /**
     * Navigates to the specified URL.
     *
     * @param url The URL to navigate to.
     */
    void to(final String url);

    /**
     * Refreshes the current web page.
     */
    void refresh();
}

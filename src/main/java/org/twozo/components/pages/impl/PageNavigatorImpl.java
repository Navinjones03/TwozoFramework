package org.twozo.components.pages.impl;

import org.openqa.selenium.WebDriver;
import org.twozo.components.pages.service.PageNavigator;

/**
 * The PageNavigatorImpl class implements the PageNavigator interface to provide functionality
 * for navigating back and forward in the browser history, navigating to a specific URL, and
 * refreshing the current web page.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class PageNavigatorImpl implements PageNavigator {

    private final WebDriver.Navigation pageNavigator;

    public PageNavigatorImpl(final WebDriver.Navigation pageNavigator) {
        this.pageNavigator = pageNavigator;
    }

    /**
     * Navigates back in the browser history.
     */
    @Override
    public void back() {
        pageNavigator.back();
    }

    /**
     * Navigates forward in the browser history.
     */
    @Override
    public void forward() {
        pageNavigator.forward();
    }

    /**
     * Navigates to the specified URL.
     *
     * @param url The URL to navigate to.
     */
    @Override
    public void to(final String url) {
        pageNavigator.to(url);
    }

    /**
     * Refreshes the current web page.
     */
    @Override
    public void refresh() {
        pageNavigator.refresh();
    }
}


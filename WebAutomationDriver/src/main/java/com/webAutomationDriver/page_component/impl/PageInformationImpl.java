package com.webAutomationDriver.page_component.impl;

import com.webAutomationDriver.page_component.service.PageInformation;
import org.openqa.selenium.WebDriver;

/**
 * Retrieving information about the current web page,
 * such as its URL, title, and page source.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see PageInformation
 */
public final class PageInformationImpl implements PageInformation {

    private final WebDriver driver;

    public PageInformationImpl(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigates the browser to the specified URL.
     *
     * @param url The URL to navigate to.
     */
    @Override
    public void goToUrl(final String url) {
        driver.get(url);
    }

    /**
     * Retrieves the URL of the current web page.
     *
     * @return The URL of the current web page.
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * Retrieves the title of the current web page.
     *
     * @return The title of the current web page.
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * Retrieves the page source of the current web page.
     *
     * @return The page source of the current web page.
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }
}

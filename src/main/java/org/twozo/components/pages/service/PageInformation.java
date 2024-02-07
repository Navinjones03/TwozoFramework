package org.twozo.components.pages.service;

import org.openqa.selenium.WebDriver;
import org.twozo.components.pages.impl.PageInformationImpl;

/**
 * Description: Defines a set of methods for retrieving information about a web page.
 * @Author [Navin Jones]
 * @Version 1.0
 */

public interface PageInformation {

    static PageInformation getInstance(WebDriver driver){
        return new PageInformationImpl(driver);
    }
    /**
     * Retrieves information from the specified URL.
     *
     * @param url The URL to retrieve information from.
     */
    void goToUrl(final String url);

    /**
     * Retrieves the URL of the current web page.
     *
     * @return The URL of the current web page.
     */
    String getCurrentUrl();

    /**
     * Retrieves the title of the current web page.
     *
     * @return The title of the current web page.
     */
    String getTitle();

    /**
     * Retrieves the source code of the current web page.
     *
     * @return The source code of the current web page.
     */
    String getPageSource();
}


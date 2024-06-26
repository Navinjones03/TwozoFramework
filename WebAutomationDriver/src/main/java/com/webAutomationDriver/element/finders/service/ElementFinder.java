package com.webAutomationDriver.element.finders.service;

import com.webAutomationDriver.element.locator.relative_locator.service.RelativeLocator;
import com.webAutomationDriver.element.web_element.service.PageElement;
import org.openqa.selenium.By;

import java.util.Collection;


/**
 * Provides methods for locating web elements within a web page.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public interface ElementFinder {

    /**
     * Finds the first occurrence of a web element based on the specified selector.
     *
     * @param by The selector used to locate the web element.
     * @return The first occurrence of the located web element, or null if not found.
     */
    PageElement findElement(final By by);

    /**
     * Finds all occurrences of web elements based on the specified selector.
     *
     * @param by The selector used to locate the web elements.
     * @return A collection of all occurrences of the located web elements.
     */
    Collection<PageElement> findElements(final By by);

    PageElement findElement(final RelativeLocator locator);
}


package org.twozo.components.element.finders.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.twozo.components.element.finders.service.ElementFinder;
import org.twozo.components.element.webElement.impl.PageElementImpl;
import org.twozo.components.element.webElement.service.PageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * To provide methods for locating web elements within a web page using the WebDriver API.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class WebDriverFinder implements ElementFinder {

    private final WebDriver driver;

    public WebDriverFinder(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Finds the first occurrence of a web element based on the specified selector.
     *
     * @param by The selector used to locate the web element.
     * @return The first occurrence of the located web element, or null if not found.
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(driver.findElement(by));
    }

    /**
     * Finds all occurrences of web elements based on the specified selector.
     *
     * @param by The selector used to locate the web elements.
     * @return A collection of all occurrences of the located web elements.
     */
    @Override
    public Collection<PageElement> findElements(final By by) {
        final Collection<WebElement> webElements = driver.findElements(by);
        final Collection<PageElement> pageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            pageElements.add(new PageElementImpl(element));
        }

        return pageElements;
    }
}

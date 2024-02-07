package org.twozo.components.element.finders.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.twozo.components.element.finders.service.ElementFinder;
import org.twozo.components.element.webElement.impl.PageElementImpl;
import org.twozo.components.element.webElement.service.PageElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The WebElementFinder class implements the Finder interface to provide methods for
 * locating child web elements within a parent web element.
 *
 * @version 1.0
 * @author [Your Name]
 */
public final class WebElementFinder implements ElementFinder {

    private final WebElement element;

    public WebElementFinder(final WebElement element) {
        this.element = element;
    }

    /**
     * Finds the first occurrence of a child web element based on the specified selector.
     *
     * @param by The selector used to locate the child web element.
     * @return The first occurrence of the located child web element, or null if not found.
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(element.findElement(by));
    }

    /**
     * Finds all occurrences of child web elements based on the specified selector.
     *
     * @param by The selector used to locate the child web elements.
     * @return A collection of all occurrences of the located child web elements.
     */
    @Override
    public Collection<PageElement> findElements(final By by) {
        final Collection<WebElement> webElements = element.findElements(by);
        final Collection<PageElement> pageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            pageElements.add(new PageElementImpl(element));
        }

        return pageElements;
    }
}


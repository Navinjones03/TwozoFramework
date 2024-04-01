package com.webAutomationDriver.element.finders.impl;

import com.webAutomationDriver.element.finders.service.ElementFinder;
import com.webAutomationDriver.element.locator.relative_locator.service.RelativeLocator;
import com.webAutomationDriver.element.web_element.impl.PageElementImpl;
import com.webAutomationDriver.element.web_element.service.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Provides methods for locating child web elements within a parent web element.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see ElementFinder
 */
public final class WebElementFinder implements ElementFinder {

    private final WebElement element;

    public WebElementFinder(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     *
     * @param by The selector used to locate the child web element.
     * @return The first occurrence of the located child web element, or null if not found.
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(element.findElement(by));
    }

    /**
     * {@inheritDoc}
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

    @Override
    public PageElement findElement(RelativeLocator locator) {
        return null;
    }
}


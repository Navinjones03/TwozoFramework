package org.twozo.components.element.webElement.impl;

import org.twozo.components.element.webElement.service.PageElement;
import org.openqa.selenium.WebElement;

/**
 * To provide functionality for interacting with web elements on a web page.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see PageElement
 */
public final class PageElementImpl implements PageElement {

    private final WebElement element;

    public PageElementImpl(final WebElement element) {
        this.element = element;
    }

    /**
     * Clicks on the web element.
     */
    @Override
    public void click() {
        element.click();
    }

    /**
     * Submits the form containing the web element.
     */
    @Override
    public void submit() {
        element.submit();
    }

    /**
     * Sends the specified keys to the web element.
     *
     * @param keysToSend The keys to send to the web element.
     */
    @Override
    public void sendKeys(final CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    /**
     * Clears the text from the web element.
     */
    @Override
    public void clear() {
        element.clear();
    }

    /**
     * Checks if the web element is displayed.
     *
     * @return true if the web element is displayed, false otherwise.
     */
    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}


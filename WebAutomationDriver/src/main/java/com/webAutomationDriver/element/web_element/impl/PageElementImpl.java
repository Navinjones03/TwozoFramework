package com.webAutomationDriver.element.web_element.impl;

import com.webAutomationDriver.element.web_element.service.PageElement;
import org.openqa.selenium.WebElement;

/**
 * Interacts with web elements on a web page.
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
     * {@inheritDoc}
     */
    @Override
    public void click() {
        element.click();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void submit() {
        element.submit();
    }

    /**
     * {@inheritDoc}
     *
     * @param keysToSend The keys to send to the web element.
     */
    @Override
    public void sendKeys(final CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        element.clear();
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the web element is displayed, false otherwise.
     */
    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public String getText() {
        return element.getText();
    }
}


package org.twozo.components.driver.impl;

import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.element.finders.service.ElementFinder;
import org.twozo.components.element.finders.impl.WebDriverFinder;

import org.openqa.selenium.WebDriver;
import org.twozo.components.element.locator.service.TargetLocator;
import org.twozo.components.element.locator.impl.TargetLocatorImpl;
import org.twozo.components.pages.impl.PageInformationImpl;
import org.twozo.components.pages.impl.PageNavigatorImpl;
import org.twozo.components.pages.service.PageInformation;
import org.twozo.components.pages.service.PageNavigator;
import org.twozo.components.tabs.impl.TabControllerImpl;
import org.twozo.components.tabs.impl.TabHandlerImpl;
import org.twozo.components.tabs.service.TabInfoProvider;
import org.twozo.components.tabs.service.TabHandler;

/**
 * To provides functionality for automating browser interactions using the WebDriver API.
 * @version 1.0
 * @author [Navin Jones]
 */
public final class AutomationDriverImpl implements AutomationDriver {

    private final WebDriver driver;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Closes the current browser window.
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * Quits the WebDriver session, closing all associated browser windows.
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * Initiates a new Finder instance for locating web elements within the current page.
     *
     * @return A Finder instance for element location.
     */
    @Override
    public ElementFinder find() {
        return new WebDriverFinder(driver);
    }

    /**
     * Initiates a new Information instance for retrieving information about the current web page.
     *
     * @return An Information instance for page information retrieval.
     */
    @Override
    public PageInformation inform() {
        return new PageInformationImpl(driver);
    }

    /**
     * Initiates a new PageNavigator instance for navigating web pages.
     *
     * @return A PageNavigator instance for page navigation.
     */
    @Override
    public PageNavigator navigator() {
        return new PageNavigatorImpl(driver.navigate());
    }

    /**
     * Initiates a new TargetLocator instance for switching between browsing contexts.
     *
     * @return A TargetLocator instance for browsing context switching.
     */
    @Override
    public TargetLocator targetLocator() {
        return new TargetLocatorImpl(driver.switchTo(), driver);
    }

    /**
     * Initiates a new WindowHandler instance for handling browser window operations.
     *
     * @return A WindowHandler instance for browser window handling.
     */
    @Override
    public TabInfoProvider window() {
        return new TabControllerImpl(driver.manage().window());
    }

    /**
     * Initiates a new WindowIdentifier instance for identifying browser window handles.
     *
     * @return A WindowIdentifier instance for window handle identification.
     */
    @Override
    public TabHandler tabs() {
        return new TabHandlerImpl(driver);
    }
}


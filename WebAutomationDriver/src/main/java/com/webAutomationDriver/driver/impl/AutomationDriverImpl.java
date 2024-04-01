package com.webAutomationDriver.driver.impl;

import com.webAutomationDriver.driver.service.AutomationDriver;
import com.webAutomationDriver.element.finders.impl.WebDriverFinder;
import com.webAutomationDriver.element.finders.service.ElementFinder;
import com.webAutomationDriver.element.locator.target_locator.impl.TargetLocatorImpl;
import com.webAutomationDriver.element.locator.target_locator.service.TargetLocator;
import com.webAutomationDriver.page_component.impl.PageInformationImpl;
import com.webAutomationDriver.page_component.impl.PageNavigatorImpl;
import com.webAutomationDriver.page_component.service.PageInformation;
import com.webAutomationDriver.page_component.service.PageNavigator;
import com.webAutomationDriver.tabs.impl.TabHandlerImpl;
import com.webAutomationDriver.tabs.impl.TabNavigatorImpl;
import com.webAutomationDriver.tabs.service.TabHandler;
import com.webAutomationDriver.tabs.service.TabNavigator;
import lombok.ToString;
import org.openqa.selenium.*;


/**
 * Provides functionality for automating browser interactions using the WebDriver API.
 *
 * @author [Navin Jones]
 * @version 1.0
 * @see AutomationDriver
 */
@ToString
public final class AutomationDriverImpl implements AutomationDriver {

    private final WebDriver driver;
    private final TakesScreenshot takeScreenshot;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
        this.takeScreenshot = (TakesScreenshot) driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * {@inheritDoc}
     *
     * @return A Finder instance for element location.
     */
    @Override
    public ElementFinder find() {
        return new WebDriverFinder(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return An Information instance for page information retrieval.
     */
    @Override
    public PageInformation inform() {
        return new PageInformationImpl(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A PageNavigator instance for page navigation.
     */
    @Override
    public PageNavigator navigator() {
        return new PageNavigatorImpl(driver.navigate());
    }

    /**
     * {@inheritDoc}
     *
     * @return A TargetLocator instance for browsing context switching.
     */
    @Override
    public TargetLocator targetLocator() {
        return new TargetLocatorImpl(driver.switchTo(), driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A WindowHandler instance for browser window handling.
     */
    @Override
    public TabNavigator window() {
        return new TabNavigatorImpl(driver.manage().window());
    }

    /**
     * {@inheritDoc}
     *
     * @return A WindowIdentifier instance for window handle identification.
     */
    @Override
    public TabHandler tabs() {
        return new TabHandlerImpl(driver);
    }


    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return takeScreenshot.getScreenshotAs(target);
    }
}


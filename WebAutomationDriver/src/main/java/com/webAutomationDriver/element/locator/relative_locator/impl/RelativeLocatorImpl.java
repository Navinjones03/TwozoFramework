package com.webAutomationDriver.element.locator.relative_locator.impl;

import com.webAutomationDriver.element.locator.Locators;
import com.webAutomationDriver.element.locator.relative_locator.service.RelativeLocator;
import com.webAutomationDriver.element.web_element.service.PageElement;
import org.openqa.selenium.WebDriver;

public class RelativeLocatorImpl implements RelativeLocator {

    private org.openqa.selenium.support.locators.RelativeLocator relativeLocator;

    @Override
    public RelativeLocator above(PageElement element) {
        return null;
    }

    @Override
    public RelativeLocator above(Locators locator) {
        return null;
    }

    @Override
    public RelativeLocator below(PageElement element) {
        return null;
    }

    @Override
    public RelativeLocator below(Locators locator) {
        return null;
    }

    @Override
    public RelativeLocator toRightOf(PageElement element) {
        return null;
    }

    @Override
    public RelativeLocator toRightOf(Locators locator) {
        return null;
    }

    @Override
    public RelativeLocator toLeftOf(PageElement element) {
        return null;
    }

    @Override
    public RelativeLocator toLeftOf(Locators locator) {
        return null;
    }
}

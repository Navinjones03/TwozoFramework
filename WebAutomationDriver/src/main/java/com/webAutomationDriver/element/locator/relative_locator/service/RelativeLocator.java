package com.webAutomationDriver.element.locator.relative_locator.service;

import com.webAutomationDriver.element.locator.Locators;
import com.webAutomationDriver.element.web_element.service.PageElement;

public interface RelativeLocator {

     RelativeLocator above(final PageElement element);
     RelativeLocator above(final Locators locator);
     RelativeLocator below(final PageElement element);
     RelativeLocator below(final Locators locator);
     RelativeLocator toRightOf(final PageElement element);
     RelativeLocator toRightOf(final Locators locator);
     RelativeLocator toLeftOf(final PageElement element);
     RelativeLocator toLeftOf(final Locators locator);
}

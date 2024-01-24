package org.TwozoBase.Driver.Service;

import org.TwozoBase.WebElement.Service.PageElement;
import org.TwozoBase.enums.Locators;

import java.util.List;

public interface AutomationDriver {

    void get(final String url);

    String getCurrentUrl();

    String getTitle();

    PageElement findElement(Locators type, String value);

    List<PageElement> findElements(Locators type, String value);

    void close();

    void quit();
}

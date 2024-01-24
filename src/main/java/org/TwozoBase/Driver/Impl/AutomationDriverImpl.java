package org.TwozoBase.Driver.Impl;

import org.TwozoBase.Driver.Service.AutomationDriver;
import org.TwozoBase.WebElement.Service.PageElement;
import org.TwozoBase.WebElement.impl.WebCoreElement;
import org.TwozoBase.WebLocators.impl.LocatorsImp;
import org.TwozoBase.enums.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AutomationDriverImpl implements AutomationDriver {

    private final WebDriver driver;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void get(final String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public PageElement findElement(final Locators type, final String value) {
        return new WebCoreElement(new LocatorsImp(driver).element(type,value));
    }

    @Override
    public List<PageElement> findElements(final Locators type, final String value) {
        final List<WebElement> webElements = new LocatorsImp(driver).elements(type,value);
        final List<PageElement> pageElements = new ArrayList<>();

        for (WebElement element : webElements) {
            pageElements.add(new WebCoreElement(element));
        }

        return pageElements;
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }
}

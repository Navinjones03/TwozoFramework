package org.TwozoBase.WebLocators.impl;

import org.TwozoBase.WebLocators.Service.LocatorsApi;
import org.TwozoBase.enums.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LocatorsImp implements LocatorsApi {

    private final WebDriver driver;

    public LocatorsImp(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebElement element(final Locators type, final String value) {
        switch (type) {
            case ID:
                return driver.findElement(By.id(value));

            case NAME :
                return driver.findElement(By.name(value));

            case CLASS_NAME:
                return driver.findElement(By.className(value));

            case LINK_TEXT:
                return driver.findElement(By.linkText(value));

            case PARTIAL_LINK_TEXT:
                return driver.findElement(By.partialLinkText(value));

            case CSS_SELECTOR:
                return driver.findElement(By.cssSelector(value));

            case XPATH:
                return driver.findElement(By.xpath(value));

            case TAG_NAME:
                return driver.findElement(By.tagName(value));

            default:
                break;
        }

        return null;
    }

    @Override
    public List<WebElement> elements(final Locators type, final String value) {
        switch (type) {
            case ID:
                return driver.findElements(By.id(value));

            case NAME :
                return driver.findElements(By.name(value));

            case CLASS_NAME:
                return driver.findElements(By.className(value));

            case LINK_TEXT:
                return driver.findElements(By.linkText(value));

            case PARTIAL_LINK_TEXT:
                return driver.findElements(By.partialLinkText(value));

            case CSS_SELECTOR:
                return driver.findElements(By.cssSelector(value));

            case XPATH:
                return driver.findElements(By.xpath(value));

            case TAG_NAME:
                return driver.findElements(By.tagName(value));

            default:
                break;
        }

        return null;
    }

    public By setBy(final Locators type, final String value) {
        switch (type) {
            case ID:
                return By.id(value);

            case NAME :
                return By.name(value);

            case CLASS_NAME:
                return By.className(value);

            case LINK_TEXT:
                return By.linkText(value);

            case PARTIAL_LINK_TEXT:
                return By.partialLinkText(value);

            case CSS_SELECTOR:
                return By.cssSelector(value);

            case XPATH:
                return By.xpath(value);

            case TAG_NAME:
                return By.tagName(value);

            default:
                break;
        }

        return null;
    }
}


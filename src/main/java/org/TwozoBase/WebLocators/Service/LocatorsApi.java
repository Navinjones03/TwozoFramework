package org.TwozoBase.WebLocators.Service;

import org.TwozoBase.enums.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface LocatorsApi {

    WebElement element(Locators type, String value);

    List<WebElement> elements(Locators type, String value);
     By setBy(final Locators type, final String value);
}

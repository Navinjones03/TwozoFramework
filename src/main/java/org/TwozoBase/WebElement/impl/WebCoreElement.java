package org.TwozoBase.WebElement.impl;

import org.TwozoBase.WebElement.Service.PageElement;
import org.openqa.selenium.WebElement;

public class WebCoreElement implements PageElement {

    private final WebElement element;

    public WebCoreElement(WebElement element) {
        this.element = element;
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}

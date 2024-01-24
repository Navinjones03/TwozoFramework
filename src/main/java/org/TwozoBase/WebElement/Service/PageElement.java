package org.TwozoBase.WebElement.Service;

public interface PageElement {

    void click();

    void submit();

    void sendKeys(CharSequence... keysToSend);

    void clear();

    boolean isDisplayed();

}

package com.webAutomationDriver.alert.impl;

import com.webAutomationDriver.alert.service.WebAlert;
import org.openqa.selenium.Alert;

/**
 * Provides functionality for interacting with browser alerts, such as dismissing them,
 * accepting them, retrieving their text, and sending keys to them.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see WebAlert
 */
public final class WebAlertImpl implements WebAlert {

    private final Alert alerts;
    private static WebAlertImpl webAlertImpl;

    public WebAlertImpl(final Alert alerts) {
        this.alerts = alerts;
    }

    public static WebAlertImpl getInstance() {

        if (webAlertImpl == null) {
            webAlertImpl = new WebAlertImpl(webAlertImpl.alerts);
        }

        return webAlertImpl;
    }

    /**
     * Dismisses the browser alert.
     */
    @Override
    public void dismiss() {
        alerts.dismiss();
    }

    /**
     * Accepts the browser alert.
     */
    @Override
    public void accept() {
        alerts.accept();
    }

    /**
     * Retrieves the text of the browser alert.
     *
     * @return The text of the browser alert.
     */
    @Override
    public String getText() {
        return alerts.getText();
    }

    /**
     * Sends the specified keys to the browser alert.
     *
     * @param keysToSend The keys to send to the browser alert.
     */
    @Override
    public void sendKeys(String keysToSend) {
        alerts.sendKeys(keysToSend);
    }
}


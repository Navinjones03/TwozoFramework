package org.twozo.components.alerts;

import org.openqa.selenium.Alert;

/**
 * To provides functionality for interacting with browser alerts, such as dismissing them, accepting them, retrieving their text, and sending
 * keys to them.
 * @version 1.0
 * @author [Navin Jones]
 */
public final class AlertsImpl implements Alerts {

    private final Alert alerts;

    public AlertsImpl(final Alert alerts) {
        this.alerts = alerts;
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


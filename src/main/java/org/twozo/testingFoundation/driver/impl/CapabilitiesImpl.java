package org.twozo.testingFoundation.driver.impl;

import org.twozo.testingFoundation.driver.service.Capabilities;

import java.util.Optional;

public class CapabilitiesImpl implements Capabilities {
    @Override
    public Object getCapability(String capabilityName) {
        return null;
    }

    @Override
    public String getBrowserName() {
        return String.valueOf(Optional.ofNullable(this.getCapability("browserName")).orElse(""));
    }

    @Override
    public String getBrowserVersion() {
        return String.valueOf(Optional.ofNullable(this.getCapability("browserVersion")).orElse(""));
    }
}

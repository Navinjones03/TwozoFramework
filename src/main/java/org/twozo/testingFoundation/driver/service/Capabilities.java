package org.twozo.testingFoundation.driver.service;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public interface Capabilities {

    Object getCapability(String capabilityName);
    String getBrowserName() ;

    default String getBrowserVersion() {
        return String.valueOf(Optional.ofNullable(this.getCapability("browserVersion")).orElse(""));
    }
}

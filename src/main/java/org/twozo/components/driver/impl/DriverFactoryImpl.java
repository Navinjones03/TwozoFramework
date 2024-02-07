package org.twozo.components.driver.impl;

import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.driver.service.DriverFactory;
import org.twozo.components.driver.browser.Browser;
import org.twozo.components.driver.browser.BrowserFactory;
import org.twozo.components.utilities.PropertyFileReader;

import java.util.Objects;

/**
 * A factory implementation for creating instances of AutomationDriver,
 * specifically tailored for web browser automation tasks.
 * @Version 1.0
 * @Author [Navin Jones]
 *
 */
public final class DriverFactoryImpl implements DriverFactory {


    private static DriverFactoryImpl driverFactory;

    private final PropertyFileReader propertyFileReader;

    public DriverFactoryImpl() {
        propertyFileReader = PropertyFileReader.getInstance();
    }

    /**
     * Static method to retrieve the singleton instance of DriverBuilderImpl.
     * Lazily initializes the instance if it is null and returns the instance.
     * Ensures thread safety in a multi-thread environment.
     *
     * @return The singleton instance of DriverBuilderImpl.
     */
    public static DriverFactoryImpl getInstance() {
        if (driverFactory == null) {
            driverFactory = new DriverFactoryImpl();
        }
        return driverFactory;
    }

    /**
     * Implements the getDriver() method defined in the DriverBuilder interface.
     * Configures and returns an instance of AutomationDriver by setting up a browser
     * through BrowserController, using the browser instance obtained from the webFunctionalityHandler.
     * Ensures that the browser instance obtained from webFunctionalityHandler is not null
     * before proceeding with the setup process.
     *
     * @return An instance of AutomationDriver configured for automation tasks.
     * @throws NullPointerException if the browser instance obtained from webFunctionalityHandler is null.
     */
    @Override
    public AutomationDriver getDriver() {
        return BrowserFactory.getInstance().build(Objects.requireNonNull(Browser.valueOf
                (Objects.requireNonNull(propertyFileReader.getProperty()).getProperty("Browser"))));
    }
}

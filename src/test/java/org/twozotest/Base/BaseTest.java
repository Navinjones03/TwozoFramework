package org.twozotest.Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.twozo.components.driver.impl.DriverFactoryImpl;
import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.driver.service.DriverFactory;
import org.twozo.components.utilities.PropertyFileReader;

import java.util.Objects;

public class BaseTest {

    private final PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
    protected final AutomationDriver automationDriver = DriverFactory.getInstance().getDriver();

    @BeforeSuite
    public void launchBrowser() {
        automationDriver.inform().goToUrl(Objects.requireNonNull(propertyFileReader.getProperty()).getProperty("Url"));
    }

    @AfterSuite
    public void tearDown() {
        automationDriver.quit();
    }
}

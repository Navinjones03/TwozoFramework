package org.twozo.testingFoundation.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

public interface TakeScreenshot {

    <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException;
}

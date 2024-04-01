package org.twozotest.Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.twozo.testingFoundation.driver.service.AutomationDriver;
import org.twozo.testingFoundation.driver.service.DriverFactory;
import org.twozo.testingFoundation.utilities.excelFile.ReadDataFromJsonFile;
import org.twozo.testingFoundation.utilities.propertyFile.PropertyFileReader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BaseTest {

    private final PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
    protected final ReadDataFromJsonFile jsonFile = new ReadDataFromJsonFile();

    public AutomationDriver automationDriver;

    @BeforeMethod
    public void launchBrowser() {
        this.automationDriver = DriverFactory.getInstance().getDriver();
        automationDriver.inform().goToUrl(Objects.requireNonNull(propertyFileReader.getProperty()).getProperty("Url"));
    }

    @AfterMethod
    public void tearDown() {
        automationDriver.quit();
    }

    @DataProvider(name = "SignInData")
    public Object[][] signIn() {
        return jsonFile.provideSignInDataFromJSON();
    }

    @DataProvider(name = "SignUpData")
    public Object[][] signUp() {
        return jsonFile.provideSignUpDataFromJSON();
    }


    public String takeScreenShot(final String TestName, final AutomationDriver driver) throws IOException {
        final File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        final String timeStamp = dateFormat.format(new Date());
        final String path = System.getProperty("user.dir") + "\\reports\\" + TestName +"_" + timeStamp + ".png";
        final File file = new File(path);
        FileUtils.copyFile(sourceFile, file);

        return path;
    }
}


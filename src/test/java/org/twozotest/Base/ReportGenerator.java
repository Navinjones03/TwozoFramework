package org.twozotest.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.twozo.ExtentReport;
import org.twozo.testingFoundation.driver.service.AutomationDriver;

import java.io.IOException;

public class ReportGenerator extends BaseTest implements ITestListener {

    private final ExtentReports reports = ExtentReport.reportGenerator();

    private ExtentTest test;
    private static final ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

    public void onStart(final ITestContext context) {
        reports.setSystemInfo("OS", System.getProperty("os.name"));
        reports.setSystemInfo("JAVA VERSION", System.getProperty("java.version"));
    }

    public void onTestStart(final ITestResult result) {
        test = reports.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    public void onFinish(final ITestContext context) {
        reports.flush();
    }

    public void onTestSuccess(final ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    public void onTestFailure(final ITestResult result) {
        AutomationDriver driver = null;

        extentTest.get().fail(result.getThrowable());

        final Object testObject = result.getInstance();
        final Class<?> clazz = result.getTestClass().getRealClass();

        try {
            driver = (AutomationDriver)clazz.getDeclaredField("driver").get(testObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (driver != null) {
                extentTest.get().addScreenCaptureFromPath(takeScreenShot(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName());
            } else {
                System.out.println("Driver is null. Cannot capture screenshot.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

package org.twozo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    private static ExtentReports extent ;

    public static ExtentReports reportGenerator() {
        final ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./report.html");
        sparkReporter.config().setReportName("SignIn results");
        sparkReporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Tester", "Navin Jo");

        return extent;
    }
}

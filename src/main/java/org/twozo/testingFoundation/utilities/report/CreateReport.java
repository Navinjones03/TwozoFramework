package org.twozo.testingFoundation.utilities.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateReport {

    public static void main(String[] args) {
        final ExtentReports report = new ExtentReports();
        final ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./TestNg.html");
        report.attachReporter(sparkReporter);
    }
}

package org.twozo.extent_reports.generator.extent_reports.impl;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.twozo.extent_reports.generator.test_reports.TestGeneratorImpl;

public class ReportGeneratorImpl {

    private final ExtentReports reports;
    private final ExtentTest extentTest;

    public ReportGeneratorImpl(final ExtentReports reports, final ExtentTest test) {
        this.reports = reports;
        this.extentTest = test;
    }

    SparkReporter
    public void attachReporter(final ExtentSparkReporter extentSparkReporter) {
        reports.attachReporter(extentSparkReporter);
    }

    public TestGeneratorImpl createTest(final String name, final String description) {
        TestGeneratorImpl t = new TestGeneratorImpl( reports, name, description);
        this.onTestCreated(test.getModel());
        return t;
    }
    public TestGeneratorImpl createTestWithName(final String name) {
        return this.createTest(name);
    }

//    public TestGeneratorImpl createTest(final String name, final String description) {
//        return this.createTest(name, description);
//    }

    public void removeTest(final TestGeneratorImpl testName) {
        this.onTestRemoved(test.getModel());
    }



}


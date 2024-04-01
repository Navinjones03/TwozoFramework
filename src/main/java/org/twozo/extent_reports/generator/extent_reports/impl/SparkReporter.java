package org.twozo.extent_reports.generator.extent_reports.impl;

import com.aventstack.extentreports.ExtentReports;

import java.io.File;

public class SparkReporter {

    private final ExtentReports extentReport ;

    public SparkReporter(ExtentReports extentReport) {
        this.extentReport = extentReport;
    }

    public void SparkReporterFile(final String path) {
        new File(path);
    }
}

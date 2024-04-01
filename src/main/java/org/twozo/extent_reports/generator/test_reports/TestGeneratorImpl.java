package org.twozo.extent_reports.generator.test_reports;

import com.aventstack.extentreports.ExtentTest;

public class TestGeneratorImpl implements TestGenerator{
    ExtentTest extentTest;

    TestGeneratorImpl(ExtentTest extentTest){
        this.extentTest = extentTest;
    }

    TestGenerator createNode(String node){
        return (TestGenerator)extentTest.createNode(node);
    }

    TestGenerator createNode(final String name, final String description) {
        return (TestGenerator)extentTest.createNode(name, description);
    }

    TestGenerator generateLog(final Status status, final String details) {
        return (TestGenerator) extentTest.generateLog(status, details);
    }
}

package org.twozo.testingFoundation.utilities.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExtentReportGenerator {

    private static ExtentReports reports;
    private static ExtentTest test;
    private static ExtentReportGenerator extentReport;

    public ExtentReportGenerator() {
    }

    public static ExtentReportGenerator getInstance() {
        if (extentReport == null) {
            extentReport = new ExtentReportGenerator();
        }

        return extentReport;
    }
    public void startReport() {
        final ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("./ExtentReport_all.html");
        reports = new ExtentReports();
        reports.attachReporter(sparkReporter_all);

        reports.setSystemInfo("OS", System.getProperty("os.name"));
        reports.setSystemInfo("JAVA VERSION", System.getProperty("java version.name"));
    }

    public void saveReport() throws IOException {
        reports.flush();
        Desktop.getDesktop().browse(new File("ExtentReport_all.html").toURI());
    }

    public void createTest() {
        reports.createTest("signInTest");
        ExtentTest node = reports.createTest("MyFirstTest");
                node.createNode("Node");
        node.createNode("Node1")
                .pass("Pass");
        reports.createTest("MyFirstTest1")
                .createNode("Node")
                .pass("Pass");


//    public void takingScreenshot() {
//         reports.createTest("Screenshot", "this is attaching screenshot for test level")
//                .info("info1")
//                .addScreenCaptureFromPath();
//    }

//    public void assignAuthor() {
        reports.createTest("Test3")
                .assignAuthor("Navin")
                .assignCategory("smoke")
                .assignDevice("chrome99")
                .pass("Test is passed");

        reports.createTest("Test4")
                .assignAuthor("petchi")
                .assignCategory("sanity")
                .assignDevice("edge99")
                .pass("Test is passed");
    }
    public void stepStatus(final ReportStatus status, final String description) {
        switch (status) {
            case PASS -> test.pass(description);
            case FAIL -> test.fail(description);
            case INFO -> test.info(description);
            case SKIP -> test.skip(description);
            case WARNING -> test.warning(description);
        }
    }

//    public static void main(String[] args) throws IOException {
//        final ExtentReportGenerator report = new ExtentReportGenerator();
//        report.startReport();
//        report.createTest();
//        report.stepStatus(PASS,"Test is passed");
//        report.saveReport();
//        report.assignAuthor();
//    }
}

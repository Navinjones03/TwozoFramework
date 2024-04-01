//package org.twozotest.web_driver_test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.twozo.pages.signUp.SignUpPage;
//import org.twozo.testingFoundation.driver.service.AutomationDriver;
//import org.twozo.testingFoundation.utilities.excelFile.ReadDataFromJsonFile;
//import org.twozo.testingFoundation.utilities.propertyFile.PropertyFileReader;
//import org.twozo.testingFoundation.utilities.report.ExtentReportGenerator;
//
//import java.sql.Driver;
//
//public class DriverControllerForTesting {
//
//    protected final PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
//
//    protected final ReadDataFromJsonFile jsonFile = new ReadDataFromJsonFile();
//
//    protected AutomationDriver automationDriver;
//    protected String url;
//    protected SignUpPage signUpPage;
//    protected final ExtentReports extentReports = new ExtentReports();
//    protected ExtentTest extentTest;
//    protected final ExtentReportGenerator extentReportGenerator = new ExtentReportGenerator();
//
//    @BeforeClass
//    public void setUp() {
//        extentReportGenerator.startReport();
//    }
//
//    @BeforeMethod
//    public void launch() {
//        automationDriver = Driver.
//    }
//}

//package org.example;
//
//import org.base.Web.WebBrowser.Browser;
//import org.base.Locators;
//import org.base.Web.WebBrowser.Service.BrowserApI;
//import org.base.Web.WebElement.impl.PageElementImp;
//import org.base.Web.WebLocators.impl.LocatorsImp;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class SignUp {
//
//    private final LocatorsImp locatorsImp;
//    private final PageElementImp pageElementImp;
//    private final BrowserApI browserApI;
//
//    public SignUp(LocatorsImp locatorsImp, PageElementImp pageElementImp, BrowserApI browserApI) {
//        this.locatorsImp = locatorsImp;
//        this.pageElementImp = pageElementImp;
//        this.browserApI = browserApI;
//    }
//
//    @BeforeTest
//    public void launch() {
//        browserApI.setUp(Browser.FIREFOX, "https://app.thelaunchclub.in/");
//    }
//
//    @AfterTest
//    public void tearDown() {
//        close();
//    }
//
//    @Test(priority = 1)
//    public void enterWorkMail() {
//        pageElementImp.click();
//        pageElementImp.click();
//        type(locatorsImp.element,"virat18@gmail.com");
//
//        click(element(Locators.XPATH, "//*[text()='Next']"));
//    }
//
//    @Test(priority = 2)
//    public void putDetails() {
//        click(element(Locators.ID, ":r3:"));
//        type(element(Locators.ID, ":r3:"),"Navin Jones");
//        click(element(Locators.ID, ":r5:"));
//        type(element(Locators.ID, ":r5:"), "Nj@12345");
//        click(element(Locators.ID, ":r6:"));
//        type(element(Locators.ID, ":r6:"), "Nj@12345");
//        click(element(Locators.XPATH, "//*[text()='Create Account']"));
//    }
//
//    @Test(priority = 3)
//    public void putCompanyName() {
//        click(element(Locators.ID, ":r7:"));
//        type(element(Locators.ID, ":r7:"), "Twozo-2001");
//    }
//
//    @Test(priority = 4)
//    public void selectJobRole() {
//        click(element(Locators.XPATH, "//*[text()='Select']"));
//        List<WebElement> webElements = elements(Locators.TAG_NAME, "li");
//
//        for (final WebElement element : webElements) {
//            final String dropDownOptions = element.getText();
//            System.out.println(dropDownOptions);
//
//            if ("Admin".equals(dropDownOptions)) {
//                element.click();
//            }
//        }
//    }
//
//    @Test(priority = 5)
//    public void signUp() {
//        click(element(Locators.XPATH, "//*[text()='Complete Signup']"));
//    }
//}

//package org.TwozoTest;
//
//import org.TwozoBase.WebBrowser.Service.BrowserApI;
//import org.TwozoBase.WebLocators.impl.LocatorsImp;
//import org.TwozoBase.enums.Browser;
//import org.testng.annotations.Test;
//
//public class Twozo {
//
//    private final LocatorsImp locatorsImp;
//    private final PageElementImp pageElementImp;
//    private final BrowserApI browserApI;
//
//
//    public Twozo(LocatorsImp locatorsImp, PageElementImp pageElementImp, BrowserApI browserApI) {
//        this.locatorsImp = locatorsImp;
//        this.pageElementImp = pageElementImp;
//        this.browserApI = browserApI;
//    }
//    @Test
//    public void launch() {
//        browserApI.setUp(Browser.CHROME, "https://app.thelaunchclub.in/");
//    }
//}

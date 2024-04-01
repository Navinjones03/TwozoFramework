package org.twozotest.signIn_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.twozo.pages.signIn.SignInPage;
import org.twozo.testingFoundation.driver.service.AutomationDriver;
import org.twozotest.Base.BaseTest;

public class SignInTest extends BaseTest {

    public AutomationDriver driver;

    @Test(dataProvider = "SignInData")
    public void signInTest(final String mailId, final String Password) {
        driver = super.automationDriver;
        new SignInPage(driver).logIn(mailId, Password);
        Assert.fail();
    }
}




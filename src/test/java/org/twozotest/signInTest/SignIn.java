package org.twozotest.signInTest;

import org.testng.annotations.Test;

import org.twozo.pages.signIn.SignInPage;
import org.twozotest.Base.BaseTest;

public class SignIn extends BaseTest {

    @Test(priority = 1)
    public void signInTest() {
        new SignInPage(automationDriver).logIn();
    }
}
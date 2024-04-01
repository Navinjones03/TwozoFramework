package org.twozotest.signUp_test;

import org.testng.annotations.Test;
import org.twozo.pages.signUp.SignUpPage;
import org.twozotest.Base.BaseTest;

public class SignUpTest extends BaseTest {

    @Test(dataProvider = "SignUpData")
    public void setSignUp(final String email, final String name, final String pass, final String confirmPass, final String comName, final String role) {
        new SignUpPage(automationDriver).setSignUp(email, name, pass, confirmPass, comName, role);
    }
}


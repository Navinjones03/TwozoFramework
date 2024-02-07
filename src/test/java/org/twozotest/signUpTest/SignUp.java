package org.twozotest.signUpTest;

import org.testng.annotations.Test;
import org.twozo.pages.signUp.SignUpPage;
import org.twozotest.Base.BaseTest;

public class SignUp extends BaseTest {

    @Test
    public void clickSignUp() {
        new SignUpPage(automationDriver).clickSignUpButton().enterWorkMail().provideDetails();
    }

}

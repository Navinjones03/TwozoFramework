package org.twozo.pages.signUp;

import org.twozo.testingFoundation.driver.service.AutomationDriver;
import org.twozo.testingFoundation.element.locator.ElementLocator;
import org.twozo.testingFoundation.element.locator.Locators;
import org.twozo.testingFoundation.element.webElement.service.PageElement;

import java.util.Collection;


/**
 * <p>
 * Represents a page object for the sign-up page of a web application.
 * <p>
 * <p>
 * Author: [Navin Jones]
 * Version: 1.0
 */

public class SignUpPage {

    private static SignUpPage signUpPage;
    private static ElementLocator elementLocator;
    private PageElement signUpButton;
    private PageElement workMail;
    private PageElement nextBtn;
    private PageElement fieldName;
    private PageElement fieldPassword;
    private PageElement fieldConfirmPassword;
    private PageElement createAccountBtn;
    private PageElement fieldCompanyName;
    private PageElement select;
    private PageElement completeSignUpBtn;

    public SignUpPage(final AutomationDriver automationDriver) {
        elementLocator = ElementLocator.getInstance(automationDriver);
    }

    public static SignUpPage getInstance(final AutomationDriver automationDriver) {
        //if (signUpPage == null) {
            signUpPage = new SignUpPage(automationDriver);
        //}

        return signUpPage;
    }

    public PageElement clickSignUp() {
        if (signUpButton == null) {
            signUpButton = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Sign Up']");
        }

        return signUpButton;
    }

    public PageElement enterMail() {
        if (workMail == null) {
            workMail = elementLocator.getPageElement(Locators.ID, ":r2:");
        }

        return workMail ;
    }

    public PageElement clickNext() {
        if (nextBtn == null) {
            nextBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Next']");
        }

        return nextBtn;
    }

    public PageElement enterName() {
        if (fieldName == null) {
            fieldName = elementLocator.getPageElement(Locators.ID, ":r3:");
        }

        return fieldName;
    }

    public PageElement enterPass() {
        if (fieldPassword == null) {
            fieldPassword = elementLocator.getPageElement(Locators.ID, ":r5:");
        }

        return fieldPassword;
    }

    public PageElement enterConfirmPass() {
        if (fieldConfirmPassword == null) {
            fieldConfirmPassword = elementLocator.getPageElement(Locators.ID, ":r6:");
        }

        return fieldConfirmPassword;
    }

    public PageElement clickCreateAccount() {
        if (createAccountBtn == null) {
            createAccountBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Create Account']");
        }

        return createAccountBtn;
    }

    public PageElement select() {
        if (select == null) {
            select = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Select']");
        }

        return select;
    }

    public PageElement enterComName() {
        if (fieldCompanyName == null) {
            fieldCompanyName = elementLocator.getPageElement(Locators.ID, ":r7:");
        }

        return fieldCompanyName;
    }

    public PageElement setJobRole(final String userRole) {
        PageElement elements = null;
        final Collection<PageElement> jobRoles = elementLocator.getPageElements(Locators.TAG_NAME, "li");

        for (final PageElement element : jobRoles) {
            final String dropDownOptions = element.getText();
            System.out.println(dropDownOptions);

            if (dropDownOptions.equalsIgnoreCase(userRole)) {
                elements = element;
            }
        }

        return elements;
    }

    public PageElement clickCompleteSignUp() {
        if (completeSignUpBtn == null) {
            completeSignUpBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Complete Signup']");
        }

        return completeSignUpBtn;
    }

    public void setSignUp(final String email, final String name, final String pass, final String confirmPass, final String comName, final String role) {
        clickSignUp().click();
        enterMail().sendKeys(email);
        clickNext().click();
        enterName().sendKeys(name);
        enterPass().sendKeys(pass);
        enterConfirmPass().sendKeys(confirmPass);
        clickCreateAccount().click();
        enterComName().sendKeys(comName);
        //select().click();
        //setJobRole(role).click();
        clickCompleteSignUp().click();
    }
}



//        signUpButton = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Sign Up']");
//        workMail = elementLocator.getPageElement(Locators.ID, ":r2:");
//        nextBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Next']");
//        fieldName = elementLocator.getPageElement(Locators.ID, ":r3:");
//        fieldPassword = elementLocator.getPageElement(Locators.ID, ":r5:");
//        fieldConfirmPassword = elementLocator.getPageElement(Locators.ID, ":r6:");
//        createAccountBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Create Account']");
//    }
//
//    /**
//     * Clicks the sign-up button.
//     */
//    public void clickSignUpButton() {
//        signUpButton.click();
//    }
//
//    /**
//     * Enters the work email and clicks the next button.
//     */
//    public void enterWorkMail() {
//        workMail.sendKeys("vk18@thelaunchclub.in");
//        nextBtn.click();
//    }
//
//    /**
//     * Provides user details such as name, password, and clicks the create account button.
//     */
//    public void provideDetails() {
//        fieldName.sendKeys("Vi_rat");
//        fieldPassword.sendKeys("Virat$123");
//        fieldConfirmPassword.sendKeys("Virat$123");
//        createAccountBtn.click();
//    }

//

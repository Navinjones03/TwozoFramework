package org.twozo.pages.signUp;

import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.element.locator.ElementLocator;
import org.twozo.components.element.locator.Locators;
import org.twozo.components.element.webElement.service.PageElement;

/**
 * Class: SignUpPage
 * Description: This class represents a page object for the sign-up page of a web application.
 * Author: [Navin Jones]
 * Version: 1.0
 */

public class SignUpPage {

    // Page elements
    private final PageElement signUpButton;          // Element representing the sign-up button
    private final PageElement workMail;              // Element representing the work email input field
    private final PageElement nextBtn;               // Element representing the next button
    private final PageElement fieldName;             // Element representing the name input field
    private final PageElement fieldPassword;         // Element representing the password input field
    private final PageElement fieldConfirmPassword;  // Element representing the confirmation password input field
    private final PageElement createAccountBtn;      // Element representing the create account button

    /**
     * Constructor for SignUpPage.
     * Initializes page elements using the provided AutomationDriver.
     *
     * @param automationDriver The AutomationDriver used for interacting with the web page.
     */
    public SignUpPage(final AutomationDriver automationDriver) {
        // Initialize element locator
        final ElementLocator elementLocator = ElementLocator.getInstance(automationDriver);

        // Locate page elements using ElementLocator
        signUpButton = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Sign Up']");       // Value: The XPath of the sign-up button
        workMail = elementLocator.getPageElement(Locators.ID, ":r2:");                                // Value: The ID of the work email input field
        nextBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Next']");                // Value: The XPath of the next button
        fieldName = elementLocator.getPageElement(Locators.ID, ":r3:");                                // Value: The ID of the name input field
        fieldPassword = elementLocator.getPageElement(Locators.ID, ":r5:");                            // Value: The ID of the password input field
        fieldConfirmPassword = elementLocator.getPageElement(Locators.ID, ":r6:");                     // Value: The ID of the confirmation password input field
        createAccountBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Create Account']"); // Value: The XPath of the create account button
    }

    /**
     * Clicks the sign-up button.
     *
     * @return This SignUpPage instance.
     */
    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return this;
    }

    /**
     * Enters the work email and clicks the next button.
     *
     * @return This SignUpPage instance.
     */
    public SignUpPage enterWorkMail() {
        workMail.sendKeys("vk18@thelaunchclub.in"); // Value: Sample work email address
        nextBtn.click();
        return this;
    }

    /**
     * Provides user details such as name, password, and clicks the create account button.
     *
     * @return This SignUpPage instance.
     */
    public SignUpPage provideDetails() {
        fieldName.sendKeys("Vi_rat");         // Value: Sample user name
        fieldPassword.sendKeys("Virat$123"); // Value: Sample password
        fieldConfirmPassword.sendKeys("Virat$123"); // Value: Sample password confirmation
        createAccountBtn.click();
        return this;
    }
}


package org.twozo.pages.signIn;

import org.twozo.components.driver.service.AutomationDriver;
import org.twozo.components.element.locator.Locators;
import org.twozo.components.element.locator.ElementLocator;
import org.twozo.components.element.webElement.service.PageElement;

/**
 * Class: SignInPage
 * Description: This class represents a page object for the sign-in page of a web application.
 * Author: [Author Name]
 * Version: 1.0
 */

public class SignInPage {

    // Page elements
    private final PageElement fieldEmail;     // Element representing the email input field
    private final PageElement fieldPassword;  // Element representing the password input field
    private final PageElement buttonSignIn;   // Element representing the sign-in button

    /**
     * Constructor for SignInPage.
     * Initializes page elements using the provided AutomationDriver.
     *
     * @param driver The AutomationDriver used for interacting with the web page.
     */
    public SignInPage(final AutomationDriver driver) {
        // Initialize element locator
        final ElementLocator elementLocator = ElementLocator.getInstance(driver);

        // Locate page elements using ElementLocator
        fieldEmail = elementLocator.getPageElement(Locators.ID, ":r0:");   // Value: The ID of the email input field
        fieldPassword = elementLocator.getPageElement(Locators.ID, ":r1:"); // Value: The ID of the password input field
        buttonSignIn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Sign In']"); // Value: The XPath of the sign-in button
    }

    /**
     * Method to perform login action by entering email, password, and clicking the sign-in button.
     */
    public void logIn() {
        // Enter email and password
        fieldEmail.sendKeys("s.n.jones0304@gmail.com"); // Value: Sample email address for login
        fieldPassword.sendKeys("Nj8220978540");         // Value: Sample password for login

        // Click the sign-in button
        buttonSignIn.click();
    }
}

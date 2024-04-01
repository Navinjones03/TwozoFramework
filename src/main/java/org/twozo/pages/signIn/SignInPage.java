package org.twozo.pages.signIn;

import org.twozo.testingFoundation.driver.service.AutomationDriver;
import org.twozo.testingFoundation.element.locator.Locators;
import org.twozo.testingFoundation.element.locator.ElementLocator;
import org.twozo.testingFoundation.element.webElement.service.PageElement;

/**
 * <p>
 * Represents a page object for the sign-in page of a web application.
 * <p>
 *
 * Author: [Author Name]
 * Version: 1.0
 */

public class SignInPage {

    private final PageElement fieldEmail;
    private final PageElement fieldPassword;
    private final PageElement buttonSignIn;
//    private final PageElement buttonImport;

    /**
     * Constructor for SignInPage.
     * Initializes page elements using the provided AutomationDriver.
     *
     * @param driver The AutomationDriver used for interacting with the web page.
     */
    public SignInPage(final AutomationDriver driver) {
        final ElementLocator elementLocator = ElementLocator.getInstance(driver);

        fieldEmail = elementLocator.getPageElement(Locators.ID, ":r0:");
        fieldPassword = elementLocator.getPageElement(Locators.ID, ":r1:");
        buttonSignIn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Sign In']");
//        buttonImport = elementLocator.getPageElement(Locators.XPATH,"//*[text()='Import']");
    }

    /**
     * Method to perform login action by entering email, password, and clicking the sign-in button.
     */
    public void logIn(final String mail, final String password) {
        fieldEmail.sendKeys(mail);
        fieldPassword.sendKeys(password);
        buttonSignIn.click();
//        buttonImport.click();
    }
}

package org.twozo.pages.addContact;

import org.twozo.testingFoundation.driver.service.AutomationDriver;
import org.twozo.testingFoundation.element.locator.ElementLocator;
import org.twozo.testingFoundation.element.locator.Locators;
import org.twozo.testingFoundation.element.webElement.service.PageElement;

public class ContactPage {

    private static  ContactPage contactPage;
    private static ElementLocator elementLocator;
    private PageElement contactIcon;
    private PageElement contactBtn;
    private PageElement firstName;
    private PageElement lastName;
    private PageElement email;
    private PageElement phone;
    private PageElement company;
    private PageElement designation;
    private PageElement source;


    public ContactPage(final AutomationDriver driver) {
        elementLocator = ElementLocator.getInstance(driver);
    }

    public static ContactPage getInstance(final AutomationDriver driver) {
        contactPage = new ContactPage(driver);

        return contactPage;
    }

    public PageElement clickContactLabel() {
        if (contactIcon == null) {
            contactIcon = elementLocator.getPageElement(Locators.CLASS_NAME, "//li[@class='MuiListItem-root MuiListItem-gutters css-12dzmul'][2]");
        }

        return contactIcon;
    }

    public PageElement clickContactBtn() {
        if (contactBtn == null) {
            contactBtn = elementLocator.getPageElement(Locators.XPATH, "//*[text()='Contact']");
        }

        return contactBtn;
    }

    public PageElement addFirstName() {
        if (firstName == null) {
            firstName = elementLocator.getPageElement(Locators.XPATH, "//*[@Id='1']");
        }

        return firstName;
    }

    public PageElement addLastName() {
        if (lastName == null) {
            lastName = elementLocator.getPageElement(Locators.XPATH, "//*[@Id='2']");
        }

        return lastName;
    }

    public PageElement addEmail() {
        if (email == null) {
            email = elementLocator.getPageElement(Locators.XPATH, "//*[@Id='3']");
        }

        return email;
    }

    public PageElement addPhone() {
        if (phone == null) {
            phone = elementLocator.getPageElement(Locators.XPATH, "//*[@Id='4']");
        }

        return phone;
    }

    public PageElement addCompany() {
        if (company == null) {
            company = elementLocator.getPageElement(Locators.ID, ":r7:");
        }

        return company;
    }

    public PageElement addDesignation() {
        if (designation == null) {
            designation = elementLocator.getPageElement(Locators.XPATH, "//*[@Id='6']");
        }

        return designation;
    }

    public PageElement addSource() {
        if (source == null) {
            source = elementLocator.getPageElement(Locators.XPATH, "//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1lv6683'][1]");
        }

        return source;
    }


}

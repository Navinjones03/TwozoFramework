package org.twozo.pages.addContact;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddForm {

    private String FirstName;
    private String LastName;
    private EmailType emailType;
    private PhoneType phone;
    private String company;
    private String designation;
    private String salesOwner;
    private LifeCycleStage stage;
    private Source source;
    private String DOB;
    private String address1;
    private String address2;
    private String City;
    private String State;
    private int pinCode;
    private String faceBook;
    private String Twitter;
    private String LinkedIn;
    private SubscriptionStatus status;
}

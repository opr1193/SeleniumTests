package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbRadioButton;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;



import static com.infarmbureau.qa.enums.Spinner.SPINNER;

    public class EventRegistrationPage extends Page {

        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[2]/ul[1]/li[1]/a")
        private WebElement infbmemberElement;

        @FindBy(xpath = "//*[@id=\"MemberInfo_FirstName\"]" )
        private WebElement firstnameElement;

        @FindBy(xpath = "//*[@id=\"MemberInfo_LastName\"]")
        private WebElement lastnameElement;

        @FindBy(xpath = "//*[@id=\"MemberInfo_ZipCode\"]")
        private WebElement zipcodeElement;

        @FindBy(xpath = "//*[@id=\"MemberInfo_MemberNumber\"]")
        private WebElement membershipnumberElement;

        @FindBy(xpath = "//*[@id=\"button-row-div\"]/div[3]/input")
        private WebElement membercontinuebuttonElement;

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[2]/div/label/span[2]")
        private WebElement memberattendingElement;

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[3]/div/label/span[2]")
        private WebElement memberfirsttimeElement;

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[5]/div[2]/input")
        private WebElement membercontbuttonElement;

        @FindBy(xpath = "//*[@id=\"HouseholdMembers_0__Member_Email\"]")
        private WebElement memberemailaddressElement;

        @FindBy(xpath = "//*[@id=\"confirm-form\"]/div[4]/div/div/label/span[2]")
        private WebElement membertermsElement;


        @FindBy(id = "submitBtn")
        private WebElement memberregisterElement;


        @FindBy(xpath = "//*[@id=\"member-div\"]/div[2]/div/label[2]/span")
        private WebElement membernoElement;

        public IfbRadioButton membernoRadioButton = new IfbRadioButton(driver, membernoElement);

        @FindBy(xpath= "//*[@id=\"main\"]/div/div/div/div[2]/p/a")
        private WebElement alreadyregisteredElement;

        public IfbLink alreadyregisteredlink = new IfbLink(driver, alreadyregisteredElement);



        @FindBy(id = "NonMemberInfo_Email")
        private WebElement emailElement;


        @FindBy(xpath = "//*[@id='guestInfo']//div[3]//input")
        private WebElement continuebuttonElement;

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[3]/div/label/span[2]")
        private WebElement firsttimebuttonElement;

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[5]/div[2]/input")
        private WebElement contbuttonElement;

        @FindBy(xpath = "//*[@id=\"confirm-form\"]/div[3]/div/div/label")
        private WebElement termsbuttonElement;

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        private  WebElement registerbuttonElement;


        public IfbTextBox firstNameTextField = new IfbTextBox(driver, firstnameElement);
        public IfbTextBox lastNameTextField = new IfbTextBox(driver, lastnameElement);
        public IfbTextBox emailTextField = new IfbTextBox(driver, emailElement);

        public IfbButton continueButton = new IfbButton(driver, continuebuttonElement);
        public IfbButton firsttimeButton = new IfbButton(driver, firsttimebuttonElement);
        public IfbButton contButton = new IfbButton(driver, contbuttonElement);
        public IfbButton termsButton = new IfbButton(driver, termsbuttonElement);
        public IfbButton registerButton = new IfbButton(driver, registerbuttonElement);

        public IfbButton membercontinueButton = new IfbButton(driver, membercontinuebuttonElement);
        public IfbButton  memberattendingButton = new IfbButton(driver, memberattendingElement);
        public IfbButton memberfirsttimeButton = new IfbButton(driver, memberfirsttimeElement);
        public IfbTextBox memberemailaddressTextField = new IfbTextBox(driver, memberemailaddressElement);
        public IfbButton membercontButton = new IfbButton(driver, membercontbuttonElement);
        public IfbButton membertermsButton = new IfbButton(driver, membertermsElement);
        public IfbButton memberregisterButton = new IfbButton(driver, memberregisterElement);



        public EventRegistrationPage(WebDriver driver) {

            super(driver, SPINNER);
        }
    }


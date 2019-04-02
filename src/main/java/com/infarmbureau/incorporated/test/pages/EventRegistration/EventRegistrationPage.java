package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;



import static com.infarmbureau.qa.enums.Spinner.SPINNER;

    public class EventRegistrationPage extends Page {

        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[2]/ul[1]/li[2]/a")
        private WebElement guestElement;

        public IfbLink guestlink = new IfbLink(driver, guestElement);

        @FindBy(xpath = "//*[@id=\"GuestInfo_FirstName\"]")
        private WebElement guestfirstnameElement;

        public IfbTextBox guestfirstnametextbox = new IfbTextBox(driver, guestfirstnameElement);

        @FindBy(xpath = "//*[@id=\"GuestInfo_LastName\"]")
        private WebElement guestlastnameElement;

        public IfbTextBox guestlastnametextbox = new IfbTextBox(driver, guestlastnameElement);

        @FindBy(xpath = "//*[@id=\"GuestInfo_Email\"]")
        private WebElement guestemailElement;

        public IfbTextBox guestemailtextbox = new IfbTextBox(driver, guestemailElement);

        @FindBy(xpath = "//*[@id=\"GuestInfo_CountyName\"]")
        public WebElement guestcountyElement;

        public IfbDropDown guestcountydropdown = new IfbDropDown(driver, guestcountyElement);

        @FindBy(xpath = "//*[@id=\"guestInfo\"]/form/div[4]/div/input")
        public WebElement guestcontinueElement;

        public IfbButton guestcontinuebutton = new IfbButton(driver, guestcontinueElement);

        @FindBy(xpath = "//*[@id=\"Members_0__BadgeName\"]")
        private WebElement guestbadgenameElement;

        public IfbTextBox guestbadgenametextbox = new IfbTextBox(driver, guestbadgenameElement);

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[5]/div[2]/input")
        private WebElement guestcontinue1Element;

        public IfbLink guestcontinue1link = new IfbLink(driver, guestcontinue1Element);

        @FindBy(xpath = "//*[@id=\"confirm-form\"]/div[3]")
        private WebElement guesttermsElement;

        public IfbCheckBox guesttermscheckbox = new IfbCheckBox(driver, guesttermsElement);

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        private WebElement guestregisterElement;

        public IfbLink guestregisterlink = new IfbLink(driver, guestregisterElement);




        public EventRegistrationPage(WebDriver driver) {

            super(driver, SPINNER);
        }
    }


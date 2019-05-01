package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

    public class EventRegistrationPage extends Page {


        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[2]/ul[1]/li[1]/a")
        private WebElement memberElement;

        public IfbLink memberlink = new IfbLink(driver, memberElement);

        @FindBy(xpath = "//*[@id=\"MemberInfo_FirstName\"]")
        private WebElement memberfirstnameElement;

        public IfbTextBox memberfirstnametextbox = new IfbTextBox(driver, memberfirstnameElement);

        @FindBy(xpath = "//*[@id=\"MemberInfo_LastName\"]")
        private WebElement memberlastnameElement;

        public IfbTextBox memberlastnametextbox = new IfbTextBox(driver, memberlastnameElement);

        @FindBy(xpath = "//*[@id=\"MemberInfo_ZipCode\"]")
        private WebElement memberzipcodeElement;

        public IfbTextBox memberzipcodetextbox = new IfbTextBox(driver, memberzipcodeElement);

        @FindBy(xpath = "//*[@id=\"MemberInfo_MemberNumber\"]")
        private WebElement membernumberElement;

        public IfbTextBox membernumbertextbox = new IfbTextBox(driver, membernumberElement);

        @FindBy(xpath = "//*[@id=\"memberInfo\"]/form/div[4]/div/input") //*[@id="household-div"]/div[5]/div[2]/input
        private WebElement membercontinueElement;

        public IfbButton membercontinuebutton = new IfbButton(driver, membercontinueElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/div[2]/div/label/span[2]")
        private WebElement firstattendingElement;

        public IfbCheckBox firstattendingcheckbox = new IfbCheckBox(driver, firstattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/div[2]/div/label/span[2]")
        private WebElement secondattendingElement;

        public IfbCheckBox seconattendingcheckbox = new IfbCheckBox(driver, secondattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/div[3]/div/label/span[2]")
        private WebElement firstfirsttimeattendingElement;

        public IfbCheckBox firstfirsttimeattendingcheckbox = new IfbCheckBox(driver, firstfirsttimeattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/div[3]/div/label/span[2]")
        private WebElement secondfirstattendingElement;

        public IfbCheckBox secondfirsttimeattendingcheckbox = new IfbCheckBox(driver, secondfirstattendingElement);

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[5]/div[2]/input")
        private WebElement householdcontinueElement;

        public IfbButton householdcontinuebutton = new IfbButton(driver, householdcontinueElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[2]/div/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement session1firstattendeegoingElement;

        public IfbRadioButton session1firstattendeegoingradiobutton = new IfbRadioButton(driver, session1firstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[2]/div/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement session1secondattendeegoingElement;

        public IfbRadioButton session1secondattendeegoingradiobutton = new IfbRadioButton(driver, session1secondattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[1]/div[4]/h5[2]/div")
        private WebElement session2textboxElement;//*[@id="step5-form"]/div[3]/div[1]/div[4]/h5[2]/div/span

        public IfbButton session2textboxbutton = new IfbButton(driver, session2textboxElement);

        @FindBy(xpath = "//*[@id=\"Members_0__AvailableSessions_5__Quantity\"]")
        private WebElement session2textboxinputElement;

        public IfbTextBox  session2textboxinputtextbox = new IfbTextBox(driver, session2textboxinputElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[2]/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement session3firstattendeegoingElement;

        public  IfbCheckBox session3firstattendeegoingcheckbox = new IfbCheckBox(driver, session3firstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[2]/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement session3secondattendeegoingElement; //*[@id="step5-form"]/div[3]/div[2]/div[3]/div[2]/div[3]/label[1]/span

        public IfbCheckBox session3secondattendeegoingcheckbox = new IfbCheckBox(driver, session3secondattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[3]/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement session4firstattendeegoingElement;

        public IfbCheckBox session4firstattendeegoingcheckbox  = new IfbCheckBox(driver, session4firstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[3]/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement session4secondattendeegoingElement;

        public IfbCheckBox session4secondattendeegoingcheckbox = new IfbCheckBox(driver, session4secondattendeegoingElement);


        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[4]/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement session5firstattendeegoingElement;

        public IfbCheckBox session5firstattendeegoingcheckbox = new IfbCheckBox(driver, session5firstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[4]/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement session5secondattendeegoingElement;

        public IfbCheckBox session5secondattendeegoingcheckbox = new IfbCheckBox(driver, session5secondattendeegoingElement);


        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[5]/div[3]/div[2]/div[2]/label[2]/span")
        private WebElement session6firstattendeenotgoingElement;

        public IfbCheckBox session6firstattendeenotgoingcheckbox = new IfbCheckBox(driver, session6firstattendeenotgoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div[5]/div[3]/div[2]/div[3]/label[2]/span")
        private WebElement session6secondattendeenotgoingElement;

        public IfbCheckBox session6secondattendeenotgoingcheckbox = new IfbCheckBox(driver, session6secondattendeenotgoingElement);


        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[4]/div/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement session7firstattendeegoingElement;

        public IfbCheckBox session7firstattendeegoingcheckbox = new IfbCheckBox(driver, session7firstattendeegoingElement);
        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[4]/div/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement session7secondattendeegoingElement;

        public IfbCheckBox session7secondattendeegoingcheckbox = new IfbCheckBox(driver, session7secondattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[4]/h5[2]/div/span")
        private WebElement session8Element;

        public IfbLink session8link = new IfbLink(driver, session8Element);

        @FindBy(xpath = "//*[@id=\"Members_0__AvailableSessions_32__Attending_Value\"]")
        private WebElement session8firstattendeeElement;

        public IfbCheckBox session8firstattendeecheckbox = new IfbCheckBox(driver, session8firstattendeeElement);

        @FindBy(xpath = "//*[@id=\"Members_1__AvailableSessions_32__Attending_Value\"]")
        private WebElement session8secondattendeeElement;

        public IfbCheckBox session8secondattendeecheckbox = new IfbCheckBox(driver, session8secondattendeeElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[4]/h5[2]/div/span")
        private WebElement session9Element;

        public IfbLink session9link = new IfbLink(driver, session9Element);

        @FindBy(xpath = "//*[@id=\"Members_0__AvailableSessions_33__Quantity\"]")
        private WebElement session9texboxElement;

        public IfbTextBox session9textbox = new IfbTextBox(driver, session9texboxElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[12]/div[2]/input")
        private WebElement selectsessioncontinueElement;

        public IfbButton selectsessioncontinuebutton = new IfbButton(driver, selectsessioncontinueElement);

        @FindBy(id = "HouseholdMembers_0__Member_Email")
        private WebElement firstattendeeemailElement;

        public IfbTextBox firstattendeeemailtextbox = new IfbTextBox(driver, firstattendeeemailElement);

        @FindBy(id = "HouseholdMembers_1__Member_Email")
        private WebElement secondattendeeemailElement;

        public IfbTextBox secondattendeeemailtextbox = new IfbTextBox(driver, secondattendeeemailElement);

        @FindBy(xpath = "//*[@id=\"confirm-form\"]/div[3]/div/div/label/span[2]")
        private WebElement confirmscreentermsElement;
        //*[@id="confirm-form"]/div[4]/div/div/label/span[2]

        public IfbCheckBox confirmscreentermscheckbox = new IfbCheckBox(driver, confirmscreentermsElement);

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        private WebElement confirmscreencontinueElement;

        public IfbButton confirmscreencontinuebutton = new IfbButton(driver, confirmscreencontinueElement);

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

        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[3]/p/a")
        private WebElement updateregistrationElement;

        public IfbLink updateregistrationlink = new IfbLink(driver, updateregistrationElement);

        @FindBy(xpath = "//*[@id=\"koconf\"]/div[2]/div[2]/input")
        private WebElement updateregcontinueElement;

        public IfbButton updateregcontinuebutton = new IfbButton(driver, updateregcontinueElement);

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[5]/div[1]/a[2]")
        private WebElement cancelregistrationElement;


        public IfbButton cancelregistrationbutton = new IfbButton(driver, cancelregistrationElement);

        @FindBy(xpath = "//*[@id=\"cancelpopup\"]/div/div[3]/a[2]")
        private WebElement confirmcancelregistrationElement;

        public IfbButton confirmcancelregistrationbutton = new IfbButton(driver, confirmcancelregistrationElement);

        public EventRegistrationPage(WebDriver driver) {

            super(driver, SPINNER);
        }
    }


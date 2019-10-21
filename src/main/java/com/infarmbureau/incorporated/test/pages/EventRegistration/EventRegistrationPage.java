package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import javafx.css.CssMetaData;
import org.hibernate.mapping.Value;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.SunHints;

import javax.xml.bind.Element;

import java.lang.reflect.Type;
import java.nio.channels.Selector;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

    public class EventRegistrationPage extends Page {


        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[3]/ul[1]/li[1]/a")
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

        @FindBy(xpath = "//*[@id=\"button-row-div\"]/div/input") //*[@id="household-div"]/div[5]/div[2]/input
        private WebElement membercontinueElement;

        public IfbButton membercontinuebutton = new IfbButton(driver, membercontinueElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/label/span")
        private WebElement firstattendingElement;

        public IfbCheckBox firstattendingcheckbox = new IfbCheckBox(driver, firstattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/label/span")
        private WebElement secondattendingElement;

        public IfbCheckBox seconattendingcheckbox = new IfbCheckBox(driver, secondattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/div[2]/div/div[1]/label/span[2]")
        private WebElement firstfirsttimeattendingElement;

        public IfbCheckBox firstfirsttimeattendingcheckbox = new IfbCheckBox(driver, firstfirsttimeattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/div[2]/div/div[2]/label/span[2]")
        private WebElement firstpreferrednamecheckElement;

        public IfbCheckBox firstpreferrednamecheckbox = new IfbCheckBox(driver, firstpreferrednamecheckElement);

        @FindBy(xpath = "//*[@id=\"Members_0__BadgeName\"]")
        private WebElement firstpreferrednameElement;

        public IfbTextBox firstpreferrednametextbox = new IfbTextBox(driver, firstpreferrednameElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[1]/div[2]/div/div[3]/label/span[2]")
        private WebElement firstsuperqualElement;

        public IfbCheckBox firstsuperqualcheckbox = new IfbCheckBox(driver, firstsuperqualElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/div[2]/div/div[1]/label/span[2]")
        private WebElement secondfirstattendingElement;

        public IfbCheckBox secondfirsttimeattendingcheckbox = new IfbCheckBox(driver, secondfirstattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/div[2]/div/div[2]/label/span[2]")
        private WebElement secondpreferrednamcheckElemnt;

        public IfbCheckBox secondpreferrednamecheckbox = new IfbCheckBox(driver, secondpreferrednamcheckElemnt);

        @FindBy(xpath = "//*[@id=\"Members_1__BadgeName\"]")
        private WebElement secondpreferrednameElement;

        public IfbTextBox secondpreferrednametextbox = new IfbTextBox(driver, secondpreferrednameElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div[2]/div[2]/div/div[3]/label/span[2]")
        private WebElement secondsuperqualElement;

        public IfbCheckBox secondsuperqualcheckbox = new IfbCheckBox(driver, secondsuperqualElement);

        @FindBy(xpath = "//*[@id=\"addMemberBtn\"]")
        //*[@id="memberHolder"]/div[2]/label/span

        private WebElement memberadditionalhouseholdmemberElement;

        public IfbButton memberadditionalhouseholdmemberbutton = new IfbButton(driver, memberadditionalhouseholdmemberElement);

        @FindBy(xpath = "//*[@id=\"Member_FirstName\"]")
        private WebElement memberadditionalfirstnameElement;

        public IfbTextBox memberadditionalfirstnametextbox = new IfbTextBox(driver, memberadditionalfirstnameElement);

        @FindBy(xpath = "//*[@id=\"Member_LastName\"]")
        private WebElement memberadditionallastnameElement;

        public IfbTextBox memberadditionallastnametextbox = new IfbTextBox(driver, memberadditionallastnameElement);

        @FindBy(xpath = "//*[@id=\"Relationship\"]")
        private WebElement memberadditionalrelationElement;

        public IfbDropDown memberadditionalrelationdropdown = new IfbDropDown(driver, memberadditionalrelationElement);

        @FindBy(xpath = "//*[@id=\"submitAdd\"]")//*[@id="submitAdd"]
        private WebElement memberadditionaladdElement;

        public IfbButton memberadditionaladdbutton = new IfbButton(driver, memberadditionaladdElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/label/span")
        private WebElement memberadditionalmemberElement;

        public IfbCheckBox memberadditionalmembercheckbox = new IfbCheckBox(driver, memberadditionalmemberElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[1]/label/span[2]")
        private WebElement memberadditionalmemberfirsttimeattendingElement;


        public IfbCheckBox memberadditionalmemberfirsttimeattendingcheckbox = new IfbCheckBox(driver, memberadditionalmemberfirsttimeattendingElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[2]/label/span[2]")
        private WebElement memberadditionalmemberpreferrednamecheckElement;

        public IfbCheckBox memberadditonalmemberpreferrednamecheckbox = new IfbCheckBox(driver, memberadditionalmemberpreferrednamecheckElement);

        @FindBy(xpath = "//*[@id=\"Members_4__BadgeName\"]")
        private WebElement memberadditionalmemberpreferrednameElement;

        public IfbTextBox memberadditionalmemberpreferrednametextbox = new IfbTextBox(driver, memberadditionalmemberpreferrednameElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[3]/label/span[2]")
        private WebElement memberadditionalsuperqualElement;

        public IfbCheckBox memberadditionalsuperqualcheckbox = new IfbCheckBox(driver, memberadditionalsuperqualElement);

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        //*[@id="household-div"]/div[5]/div[2]/input
        private WebElement householdcontinueElement;

        public IfbButton householdcontinuebutton = new IfbButton(driver, householdcontinueElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div/div[1]/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement tsessionfirstattendeegoingElement;

        public IfbRadioButton tsessionfirstattendeegoingradiobutton = new IfbRadioButton(driver, tsessionfirstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div/div[1]/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement tsessionsecondattendeegoingElement;

        public IfbRadioButton tsessionsecondattendeegoingradiobutton = new IfbRadioButton(driver, tsessionsecondattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div/div[1]/div[3]/div[2]/div[4]/label[1]/span")
        private WebElement tsessionthirdattendeegoingElement;

        public IfbRadioButton tsessionthirdattendeegoingradiobutton = new IfbRadioButton(driver, tsessionthirdattendeegoingElement);


        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[4]/h5[2]/span[1]")

        //*[@id="step5-form"]/div[6]/div/div[1]/div[4]/h5[2]/span[1]
        private WebElement paidfunsessionElement;//*[@id="step5-form"]/div[3]/div[1]/div[4]/h5[2]/div/span


        public IfbButton paidfunsessionbutton = new IfbButton(driver, paidfunsessionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[2]/label/span[2]")
        private WebElement paidfunsessionfirstattendeegoingElement;

        public IfbCheckBox paidfunsessionfirstattendingcheckbox = new IfbCheckBox(driver, paidfunsessionfirstattendeegoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[3]/label/span[2]")
        private WebElement paidfunsessionsecondattendingElement;

        public IfbCheckBox paidfunsessionsecondattendingcheckbox = new IfbCheckBox(driver, paidfunsessionsecondattendingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[4]/label/span[2]")
        private WebElement paidfunsessionthirdattendingElement;

        public IfbCheckBox paidfunsessionthirdattendingcheckbox = new IfbCheckBox(driver, paidfunsessionthirdattendingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[5]/div/div[1]/input")
        private WebElement paidfunsessioncontributionElement;

        public IfbTextBox paidfunsessioncontributiontextbox = new IfbTextBox(driver, paidfunsessioncontributionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[4]/h5[2]/span[1]")
        private WebElement testsessionElement;

        public IfbButton testsessionbutton = new IfbButton(driver, testsessionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[2]/label/span[2]")
        private  WebElement testsessionfirstattendingElement;

        public IfbCheckBox testsessionfirstattendingcheckbox = new IfbCheckBox(driver, testsessionfirstattendingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[3]/label/span[2]")
        private WebElement testsessionsecondattendingElement;

        public IfbCheckBox testsessionsecondattendingcheckbox = new IfbCheckBox(driver, testsessionsecondattendingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[4]/label/span[2]")
        private WebElement testsessionthirdattendingElement;

        public IfbCheckBox testsessionthirdattendingcheckbox = new IfbCheckBox(driver, testsessionthirdattendingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[8]/div[2]/input")
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

        //*[@id="confirm-form"]/div[4]/div/div/label/span[1]

        public IfbButton confirmscreentermsbutton = new IfbButton(driver, confirmscreentermsElement);

        @FindBy(id = "submitBtn")
        private WebElement confirmscreencontinueElement;

        public IfbButton confirmscreencontinuebutton = new IfbButton(driver, confirmscreencontinueElement);

        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[3]/ul[1]/li[2]/a")
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
        private WebElement guestcountyElement;

        public IfbDropDown guestcountydropdown = new IfbDropDown(driver, guestcountyElement);

        @FindBy(xpath = "//*[@id=\"guestInfo\"]/form/div[4]/div/input")
        private WebElement guestcontinueElement;


        public IfbLink guestcontinuelink = new IfbLink(driver, guestcontinueElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[2]/div/div[1]/label/span[2]")
        private WebElement guestfirsttimeattendingElement;

        public IfbCheckBox guestfirsttimeattendingcheckbox = new IfbCheckBox(driver, guestfirsttimeattendingElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[2]/div/div[2]/label/span[2]")
        private WebElement guestbadgenamecheckElement;

        public IfbCheckBox guestbadgenamecheckbox = new IfbCheckBox(driver, guestbadgenamecheckElement);


        @FindBy(xpath = "//*[@id=\"Members_0__BadgeName\"]")


        private WebElement guestbadgenameElement;

        public IfbTextBox guestbadgenametextbox = new IfbTextBox(driver, guestbadgenameElement);

        @FindBy(xpath = "//*[@id=\"formContents\"]/div/div[2]/div/div[3]/label/span[2]")
        private WebElement guestsuperqualElement;

        public IfbCheckBox guestsuperqualcheckbox = new IfbCheckBox(driver, guestsuperqualElement);

        @FindBy(xpath = "//*[@id=\"addMemberBtn\"]")
        private WebElement guestaddhouseholdElement;

        public IfbButton guestaddhouseholdbutton = new IfbButton(driver, guestaddhouseholdElement);

        @FindBy(xpath = "//*[@id=\"Member_FirstName\"]")
        private WebElement guestaddhouseholdfirstnameElement;

        public IfbTextBox guestaddhouseholdfirstnametextbox = new IfbTextBox(driver, guestaddhouseholdfirstnameElement);

        @FindBy(xpath = "//*[@id=\"Member_LastName\"]" )
        private WebElement guestaddhouseholdlastnameElement;

        public IfbTextBox guestaddhouseholdlastnametextbox = new IfbTextBox(driver, guestaddhouseholdlastnameElement);

        @FindBy(xpath = "//*[@id=\"Relationship\"]")
        private WebElement guestaddhouseholdrelationshipElement;

        public IfbDropDown guestaddhouseholdrelationdropdown = new IfbDropDown(driver, guestaddhouseholdrelationshipElement);


        @FindBy(xpath = "//*[@id=\"submitAdd\"]")
        private WebElement guestaddhouseholdmemberElement;

        public IfbButton guestaddhouseholdmemberbutton = new IfbButton(driver, guestaddhouseholdmemberElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/label/span")
        private WebElement guestadditionalmember1Element;

        public IfbCheckBox guestadditionalmember1checkbox = new IfbCheckBox(driver, guestadditionalmember1Element);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[1]/label/span[2]")
        private WebElement guestadditionalmember1firsttimeattendingElement;

        public IfbCheckBox guestadditionalmember1firsttimeattendingcheckbox = new IfbCheckBox(driver, guestadditionalmember1firsttimeattendingElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[2]/label/span[2]")
        private WebElement guestadditionalmember1preferrednameElement;

        public IfbCheckBox guestadditionalmember1preferrednamecheckbox = new IfbCheckBox(driver, guestadditionalmember1preferrednameElement);

        @FindBy(xpath = "//*[@id=\"Members_1__BadgeName\"]")
        private WebElement guestadditionalmember1preferrednametextboxElement;

        public IfbTextBox guestadditionalmember1preferrednametextbox = new IfbTextBox(driver, guestadditionalmember1preferrednametextboxElement);

        @FindBy(xpath = "//*[@id=\"memberHolder\"]/div[2]/div[2]/div/div[3]/label/span[2]")
        private WebElement guestadditionalmember1superqualElement;

        public IfbCheckBox guestadditionalmmember1superqualcheckbox = new IfbCheckBox(driver, guestadditionalmember1superqualElement);

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        private WebElement guesthouseholdsubmitElement;

        public IfbButton guesthouseholdsubmitbutton = new IfbButton(driver, guesthouseholdsubmitElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div/div[1]/div[3]/div[2]/div[2]/label[1]/span")
        private WebElement guesttsessiongoingElement;

        public IfbCheckBox guesttsessiongoingcheckbox = new IfbCheckBox(driver, guesttsessiongoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[3]/div/div[1]/div[3]/div[2]/div[3]/label[1]/span")
        private WebElement guestadditionalmember1tsessiongoingElement;

        public IfbCheckBox guestadditionalmember1tsessiongoingcheckbox = new IfbCheckBox(driver, guestadditionalmember1tsessiongoingElement);


        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[4]/h5[2]/span[1]/span")
        private WebElement guestpaidfunsessionElement;

        public IfbButton guestpaidfunsessionbutton = new IfbButton(driver, guestpaidfunsessionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[2]/label/span[2]")
        private WebElement guestpaidfunsessiongoingElement;

        public IfbCheckBox guestpaidfunsessiongoingcheckbox = new IfbCheckBox(driver, guestpaidfunsessiongoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[3]/label/span[2]")
        private WebElement guestadditionalmember1paidfunsessiongoingElement;

        public IfbCheckBox guestadditionalmember1paidfunsessiongoingcheckbox = new IfbCheckBox(driver, guestadditionalmember1tsessiongoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[6]/div/div[1]/div[3]/div[2]/div[5]/div/div[1]/input")
        private WebElement guestpaidfunsessioncontributionElement;

        public IfbTextBox guestpaidfunsessioncontributiontextbox = new IfbTextBox(driver, guestpaidfunsessioncontributionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[4]/h5[2]/span[1]/span")
        private WebElement guesttestsessionElement;

        public IfbButton guesttestsessionbutton = new IfbButton(driver, guesttestsessionElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[2]/label/span[2]")
        private WebElement guesttestsessiongoingElement;

        public IfbCheckBox guesttestsessiongoingcheckbox = new IfbCheckBox(driver, guesttestsessiongoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[3]/label/span[2]")
        private WebElement guestadditionalmember1testsessiongoingElement;

        public IfbCheckBox guestadditionalmember1testsessiongoingcheckbox = new IfbCheckBox(driver, guestadditionalmember1testsessiongoingElement);

        @FindBy(xpath = "//*[@id=\"step5-form\"]/div[8]/div[2]/input")
        private WebElement guestsessionsubmitElement;

        public IfbButton guestsessionsubmitbutton = new IfbButton(driver, guestsessionsubmitElement);

        @FindBy(xpath = "//*[@id=\"confirm-form\"]/div[3]/div/div/label/span[2]")
        private WebElement guestconfirmtermsElement;

        public IfbCheckBox guestconfirmtermsccheckbox = new IfbCheckBox(driver, guestconfirmtermsElement);

        @FindBy(xpath = "//*[@id=\"submitBtn\"]")
        private WebElement guestconfirmsubmitElement;

        public IfbButton guestconfirmsubmitbutton = new IfbButton(driver, guestconfirmsubmitElement);



        @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div[4]/p/a")
        private WebElement updateregistrationElement;

        public IfbLink updateregistrationlink = new IfbLink(driver, updateregistrationElement);

        @FindBy(id = "ConfirmationNumber")
        private WebElement confirmationnumberElement;

        public IfbTextBox confirmationnumbettextbox = new IfbTextBox(driver, confirmationnumberElement);

        @FindBy(xpath = "//*[@id=\"update-form\"]/div[2]/div[2]/input")
        private WebElement updateregcontinueElement;

        public IfbButton updateregcontinuebutton = new IfbButton(driver, updateregcontinueElement);

        @FindBy(xpath = "//*[@id=\"household-div\"]/div[4]/div[1]/a[2]")
        //*[@id="household-div"]/div[4]/div[1]/a[2]
        //*[@id="update-form"]/div[2]/div[2]/input



        //*[@id="household-div"]/div[5]/div[1]/a[2]
        private WebElement cancelregistrationElement;


        public IfbButton cancelregistrationbutton = new IfbButton(driver, cancelregistrationElement);


        @FindBy(xpath = "//*[@id=\"cancelpopup\"]/div/div[3]/a[2]")
        //*[@id="cancelpopup"]/div/div[3]/a[2]

        private WebElement confirmcancelregistrationElement;

        public IfbButton confirmcancelregistrationbutton = new IfbButton(driver, confirmcancelregistrationElement);

        public EventRegistrationPage(WebDriver driver) {

            super(driver, SPINNER);
        }
    }


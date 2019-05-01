package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;
import org.junit.Test;


public class EventRegistrationGuestTest extends IfbIncorporatedTest {

                    @Test
                    public void eventregistrationtest(){
                        startEventReg();
                        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);

                        eventRegistrationPage. guestlink.safeClick();
                        eventRegistrationPage.guestfirstnametextbox.input("test");
                        eventRegistrationPage.guestlastnametextbox.input("test");
                        eventRegistrationPage.guestemailtextbox.input("test@example.com");
                        eventRegistrationPage.guestcountydropdown.select("Hamilton");
                        eventRegistrationPage.guestcountydropdown.waitThenClickSendKeys(10);
                        eventRegistrationPage.guestcontinuebutton.safeClick();
                        eventRegistrationPage.guestbadgenametextbox.clearTextBox();
                        eventRegistrationPage.guestbadgenametextbox.input("test");
                        eventRegistrationPage.guestcontinue1link.safeClick();
                        eventRegistrationPage.guesttermscheckbox.check();
                        eventRegistrationPage.guestregisterlink.safeClick();

                        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

//                        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");
//
//                        assertTrue(confirmationPage.confirmationNumber.isDisplayed());

                        System.out.println("hello");
                 }
    }



package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;


import org.junit.Test;



import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EventRegistrationTest extends IfbIncorporatedTest {

                    @Test
                    public void eventregistrationtest(){
                        startEventReg();
                        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);
                        eventRegistrationPage.membernoRadioButton.check();
                        eventRegistrationPage.firstNameTextField.input("test");
                        eventRegistrationPage.lastNameTextField.input("test");
                        eventRegistrationPage.emailTextField.input("test@example.com");
                        eventRegistrationPage.continueButton.safeClick();
                        eventRegistrationPage.firsttimeButton.safeClick();
                        eventRegistrationPage.contButton.safeClick();
                        eventRegistrationPage.termsButton.safeClick();
                        eventRegistrationPage.registerButton.safeClick();
                        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

                        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");
                        assertTrue(confirmationPage.confirmationNumber.isDisplayed());

                        System.out.println("hello");
                  }
    }



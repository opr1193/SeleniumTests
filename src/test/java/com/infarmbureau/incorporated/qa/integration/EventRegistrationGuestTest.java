package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EventRegistrationGuestTest extends IfbIncorporatedTest {

                    @Test
                    public void eventregistrationtest(){
                        startEventReg();
                        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);
                        eventRegistrationPage.guestlink.safeClick();
                        eventRegistrationPage.guestfirstnametextbox.input("Sree");
                        eventRegistrationPage.guestlastnametextbox.input("Balakrishna");
                        eventRegistrationPage.guestemailtextbox.input("sree.balakrishna@infb.com");
                        eventRegistrationPage.guestcountydropdown.select("Hamilton");
                        eventRegistrationPage.guestcontinuelink.safeClick();
                        eventRegistrationPage.guestfirsttimeattendingcheckbox.check();
                        eventRegistrationPage.guestbadgenamecheckbox.check();
                        eventRegistrationPage.guestbadgenametextbox.input("Sree Balakrishna");
                        eventRegistrationPage.guestsuperqualcheckbox.check();
                        eventRegistrationPage.guestaddhouseholdbutton.safeClick();
                        eventRegistrationPage.guestaddhouseholdfirstnametextbox.input("Sridhar");
                        eventRegistrationPage.guestaddhouseholdlastnametextbox.input("Balakrishna");
                        eventRegistrationPage.guestaddhouseholdrelationdropdown.select("Spouse");
                        eventRegistrationPage.guestaddhouseholdmemberbutton.safeClick();
                        eventRegistrationPage.guestadditionalmember1checkbox.waitForElementToBeVisible(30);
                        eventRegistrationPage.guestadditionalmember1checkbox.check();
                        eventRegistrationPage.guestadditionalmember1firsttimeattendingcheckbox.check();
                        eventRegistrationPage.guestadditionalmember1preferrednamecheckbox.check();
                        eventRegistrationPage.guestadditionalmember1preferrednametextbox.input("Sridhar Balakrishna");
                        eventRegistrationPage.guestadditionalmmember1superqualcheckbox.check();
                        eventRegistrationPage.guesthouseholdsubmitbutton.safeClick();
                        eventRegistrationPage.guesttsessiongoingcheckbox.check();
                        eventRegistrationPage.guestadditionalmember1tsessiongoingcheckbox.check();
                        eventRegistrationPage.guestpaidfunsessionbutton.safeClick();
                        eventRegistrationPage.guestpaidfunsessiongoingcheckbox.check();
                        eventRegistrationPage.guestadditionalmember1paidfunsessiongoingcheckbox.check();
                        eventRegistrationPage.guestpaidfunsessioncontributiontextbox.input("10");
                        eventRegistrationPage.guesttestsessionbutton.safeClick();
                        eventRegistrationPage.guesttestsessiongoingcheckbox.check();
                        eventRegistrationPage.guestadditionalmember1testsessiongoingcheckbox.check();
                        eventRegistrationPage.guestsessionsubmitbutton.safeClick();
                        eventRegistrationPage.guestconfirmtermsccheckbox.check();
                        eventRegistrationPage.guestconfirmsubmitbutton.safeClick();

                        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

                        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");


                        assertTrue(confirmationPage.confirmationNumber.isDisplayed());


                        String text = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[1]/div[1]/h2")).getText();

                        //*[@id="main"]/div/div/div[1]/div[1]/div[1]/h2

                        startEventReg();

                        eventRegistrationPage.updateregistrationlink.safeClick();

                        driver.findElement(By.xpath("//*[@id=\"ConfirmationNumber\"]")).sendKeys(text);

                        eventRegistrationPage.updateregcontinuebutton.safeClick();

                        eventRegistrationPage.cancelregistrationbutton.safeClick();

                        eventRegistrationPage.confirmcancelregistrationbutton.safeClick();

                        assertEquals(confirmationPage.cancellationTextField.getText(),"Registration Cancelled");

                        System.out.println("hello");









//
////
////                        eventRegistrationPage. guestlink.safeClick();
////                        eventRegistrationPage.guestfirstnametextbox.input("test");
////                        eventRegistrationPage.guestlastnametextbox.input("test");
////                        eventRegistrationPage.guestemailtextbox.input("test@example.com");
////                        eventRegistrationPage.guestcountydropdown.select("Hamilton");
////                        eventRegistrationPage.guestcountydropdown.waitThenClickSendKeys(10);
////                        eventRegistrationPage.guestcontinuebutton.safeClick();
////                        eventRegistrationPage.guestbadgenametextbox.clearTextBox();
////                        eventRegistrationPage.guestbadgenametextbox.input("test");
////                        eventRegistrationPage.guestcontinue1button.safeClick();
////                        eventRegistrationPage.guesttermscheckbox.check();
////                        eventRegistrationPage.guestregisterlink.safeClick();

//
//                        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
//
////                        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");
////
////                        assertTrue(confirmationPage.confirmationNumber.isDisplayed());


                 }
    }



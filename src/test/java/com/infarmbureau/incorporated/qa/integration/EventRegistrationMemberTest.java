package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EventRegistrationMemberTest extends IfbIncorporatedTest {

    @Test
    public void eventregistrationtest() {
        startEventReg();
        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);

        eventRegistrationPage.memberfirstnametextbox.input("Mark");
        eventRegistrationPage.memberlastnametextbox.input("Wetzel");
        eventRegistrationPage.memberzipcodetextbox.input("47164");
        eventRegistrationPage.membernumbertextbox.input("0002516746");
        eventRegistrationPage.membercontinuebutton.safeClick();
        eventRegistrationPage.firstattendingcheckbox.check();
        eventRegistrationPage.seconattendingcheckbox.check();
        eventRegistrationPage.firstfirsttimeattendingcheckbox.check();
        eventRegistrationPage.secondfirsttimeattendingcheckbox.check();
        eventRegistrationPage.householdcontinuebutton.safeClick();
        eventRegistrationPage.session1firstattendeegoingradiobutton.safeClick();
        eventRegistrationPage.session1secondattendeegoingradiobutton.safeClick();
        eventRegistrationPage.session2textboxbutton.safeClick();
        eventRegistrationPage.session2textboxinputtextbox.input("0");
        eventRegistrationPage.session3firstattendeegoingcheckbox.check();
        eventRegistrationPage.session3secondattendeegoingcheckbox.check();
        eventRegistrationPage.session4firstattendeegoingcheckbox.check();
        eventRegistrationPage.session4secondattendeegoingcheckbox.check();
        eventRegistrationPage.session5firstattendeegoingcheckbox.check();
        eventRegistrationPage.session5secondattendeegoingcheckbox.check();
        eventRegistrationPage.session6firstattendeenotgoingcheckbox.check();
        eventRegistrationPage.session6secondattendeenotgoingcheckbox.check();
        eventRegistrationPage.session7firstattendeegoingcheckbox.check();
        eventRegistrationPage.session7secondattendeegoingcheckbox.check();
        eventRegistrationPage.session8link.safeClick();
        eventRegistrationPage.session8firstattendeecheckbox.check();
        eventRegistrationPage.session8secondattendeecheckbox.check();
        eventRegistrationPage.selectsessioncontinuebutton.safeClick();
//                        eventRegistrationPage.firstattendeeemailtextbox.input("amy.wetzel@example.com");
//                        eventRegistrationPage.secondattendeeemailtextbox.input("Mark.Wetzel@example.com");
        eventRegistrationPage.confirmscreentermscheckbox.check();
        eventRegistrationPage.confirmscreencontinuebutton.safeClick();
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");


        assertTrue(confirmationPage.confirmationNumber.isDisplayed());


        String text = driver.findElement(By.xpath("//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h2")).getText();

        startEventReg();

        eventRegistrationPage.updateregistrationlink.safeClick();
//
        driver.findElement(By.xpath("//*[@id=\"ConfirmationNumber\"]")).sendKeys(text);

        eventRegistrationPage.updateregcontinuebutton.safeClick();

        eventRegistrationPage.cancelregistrationbutton.safeClick();

        eventRegistrationPage.confirmcancelregistrationbutton.safeClick();

       




        System.out.println("hello");


    }
}



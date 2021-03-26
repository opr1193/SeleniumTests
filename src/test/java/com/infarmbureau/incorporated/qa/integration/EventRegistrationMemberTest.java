package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EventRegistrationMemberTest extends IfbIncorporatedTest {

    @Test
    public void eventregistrationtest() throws InterruptedException {
        startEventReg();
        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);

        eventRegistrationPage.memberfirstnametextbox.input("Michael");
        eventRegistrationPage.memberlastnametextbox.input("Taylor");
        eventRegistrationPage.memberzipcodetextbox.input("47501");
        eventRegistrationPage.membernumbertextbox.input("0002009802");
//        eventRegistrationPage.membercontinuebutton.safeClick();
        WebElement continuebtn = driver.findElement(By.xpath("//*[@id=\"MemberInfo_MemberNumber\"]"));
        continuebtn.submit();
        eventRegistrationPage.firstattendingcheckbox.check();
        eventRegistrationPage.seconattendingcheckbox.check();
        eventRegistrationPage.firstfirsttimeattendingcheckbox.check();
        eventRegistrationPage.firstpreferrednamecheckbox.check();
        eventRegistrationPage.firstpreferrednametextbox.input("C Taylor");
        eventRegistrationPage.firstsuperqualcheckbox.check();
        eventRegistrationPage.secondfirsttimeattendingcheckbox.check();
        eventRegistrationPage.secondpreferrednamecheckbox.check();
        eventRegistrationPage.secondpreferrednametextbox.input("Julie Taylor");
        eventRegistrationPage.secondsuperqualcheckbox.check();
//        eventRegistrationPage.memberadditionalhouseholdmemberbutton.safeClick();
//        eventRegistrationPage.memberadditionalfirstnametextbox.input("Kathie");
//        eventRegistrationPage.memberadditionallastnametextbox.input("Taylor");
//        eventRegistrationPage.memberadditionalrelationdropdown.select("Child");
//        eventRegistrationPage.memberadditionaladdbutton.safeClick();
//        eventRegistrationPage.memberadditionalmembercheckbox.check();
//        eventRegistrationPage.memberadditionalmemberfirsttimeattendingcheckbox.check();
//        eventRegistrationPage.memberadditonalmemberpreferrednamecheckbox.check();
//        eventRegistrationPage.memberadditionalmemberpreferrednametextbox.input("Kathie Taylor");
//        eventRegistrationPage.memberadditionalsuperqualcheckbox.check();
        eventRegistrationPage.householdcontinuebutton.safeClick();
        eventRegistrationPage.tsessionfirstattendeegoingradiobutton.safeClick();
        eventRegistrationPage.tsessionsecondattendeegoingradiobutton.safeClick();
//        eventRegistrationPage.tsessionthirdattendeegoingradiobutton.safeClick();
        eventRegistrationPage.paidfunsessionbutton.safeClick();
        eventRegistrationPage.paidfunsessionfirstattendingcheckbox.check();
        eventRegistrationPage.paidfunsessionsecondattendingcheckbox.check();
//        eventRegistrationPage.paidfunsessionthirdattendingcheckbox.check();
        eventRegistrationPage.paidfunsessioncontributiontextbox.input("15");
        eventRegistrationPage.testsessionbutton.safeClick();
        eventRegistrationPage.testsessionfirstattendingcheckbox.check();
        eventRegistrationPage.testsessionsecondattendingcheckbox.check();
//        eventRegistrationPage.testsessionthirdattendingcheckbox.check();
        WebElement continuebtn1 = driver.findElement(By.xpath("//*[@id=\"step5-form\"]/div[7]/div/div[1]/div[3]/div[2]/div[3]/label/span[2]"));
        continuebtn1.submit();

        eventRegistrationPage.secondattendeeemailtextbox.input("Kathie@example.com");
        Thread.sleep(1000);

        eventRegistrationPage.confirmscreentermsbutton.safeClick();
//        WebElement continuebtn2 = driver.findElement(By.xpath("//*[@id=\"confirm-form\"]/div[5]/div/div/label/span[2]"));
//        continuebtn2.submit();
//        eventRegistrationPage.selectsessioncontinuebutton.safeClick();
        eventRegistrationPage.confirmscreencontinuebutton.safeClick();


        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");


        assertTrue(confirmationPage.confirmationNumber.isDisplayed());


        String text = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[1]/div[1]/h2")).getText();

        //*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h2

        startEventReg();

        eventRegistrationPage.updateregistrationlink.safeClick();

        driver.findElement(By.xpath("//*[@id=\"ConfirmationNumber\"]")).sendKeys(text);



        eventRegistrationPage.updateregcontinuebutton.safeClick();

        eventRegistrationPage.cancelregistrationbutton.safeClick();

        eventRegistrationPage.confirmcancelregistrationbutton.safeClick();

        assertEquals(confirmationPage.cancellationTextField.getText(),"Registration Cancelled");



       //System.out.println("hello");


    }
}



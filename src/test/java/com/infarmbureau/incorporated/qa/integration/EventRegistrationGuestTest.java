package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventRegistration.ConfirmationPage;
import com.infarmbureau.incorporated.test.pages.EventRegistration.EventRegistrationPage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EventRegistrationGuestTest extends IfbIncorporatedTest {

    @Ignore
    public void eventRegistrationTest() throws InterruptedException {
        startEventReg();
        EventRegistrationPage eventRegistrationPage = new EventRegistrationPage(driver);
        eventRegistrationPage.guestlink.safeClick();
        eventRegistrationPage.guestfirstnametextbox.input("Test");
        eventRegistrationPage.guestlastnametextbox.input("Test");
        eventRegistrationPage.guestemailtextbox.input("sree.balakrishna@infb.com");
        eventRegistrationPage.guestcountydropdown.select("Hamilton");

        WebElement continuebtn = driver.findElement(By.xpath("//*[@id=\"GuestInfo_CountyName\"]"));
        continuebtn.submit();


        eventRegistrationPage.guestfirsttimeattendingcheckbox.check();
        eventRegistrationPage.guestbadgenamecheckbox.check();
        Thread.sleep(1000);
        eventRegistrationPage.guestbadgenametextbox.input("Sree Test");
        eventRegistrationPage.guestsuperqualcheckbox.check();
        eventRegistrationPage.guestaddhouseholdbutton.safeClick();
        eventRegistrationPage.guestaddhouseholdfirstnametextbox.input("Sridhar");
        eventRegistrationPage.guestaddhouseholdlastnametextbox.input("Balakrishna");
        eventRegistrationPage.guestaddhouseholdrelationdropdown.select("Spouse");
        eventRegistrationPage.guestaddhouseholdmemberbutton.safeClick();
        eventRegistrationPage.guestadditionalmember1checkbox.waitForElementToBeVisible(30);
        eventRegistrationPage.guestadditionalmember1checkbox.check();

        eventRegistrationPage.guesthouseholdsubmitbutton.safeClick();
        Thread.sleep(2000);
        eventRegistrationPage.guesttsessiongoingcheckbox.safeClick();
        eventRegistrationPage.guestadditionalmember1testsessiongoingcheckbox.safeClick();
        eventRegistrationPage.guestpaidfunsessionbutton.safeClick();

        eventRegistrationPage.guesttsessiongoingcheckbox.check();

        eventRegistrationPage.guestpaidfunsessiongoingcheckbox.check();

        eventRegistrationPage.guestpaidfunsessioncontributiontextbox.input("10");
        eventRegistrationPage.guesttestsessionbutton.safeClick();
        eventRegistrationPage.guesttestsessiongoingcheckbox.check();

        eventRegistrationPage.guestsessionsubmitbutton.safeClick();
        eventRegistrationPage.guestconfirmtermsccheckbox.check();
        eventRegistrationPage.guestconfirmsubmitbutton.safeClick();

        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

        assertEquals(confirmationPage.confirmationTextField.getText(), "YOUR CONFIRMATION NUMBER IS");


        assertTrue(confirmationPage.confirmationNumber.isDisplayed());


        String text = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[1]/div[1]/h2")).getText();



        startEventReg();

        eventRegistrationPage.updateregistrationlink.safeClick();

        driver.findElement(By.xpath("//*[@id=\"ConfirmationNumber\"]")).sendKeys(text);

        eventRegistrationPage.updateregcontinuebutton.safeClick();

        eventRegistrationPage.cancelregistrationbutton.safeClick();

        eventRegistrationPage.confirmcancelregistrationbutton.safeClick();

        assertEquals(confirmationPage.cancellationTextField.getText(), "Registration Cancelled");

        System.out.println("hello");




    }

    private JavascriptExecutor JavascriptExecutor(WebDriver driver) {
        return null;
    }
}



package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.AboutPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutTest extends IfbIncorporatedTest {

    @Test
    public void aboutTest() throws InterruptedException {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("JoniLinville");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.safeClick();

        AboutPage aboutPage = new AboutPage(driver);

        aboutPage.aboutlink.safeClick();

        aboutPage.missionlink.safeClick();

        aboutPage.leadershiplink.safeClick();

        Thread.sleep(1000);

        aboutPage.randylink.safeClick();

        aboutPage.kendelllink.safeClick();

        aboutPage.isabellalink.safeClick();

        aboutPage.marklink.safeClick();

        aboutPage.boardofdirectorslink.safeClick();

        aboutPage.districtlink.safeClick();

        driver.navigate().back();

        Thread.sleep(1000);

        aboutPage.youngfarmerslink.safeClick();


        aboutPage.collegiatelink.safeClick();

        aboutPage.awardslink.safeClick();

        aboutPage.activitieslink.safeClick();

        aboutPage.infb100link.safeClick();

        aboutPage.aboutlink.safeClick();

        Thread.sleep(1000);

        aboutPage.stafflink.safeClick();

        aboutPage.adminlink.safeClick();

        aboutPage.legallink.safeClick();

        aboutPage.organisationlink.safeClick();

        aboutPage.publiclink.safeClick();

        aboutPage.marketinglink.safeClick();

        aboutPage.aboutlink.safeClick();
        aboutPage.countylink.safeClick();

        aboutPage.historylink.safeClick();


        aboutPage.historyonelink.safeClick();
        driver.navigate().back();


        aboutPage.ifbadvocacylink.safeClick();
        driver.navigate().back();



        aboutPage.ifbwomenlink.safeClick();

        driver.navigate().back();


        aboutPage.ifbyouthlink.safeClick();

        driver.navigate().back();

        aboutPage.datesofinclink.safeClick();

        aboutPage.ifbpastlink.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.contactlink.safeClick();
        aboutPage.contactuslink.safeClick();

        aboutPage.type.safeClick();
        WebElement contactuslistelement = driver.findElement(By.xpath("/html/body/div[9]/ul"));
        Actions contactuslistaction = new Actions(driver);
        contactuslistaction.moveToElement(contactuslistelement).build().perform();
        Thread.sleep(1000);
        WebElement paymembershipelement = driver.findElement(By.xpath("/html/body/div[8]/ul/li[2]"));
        Actions paymembershipaction = new Actions(driver);
        paymembershipaction.moveToElement(paymembershipelement).build().perform();
        Thread.sleep(1000);
        paymembershipelement.click();

        aboutPage.type.safeClick();
        contactuslistaction.moveToElement(contactuslistelement).build().perform();
        Thread.sleep(1000);
        WebElement joininfbelement = driver.findElement(By.xpath("/html/body/div[8]/ul/li[3]"));
        Actions joininfbaction = new Actions(driver);
        joininfbaction.moveToElement(joininfbelement).build().perform();
        Thread.sleep(1000);
        joininfbelement.click();
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.safeClick();
        WebElement prefcontelement = driver.findElement(By.xpath("/html/body/div[12]/ul"));
        Actions prefcontaction = new Actions(driver);
        prefcontaction.moveToElement(prefcontelement).build().perform();
        Thread.sleep(1000);
        WebElement emailelement = driver.findElement(By.xpath("/html/body/div[11]/ul/li[3]"));
        Actions emailaction = new Actions(driver);
        emailaction.moveToElement(emailelement).build().perform();
        emailelement.click();
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        System.out.println("hello");


    }

    private void assertEquals(String text, String logout_successful) {
    }
}
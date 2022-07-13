package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.MembershipPage;
import org.junit.Ignore;
import org.junit.Test;

public class MembershipTest extends IfbIncorporatedTest {

    @Test
    public void membershipTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.membershiplink.safeClick();

        MembershipPage membershipPage = new MembershipPage(driver);

        membershipPage.becomeamemberlink.waitForElementToBeVisible(100);

        membershipPage.becomeamemberlink.safeClick();

        membershipPage.countyfarmbureaulink.waitForElementToBeVisible(100);

        membershipPage.countyfarmbureaulink.safeClick();

        membershipPage.membershiplink.waitForElementToBeVisible(100);

        membershipPage.membershiplink.safeClick();

        membershipPage.infbexpertlink.waitForElementToBeVisible(200);

        membershipPage.infbexpertlink.safeClick();

        membershipPage.infbinsurancelink.waitForElementToBeVisible(100);

        membershipPage.infbinsurancelink.safeClick();

        membershipPage.membershipsweepstakeslink.waitForElementToBeVisible(100);

        membershipPage.membershipsweepstakeslink.safeClick();

        membershipPage.mymemberdealslink.waitForElementToBeVisible(100);

        membershipPage.mymemberdealslink.safeClick();

//        membershipPage.abenitylink.safeClick();
//
//        driver.navigate().back();

        //membershipPage.renewyourmembershiplink.safeClick();

        //homePage.logoutlink.waitAndClick();
//
//          logoutPage = new LogoutPage(driver);
//        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");



    }
}

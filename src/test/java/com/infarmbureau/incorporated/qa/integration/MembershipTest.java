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

        membershipPage.becomeamemberlink.safeClick();

        membershipPage.countyfarmbureaulink.safeClick();

        homePage.membershiplink.safeClick();
        membershipPage.infbexpertlink.safeClick();

        membershipPage.infbinsurancelink.safeClick();

        membershipPage.membershipsweepstakeslink.safeClick();

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

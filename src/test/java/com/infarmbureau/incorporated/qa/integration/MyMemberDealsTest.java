package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMemberDealsTest extends IfbIncorporatedTest {

    @Test
    public void myMemberDealsTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginButton.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.mymemberdealslink.safeClick();

        homePage.logoutlink.waitAndClick();

        LogoutPage logoutPage = new LogoutPage(driver);
        assertEquals(logoutPage.logoutlabel.getText(), "Logout successful");
    }
}


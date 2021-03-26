package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.MyAccountPage;
import org.junit.Ignore;
import org.junit.Test;

public class MyAccountTest extends IfbIncorporatedTest {

    @Test
    public void myAccountTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Jonilinville");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.eventslink.safeClick();

        homePage.myAccountlink.safeClick();







    }
}
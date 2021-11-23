package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginLogoutTest extends IfbIncorporatedTest {

    @Ignore
    public void loginlogouttest() {
        start();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyork");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.safeClick();
        homePage.logoutlink.safeClick();

//       LogoutPage logoutPage = new LogoutPage(driver);
//        assertEquals(logoutPage.logoutlabel.getText(),"Logout successfully");
//        System.out.println("hello");

    }
}

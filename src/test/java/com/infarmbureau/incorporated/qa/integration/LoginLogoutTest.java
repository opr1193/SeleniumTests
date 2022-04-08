package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginLogoutTest extends IfbIncorporatedTest {

    @Test
    public void loginlogouttest() {
        start();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();
        homePage.logoutlink.waitForElementToBeVisible(2000);
        homePage.logoutlink.safeClick();

//       LogoutPage logoutPage = new LogoutPage(driver);
//        assertEquals(logoutPage.logoutlabel.getText(),"Logout successfully");
        System.out.println("hello");

    }
}

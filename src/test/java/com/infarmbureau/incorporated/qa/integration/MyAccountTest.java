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
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.myaccountlink.waitForElementToBeVisible(200);
        homePage.myaccountlink.safeClick();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.viewmembershipcardlink.waitForElementToBeVisible(200);
        myAccountPage.viewmembershipcardlink.safeClick();
        myAccountPage.gopaperlessbutton.safeClick();
        System.out.println("hello");


    }
}

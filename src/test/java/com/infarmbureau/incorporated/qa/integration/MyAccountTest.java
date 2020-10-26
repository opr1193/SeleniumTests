package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.MyAccount.MyAccountPage;
import org.junit.Ignore;
import org.junit.Test;

public class MyAccountTest extends IfbIncorporatedTest {

    @Ignore
    public void myAccountTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.myAccountlink.safeClick();

        MyAccountPage MyAccountPage = new  MyAccountPage(driver);

        MyAccountPage.myprofilelink.safeClick();

        MyAccountPage.printmembershipcardlink.safeClick();

        MyAccountPage.contactuslink.safeClick();

        MyAccountPage.myprofilelink.safeClick();





    }
}
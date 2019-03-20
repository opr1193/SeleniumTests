package com.infarmbureau.incorporated.qa.integration.authentication;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import com.infarmbureau.incorporated.test.pages.MyAccount.MyAccountPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAccountTest extends IfbIncorporatedTest {

    @Test
    public void myAccountTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginButton.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.myAccountlink.safeClick();

        MyAccountPage MyAccountPage = new  MyAccountPage(driver);

        MyAccountPage.myprofilelink.safeClick();

        MyAccountPage.printmembershipcardlink.safeClick();

        MyAccountPage.contactuslink.safeClick();

        MyAccountPage.myprofilelink.safeClick();





    }
}
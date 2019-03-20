package com.infarmbureau.incorporated.qa.integration.authentication;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import com.infarmbureau.incorporated.test.pages.OurPrograms.OurProgramsPage;
import com.infarmbureau.incorporated.test.pages.PublicPolicy.PublicPolicyPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicPolicyTest extends IfbIncorporatedTest {

    @Test
    public void publicpolicyTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginButton.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.publicpolicylink.safeClick();

        PublicPolicyPage publicPolicyPage = new PublicPolicyPage(driver);

        publicPolicyPage.nationalissueslink.safeClick();

        publicPolicyPage.stateissueslink.safeClick();

        publicPolicyPage.localissueslink.safeClick();

        publicPolicyPage.takeactionlink.safeClick();

        publicPolicyPage.policydevelopmentlink.safeClick();

        homePage.logoutlink.waitAndClick();

        LogoutPage logoutPage = new LogoutPage(driver);
        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");
}
}
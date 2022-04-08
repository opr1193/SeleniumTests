package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import com.infarmbureau.incorporated.test.pages.PublicPolicyPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicPolicyTest extends IfbIncorporatedTest {

    @Ignore
    public void publicpolicyTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.publicpolicylink.safeClick();

        PublicPolicyPage publicPolicyPage = new PublicPolicyPage(driver);

        publicPolicyPage.nationalissueslink.safeClick();

        publicPolicyPage.stateissueslink.safeClick();

        publicPolicyPage.localissueslink.safeClick();

        publicPolicyPage.Indianatownshipmaplink.safeClick();

        driver.navigate().back();

        publicPolicyPage.waterlink.safeClick();

        publicPolicyPage.takeactionlink.safeClick();

        publicPolicyPage.lookupcandidatelink.safeClick();

        driver.navigate().back();

        publicPolicyPage.policydevelopmentlink.safeClick();

        publicPolicyPage.policydevelopmentresourceslink.safeClick();

        publicPolicyPage.policyrecommendationformlink.safeClick();

        driver.navigate().back();

        publicPolicyPage.policyimplementationlink.safeClick();

        driver.navigate().back();

        driver.navigate().back();

        publicPolicyPage.policyactioncommitteeslink.safeClick();

        publicPolicyPage.donatetoagelectlink.safeClick();

        publicPolicyPage.donatenowlink.safeClick();

        publicPolicyPage.agelectdisclaimerlink.safeClick();

        driver.navigate().back();

        driver.navigate().back();

        driver.navigate().back();

        publicPolicyPage.INFB100link.safeClick();


        homePage.logoutlink.waitAndClick();

//        LogoutPage logoutPage = new LogoutPage(driver);
//        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");
}
}
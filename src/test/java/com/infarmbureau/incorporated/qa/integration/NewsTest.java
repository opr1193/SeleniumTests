package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import com.infarmbureau.incorporated.test.pages.NewsPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewsTest extends IfbIncorporatedTest {

    @Ignore
    public void newsTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.newslink.safeClick();

        NewsPage newsPage = new NewsPage(driver);

        newsPage.ifbinthenewslink.safeClick();

        newsPage.newsreleaseslink.safeClick();

        newsPage.publicationslink.safeClick();


        newsPage.mediacontactonformationlink.safeClick();

        newsPage.socialmedialink.safeClick();


        homePage.logoutlink.waitAndClick();

        LogoutPage logoutPage = new LogoutPage(driver);
        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");
    }
}
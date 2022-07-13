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

    @Test
    public void newsTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.newslink.safeClick();

        NewsPage newsPage = new NewsPage(driver);

        newsPage.ifbinthenewslink.safeClick();

        newsPage.newsreleaseslink.waitForElementToBeVisible(100);

        newsPage.newsreleaseslink.safeClick();

        newsPage.publicationslink.waitForElementToBeVisible(100);

        newsPage.publicationslink.safeClick();

        newsPage.mediacontactonformationlink.waitForElementToBeVisible(100);


        newsPage.mediacontactonformationlink.safeClick();

        newsPage.socialmedialink.waitForElementToBeVisible(100);

        newsPage.socialmedialink.safeClick();


        //homePage.logoutlink.waitAndClick();

       //LogoutPage logoutPage = new LogoutPage(driver);
//assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");
    }
}

package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.AboutPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.SearchPage;
import org.junit.Ignore;
import org.junit.Test;

import javax.sound.midi.ShortMessage;

public class SearchTest extends IfbIncorporatedTest {

    @Test
    public void searchTest() throws InterruptedException {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        SearchPage searchPage = new SearchPage(driver);

        searchPage.searchdropdown.waitForElementToBeVisible(100);
        searchPage.searchdropdown.safeClick();
        searchPage.searchboxlink.waitForElementToBeVisible(100);
        searchPage.searchboxlink.input("Membership");
        searchPage.searchdropdown.safeClick();
        searchPage.searchlinklink.safeClick();
        searchPage.searchresultclicklink.waitForElementToBeVisible(100);
        searchPage.searchresultclicklink.safeClick();

        HomePage homePage = new HomePage(driver);

        homePage.logoutlink.safeClick();



    }

//    private void assertEquals(String text, String logout_successful)
   {
    }
}

package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EventsPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventsTest extends IfbIncorporatedTest {

                    @Ignore
                    public void eventsTest() {
                        start();
                        //LoginPage loginPage = new LoginPage(driver);
                        //loginPage.usernameTextField.input("Markyork");
                        //loginPage.passwordTextField.input("testing15");
                        //loginPage.loginLink.safeClick();

                        HomePage homePage = new HomePage(driver);
                        homePage.eventslink.safeClick();



                        EventsPage eventsPage = new EventsPage(driver);
                        eventsPage.stateconventionlink.safeClick();
                        driver.navigate().back();
                        //homePage.logoutlink.safeClick();


                        //LogoutPage logoutPage = new LogoutPage(driver);
                        //assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");


    }
}



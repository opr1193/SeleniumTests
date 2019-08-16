package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.AboutPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AboutTest extends IfbIncorporatedTest {

    @Ignore
    public void aboutTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markwetzel");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginButton.safeClick();

        AboutPage aboutPage = new AboutPage(driver);

        aboutPage.aboutlink.safeClick();

        aboutPage.missionlink.safeClick();

        aboutPage.leadershiplink.safeClick();

        aboutPage.randylink.safeClick();

        aboutPage.kendelllink.safeClick();

        aboutPage.isabellalink.safeClick();

        aboutPage.marklink.safeClick();

        aboutPage.boardofdirectorslink.safeClick();

        aboutPage.districtlink.safeClick();

        driver.navigate().back();

        aboutPage.youngfarmerslink.safeClick();

        aboutPage.stateyounglink.safeClick();

        aboutPage.collegiatelink.safeClick();

        aboutPage.awardslink.safeClick();

        aboutPage.activitieslink.safeClick();

        aboutPage.infb100link.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.stafflink.safeClick();

        aboutPage.adminlink.safeClick();

        aboutPage.legallink.safeClick();

        aboutPage.organisationlink.safeClick();

        aboutPage.publiclink.safeClick();

        aboutPage.marketinglink.safeClick();

        aboutPage.regionallink.safeClick();

        aboutPage.countylink.safeClick();

        aboutPage.historylink.safeClick();

        aboutPage.ifbhundredlink.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.historyonelink.safeClick();

        aboutPage.ifbadvocacylink.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.historyonelink.safeClick();

        aboutPage.ifbwomenlink.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.historyonelink.safeClick();

        aboutPage.ifbyouthlink.safeClick();

        aboutPage.aboutlink.safeClick();

        aboutPage.historyonelink.safeClick();

        aboutPage.ifbpastlink.safeClick();

        aboutPage.aboutlink.safeClick();

        /*aboutPage.careerslink.safeClick();*/



        /*aboutPage.contacttlink.safeClick();*/

        aboutPage.contactlink.safeClick();
        aboutPage.contactuslink.safeClick();

        aboutPage.type.select("Member Benefits");


        aboutPage.type.select("Pay Membership");

        aboutPage.type.select("Join INFB");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();

        aboutPage.type.select("Member Benefits");
        aboutPage.memberbenefits.select("Questions about Benefits");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();

        aboutPage.type.select("Login Help");
        aboutPage.loginhelptype.select("Reset Password");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();


        aboutPage.type.select("Login Help");
        aboutPage.loginhelptype.select("Forgot Username");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();


        aboutPage.type.select("Login Help");
        aboutPage.loginhelptype.select("Trouble Logging In");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();




        aboutPage.type.select("Login Help");
        aboutPage.loginhelptype.select("Other");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.comments.input("test");
        aboutPage.submit.safeClick();

        driver.navigate().back();


        aboutPage.type.select("Registration Help");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.description.input("test");
        aboutPage.submit.safeClick();


        aboutPage.type.select("Ag in the Classroom (AITC)");
        aboutPage.firstname.input("Mark");
        aboutPage.lastname.input("Wetzel");
        aboutPage.contacted.select("Email");
        aboutPage.emailinput.input("Mark.Wetzel@example.com");
        aboutPage.membershipnumber.input("0002516746");
        aboutPage.username.input("markwetzel");
        aboutPage.description.input("test");
        aboutPage.submit.safeClick();


        HomePage homePage = new HomePage(driver);
        homePage.logoutlink.waitForElementToBeVisible(20);
        homePage.logoutlink.safeClick();

        LogoutPage logoutPage = new LogoutPage(driver);
        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");

    }
}
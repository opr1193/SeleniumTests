package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.LogoutPage;
import com.infarmbureau.incorporated.test.pages.OurProgramsPage;
import org.junit.Ignore;
import org.junit.Test;

public class OurProgramsTest extends IfbIncorporatedTest {

    @Test
    public void ourprogramsTest() {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Jonilinville");
        loginPage.passwordTextField.input("testing15");
        loginPage.loginLink.waitForElementToBeVisible(10);
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        homePage.ourprogramslink.safeClick();

        OurProgramsPage ourProgramsPage = new OurProgramsPage(driver);

        ourProgramsPage.agintheclassroomlink.safeClick();

        ourProgramsPage.classroomcenterlink.safeClick();

        ourProgramsPage.accurateagribookslink.safeClick();

        ourProgramsPage.additionallink.safeClick();

        ourProgramsPage.AITCteacherregistrationlink.safeClick();

        ourProgramsPage.teachernametextbox.input("test");

        ourProgramsPage.teacheremailtextbox.input("test@example.com");

        ourProgramsPage.nametextbox.input("test");

        ourProgramsPage.addresstextbox.input("test");

        ourProgramsPage.citytextbox.input("test");

        ourProgramsPage.statedropdown.select("IN");

        ourProgramsPage.zipcodetextbox.input("46038");

        ourProgramsPage.schoolcountydropdown.select("Hamilton");

        ourProgramsPage.schoolyeartextbox.input("2019");

        ourProgramsPage.currentgradecheckbox.safeClick();

        ourProgramsPage.departmentcheckbox.safeClick();

        ourProgramsPage.noofstudentstextbox.input("100");

        ourProgramsPage.agrithemebooksdropdown.select("No");

        ourProgramsPage.aitcvolunteerdropdown.select("No");

        ourProgramsPage.studentsagrithemedropdown.select("No");

        ourProgramsPage.volunteerregisterlink.safeClick();

//        ourProgramsPage.studentcenterlink.safeClick();

//        ourProgramsPage.volunteercenterlink.safeClick();

//        ourProgramsPage.volunteerreportlink.safeClick();
//
//        ourProgramsPage.volunteeremailtextbox.input("mark.wetzel@example.com");
//
//        ourProgramsPage.membercountydropdown.select("Clark");
//
//        ourProgramsPage.presentationnametextbox.input("test presentation");
//
//        ourProgramsPage.presentationdatetextbox.input("03/11/2019");
//
//        ourProgramsPage.presentationlocationtextbox.input("test location");
//
//        ourProgramsPage.singlegradelevelpresentationdropdown.select("Yes");
//
//        ourProgramsPage.gradeofaudiencedropdown.select("6");
//
//        ourProgramsPage.numberofstudentstextbox.input("100");
//
//        ourProgramsPage.numberofadultsdropdown.select("6");
//
//        ourProgramsPage.lengthofpresentationdropdown.select("30+ minutes");
//
//        ourProgramsPage.numberofteachersdropdown.select("0");
//
//        ourProgramsPage.handsonactivitydropdown.select("No");
//
//        ourProgramsPage.agbookdropdown.select("No");
//
//       ourProgramsPage.teachersmaterialsdropdown.select("No");
//
//        ourProgramsPage.agribusinessdropdown.select("No");
//
//        ourProgramsPage.agridonationdropdown.select("No");
//
//        ourProgramsPage.membercommentstextbox.input("test");
//
//        ourProgramsPage.volunteersubmitlink.safeClick();
//
//        ourProgramsPage.leadersinactionlink.safeClick();
//
//        ourProgramsPage.womenleadershipcommitteelink.safeClick();
//
//        ourProgramsPage.youngfarmerslink.safeClick();
//

        homePage.logoutlink.waitAndClick();

        LogoutPage logoutPage = new LogoutPage(driver);
         }


}

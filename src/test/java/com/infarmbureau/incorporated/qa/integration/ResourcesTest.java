package com.infarmbureau.incorporated.qa.integration;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.*;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class    ResourcesTest  extends IfbIncorporatedTest {

    @Test
    public void resourcesTest() throws InterruptedException {
        start();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameTextField.input("Markyorkmark");
        loginPage.passwordTextField.input("testing22");
        loginPage.loginLink.safeClick();

        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.resourceslink.safeClick();
        ResourcesPage resourcesPage = new ResourcesPage(driver);
        resourcesPage.agintheclassroomlink.safeClick();
        Thread.sleep(2000);
        resourcesPage.classroomcenterlink.safeClick();
        resourcesPage.accurateagbooklink.safeClick();
        resourcesPage.additionallinks.safeClick();
        resourcesPage.AITClink.safeClick();
        resourcesPage.AITCteachernametextbox.input("Sara");
        resourcesPage.AITCteacheremailtextbox.input("Sara@example.com");
        resourcesPage.AITCschoolnametextbox.input("LadyBird");
        resourcesPage.AITCschooladdresstextbox.input("123 Test Street");
        resourcesPage.AITCschoolcitytextbox.input("Fishers");
        resourcesPage.AITCschoolstatedropdown.select("IN");
        resourcesPage.AITCschoolziptextbox.input("46038");
        resourcesPage.AITCschoolcountydropdown.select("Hamilton");
        resourcesPage.AITCschoolyeartextbox.input("2020");
        resourcesPage.AITCgradelevelcheckbox.safeClick();
        resourcesPage.AITCdepcheckbox.safeClick();
        resourcesPage.AITCnoofstudentstextbox.input("50");
        resourcesPage.AITCagthemebooksdropdown.select("No");
        resourcesPage.AITCvolunteerdropdown.select("No");
        resourcesPage.AITCagthemeddropdown.select("No");
        resourcesPage.AITCsubjectcheckbox.safeClick();
        resourcesPage.AITCregisterbutton.safeClick();
//        resourcesPage.AITCformclassroomlink.safeClick();
//        resourcesPage.AITCadoptclassroomlink.safeClick();
//        resourcesPage.AITCvolunteercenterlink.safeClick();
//        resourcesPage.AITCvolunteerrecogprogramlink.safeClick();
//        resourcesPage.AITCvolunteerrecogprogramlevelslink.safeClick();
//        resourcesPage.AITCbacktovolunteercenterlink.safeClick();
//        resourcesPage.AITCprogramsandeventslink.safeClick();
//        resourcesPage.AITCgrantslink.safeClick();
//        resourcesPage.AITCgrantsprogramslink.safeClick();
//        resourcesPage.AITCscholarshipslink.safeClick();
//        resourcesPage.backtoAITClink.safeClick();
//        resourcesPage.leadersinactionlink.safeClick();
//        resourcesPage.womensleadershiplink.safeClick();
//        resourcesPage.districteducationlink.safeClick();
//        driver.navigate().back();
//        resourcesPage.youngfarmerslink.safeClick();
//        resourcesPage.statecommitteelink.safeClick();
//        resourcesPage.district1link.safeClick();
//        resourcesPage.district2link.safeClick();
//

//
//           homePage.logoutlink.waitAndClick();
//
//        LogoutPage logoutPage = new LogoutPage(driver);
//        assertEquals(logoutPage.logoutlabel.getText(),"Logout successful");

    }
}

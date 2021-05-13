package com.infarmbureau.incorporated.qa.integration.HealthPlans;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPAboutPage;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPFarmsandResourcesPage;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPFarmsandResourcesPage;
import org.junit.Test;

public class HPFarmsandResourcesTest extends IfbIncorporatedTest {

    @Test
    public void hpaboutTest() throws InterruptedException {
        start();

        driver.navigate().to("https://qa.infbhealthplans.com/");


        HPFarmsandResourcesPage hpformsandresourcesPage = new HPFarmsandResourcesPage(driver);

        hpformsandresourcesPage.formsandresourceslink.safeClick();

        hpformsandresourcesPage.newapplicationlink.safeClick();

        hpformsandresourcesPage.claimsformslink.safeClick();

        hpformsandresourcesPage.underwritinglink.safeClick();

        hpformsandresourcesPage.coverageinformationlink.safeClick();

        hpformsandresourcesPage.coverageinformationlink.safeClick();

        hpformsandresourcesPage.otherusefulformslink.safeClick();



        System.out.println("hello");


    }

//    private void assertEquals(String text, String logout_successful)
   {
    }
}
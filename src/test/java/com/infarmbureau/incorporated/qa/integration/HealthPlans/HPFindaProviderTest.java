package com.infarmbureau.incorporated.qa.integration.HealthPlans;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPFarmsandResourcesPage;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPFindaProviderPage;
import org.junit.Test;

public class HPFindaProviderTest extends IfbIncorporatedTest {

    @Test
    public void hpaboutTest() throws InterruptedException {
        start();

        driver.navigate().to("https://qa.infbhealthplans.com/");


        HPFindaProviderPage hpFindaProviderPage = new HPFindaProviderPage(driver);

        hpFindaProviderPage.unitedhealthcarelink.safeClick();

        hpFindaProviderPage.deltadentallink.safeClick();

        hpFindaProviderPage.optumlink.safeClick();

        System.out.println("hello");

   }

//    private void assertEquals(String text, String logout_successful)
   {
    }
}
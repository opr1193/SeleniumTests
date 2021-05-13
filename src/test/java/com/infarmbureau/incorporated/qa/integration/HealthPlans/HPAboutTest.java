package com.infarmbureau.incorporated.qa.integration.HealthPlans;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HealthPlans.HPAboutPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HPAboutTest extends IfbIncorporatedTest {

    @Test
    public void hpaboutTest() throws InterruptedException {
        start();

        driver.navigate().to("https://qa.infbhealthplans.com/");


        HPAboutPage hpaboutPage = new HPAboutPage(driver);

        hpaboutPage.aboutlink.safeClick();

        hpaboutPage.greatlink.safeClick();

        hpaboutPage.recommendtextbox.input("test");

        hpaboutPage.visitfaqslink.safeClick();


        System.out.println("hello");


    }

//    private void assertEquals(String text, String logout_successful)
   {
    }
}
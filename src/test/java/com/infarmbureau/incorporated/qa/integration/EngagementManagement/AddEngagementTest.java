package com.infarmbureau.incorporated.qa.integration.EngagementManagement;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EngagementPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.MembershipPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddEngagementTest extends IfbIncorporatedTest {

    @Test
    public void engagementSearchTest() {
        startMemberManagement();
        EngagementPage engagementPage = new EngagementPage(driver);

        engagementPage.engagementslink.waitForElementToBeVisible(40);
        engagementPage.engagementslink.safeClick();
        engagementPage.addengagelink.safeClick();
        engagementPage.firstaddengtextbox.input("Mark");
        engagementPage.searchmemlink.safeClick();
        engagementPage.firstsearchresultlink.waitForElementToBeVisible(20);
        engagementPage.firstsearchresultlink.safeClick();

        engagementPage.addaitccheckbox.check();
        engagementPage.addstateconvcheckbox.waitForElementToBeVisible(20);
        engagementPage.addstateconvcheckbox.check();

        engagementPage.effectivedatedropdown.safeClick();
        WebElement effdateelement = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div"));
        Actions effdateaction = new Actions(driver);
        effdateaction.moveToElement(effdateelement).build().perform();
        WebElement effdateelementclick = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[5]"));
        Actions effdateactionclick = new Actions(driver);
        effdateactionclick.moveToElement(effdateelementclick).build().perform();
        effdateelementclick.click();

        engagementPage.expirationdatedropdown.safeClick();
        WebElement expdateelement = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-1\"]/div"));
        Actions expdateaction = new Actions(driver);
        expdateaction.moveToElement(expdateelement).build().perform();
        WebElement expdateelementclick = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[5]/td[5]/div[1]"));
        Actions expdateactionclick = new Actions(driver);
        expdateactionclick.moveToElement(expdateelementclick).build().perform();
        expdateelementclick.click();

        engagementPage.addtoselectionlink.safeClick();

        engagementPage.saveengagementlink.safeClick();

        System.out.println("hello");



    }
}

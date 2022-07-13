package com.infarmbureau.incorporated.qa.integration.EngagementManagement;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EngagementPage;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.LoginPage;
import com.infarmbureau.incorporated.test.pages.MembershipPage;
import org.junit.Test;

public class EngagementsSearchTest extends IfbIncorporatedTest {

    @Test
    public void engagementSearchTest() {
        startMemberManagement();
        EngagementPage engagementPage = new EngagementPage(driver);

        engagementPage.engagementslink.waitForElementToBeVisible(20);
        engagementPage.engagementslink.safeClick();
        engagementPage.engagementssearchlink.waitForElementToBeVisible(20);
        engagementPage.engagementssearchlink.safeClick();
        engagementPage.aitccheckbox.waitForElementToBeVisible(20);
        engagementPage.aitccheckbox.check();
        engagementPage.statecheckbox.waitForElementToBeVisible(20);
        engagementPage.statecheckbox.check();
        engagementPage.searchengbutton.safeClick();
        engagementPage.firstsearchresultlink.waitForElementToBeVisible(20);
        engagementPage.firstsearchresultlink.safeClick();
        engagementPage.backtoenglink.safeClick();
        System.out.println("hello");



    }
}

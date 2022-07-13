package com.infarmbureau.incorporated.qa.integration.EngagementManagement;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.EngagementPage;
import org.junit.Test;

public class SearchMembersForEngagementsTest extends IfbIncorporatedTest {

    @Test
    public void engagementSearchTest() {
        startMemberManagement();
        EngagementPage engagementPage = new EngagementPage(driver);

        engagementPage.engagementslink.waitForElementToBeVisible(20);
        engagementPage.engagementslink.safeClick();
        engagementPage.searchmembersforengagementslink.waitForElementToBeVisible(20);
        engagementPage.searchmembersforengagementslink.safeClick();
        engagementPage.searchmembersfirstnametextbox.input("Rob");
        engagementPage.searchmembersbutton.safeClick();
        engagementPage.searchmembersresultlink.waitForElementToBeVisible(20);
        engagementPage.searchmembersresultlink.safeClick();


        engagementPage.searchmembersbacktoengagementlink.safeClick();

        System.out.println("hello");



    }
}

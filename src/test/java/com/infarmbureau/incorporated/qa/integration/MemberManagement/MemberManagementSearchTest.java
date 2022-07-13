package com.infarmbureau.incorporated.qa.integration.MemberManagement;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.MemberManagementSearchPage;
import com.infarmbureau.sitefinity.test.pages.MemberManagement.MemberManagementPage;
import org.junit.Ignore;
import org.junit.Test;


public class MemberManagementSearchTest extends IfbIncorporatedTest {

   @Test
   public void membermanagementtest() {
      startMemberMgt();
      MemberManagementSearchPage memberManagementSearchPage = new MemberManagementSearchPage(driver);


      memberManagementSearchPage.memberslink.waitForElementToBeVisible(40);
      memberManagementSearchPage.memberslink.safeClick();
      memberManagementSearchPage.firstnametextbox.input("Rob");
      memberManagementSearchPage.searchlink.safeClick();
      memberManagementSearchPage.searchresultlink.waitForElementToBeVisible(40);
      memberManagementSearchPage.searchresultlink.safeClick();

      System.out.println("hello");
   }
}



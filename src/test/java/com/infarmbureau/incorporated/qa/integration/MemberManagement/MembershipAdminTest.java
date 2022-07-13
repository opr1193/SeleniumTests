package com.infarmbureau.incorporated.qa.integration.MemberManagement;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.MemberManagementSearchPage;
import com.infarmbureau.incorporated.test.pages.MemberhipAdminPage;
import org.junit.Test;


public class MembershipAdminTest extends IfbIncorporatedTest {

   @Test
   public void memberhipadmintest() {
      startMemberAdmin();
      MemberhipAdminPage memberhipAdminPage = new MemberhipAdminPage(driver);


      memberhipAdminPage.sendmemcardcheckbox.waitForElementToBeVisible(40);
      memberhipAdminPage.sendmemcardcheckbox.check();
      memberhipAdminPage.savebutton.safeClick();


      System.out.println("hello");
   }
}



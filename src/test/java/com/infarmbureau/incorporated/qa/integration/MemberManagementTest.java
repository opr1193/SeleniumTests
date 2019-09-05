package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.sitefinity.test.pages.MemberManagement.MemberManagementPage;
import org.junit.Ignore;
import org.junit.Test;


public class MemberManagementTest extends IfbIncorporatedTest {

   @Ignore
   public void membermanagementtest() {
      startMemberMgt();
      com.infarmbureau.sitefinity.test.pages.MemberManagement.MemberManagementPage memberManagementPage = new MemberManagementPage(driver);
      memberManagementPage.eventsButton.safeClick();

      memberManagementPage.neweventLink.safeClick();

      memberManagementPage.activeeventButton.safeClick();

      memberManagementPage.eventtitleTextField.input("Farm Event");

      memberManagementPage.hostnameTextField.input("Tony Stark");

      memberManagementPage.hostphoneTextField.input("3126547586");

      memberManagementPage.hosttwitterhandleTextField.input("@INFB");

      memberManagementPage.hashtagTextField.input("INFBEvents");

      memberManagementPage.bannerimageTextField.input("https://www.pexels.com/search/nature/");

      memberManagementPage.venuedescriptionTextField.input("State Fair");

      memberManagementPage.addressdescriptionTextField.input("Indianapolis");

      memberManagementPage.addressdescriptiontwoTextField.input("Indiana");

      memberManagementPage.cityTextField.input("Indianapolis");

      memberManagementPage.stateTextField.input("IN");

      memberManagementPage.zipcodeTextField.input("46038");

      memberManagementPage.countyTextField.input("Hamilton");


//                       memberManagementPage.startdateButton.safeClick();
//
//                       memberManagementPage.todaysDate.safeClick();
//
//                       memberManagementPage.startHour.safeClick();
//
//                       memberManagementPage.startMinute.safeClick();
//
//                       memberManagementPage.endDate.safeClick();

      memberManagementPage.startdateTextField.input("06/10/2019");

      memberManagementPage.endDateTextField.input("06/24/2019");

      memberManagementPage.registrationopenTextField.input("05/05/2019");

      memberManagementPage.registrationendTextField.input("05/07/2019");

      memberManagementPage.maximumattendeesTextField.input("50");

      memberManagementPage.enablewaitlistButton.safeClick();

      memberManagementPage.paymentsectionButton.safeClick();

      memberManagementPage.basecostTextField.input("50");

      memberManagementPage.costdescriptionTextField.input("$25/ person for members, $50/person for non-members");

      memberManagementPage.payeeTextField.safeClick();

      memberManagementPage.payeeselectionButton.safeClick();

      memberManagementPage.qualifiersbutton.safeClick();

      memberManagementPage.qualifierTextField.input("Stark Fans");

      memberManagementPage.addqualifierButton.safeClick();

      memberManagementPage.discountButton.safeClick();

      memberManagementPage.discountselectionButton.safeClick();

      memberManagementPage.discountamountTextField.input("10");

//                       memberManagementPage.engagementselectionButton.safeClick();

//                       memberManagementPage.selectengagementButton.safeClick();
//
//                       memberManagementPage.selectengagement1Button.safeClick();
//
//                       memberManagementPage.acceptselectionButton.safeClick();


      memberManagementPage.saveButton.safeClick();

//                       memberManagementPage.editButton.safeClick();
////
//                       memberManagementPage.editmaxattendeesTextField.clearTextBox();
////
//                       memberManagementPage.editmaxattendeesTextField.input("106");
////
//                       memberManagementPage.editsaveButton.safeClick();
////
//                       memberManagementPage.backtooverviewButton.safeClick();

      System.out.println("hello");
   }
}



package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.sitefinity.test.pages.MemberManagement.MemberManagementPage;
import org.junit.Ignore;
import org.junit.Test;


public class MemberManagementTest extends IfbIncorporatedTest {

                    @Ignore
                    public void membermanagementtest(){
                        startMemberMgt();
                        com.infarmbureau.sitefinity.test.pages.MemberManagement.MemberManagementPage memberManagementPage = new MemberManagementPage(driver);
                        memberManagementPage.eventsButton.safeClick();

                       memberManagementPage.neweventLink.safeClick();

                       memberManagementPage.eventtitleTextField.input("Auto Event");

                       memberManagementPage.hostnameTextField.input("Mark");

                       memberManagementPage.hostphoneTextField.input("3126547586");

                       memberManagementPage.hosttwitterhandleTextField.input("@INFB");

                       memberManagementPage.hashtagTextField.input("INFBEvents");

                       memberManagementPage.bannerimageTextField.input("https://www.pexels.com/search/nature/");

                       memberManagementPage.attendancecostTextField.input("100");

                       memberManagementPage.venuedescriptionTextField.input("State Fair");

                       memberManagementPage.addressdescriptionTextField.input("Indianapolis");

                       memberManagementPage.addressdescriptiontwoTextField.input("Indiana");

                       memberManagementPage.cityTextField.input("Indianapolis");

                       memberManagementPage.stateTextField.input("IN");

                       memberManagementPage.zipcodeTextField.input("46038");

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

                       memberManagementPage.saveButton.safeClick();

//e                       memberManagementPage.editButton.safeClick();
//
//                       memberManagementPage.editmaxattendeesTextField.clearTextBox();
//
//                       memberManagementPage.editmaxattendeesTextField.input("106");
//
//                       memberManagementPage.editsaveButton.safeClick();
//
//                       memberManagementPage.backtooverviewButton.safeClick();

                       System.out.println("hello");
                  }
    }



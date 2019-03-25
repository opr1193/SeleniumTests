package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;

import com.infarmbureau.incorporated.test.pages.EventRegistration.MemberManagementPage;
import org.junit.Ignore;
import org.junit.Test;

import javax.print.DocFlavor;


public class MemberManagementTest extends IfbIncorporatedTest {

                    @Ignore
                    public void membermanagementtest(){
                        startMemberMgt();
                        MemberManagementPage memberManagementPage = new MemberManagementPage(driver);
                        memberManagementPage.eventsButton.safeClick();

                       memberManagementPage.neweventLink.safeClick();

                       memberManagementPage.eventtitleTextField.input("Pumpkin");

                       memberManagementPage.hostnameTextField.input("Jason");

                       memberManagementPage.hostphoneTextField.input("3126547586");

                       memberManagementPage.hosttwitterhandleTextField.input("@INFB");

                       memberManagementPage.venuedescriptionTexrGield.input("State Fair");

                       memberManagementPage.addressdescriptionTextField.input("Indianapolis");

                       memberManagementPage.addressdescriptiontwoTextField.input("Indiana");

                       memberManagementPage.cityTextField.input("Indianapolis");

                       memberManagementPage.stateTextField.input("IN");

                       memberManagementPage.zipcodeTextField.input("46038");

                       memberManagementPage.startdateButton.safeClick();

                       memberManagementPage.todaysDate.safeClick();

                       memberManagementPage.startHour.safeClick();

                       memberManagementPage.startMinute.safeClick();

                       memberManagementPage.endDate.safeClick();

                       memberManagementPage.starttimeTextField.input("01/10/2019");

                       memberManagementPage.endtimeTextField.input("01/24/2019");

                       memberManagementPage.registrationopenTextField.input("01/05/2019");

                       memberManagementPage.registrationendTextField.input("01/07/2019");

                       memberManagementPage.maximumattendeesTextField.input("50");

                       memberManagementPage.enablewaitlistButton.safeClick();

                       memberManagementPage.saveButton.safeClick();

                       System.out.println("hello");


                  }
    }



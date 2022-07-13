package com.infarmbureau.incorporated.test;

import com.infarmbureau.qa.templates.DriverTemplate;
import com.infarmbureau.qa.utilities.XMLUtilities;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class IfbIncorporatedTest extends DriverTemplate {

  protected WebDriver driver;

  @Before
  public void beforeSetUp() {

    driver = getDriver();
  }

  protected final void start() {
    navigateTo("");
  }

  private void navigateTo(String url) {
//    driver.manage().window().fullscreen();
    driver.navigate().to(
            XMLUtilities.getItemFromNode("baseUrl") + url);
  }

  protected final void startEventReg() {
    driver.navigate().to("https://app-qa.infarmbureau.org/EventRegistration?event=121");

  }

  protected final void startMemberMgt() {
    driver.navigate().to("https://member-management-qag.infarmbureau.com/");

  }

  protected final void startMemberPur() {
    driver.navigate().to("https://join-qag.infarmbureau.org/");

  }

  protected final void startMemberAdmin() {
    driver.navigate().to("https://member-management-qag.infarmbureau.com/membership/admin/2579058");
  }

  protected final void startMemberSubmission() {
    driver.navigate().to("https://member-management-qag.infarmbureau.com/membership/submission/3QUVALQFF030CLTCTCN3");
  }

  protected final void startMemberManagement(){
    driver.navigate().to("https://member-management-qag.infarmbureau.com");
  }

}

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
    driver.navigate().to(
      XMLUtilities.getItemFromNode("baseUrl") + url);
  }

  protected final void startEventReg() {
    driver.navigate().to("https://app-qa.infarmbureau.org/EventRegistration?event=3");

  }
protected final void startMemberMgt()  {
    driver.navigate().to("https://member-management-qag.infarmbureau.com/");
}
}


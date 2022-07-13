package com.infarmbureau.incorporated.qa.integration;


import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.HomePage;
import com.infarmbureau.incorporated.test.pages.MembershipSubmissionPage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MembershipSubmissionTest extends IfbIncorporatedTest {

   @Ignore
   public void membershipsubmissiontest() throws InterruptedException {
      startMemberSubmission();

      MembershipSubmissionPage memberhipSubmissionPage = new MembershipSubmissionPage(driver);


      memberhipSubmissionPage.membtypedropdown.waitForElementToBeVisible(80);
      memberhipSubmissionPage.membtypedropdown.safeClick();
      WebElement memtypeelement = driver.findElement(By.xpath("//*[@id=\"mat-select-0-panel\"]"));
      Actions memtypeaction = new Actions(driver);
      memtypeaction.moveToElement(memtypeelement).build().perform();
      WebElement memtypeelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span"));
      Actions memtypeactionclick = new Actions(driver);
      memtypeactionclick.moveToElement(memtypeelementclick).build().perform();
      memtypeelementclick.click();


      memberhipSubmissionPage.effectivedatetextbox.input("05/27/2022");

      memberhipSubmissionPage.memberclassificationdropdown.safeClick();
      WebElement memclasselement = driver.findElement(By.xpath("//*[@id=\"mat-select-2-panel\"]"));
      Actions memclassaction = new Actions(driver);
      memclassaction.moveToElement(memclasselement).build().perform();
      WebElement memclasselementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]/span"));
      Actions memclassactionclick = new Actions(driver);
      memclassactionclick.moveToElement(memclasselementclick).build().perform();
      memclasselementclick.click();

      memberhipSubmissionPage.membercodedropdown.safeClick();
      WebElement memcodeelement = driver.findElement(By.xpath("//*[@id=\"mat-select-4-panel\"]"));
      Actions memcodeaction = new Actions(driver);
      memcodeaction.moveToElement(memcodeelement).build().perform();
      WebElement memcodeelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span"));
      Actions memcodeactionclick = new Actions(driver);
      memcodeactionclick.moveToElement(memcodeelementclick).build().perform();
      memcodeelementclick.click();

      Thread.sleep(20000);

      memberhipSubmissionPage.billaccountdropdown.safeClick();
      Thread.sleep(1000);
      WebElement billacctelement = driver.findElement(By.xpath("//*[@id=\"county-panel\"]"));
      Actions billacctaction = new Actions(driver);
      billacctaction.moveToElement(billacctelement).build().perform();
      Thread.sleep(3000);
      WebElement billacctelementclick = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span"));

      Actions billacctactionclick = new Actions(driver);
      billacctactionclick.moveToElement(billacctelementclick).build().perform();
      billacctelementclick.click();

      Thread.sleep(20000);

      memberhipSubmissionPage.memberreferraldropdown.safeClick();
      WebElement membrefelement = driver.findElement(By.xpath("//*[@id=\"mat-select-12-panel\"]"));
      Actions membrefaction = new Actions(driver);
      membrefaction.moveToElement(membrefelement).build().perform();
      WebElement membrefelementclick = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span"));
      Actions membrefactionclick = new Actions(driver);
      membrefactionclick.moveToElement(membrefelementclick).build().perform();
      membrefelementclick.click();

      memberhipSubmissionPage.submitbutton.safeClick();


      System.out.println("hello");
   }
}



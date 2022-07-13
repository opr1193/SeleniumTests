package com.infarmbureau.incorporated.qa.integration.MembershipPurchase;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.SelectMembershipPurchasePage;
import com.infarmbureau.incorporated.test.pages.StudentMembershipPurchasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class StudentMembershipPurchaseTest extends IfbIncorporatedTest {
    @Test

    public void membershippurchasetest() throws InterruptedException {
        startMemberPur();

        StudentMembershipPurchasePage studentMembershipPurchasePage = new StudentMembershipPurchasePage(driver);

        studentMembershipPurchasePage.studentradiobutton.safeClick();

        studentMembershipPurchasePage.nextbutton.safeClick();
        studentMembershipPurchasePage.firstnametextbox.input("Stest7");
        studentMembershipPurchasePage.lastnametextbox.input("Btest7");
        studentMembershipPurchasePage.dobtextbox.input("02/08/1987");

        studentMembershipPurchasePage.genderdropdown.safeClick();
        WebElement genelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div"));
        Actions genaction = new Actions(driver);
        genaction.moveToElement(genelement).build().perform();
        WebElement genelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span"));
        Actions genactionclick = new Actions(driver);
        genactionclick.moveToElement(genelementclick).build().perform();
        genelementclick.click();

        studentMembershipPurchasePage.emailaddresstextbox.input("Sree.Balakrishna@infarmbureau.com");
        studentMembershipPurchasePage.mobilephonetextbox.input("4568589582");
        studentMembershipPurchasePage.homephonetextbox.input("4785825865");
        studentMembershipPurchasePage.addresstextbox.input("12906 Pleasant View Lane");
        studentMembershipPurchasePage.citytextbox.input("Fishers");
        studentMembershipPurchasePage.statetextbox.input("IN");
        studentMembershipPurchasePage.zipcodetextbox.input("46038");

        studentMembershipPurchasePage.countydropdown.safeClick();
        WebElement countyelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/div/div"));
        Actions countyaction = new Actions(driver);
        countyaction.moveToElement(countyelement).build().perform();
        WebElement countyelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-40\"]/span"));
        Actions countyactionclick = new Actions(driver);
        countyactionclick.moveToElement(countyelementclick).build().perform();
        countyelementclick.click();

        studentMembershipPurchasePage.next1button.safeClick();
        studentMembershipPurchasePage.next2button.safeClick();

        studentMembershipPurchasePage.notinvagriradiobutton.safeClick();
        studentMembershipPurchasePage.referredbydropdown.safeClick();



        WebElement refelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/div/div"));
        Actions refaction = new Actions(driver);
        refaction.moveToElement(refelement).build().perform();
        WebElement refelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span"));
        Actions refactionclick = new Actions(driver);
        refactionclick.moveToElement(refelementclick).build().perform();
        refelementclick.click();

        studentMembershipPurchasePage.enrolledcheckbox.check();
        studentMembershipPurchasePage.next3button.safeClick();



                String MainWindow = driver.getWindowHandle();

                Set<String> s1 = driver.getWindowHandles();
                Iterator<String> i1 = s1.iterator();

                while (i1.hasNext()) {
                    String ChildWindow = i1.next();

                    if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                        driver.switchTo().window(ChildWindow);
                      Thread.sleep(30000);
                        driver.findElement(By.xpath("//*[@id=\"nameOnCreditCard\"]"))
                                .sendKeys("sree balakrishna");
                        driver.findElement(By.xpath("//*[@id=\"zipcode\"]"))
                                .sendKeys("46038");
                        driver.findElement(By.xpath("//*[@id=\"cardNumber\"]"))
                                .sendKeys("4954775518196006");
                        driver.findElement(By.xpath("//*[@id=\"month\"]"))
                                .sendKeys("04");
                        driver.findElement(By.xpath("//*[@id=\"year\"]"))
                                .sendKeys("2023");
                        driver.findElement(By.xpath("//*[@id=\"cvv\"]"))
                                .sendKeys("862");


                        driver.findElement(By.xpath("//*[@id=\"saveButtonId\"]")).click();

//                    }
//                }
                        driver.switchTo().window(MainWindow);
//            }
//        }
                        System.out.println("hello");


                    }

                }
            }}

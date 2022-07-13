package com.infarmbureau.incorporated.qa.integration.MembershipPurchase;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.PrimaryMembershipPurchasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
import java.util.Set;


public class PrimaryMembershipPurchaseTest extends IfbIncorporatedTest {
    @Test

    public void membershippurchasetest() throws InterruptedException {
        startMemberPur();

        PrimaryMembershipPurchasePage membershipPurchasePage = new PrimaryMembershipPurchasePage(driver);

        membershipPurchasePage.primaryradiobutton.safeClick();

        membershipPurchasePage.nextbutton.safeClick();
        membershipPurchasePage.firstnametextbox.input("Stest5");
        membershipPurchasePage.lastnametextbox.input("Btest5");
        membershipPurchasePage.dobtextbox.input("02/06/1987");

        membershipPurchasePage.genderdropdown.safeClick();
        WebElement genelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div"));
        Actions genaction = new Actions(driver);
        genaction.moveToElement(genelement).build().perform();
        WebElement genelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span"));
        Actions genactionclick = new Actions(driver);
        genactionclick.moveToElement(genelementclick).build().perform();
        genelementclick.click();

        membershipPurchasePage.emailaddresstextbox.input("Sree.Balakrishna@infarmbureau.com");
        membershipPurchasePage.mobilephonetextbox.input("4568589582");
        membershipPurchasePage.homephonetextbox.input("4785825865");
        membershipPurchasePage.addresstextbox.input("12906 Pleasant View Lane");
        membershipPurchasePage.citytextbox.input("Fishers");
        membershipPurchasePage.statetextbox.input("IN");
        membershipPurchasePage.zipcodetextbox.input("46038");

        membershipPurchasePage.countydropdown.safeClick();
        WebElement countelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]"));
        Actions countaction = new Actions(driver);
        countaction.moveToElement(countelement).build().perform();
        WebElement countelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-40\"]/span"));
        Actions countactionclick = new Actions(driver);
        countactionclick.moveToElement(countelementclick).build().perform();
        countelementclick.click();

        membershipPurchasePage.next1button.safeClick();

        membershipPurchasePage.next2button.safeClick();

        membershipPurchasePage.notinvagriradiobutton.safeClick();

        membershipPurchasePage.referredbydropdown.safeClick();
        WebElement refelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/div/div"));
        Actions refaction = new Actions(driver);
        refaction.moveToElement(refelement).build().perform();
        WebElement refelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span"));
        Actions refactionclick = new Actions(driver);
        refactionclick.moveToElement(refelementclick).build().perform();
        refelementclick.click();

        membershipPurchasePage.next3button.safeClick();
        membershipPurchasePage.purchasebutton.safeClick();



                String MainWindow = driver.getWindowHandle();

                // To handle all new opened window.
                Set<String> s1 = driver.getWindowHandles();
                Iterator<String> i1 = s1.iterator();

                while (i1.hasNext()) {
                    String ChildWindow = i1.next();

                    if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                        // Switching to Child window
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

//                        // Closing the Child Window.
//                        driver.close();
//                    }
//                }
//                // Switching to Parent window i.e Main Window.
                        driver.switchTo().window(MainWindow);
                        WebElement myElement = driver.findElement(By.xpath("/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[6]/div/app-finish/div/div[2]/div/div/div")); // Provide the XPath expression for the element containing the text you need.
                        String myText = myElement.getText();  // Saves the obtained text into a String object
//            }
//        }
//
//
//
//        membershipPurchasePage.ccnametextbox.input("Sree Balakrishna");
//        membershipPurchasePage.cczipcodetextbox.input("46038");
//        membershipPurchasePage.cccardnubertextbox.input("4954775518196006");
//        membershipPurchasePage.ccexpmonthdropdown.safeClick();
//        membershipPurchasePage.ccexpmonthdropdown.input("04");
//        membershipPurchasePage.ccexpyeardropdown.safeClick();
//        membershipPurchasePage.ccexpyeardropdown.input("2023");
//        membershipPurchasePage.cccvvtextbox.input("862");
//        membershipPurchasePage.ccnextbutton.safeClick();




                        System.out.println("hello");



                    }

                }
            }}

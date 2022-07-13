package com.infarmbureau.incorporated.qa.integration.MembershipPurchase;

import com.infarmbureau.incorporated.test.IfbIncorporatedTest;
import com.infarmbureau.incorporated.test.pages.SelectMembershipPurchasePage;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class SelectMembershipPurchaseTest extends IfbIncorporatedTest {
    @Ignore

    public void membershippurchasetest() throws InterruptedException {
        startMemberPur();

        SelectMembershipPurchasePage selectMembershipPurchasePage = new SelectMembershipPurchasePage(driver);

        selectMembershipPurchasePage.selectradiobutton.safeClick();

        selectMembershipPurchasePage.nextbutton.safeClick();
        selectMembershipPurchasePage.firstnametextbox.input("Stest7");
        selectMembershipPurchasePage.lastnametextbox.input("Btest7");
        selectMembershipPurchasePage.dobtextbox.input("02/08/1987");

        selectMembershipPurchasePage.genderdropdown.safeClick();
        WebElement genelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div"));
        Actions genaction = new Actions(driver);
        genaction.moveToElement(genelement).build().perform();
        WebElement genelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span"));
        Actions genactionclick = new Actions(driver);
        genactionclick.moveToElement(genelementclick).build().perform();
        genelementclick.click();

        selectMembershipPurchasePage.emailaddresstextbox.input("Sree.Balakrishna@infarmbureau.com");
        selectMembershipPurchasePage.mobilephonetextbox.input("4568589582");
        selectMembershipPurchasePage.homephonetextbox.input("4785825865");
        selectMembershipPurchasePage.membernumbertextbox.input("0002718469");
        selectMembershipPurchasePage.primarylastnametextbox.input("Btest4");
        selectMembershipPurchasePage.next1button.safeClick();

        selectMembershipPurchasePage.notinvagriradiobutton.safeClick();

        selectMembershipPurchasePage.referredbydropdown.safeClick();
        WebElement refelement = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/div/div"));
        Actions refaction = new Actions(driver);
        refaction.moveToElement(refelement).build().perform();
        WebElement refelementclick = driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span"));
        Actions refactionclick = new Actions(driver);
        refactionclick.moveToElement(refelementclick).build().perform();
        refelementclick.click();

        selectMembershipPurchasePage.next2button.safeClick();
        selectMembershipPurchasePage.purchasebutton.safeClick();


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

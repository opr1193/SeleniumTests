package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MembershipPage extends Page {

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement becomeamemberElement;

    public IfbLink becomeamemberlink = new IfbLink(driver, becomeamemberElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement countyfarmbureauElement;

    public IfbLink countyfarmbureaulink = new IfbLink(driver, countyfarmbureauElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement infbexpertElement;

    public IfbLink infbexpertlink = new IfbLink(driver, infbexpertElement);

    @FindBy(xpath = "//*[@id=\"label-4E097E4B-D540-6B36-96E3-FF0000F5C395\"]")
    private WebElement membershipElement;

    public IfbLink membershiplink = new IfbLink(driver, membershipElement);




    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement infbinsuranceElement;

    public IfbLink infbinsurancelink = new IfbLink(driver, infbinsuranceElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement membershipsweepstakesElement;

    public IfbLink membershipsweepstakeslink = new IfbLink(driver, membershipsweepstakesElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[6]")
    private WebElement mymemberdealsElement;

    public IfbLink mymemberdealslink = new IfbLink(driver, mymemberdealsElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col03\"]/div[2]/div[3]/div/div/div[2]/div[1]/h5/a")
    private WebElement abenityElement;

    public IfbLink abenitylink = new IfbLink(driver, abenityElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[7]")
    private WebElement renewyourmembershipElement;

    public IfbLink renewyourmembershiplink = new IfbLink(driver, renewyourmembershipElement);

    public MembershipPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
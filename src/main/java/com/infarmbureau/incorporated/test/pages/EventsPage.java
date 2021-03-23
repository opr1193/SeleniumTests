package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class EventsPage extends Page {

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement stateconventionElement;

    public IfbLink stateconventionlink = new IfbLink(driver, stateconventionElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement indianastatefairElement;

    public IfbLink indianastatefairlimk = new IfbLink(driver, indianastatefairElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/a")
    private WebElement afbfannualconventionElement;

    public IfbLink afbfannualconventionlink = new IfbLink(driver, afbfannualconventionElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement agricultureintheclassroomElement;

    public IfbLink agricultureintheclassroomlink = new IfbLink(driver, agricultureintheclassroomElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[5]/a")
    private WebElement leadersinactionElement;

    public IfbLink leadersinactionlink = new IfbLink(driver, leadersinactionElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[6]/a")
    private WebElement publicpolicyElement;

    public IfbLink publicpolicylink = new IfbLink(driver, publicpolicyElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[7]/a")
    private WebElement womensleadershipcommitteeElement;

    public IfbLink womensleadershipcommitteelink = new IfbLink(driver, womensleadershipcommitteeElement);

    public EventsPage(WebDriver driver) {

        super(driver, SPINNER);


    }
}

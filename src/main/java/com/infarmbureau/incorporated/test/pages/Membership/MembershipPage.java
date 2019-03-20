package com.infarmbureau.incorporated.test.pages.Membership;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MembershipPage extends Page {

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[1]/a")
    private WebElement becomeamemberElement;

    public IfbLink becomeamemberlink = new IfbLink(driver, becomeamemberElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T73578992009_Col01\"]/nav/ul/li[2]/a")
    private WebElement countyfarmbureauElement;

    public IfbLink countyfarmbureaulink = new IfbLink(driver, countyfarmbureauElement);

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[3]/a")
    private WebElement infbexpertElement;

    public IfbLink infbexpertlink = new IfbLink(driver, infbexpertElement);


    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement infbinsuranceElement;

    public IfbLink infbinsurancelink = new IfbLink(driver, infbinsuranceElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[5]/a")
    private WebElement membershipsweepstakesElement;

    public IfbLink membershipsweepstakeslink = new IfbLink(driver, membershipsweepstakesElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[6]/a")
    private WebElement mymemberdealsElement;

    public IfbLink mymemberdealslink = new IfbLink(driver, mymemberdealsElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col03\"]/div[2]/div[3]/div/div/div[2]/div[1]/h5/a")
    private WebElement abenityElement;

    public IfbLink abenitylink = new IfbLink(driver, abenityElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[7]/a")
    private WebElement renewyourmembershipElement;

    public IfbLink renewyourmembershiplink = new IfbLink(driver, renewyourmembershipElement);

    public MembershipPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
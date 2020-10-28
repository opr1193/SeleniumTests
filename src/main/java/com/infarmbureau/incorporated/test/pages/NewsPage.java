package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class NewsPage extends Page {

    @FindBy(xpath= "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[1]/a")
    private WebElement ifbinthenewsElement;

    public IfbLink ifbinthenewslink = new IfbLink(driver, ifbinthenewsElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[2]/a")
    private WebElement newsreleasesElement;

    public IfbLink newsreleaseslink = new IfbLink(driver, newsreleasesElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/a")
    private WebElement publicationsElement;

    public IfbLink publicationslink = new IfbLink(driver, publicationsElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement mediacontactinformationElement;

    public IfbLink mediacontactonformationlink = new IfbLink(driver, mediacontactinformationElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[5]/a")
    private WebElement socialmediaElement;

    public IfbLink socialmedialink = new IfbLink(driver, socialmediaElement);

    public NewsPage(WebDriver driver) {

        super(driver, SPINNER);

    }
}

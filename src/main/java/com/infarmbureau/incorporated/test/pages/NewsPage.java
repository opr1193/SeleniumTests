package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class NewsPage extends Page {

    @FindBy(xpath= "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement ifbinthenewsElement;

    public IfbLink ifbinthenewslink = new IfbLink(driver, ifbinthenewsElement);

    @FindBy(xpath= "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement newsreleasesElement;

    public IfbLink newsreleaseslink = new IfbLink(driver, newsreleasesElement);

    @FindBy(xpath= "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement publicationsElement;

    public IfbLink publicationslink = new IfbLink(driver, publicationsElement);

    @FindBy(xpath= "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement mediacontactinformationElement;

    public IfbLink mediacontactonformationlink = new IfbLink(driver, mediacontactinformationElement);

    @FindBy(xpath= "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement socialmediaElement;

    public IfbLink socialmedialink = new IfbLink(driver, socialmediaElement);

    public NewsPage(WebDriver driver) {

        super(driver, SPINNER);

    }
}

package com.infarmbureau.incorporated.test.pages.HealthPlans;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class HPFarmsandResourcesPage extends Page {


    @FindBy(xpath = "//*[@id=\"navbar-1\"]/div[3]/div/a/span")
    private WebElement formsandresourcesElement;

    public IfbLink formsandresourceslink = new IfbLink(driver, formsandresourcesElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C007_Col00\"]/div/div/h3")
    private WebElement newapplicationElement;

    public IfbLink newapplicationlink = new IfbLink(driver, newapplicationElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C012_Col00\"]/div/div/h3")
    private WebElement claimsformsElement;

    public IfbLink claimsformslink = new IfbLink(driver, claimsformsElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C016_Col00\"]/div/div/h3")
    private WebElement underwritingElement;

    public IfbLink underwritinglink = new IfbLink(driver, underwritingElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C019_Col00\"]/div/div/h3")
    private WebElement coverageinformationElement;

    public IfbLink coverageinformationlink = new IfbLink(driver, coverageinformationElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C023_Col00\"]/div/div/h3")
    private WebElement otherusefulformsElement;

    public IfbLink otherusefulformslink = new IfbLink(driver, otherusefulformsElement);


    public HPFarmsandResourcesPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}


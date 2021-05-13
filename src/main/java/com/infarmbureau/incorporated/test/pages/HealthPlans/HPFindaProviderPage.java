package com.infarmbureau.incorporated.test.pages.HealthPlans;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class HPFindaProviderPage extends Page {


    @FindBy(xpath = "//*[@id=\"navbar-1\"]/div[4]/div/a/span")
    private WebElement unitedhealthcareElement;

    public IfbLink unitedhealthcarelink = new IfbLink(driver, unitedhealthcareElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C019_Col01\"]/div/div/p[4]/a[1]")
    private WebElement deltadentalElement;

    public IfbLink deltadentallink = new IfbLink(driver, deltadentalElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C019_Col01\"]/div/div/p[6]/a")
    private WebElement optumElement;

    public IfbLink optumlink = new IfbLink(driver, optumElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C003_Col00\"]/div/div/p[2]/a")
    private WebElement oneconnectionElement;

    public IfbLink oneconnectionlink = new IfbLink(driver, oneconnectionElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C003_Col00\"]/div/div/p[4]/a")
    private WebElement visitUMRElement;

    public IfbLink visitUMRlink = new IfbLink(driver, visitUMRElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C003_Col00\"]/div/div/p[6]/a[1]")
    private WebElement deltadentalvisionElement;

    public IfbLink deltadentalvisionlink = new IfbLink(driver, deltadentalvisionElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C003_Col00\"]/div/div/p[6]/a[2]")
    private WebElement vspElement;

    public IfbLink vsplink = new IfbLink(driver, vspElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C003_Col00\"]/div/div/p[10]/a")
    private WebElement wellnessresourcesElement;

    public IfbLink wellnessresourceslink = new IfbLink(driver, wellnessresourcesElement);










    public HPFindaProviderPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}


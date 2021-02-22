package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class PublicPolicyPage extends Page {

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement nationalissuesElement;

    public IfbLink nationalissueslink = new IfbLink(driver, nationalissuesElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement stateissuesElement;

    public IfbLink stateissueslink = new IfbLink(driver, stateissuesElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement localissuesElement;

    public IfbLink localissueslink = new IfbLink(driver, localissuesElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a")
    private WebElement IndianatownshipmapElement;

    public IfbLink Indianatownshipmaplink = new IfbLink(driver, IndianatownshipmapElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement waterElement;

    public IfbLink waterlink = new IfbLink(driver, waterElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement takeactionElement;

    public IfbLink takeactionlink = new IfbLink(driver, takeactionElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div[1]/div/div/a")
    private WebElement lookupcandidatesElement;

    public IfbLink lookupcandidatelink = new IfbLink(driver, lookupcandidatesElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div[1]/div/a[6]")
    private WebElement policydevelopmentElement;

    public IfbLink policydevelopmentlink = new IfbLink(driver, policydevelopmentElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div[1]/div/div/a[1]")
    private WebElement policydevelopmentresourcesElement;

    public IfbLink policydevelopmentresourceslink = new IfbLink(driver, policydevelopmentresourcesElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a")
    private WebElement policyrecommendationformElement;

    public IfbLink policyrecommendationformlink = new IfbLink(driver, policyrecommendationformElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement policyimplementationElement;

    public IfbLink policyimplementationlink = new IfbLink(driver, policyimplementationElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div[1]/div/a[7]")
    private WebElement policyactioncommitteesElement;

    public IfbLink policyactioncommitteeslink = new IfbLink(driver, policyactioncommitteesElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement donatetoagelectElemet;

    public IfbLink donatetoagelectlink = new IfbLink(driver, donatetoagelectElemet);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement donatenowElement;

    public IfbLink donatenowlink = new IfbLink(driver, donatenowElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement agelectdisclaimerElement;

    public IfbLink agelectdisclaimerlink = new IfbLink(driver, agelectdisclaimerElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[8]")
    private WebElement INFB100Element;

    public IfbLink INFB100link = new IfbLink(driver, INFB100Element);



    public PublicPolicyPage(WebDriver driver) {

        super(driver, SPINNER);

    }
}

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

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement takeactionElement;

    public IfbLink takeactionlink = new IfbLink(driver, takeactionElement);


    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[5]/a")
    private WebElement policydevelopmentElement;

    public IfbLink policydevelopmentlink = new IfbLink(driver, policydevelopmentElement);

    public PublicPolicyPage(WebDriver driver) {

        super(driver, SPINNER);

    }
}

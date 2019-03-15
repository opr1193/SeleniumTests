package com.infarmbureau.incorporated.test.pages.PublicPolicy;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class PublicPolicyPage extends Page {

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[1]/a")
    private WebElement nationalissuesElement;

    public IfbLink nationalissueslink = new IfbLink(driver, nationalissuesElement);


    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[2]/a")
    private WebElement stateissuesElement;

    public IfbLink stateissueslink = new IfbLink(driver, stateissuesElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/a")
    private WebElement localissuesElement;

    public IfbLink localissueslink = new IfbLink(driver, localissuesElement);

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

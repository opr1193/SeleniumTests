package com.infarmbureau.incorporated.test.pages.HealthPlans;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class HPAboutPage extends Page {


    @FindBy(xpath = "//*[@id=\"label-9F452901-BB8C-49C9-90C5-60C8B3B49DE3\"]")
    private WebElement aboutElement;

    public IfbLink aboutlink = new IfbLink(driver, aboutElement);


    @FindBy(xpath = "//*[@id=\"Great\"]")
    private WebElement greatElement;

    public IfbLink greatlink = new IfbLink(driver, greatElement);


    @FindBy(xpath = "//*[@id=\"Textbox-1\"]")
    private WebElement recommendplanElement;

    public IfbTextBox recommendtextbox = new IfbTextBox(driver, recommendplanElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C002_Col00\"]/div[4]/form/div[5]/button")
    private WebElement  submitElement;

    public IfbLink submitlink = new IfbLink(driver, submitElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder1_C002_Col00\"]/div[5]/div/div/div/a")
    private WebElement visitfaqsElement;

    public IfbLink visitfaqslink = new IfbLink(driver, visitfaqsElement);











    public HPAboutPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}


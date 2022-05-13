package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MyAccountPage extends Page {



    @FindBy(xpath= "//*[@id=\"Contentplaceholder_C020_Col00\"]/div[1]/div[1]/div/div/div[1]/div[1]")
    private WebElement viewmembershipcardElement;

    public IfbLink viewmembershipcardlink = new IfbLink(driver, viewmembershipcardElement);

    @FindBy(id = "Contentplaceholder_C020_Col00")
    //*[@id="Contentplaceholder_C020_Col00"]/form[1]/div[1]/button[2]
    //*[@id="Contentplaceholder_C020_Col00"]/form[1]/div[1]/button[2]
    private WebElement gopaperlessElement;

    public IfbButton gopaperlessbutton = new IfbButton(driver, gopaperlessElement);

    public MyAccountPage(WebDriver driver) {

        super(driver, SPINNER);

}}

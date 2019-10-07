package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class HomePageIE extends Page {

    @FindBy(xpath = "//*[@id=\"main-nav-container_mn_active\"]/a")
    private WebElement loginElement;

    public IfbLink loginlink = new IfbLink(driver, loginElement);


    public HomePageIE(InternetExplorerDriver driver) {

        super(driver, SPINNER);
    }
}

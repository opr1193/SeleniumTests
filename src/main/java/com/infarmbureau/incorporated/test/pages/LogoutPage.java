package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLabel;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class LogoutPage extends Page {

    @FindBy(xpath= "//*[@id=\"msg\"]/h2")
    private WebElement logoutlabelElement;

    public IfbLabel logoutlabel = new IfbLabel(driver, logoutlabelElement);


    public LogoutPage(WebDriver driver) {

        super(driver, SPINNER);
    }
    }
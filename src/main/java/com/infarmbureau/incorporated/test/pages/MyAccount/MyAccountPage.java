package com.infarmbureau.incorporated.test.pages.MyAccount;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MyAccountPage extends Page {

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[1]/a")
    private WebElement myprofileElement;

    public IfbLink myprofilelink = new IfbLink(driver, myprofileElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/a")
    private WebElement printMembershipCardElement;

    public IfbLink printmembershipcardlink = new IfbLink(driver, printMembershipCardElement);

    @FindBy(xpath= "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement contactusElement;

    public IfbLink contactuslink = new IfbLink(driver, contactusElement);

    public MyAccountPage(WebDriver driver) {

        super(driver, SPINNER);

}}

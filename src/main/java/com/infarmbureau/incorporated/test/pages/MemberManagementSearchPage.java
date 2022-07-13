package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MemberManagementSearchPage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-chip-list-0\"]/div/mat-chip[4]")
    private WebElement membersElement;

    public IfbLink memberslink = new IfbLink(driver, membersElement);

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstnameElement;

    public IfbTextBox firstnametextbox = new IfbTextBox(driver, firstnameElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-member-search/app-search-form/mat-card/div[1]/button[2]")
    private WebElement searchElement;

    public IfbLink searchlink = new IfbLink(driver, searchElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-member-search/div[3]/app-search-results/mat-card/div/div[2]/table/tbody/tr[1]/td[3]")
    private WebElement searchresultElement;

    public IfbLink searchresultlink = new IfbLink(driver, searchresultElement);

    public MemberManagementSearchPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
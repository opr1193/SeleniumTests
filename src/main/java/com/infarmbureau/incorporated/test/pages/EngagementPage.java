package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class EngagementPage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-chip-list-0\"]/div/mat-chip[3]")
    //*[@id="mat-chip-list-0"]/div/mat-chip[3]
    private WebElement engagementsElement;

    public IfbLink engagementslink = new IfbLink(driver, engagementsElement);

    @FindBy(xpath = "//*[@id=\"mat-chip-list-1\"]/div/mat-chip[2]")
    //*[@id="mat-chip-list-1"]/div/mat-chip[2]
    //*[@id="mat-chip-list-0"]/div/mat-chip[2]
    //*[@id="mat-chip-list-0"]/div/mat-chip[2]
    //*[@id="mat-chip-list-1"]/div/mat-chip[2]
    private WebElement engagementssearchElement;

    public IfbLink engagementssearchlink = new IfbLink(driver, engagementssearchElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-engagements/mat-card/app-engagement-tree/div/div[1]/app-engagement-tier/form/span/div/span/mat-selection-list/mat-list-option[2]/div/mat-pseudo-checkbox")
    private WebElement aitcElement;

    public IfbCheckBox aitccheckbox = new IfbCheckBox(driver, aitcElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-engagements/mat-card/app-engagement-tree/div[1]/div[1]/app-engagement-tier[2]/form/span/div/span/mat-selection-list/mat-list-option[6]/div/mat-pseudo-checkbox")
    private WebElement stateElement;

    public IfbCheckBox statecheckbox = new IfbCheckBox(driver, stateElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-engagements/mat-card/div/button[2]/span[1]/mat-icon")
    private WebElement searchenglement;


    public IfbButton searchengbutton = new IfbButton(driver, searchenglement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-engagements/div/app-search-results/mat-card/div/div[2]/table/tbody/tr[1]/td[2]")
    private WebElement searchengresultelement;

    public IfbLink searchengresultlink = new IfbLink(driver, searchengresultelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-individual-engagements/a[2]/span[1]")
    private WebElement backtoengelement;

    public IfbLink backtoenglink = new IfbLink(driver, backtoengelement);

    @FindBy(xpath = "//*[@id=\"mat-chip-list-1\"]/div/mat-chip[1]")
    private WebElement addengagelement;

    public IfbLink addengagelink = new IfbLink(driver, addengagelement);

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstaddengelement;

    public IfbTextBox firstaddengtextbox = new IfbTextBox(driver, firstaddengelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/app-search-form/mat-card/div[1]/button[2]/span[1]/mat-icon")
    private WebElement searchmemelement;

    public IfbLink searchmemlink = new IfbLink(driver, searchmemelement);

    @FindBy(xpath = "    /html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-engagements/div/app-search-results/mat-card/div/div[2]/table/tbody/tr[1]/td[2]\n")
    private WebElement firstsearchresultelement;

    public IfbLink firstsearchresultlink = new IfbLink(driver, firstsearchresultelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/mat-card/app-engagement-picker/form/div/div[4]/mat-form-field[3]/div/div[1]/div[2]/mat-datepicker-toggle/button")
    private WebElement effectivedateelement;

    public IfbDropDown effectivedatedropdown = new IfbDropDown(driver, effectivedateelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/mat-card/app-engagement-picker/form/div/div[4]/mat-form-field[4]/div/div[1]/div[2]/mat-datepicker-toggle/button")
    private WebElement expirationdateelement;

    public IfbDropDown expirationdatedropdown = new IfbDropDown(driver, expirationdateelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/mat-card/app-engagement-picker/form/div/div[1]/app-engagement-tier/form/span/div/span[1]/mat-selection-list/mat-list-option[2]/div/mat-pseudo-checkbox")
    private WebElement addaitcelement;

    public IfbCheckBox addaitccheckbox = new IfbCheckBox(driver, addaitcelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/mat-card/app-engagement-picker/form/div/div[1]/app-engagement-tier[2]/form/span/div/span[1]/mat-selection-list/mat-list-option[6]/div/mat-pseudo-checkbox")
    private WebElement addstateconvelement;

    public IfbCheckBox addstateconvcheckbox = new IfbCheckBox(driver, addstateconvelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/mat-card/app-engagement-picker/form/div/div[3]/button/span[1]")
    private WebElement addtoselectionelement;

    public IfbLink addtoselectionlink = new IfbLink(driver, addtoselectionelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/div/button/span[1]")
    private WebElement saveengagementelement;

    public IfbLink saveengagementlink = new IfbLink(driver, saveengagementelement);

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-message-dialog/div[3]/button")
    private WebElement addsuccesselement;

    public IfbLink addsucesslink = new IfbLink(driver, addsuccesselement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-create-new-engagement/a/span[1]")
    private WebElement backtohomeelement;

    public IfbLink backtohomelink = new IfbLink(driver, backtohomeelement);

    @FindBy(xpath = "//*[@id=\"mat-chip-list-1\"]/div/mat-chip[3]")
    private WebElement searchmembersforengagementselement;

    public IfbLink searchmembersforengagementslink = new IfbLink(driver, searchmembersforengagementselement);

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement searchmembersfirstnameelement;

    public IfbTextBox searchmembersfirstnametextbox = new IfbTextBox(driver, searchmembersfirstnameelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-members/app-search-form/mat-card/div[1]/button[2]")
    private WebElement searchmemberselement;

    public IfbButton searchmembersbutton = new IfbButton(driver, searchmemberselement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-search-members/div/app-search-results/mat-card/div/div[2]/table/tbody/tr[1]/td[2]")
    private WebElement searchmembersresultelement;
    public IfbLink searchmembersresultlink = new IfbLink(driver, searchmembersresultelement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-individual-engagements/mat-card[2]/div/table/tbody/tr[1]/td[6]/div/span/button[1]/span[1]/mat-icon")
    private WebElement editengagementelement;
    public IfbLink editengagementlink = new IfbLink(driver, editengagementelement);

    @FindBy(xpath = "//*[@id=\"mat-input-12\"]")
    //*[@id="mat-input-12"]
    private WebElement engexpirydateelement;
    public IfbTextBox engexpirydatetextbox = new IfbTextBox(driver, engexpirydateelement);

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-edit-engagement/form/div[2]/button[2]")
    //*[@id="mat-dialog-0"]/app-edit-engagement/form/div[2]/button[2]/span[2]
    private WebElement editengsaveelement;
    public IfbLink editengsavelink = new IfbLink(driver, editengsaveelement);

    @FindBy(xpath = "    /html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-individual-engagements/a[2]/span[1]\n")
    private WebElement searchmembersbacktoengagementelement;

    public IfbLink searchmembersbacktoengagementlink = new IfbLink(driver, searchmembersbacktoengagementelement);


    public EngagementPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
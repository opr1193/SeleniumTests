package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class StudentMembershipPurchasePage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-radio-4\"]/label/div[2]/div/div[1]/span[1]")
    private WebElement studentElement;

    public IfbRadioButton studentradiobutton = new IfbRadioButton(driver, studentElement);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[1]/div/app-membership-type-form/div/div[3]/div[2]/button")
    private WebElement nextElement;

    public IfbButton nextbutton = new IfbButton(driver, nextElement);

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement firstnameElement;

    public IfbTextBox firstnametextbox = new IfbTextBox(driver, firstnameElement);

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    private WebElement lastnameElement;

    public IfbTextBox lastnametextbox = new IfbTextBox(driver, lastnameElement);

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    private WebElement dobElement;

    public IfbTextBox dobtextbox = new IfbTextBox(driver, dobElement);

    @FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]")
    private WebElement genderElement;

    public IfbDropDown genderdropdown = new IfbDropDown(driver, genderElement);

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement emailaddressElement;

    public IfbTextBox emailaddresstextbox = new IfbTextBox(driver, emailaddressElement);

    @FindBy(xpath = "//*[@id=\"mat-input-4\"]")
    private WebElement mobilephoneElement;

    public IfbTextBox mobilephonetextbox = new IfbTextBox(driver, mobilephoneElement);

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement homephoneElement;

    public IfbTextBox homephonetextbox = new IfbTextBox(driver, homephoneElement);

    @FindBy(xpath = "//*[@id=\"mat-input-7\"]")
    //*[@id="mat-input-7"]
    private WebElement addressElement;

    public IfbTextBox addresstextbox = new IfbTextBox(driver,addressElement);

    @FindBy(xpath = "//*[@id=\"mat-input-9\"]")
    private WebElement cityElement;

    public IfbTextBox citytextbox = new IfbTextBox(driver, cityElement);

    @FindBy(xpath = "//*[@id=\"mat-input-10\"]")
    private WebElement stateElement;

    public IfbTextBox statetextbox = new IfbTextBox(driver, stateElement);

    @FindBy(xpath = "//*[@id=\"mat-input-11\"]")
    private WebElement zipcodeElement;

    public IfbTextBox zipcodetextbox = new IfbTextBox(driver, zipcodeElement);

    @FindBy(xpath = "//*[@id=\"mat-select-3\"]/div/div[1]")
    private WebElement countyElement;

    public IfbDropDown countydropdown = new IfbDropDown(driver, countyElement);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[2]/div/app-personal-info-form/div/div[3]/div[2]/button[1]")
    private WebElement next1Element;

    public IfbButton next1button = new IfbButton(driver, next1Element);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[3]/div/app-household-form/div/div[3]/div[2]/button[1]")
    private WebElement next2Element;

    public IfbButton next2button = new IfbButton(driver, next2Element);

    @FindBy(xpath = "//*[@id=\"mat-radio-10\"]/label/div[2]/div/div/span")
    private WebElement notinvagriElement;

    public IfbRadioButton notinvagriradiobutton = new IfbRadioButton(driver, notinvagriElement);

    @FindBy(xpath = "//*[@id=\"mat-select-2\"]/div/div[1]/span")
    private WebElement referredbyElement;

    public IfbDropDown referredbydropdown = new IfbDropDown(driver, referredbyElement);

    @FindBy(xpath = "//*[@id=\"mat-checkbox-1\"]/label/div")
    private WebElement enrolledElement;

    public IfbCheckBox enrolledcheckbox = new IfbCheckBox(driver, enrolledElement);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[4]/div/app-involvement-form/div/div[2]/div[2]/button[1]")
    private WebElement next3Element;

    public IfbButton next3button = new IfbButton(driver, next3Element);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[5]/div/app-payment-prompt/div/div[3]/div[2]/button[1]")
    private WebElement purchaseElement;

    public IfbButton purchasebutton = new IfbButton(driver, purchaseElement);







































    public StudentMembershipPurchasePage(WebDriver driver) {

        super(driver, SPINNER);
    }
}

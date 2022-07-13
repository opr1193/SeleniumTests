package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbRadioButton;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class SelectMembershipPurchasePage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-radio-3\"]/label/div[2]/div/div[2]")
    private WebElement selectElement;

    public IfbRadioButton selectradiobutton = new IfbRadioButton(driver, selectElement);

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

    @FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]/span")
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

    @FindBy(xpath = "//*[@id=\"mat-input-12\"]")
    private WebElement membernumberElement;

    public IfbTextBox membernumbertextbox = new IfbTextBox(driver, membernumberElement);

    @FindBy(xpath = "//*[@id=\"mat-input-13\"]")
    private WebElement primarylastnameElement;

    public IfbTextBox primarylastnametextbox = new IfbTextBox(driver, primarylastnameElement);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[2]/div/app-personal-info-form/div/div[3]/div[2]/button[1]")
    private WebElement next1Element;

    public IfbButton next1button = new IfbButton(driver, next1Element);

    @FindBy(xpath = "//*[@id=\"mat-radio-10\"]/label/div[2]/div/div/span")
    private WebElement notinvagriElement;

    public IfbRadioButton notinvagriradiobutton = new IfbRadioButton(driver, notinvagriElement);

    @FindBy(xpath = "//*[@id=\"mat-radio-10\"]/label/div[2]/div/div/span")
    private WebElement referredbyElement;

    public IfbDropDown referredbydropdown = new IfbDropDown(driver, referredbyElement);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[4]/div/app-involvement-form/div/div[2]/div[2]/button[1]")
    private WebElement next2Element;

    public IfbButton next2button = new IfbButton(driver, next2Element);

    @FindBy(xpath = "/html/body/app-root/app-pager/div/div/div[2]/app-input-card/div/div[5]/div/app-payment-prompt/div/div[3]/div[2]/button[1]")
    private WebElement purchaseElement;

    public IfbButton purchasebutton = new IfbButton(driver, purchaseElement);








































    public SelectMembershipPurchasePage(WebDriver driver) {

        super(driver, SPINNER);
    }
}

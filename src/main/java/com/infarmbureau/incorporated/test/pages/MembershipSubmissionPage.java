package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbCheckBox;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MembershipSubmissionPage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-select-value-1\"]/span")
    private WebElement membtypeElement;

    public IfbDropDown membtypedropdown = new IfbDropDown(driver, membtypeElement);

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement effectivedateElement;

    public IfbTextBox effectivedatetextbox = new IfbTextBox(driver, effectivedateElement);

    @FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
    private WebElement memberclassificationElement;

    public IfbDropDown memberclassificationdropdown = new IfbDropDown(driver, memberclassificationElement);

    @FindBy(xpath = "//*[@id=\"mat-select-value-5\"]/span")
    private WebElement membercodeElement;

    public IfbDropDown membercodedropdown = new IfbDropDown(driver, membercodeElement);

    @FindBy(xpath = "//*[@id=\"mat-select-value-7\"]")
    //*[@id="mat-select-value-7"]/span
    private WebElement billaccountElement;

    public IfbDropDown billaccountdropdown = new IfbDropDown(driver, billaccountElement);

    @FindBy(xpath = "//*[@id=\"mat-select-value-13\"]")
    private WebElement memberreferralElement;

    public IfbDropDown memberreferraldropdown = new IfbDropDown(driver, memberreferralElement);

    @FindBy(className = "mat-focus-indicator mat-raised-button mat-button-base mat-primary")
    private WebElement submitElement;
    public IfbButton submitbutton = new IfbButton(driver, submitElement);



    public MembershipSubmissionPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
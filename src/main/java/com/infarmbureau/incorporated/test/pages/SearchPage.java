package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class SearchPage extends Page {


    @FindBy(xpath = "//*[@id=\"seach-menu-dropdown\"]/i")

    private WebElement searchElement;

    public IfbDropDown searchdropdown = new IfbDropDown(driver, searchElement);

    @FindBy(xpath = "//*[@id=\"d5b0c9e1-8a13-435e-a32d-351a52eefab8\"]")
    private WebElement searchboxElement;

    public IfbTextBox searchboxlink = new IfbTextBox(driver, searchboxElement);

    //*[@id="d5b0c9e1-8a13-435e-a32d-351a52eefab8"]

    @FindBy(xpath = "//*[@id=\"686bd193-95ee-440d-8032-74237d9ef0c5\"]\n")
    private WebElement searchlinkElement;

    public IfbTextBox searchlinklink = new IfbTextBox(driver, searchlinkElement);

    @FindBy(xpath = "//*[@id=\"d083dd92-ecb1-4cd7-84e2-15802eab31c6\"]")
    private WebElement searchboxclickElement;

    public IfbButton searchboxclickbutton = new IfbButton(driver, searchboxclickElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_TA53A93A2001_Col00\"]/div[4]/div[2]/div[2]/div/div[1]/a")
    private WebElement searchresultclickElement;

    public IfbLink searchresultclicklink = new IfbLink(driver, searchresultclickElement);





    public SearchPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
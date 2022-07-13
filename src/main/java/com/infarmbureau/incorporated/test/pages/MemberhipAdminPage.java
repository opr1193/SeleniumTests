package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbCheckBox;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MemberhipAdminPage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-checkbox-4\"]/label/span[1]")
    private WebElement sendmemcardElement;

    public IfbCheckBox sendmemcardcheckbox = new IfbCheckBox(driver, sendmemcardElement);

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-member-admin/form/div[2]/button")
    private WebElement saveElement;

    public IfbButton savebutton = new IfbButton(driver, saveElement);

    public MemberhipAdminPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
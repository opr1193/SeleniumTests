package com.infarmbureau.sitefinity.test.pages.MemberManagement;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MemberManagementPage<IfbCheckbox> extends Page {

    @FindBy(xpath = "//*[@id=\"mat-chip-list-0\"]/div/mat-chip[2]")
        private WebElement eventsElement;

    @FindBy(xpath = "//*[@id=\"mat-chip-list-1\"]/div/mat-chip[3]")
    private WebElement engagementsElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-home/div/a/span")
    private WebElement incmembershipElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-event-list/app-floating-action-button/div/button/span/mat-icon")
    private WebElement neweventElement;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement eventtitleElement;

    @FindBy(xpath = "//*[@id=\"mat-input-7\"]")
    private WebElement hostnameElement;

    @FindBy(xpath = "//*[@id=\"mat-input-8\"]")
    private WebElement hostphoneElement;

    @FindBy(xpath = "//*[@id=\"mat-input-9\"]" )
    private WebElement hosttwitterhandleElement;

    @FindBy(xpath = "//*[@id=\"mat-input-10\"]")
    private WebElement hashtagElement;

    @FindBy(xpath = "//*[@id=\"mat-input-11\"]")
    private WebElement bannerimageElement;

    @FindBy(xpath = "//*[@id=\"mat-input-12\"]")
    private WebElement descriptionElement;

    @FindBy(xpath = "//*[@id=\"mat-input-11\"]")
    private WebElement attendancecostElement;

    @FindBy(xpath = "//*[@id=\"mat-input-13\"]")
    private WebElement venuedescriptionElement;



    @FindBy(xpath = "//*[@id=\"mat-input-14\"]")
    private WebElement addressdescriptionElement;

    @FindBy(xpath = "//*[@id=\"mat-input-15\"]")
    private WebElement addressdescriptiontwoElement;

    @FindBy(xpath = "//*[@id=\"mat-input-16\"]")
    private WebElement cityElement;

    @FindBy(xpath = "//*[@id=\"mat-input-17\"]")
    private WebElement stateElement;

    @FindBy(xpath = "//*[@id=\"mat-input-18\"]")
    private WebElement zipcodeElement;

    @FindBy(xpath = "//*[@id=\"mat-input-19\"]")
    private WebElement countyElement;

    @FindBy(xpath = "//*[@id=\"mat-select-3\"]/div/div[1]/span")
    private WebElement districtElement;

    @FindBy(xpath = "//*[@id=\"mat-input-24\"]")
    private WebElement startdateElement;

//    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-month-view/table/tbody/tr[1]/td[5]/div")
//    private WebElement startdate;

//    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-clock/div/div[3]/*[@class = 'mat-datetimepicker-clock-cell mat-datetimepicker-clock-cell-selected ng-star-inserted']")
//    private WebElement startHourElement;

//    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-clock/div/div[4]/div[1]")
//    private WebElement startMinuteElement;

    @FindBy(xpath = "//*[@id=\"mat-input-25\"]")
    private WebElement enddateElement;

//    @FindBy(xpath = "//*[@id=\"mat-input-16\"]")
//    private WebElement starttimeElement;
//
//    @FindBy(xpath = "//*[@id=\"mat-input-17\"]")
//    private WebElement endtimeElement;

    @FindBy(xpath = "//*[@id=\"mat-input-26\"]")
    private WebElement registrationopenElement;

    @FindBy(xpath = "//*[@id=\"mat-input-27\"]")
    private WebElement registrationendElement;

    @FindBy(xpath = "//*[@id=\"mat-input-20\"]")
    private WebElement maximumattendeesElement;

    @FindBy(xpath = "//*[@id=\"mat-slide-toggle-3\"]/label/div/div/div[1]")
    private WebElement enablewaitlistElement;

    @FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-3\"]/span[1]")
    private WebElement paymentsectionElement;

    @FindBy(xpath = "//*[@id=\"mat-input-21\"]")
    private WebElement basecostElement;

    @FindBy(xpath = "//*[@id=\"mat-input-22\"]")
    private WebElement costdescriptionElement;

    @FindBy(id = "mat-select-4")
    private WebElement payeeElement;

    @FindBy(xpath = "//*[@id=\"cdk-accordion-child-3\"]/div/section[3]/app-qualifier-editor/div/a/span/mat-icon")
    private WebElement qualifiersElement;

    @FindBy(xpath = "//*[@id=\"mat-input-28\"]")
    private WebElement qualifiertextElement;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-text-dialog/div[2]/button/span")
    private WebElement addqualifierElement;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-event-editor/form/div[2]/button")
    private WebElement saveElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-view-event/mat-card/mat-card-title/div/div/button[2]")
    private WebElement editElement;

    @FindBy(id = "mat-input-38")
    private WebElement editmaxattendeesElement;

    @FindBy(id = "mat-dialog-1")
    private WebElement editsaveElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-view-event/a")
    private WebElement backtooverviewElement;

    @FindBy(xpath = "//*[@id=\"cdk-accordion-child-3\"]/div/section[4]/app-discount-editor/div[1]/a/span/mat-icon")
    private WebElement discountElement;

    @FindBy(xpath = "//*[@id=\"cdk-overlay-8\"]/div/div/a[5]")
    private WebElement discountselectionElement;

    @FindBy(xpath = "//*[@id=\"mat-input-29\"]")
    private WebElement discountamountElement;

    @FindBy(xpath = "//*[@id=\"cdk-accordion-child-3\"]/div/section[4]/app-discount-editor/div[2]/div/div/span/a/span/mat-icon")
    private WebElement engagementselectionElement;

    @FindBy(xpath = "//*[@id=\"cdk-accordion-child-5\"]/div/mat-selection-list/mat-list-option[4]/div/mat-pseudo-checkbox")
    private WebElement selectengagementElement;

    @FindBy(xpath = "//*[@id=\"cdk-accordion-child-6\"]/div/mat-selection-list/mat-list-option[1]/div/mat-pseudo-checkbox")
    private WebElement selectengagement1Element;

    @FindBy(xpath = "//*[@id=\"mat-dialog-2\"]/app-engagement-selection-dialog/div[3]/button[2]/span")
    private WebElement acceptselectionElement;


    public IfbButton eventsButton = new IfbButton(driver, eventsElement);

    public IfbButton engagementsButton = new IfbButton(driver, engagementsElement);

    public IfbButton incmembershipButton = new IfbButton(driver, incmembershipElement);

    public IfbLink neweventLink = new IfbLink(driver, neweventElement);

    public IfbTextBox eventtitleTextField = new IfbTextBox(driver, eventtitleElement);

    public IfbTextBox hostnameTextField = new IfbTextBox(driver, hostnameElement);

    public IfbTextBox hostphoneTextField = new IfbTextBox(driver, hostphoneElement);

    public IfbTextBox hosttwitterhandleTextField = new IfbTextBox(driver, hosttwitterhandleElement);

    public IfbTextBox hashtagTextField = new IfbTextBox(driver, hashtagElement);

    public IfbTextBox bannerimageTextField = new IfbTextBox(driver, bannerimageElement);

    public IfbTextBox descriptionTextField = new IfbTextBox(driver, descriptionElement);

    public IfbTextBox attendancecostTextField = new IfbTextBox(driver, attendancecostElement);

    public IfbTextBox venuedescriptionTextField  = new IfbTextBox(driver, venuedescriptionElement);

    public IfbTextBox addressdescriptionTextField = new IfbTextBox(driver, addressdescriptionElement);

    public IfbTextBox addressdescriptiontwoTextField = new IfbTextBox(driver, addressdescriptiontwoElement);

    public IfbTextBox cityTextField = new IfbTextBox(driver,cityElement);

    public IfbTextBox stateTextField = new IfbTextBox(driver,stateElement);

    public IfbTextBox zipcodeTextField = new IfbTextBox(driver,zipcodeElement);

    public IfbTextBox countyTextField = new IfbTextBox(driver, countyElement);

    public  IfbTextBox districtTextField = new IfbTextBox(driver, districtElement);

    public IfbTextBox startdateTextField = new IfbTextBox(driver,startdateElement);
//
//    public IfbTextBox todaysDate = new IfbTextBox(driver,startdate);
//
//    public IfbTextBox startHour = new IfbTextBox(driver,startHourElement);
//
//    public IfbTextBox startMinute = new IfbTextBox(driver,startMinuteElement);

    public IfbTextBox endDateTextField = new IfbTextBox(driver, enddateElement);
//
//    public IfbTextBox starttimeTextField = new IfbTextBox(driver,starttimeElement);
//
//    public IfbTextBox endtimeTextField = new IfbTextBox(driver, endtimeElement);

    public IfbTextBox registrationopenTextField = new IfbTextBox(driver, registrationopenElement);

    public IfbTextBox registrationendTextField = new IfbTextBox(driver, registrationendElement);

    public IfbTextBox maximumattendeesTextField = new IfbTextBox(driver, maximumattendeesElement);

    public IfbButton enablewaitlistButton = new IfbButton(driver, enablewaitlistElement);

    public IfbButton paymentsectionButton = new IfbButton(driver, paymentsectionElement);

    public IfbTextBox basecostTextField = new IfbTextBox(driver, basecostElement);

    public IfbTextBox costdescriptionTextField = new IfbTextBox(driver, costdescriptionElement);

    public IfbDropDown payeedropdown = new IfbDropDown(driver, payeeElement);

    public IfbButton qualifiersbutton = new IfbButton(driver, qualifiersElement);

    public IfbTextBox qualifierTextField = new IfbTextBox(driver, qualifiertextElement);

    public IfbButton addqualifierButton = new IfbButton(driver, addqualifierElement);

    public IfbButton discountButton = new IfbButton(driver, discountElement);

    public IfbButton discountselectionButton = new IfbButton(driver, discountselectionElement);

    public IfbTextBox discountamountTextField = new IfbTextBox(driver, discountamountElement);

    public IfbButton engagementselectionButton = new IfbButton(driver, engagementselectionElement);

    public IfbButton selectengagementButton = new IfbButton(driver, selectengagementElement);

    public IfbButton selectengagement1Button = new IfbButton(driver, selectengagement1Element);

    public IfbButton acceptselectionButton = new IfbButton(driver, acceptselectionElement);


    public IfbButton saveButton = new IfbButton(driver, saveElement);

    public IfbButton editButton = new IfbButton(driver, editElement);

    public IfbTextBox editmaxattendeesTextField = new IfbTextBox(driver, editmaxattendeesElement);

    public IfbButton editsaveButton = new IfbButton(driver, editsaveElement);

    public IfbButton backtooverviewButton = new IfbButton(driver, backtooverviewElement);

    public MemberManagementPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}


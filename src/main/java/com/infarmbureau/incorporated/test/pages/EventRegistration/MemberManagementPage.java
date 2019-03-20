package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbRadioButton;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class MemberManagementPage extends Page {

    @FindBy(xpath = "//*[@id=\"mat-chip-list-0\"]/div/mat-chip[2]")
        private WebElement eventsElement;

    @FindBy(xpath = "//*[@id=\"mat-chip-list-1\"]/div/mat-chip[3]")
    private WebElement engagementsElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-home/div/a/span")
    private WebElement incmembershipElement;

    @FindBy(xpath = "/html/body/app-root/app-navigation-drawer/mat-sidenav-container/mat-sidenav-content/div/div/div/app-event-list/app-floating-action-button/div/button/span/mat-icon")
    private WebElement neweventElement;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement eventtitleElement;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement hostnameElement;

    @FindBy(xpath = "//*[@id=\"mat-input-7\"]")
    private WebElement hostphoneElement;

    @FindBy(xpath = "//*[@id=\"mat-input-8\"]" )
    private WebElement hosttwitterhandleElement;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-event-editor/form/section[2]/mat-form-field[1]/div/div[1]/div[1]")
    private WebElement hashtagElement;

    @FindBy(xpath = "//*[@id=\"mat-input-48\"]")
    private WebElement bannerimageElement;

    @FindBy(xpath = "//*[@id=\"mat-input-9\"]")
    private WebElement venuedescriptionElement;


    @FindBy(xpath = "//*[@id=\"mat-input-10\"]")
    private WebElement addressdescriptionElement;

    @FindBy(xpath = "//*[@id=\"mat-input-11\"]")
    private WebElement addressdescriptiontwoElement;

    @FindBy(xpath = "//*[@id=\"mat-input-12\"]")
    private WebElement cityElement;

    @FindBy(xpath = "//*[@id=\"mat-input-13\"]")
    private WebElement stateElement;

    @FindBy(xpath = "//*[@id=\"mat-input-14\"]")
    private WebElement zipcodeElement;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-event-editor/form/app-date-range[1]/form/mat-form-field[1]/div/div[1]/div[2]/mat-datetimepicker-toggle")
    private WebElement startdateElement;

    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-month-view/table/tbody/tr[1]/td[5]/div")
    private WebElement startdate;

    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-clock/div/div[3]/*[@class = 'mat-datetimepicker-clock-cell mat-datetimepicker-clock-cell-selected ng-star-inserted']")
    private WebElement startHourElement;

    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-clock/div/div[4]/div[1]")
    private WebElement startMinuteElement;

    @FindBy(xpath = "//*[@id=\"mat-datetimepicker-0\"]/div[2]/mat-datetimepicker-month-view/table/tbody/tr[1]/td[5]/div")
    private WebElement enddateElement;

    @FindBy(xpath = "//*[@id=\"mat-input-16\"]")
    private WebElement starttimeElement;

    @FindBy(xpath = "//*[@id=\"mat-input-17\"]")
    private WebElement endtimeElement;

    @FindBy(xpath = "//*[@id=\"mat-input-18\"]")
    private WebElement registrationopenElement;

    @FindBy(xpath = "//*[@id=\"mat-input-19\"]")
    private WebElement registrationendElement;

    @FindBy(xpath = "//*[@id=\"mat-input-15\"]")
    private WebElement maximumattendeesElement;

    @FindBy(xpath = "//*[@id=\"mat-slide-toggle-2\"]/label")
    private WebElement enablewaitlistElement;

    @FindBy(xpath = "//*[@class=\"mat-raised-button mat-accent\"]")//*[@id="mat-dialog-0"]/app-event-editor/form/div[3]/button/div[2]

    private WebElement saveElement;

    //*[@id="mat-dialog-2"]/app-event-editor/form/div[3]/button/span


    public IfbButton eventsButton = new IfbButton(driver, eventsElement);

    public IfbButton engagementsButton = new IfbButton(driver, engagementsElement);

    public IfbButton incmembershipButton = new IfbButton(driver, incmembershipElement);

    public IfbLink neweventLink = new IfbLink(driver, neweventElement);

    public IfbTextBox eventtitleTextField = new IfbTextBox(driver, eventtitleElement);

    public IfbTextBox hostnameTextField = new IfbTextBox(driver, hostnameElement);

    public IfbTextBox hostphoneTextField = new IfbTextBox(driver, hostphoneElement);

    public IfbTextBox hosttwitterhandleTextField = new IfbTextBox(driver, hosttwitterhandleElement);

    public IfbTextBox hashtagTextField = new IfbTextBox(driver, hashtagElement);


    public IfbTextBox venuedescriptionTexrGield  = new IfbTextBox(driver, venuedescriptionElement);

    public IfbTextBox addressdescriptionTextField = new IfbTextBox(driver, addressdescriptionElement);

    public IfbTextBox addressdescriptiontwoTextField = new IfbTextBox(driver, addressdescriptiontwoElement);

    public IfbTextBox cityTextField = new IfbTextBox(driver,cityElement);

    public IfbTextBox stateTextField = new IfbTextBox(driver,stateElement);

    public IfbTextBox zipcodeTextField = new IfbTextBox(driver,zipcodeElement);

    public IfbTextBox startdateButton = new IfbTextBox(driver,startdateElement);

    public IfbTextBox todaysDate = new IfbTextBox(driver,startdate);

    public IfbTextBox startHour = new IfbTextBox(driver,startHourElement);

    public IfbTextBox startMinute = new IfbTextBox(driver,startMinuteElement);

    public IfbTextBox endDate = new IfbTextBox(driver, enddateElement);

    public IfbTextBox starttimeTextField = new IfbTextBox(driver,starttimeElement);

    public IfbTextBox endtimeTextField = new IfbTextBox(driver, endtimeElement);

    public IfbTextBox registrationopenTextField = new IfbTextBox(driver, registrationopenElement);

    public IfbTextBox registrationendTextField = new IfbTextBox(driver, registrationendElement);

    public IfbTextBox maximumattendeesTextField = new IfbTextBox(driver, maximumattendeesElement);

    public IfbButton enablewaitlistButton = new IfbButton(driver, enablewaitlistElement);

    public IfbButton saveButton = new IfbButton(driver, saveElement);


    public MemberManagementPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}


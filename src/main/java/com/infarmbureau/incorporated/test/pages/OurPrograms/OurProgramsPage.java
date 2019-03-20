package com.infarmbureau.incorporated.test.pages.OurPrograms;

import com.infarmbureau.qa.elements.IfbCheckBox;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class OurProgramsPage extends Page {

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[1]/a")
    private WebElement agintheclassroomElement;

    public IfbLink agintheclassroomlink = new IfbLink(driver, agintheclassroomElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[1]/ul/li[1]/a")
    private WebElement classroomcenterElement;

    public IfbLink classroomcenterlink = new IfbLink(driver, classroomcenterElement);

    @FindBy(xpath = "//*[@id=\"MainContent_C010_Col01\"]/div/div/a")
    private WebElement teacherregistrationElement;

    public IfbLink teacherregistrationlink = new IfbLink(driver, teacherregistrationElement);

    @FindBy(xpath = "//*[@id=\"Teacher_Name\"]")
    private WebElement teachernameElement;

    public IfbTextBox teachernametextbox = new IfbTextBox(driver, teachernameElement);

    @FindBy(xpath = "//*[@id=\"Teacher_Email\"]")
    private WebElement teacheremailElement;

    public  IfbTextBox teacheremailtextbox = new IfbTextBox(driver, teacheremailElement);

    @FindBy(xpath = "//*[@id=\"School_Name\"]")
    private WebElement nameElement;

    public IfbTextBox nametextbox = new IfbTextBox(driver, nameElement);


    @FindBy(xpath = "//*[@id=\"School_Address_Street\"]")
    private WebElement addressElement;

    public IfbTextBox addresstextbox = new IfbTextBox(driver, addressElement);

    @FindBy(xpath = "//*[@id=\"School_Address_City\"]")
    private WebElement cityElement;

    public IfbTextBox citytextbox = new IfbTextBox(driver, cityElement);

    @FindBy(xpath = "//*[@id=\"School_Address_State\"]")
    private WebElement stateElement;

    public IfbDropDown statedropdown = new IfbDropDown(driver, stateElement);

    @FindBy(xpath = "//*[@id=\"School_Address_Zip\"]")
    private WebElement zipcodeelement;

    public IfbTextBox zipcodetextbox = new IfbTextBox(driver, zipcodeelement);


    @FindBy(xpath = "//*[@id=\"School_Address_County\"]")
    private WebElement schoolcountyElement;

    public IfbDropDown schoolcountydropdown = new IfbDropDown(driver, schoolcountyElement);


    @FindBy(id = "SchoolYear")
    private WebElement schoolyearElement;

    public IfbTextBox schoolyeartextbox = new IfbTextBox(driver, schoolyearElement);

    @FindBy(xpath = "//*[@id=\"AllGradeLevels_11__IsSelected\"]")
    private WebElement currentgradeElement;

    public IfbCheckBox currentgradecheckbox = new IfbCheckBox(driver, currentgradeElement);

    @FindBy(xpath = "//*[@id=\"AllDepartments_1__IsSelected\"]" )
    private WebElement departmentElement;

    public  IfbCheckBox departmentcheckbox = new IfbCheckBox(driver, departmentElement);


    @FindBy(xpath = "//*[@id=\"SingleGradeAudience_StudentsPresent\"]")

    private WebElement numberofstudentsElement;

    public IfbTextBox numberofstudentstextbox = new IfbTextBox(driver, numberofstudentsElement);

    @FindBy(xpath = "//*[@id=\"HasBooks\"] ")
    private WebElement agrithemebooksElement;

    public IfbDropDown agrithemebooksdropdown = new IfbDropDown(driver, agrithemebooksElement);

    @FindBy(xpath = "//*[@id=\"HasVolunteers\"]")
    private WebElement aitcvolunteerElement;

    public IfbDropDown aitcvolunteerdropdown = new IfbDropDown(driver, aitcvolunteerElement);

    @FindBy(xpath = "//*[@id=\"HasFieldTrips\"]")
    private WebElement studentaagrithemeElement;

    public IfbDropDown studentsagrithemedropdown = new IfbDropDown(driver, studentaagrithemeElement);


    @FindBy(xpath = "//*[@id=\"AllThemes_0__IsSelected\"]")
    private WebElement learningthemeElement;

    public IfbCheckBox learningthemecheckbox = new IfbCheckBox(driver, learningthemeElement);

    @FindBy(xpath =  "//*[@id=\"aitcForm\"]/div/div[17]/div/input")
    private WebElement volunteerregisterElement;

    public IfbLink volunteerregisterlink = new IfbLink(driver, volunteerregisterElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[1]/ul/li[2]/a")
    private WebElement studentcenterElement;

    public IfbLink studentcenterlink = new IfbLink(driver, studentcenterElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[1]/ul/li[3]/a")
    private WebElement volunteercenterElement;

    public IfbLink volunteercenterlink = new IfbLink(driver, volunteercenterElement);

    @FindBy(xpath = "//*[@id=\"MainContent_C009_Col01\"]/div/div/a")
    private WebElement volunteerreportElement;

    public IfbLink volunteerreportlink = new IfbLink(driver, volunteerreportElement);

    @FindBy(xpath = "//*[@id=\"Volunteer_Email\"]")
    private WebElement volunteeremailElement;

    public IfbTextBox volunteeremailtextbox = new IfbTextBox(driver, volunteeremailElement);

    @FindBy(xpath = "//*[@id=\"Volunteer_CountyId\"]")
    private WebElement membercountyElement;

    public IfbDropDown membercountydropdown = new IfbDropDown(driver, membercountyElement);

    @FindBy(xpath = "//*[@id=\"Presentation_Title\"]")
    private WebElement presentationnameElement;

    public IfbTextBox presentationnametextbox = new IfbTextBox(driver, presentationnameElement);

    @FindBy(xpath = "//*[@id=\"Presentation_Date\"]")
    private WebElement presentationdateElement;

    public IfbTextBox presentationdatetextbox = new IfbTextBox(driver, presentationdateElement);


    @FindBy(xpath = "//*[@id=\"Presentation_Location\"]")
    private WebElement presentationlocationElement;

    public IfbTextBox presentationlocationtextbox = new IfbTextBox(driver, presentationlocationElement);

    @FindBy(xpath = "//*[@id=\"IsSingleGradeLevel\"]")
    private WebElement singlegradelevelpresentationElement;

    public IfbDropDown singlegradelevelpresentationdropdown = new IfbDropDown(driver, singlegradelevelpresentationElement);


    @FindBy(xpath = "//*[@id=\"SingleGradeAudience_GradeId\"]")
    private WebElement gradeofaudienceElement;

    public IfbDropDown gradeofaudiencedropdown = new IfbDropDown(driver, gradeofaudienceElement);

    @FindBy(xpath = "//*[@id=\"NumberOfStudents\"]")
    private WebElement noofstudentsElement;

    public IfbTextBox noofstudentstextbox = new IfbTextBox(driver, noofstudentsElement);


    @FindBy(xpath = "//*[@id=\"Presentation_AdultsPresent\"]")
    private WebElement numberofadultsElement;

    public IfbDropDown  numberofadultsdropdown = new IfbDropDown(driver, numberofadultsElement);

    @FindBy(xpath = "//*[@id=\"Presentation_Duration\"]" )
    private WebElement lengthofpresentationElement;

    public IfbDropDown lengthofpresentationdropdown = new IfbDropDown(driver, lengthofpresentationElement);

    @FindBy(xpath = "//*[@id=\"teacherCount\"]")
    private WebElement numberofteachersElement;

    public IfbDropDown numberofteachersdropdown = new IfbDropDown(driver, numberofteachersElement);


    @FindBy(xpath = "//*[@id=\"IsMultiGrade\"]")
    private WebElement multigradelevelElement;

    public IfbDropDown multigraddeleveldropdown= new IfbDropDown(driver, multigradelevelElement);

    @FindBy(xpath = "//*[@id=\"HasHandsOn\"]")
    private WebElement handsonactivityElement;

    public IfbDropDown handsonactivitydropdown= new IfbDropDown(driver, handsonactivityElement);


    @FindBy(xpath = "//*[@id=\"HasBooks\"]")
    private WebElement agbookElement;

    public IfbDropDown agbookdropdown = new IfbDropDown(driver, agbookElement);

    @FindBy(xpath = "//*[@id=\"HasMaterials\"]")
    private WebElement teachersmaterialsElement;

    public IfbDropDown teachersmaterialsdropdown = new IfbDropDown(driver, teachersmaterialsElement);

    @FindBy(xpath = "//*[@id=\"HasOrgs\"]")
    private WebElement agribusinessElement;

    public IfbDropDown agribusinessdropdown = new IfbDropDown(driver, agribusinessElement);

    @FindBy(xpath = "//*[@id=\"HasSponsors\"]" )
    private WebElement agridonationElement;

    public IfbDropDown agridonationdropdown = new IfbDropDown(driver, agridonationElement);

   @FindBy(xpath = "//*[@id=\"Presentation_Comments\"] ")
   private WebElement membercommentsElement;

   public IfbTextBox membercommentstextbox = new IfbTextBox(driver, membercommentsElement);


   @FindBy(xpath = "//*[@id=\"SubmitButton\"]")
   private WebElement volunteersubmitElement;

   public IfbLink volunteersubmitlink = new IfbLink(driver, volunteersubmitElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[2]/a")
    private WebElement leadersinactionElement;

    public IfbLink leadersinactionlink = new IfbLink(driver, leadersinactionElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/a")
    private WebElement womenleadershipcommitteElement;

    public IfbLink womenleadershipcommitteelink = new IfbLink(driver, womenleadershipcommitteElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/a")
    private WebElement youngfarmersElement;

    public IfbLink youngfarmerslink = new IfbLink(driver, youngfarmersElement);

    @FindBy(xpath = "//*[@id=\"Presentation_Comments\"]")
    private WebElement aitcsubElement;

    public IfbLink aitcsublink  = new IfbLink(driver, aitcsubElement);


    public OurProgramsPage(WebDriver driver) {


        super(driver, SPINNER);}
}

package bai5_Locator;

public class BT_LocatorsCRM {
    public static String inputEmail="//input[@id='email']";
    public static String inputPassword="//input[@id='password']";
    public static String butonLogin="//button[@type='submit']";
    public static String linkForgotPassword="//a[normalize-space()='Forgot Password?']";


    //Dashboard
    public static String menuProjects="//span[normalize-space()='Projects']";
    public static String menuTasks="//span[normalize-space()='Tasks']";
    public static String menuDashboard="//span[normalize-space()='Dashboard']";


    // Customer List
    public static String buttonAddNewCustormer="//a[normalize-space()='New Customer']";

    public static String buttonImportCustomers="//span[normalize-space()='ImportCustomers']";
    public static String buttonContact="//a[contains(@href,'all_contacts')]";
    //public static String buttonContact="//a[normalize-space()='Import Customers']//following-sibling::a[normalize-space()='Contacts']";
    public static String headerCustomersPage="//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomer="//div[@id='DataTables_Table_0_filter']//input[@type='search']";

    //Add new Customer
    public static String inputCompanyName="//input[@id='company']";
    public static String inputVatNumber="//input[@id='vat']";
    public static String inputphone="//input[@id='phonenumber']";
    public static String inputWebsite="@id='website']";
    public static String dropdownGroup="//button[@data-id='groups_in[]']";
    public static String inputSearchFroup="//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropdownCurrency="//button[@data-id='default_currency']";
    public static String inputCurrency="//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String dropdownLanguae="//button[@data-id='default_language']";
    public static String inputVietNam="//span[normalize-space()='Vietnamese']";
    public static String inputAdress="//textarea[@id='address']";
    public static String inputCity="//input[@id='city']";
    public static String inputState="//input[@id='state']";
    public static String inputZipcode="//input[@id='zip']";
    public static String dropdownCountry="//button[@data-id='default_currency']";
    public static String inputCountry="//div[@app-field-wrapper='country']//input[@type='search']";
    public static String buttonSaveAndCreateContact="//button[normalize-space()='Save and create contact']";
    public static String buttonSave="//div[@id='profile-save-section']//button[normalize-space()='Save']";



    //project
    public static String buttonAddNewProject="//a[normalize-space()='New Project']";
    public static String buttonSearchProject="//div[@id='DataTables_Table_0_filter']//input[@type='search']";
    public static String headerAddNewProject="//form[@id='project_form']/descendant::h4[normalize-space()='Add new project']";
    public static String inputProjectName="//label[normalize-space()='* Project Name']/following-sibling::input";
    public static String dropdownCustomer="//label[@for='clientid']/following-sibling::div//button";
    public static String inputCustomer="//label[@for='clientid']/following-sibling::div//input[@type='search']";
    public static String checkboxCalculateProgres="//input[@id='progress_from_tasks']";
    public static String sliderProject="//div[@id='tab_project']";
    public static String dropdownBillingType="//label[@for='billing_type']/following-sibling::div[contains(@class,'dropdown')]";
    public static String optionBillingType  ="//span[normalize-space()='Project Hours']";
    // public static String dropdownStatus="//label[normalize-space()='Status']/following-sibling::div//button[@data-toggle='dropdown']";
    public static String dropdownStatus="//label[@for='status']/following-sibling::div[contains(@class,'dropdown')]";
    public static String optionStatus="//span[normalize-space()='On Hold']";
    public static String inputTotalRate="//label[normalize-space()='Total Rate']/following-sibling::input";
    public static String inputEstimatedHours="//label[@for='estimated_hours']/following-sibling::input";
    public static String dropdownMember="//label[normalize-space()='Members']/following-sibling::div//button[@data-toggle='dropdown']";
    public static String inputmember="//label[normalize-space()='Members']//following-sibling::div//input[@type='Search']";
    public static String inputStartDate="//label[@for='start_date']/following-sibling::div//input";
    public static String inputDeadline="//label[@for='deadline']/following-sibling::div//input";
    public static String dropdownTags="//label[normalize-space()='Tags']/following-sibling::input";
    public static String inputDescription="//body[@data-id='description']";//cần phải switch sang frame
    public static String lableSendProject="//label[normalize-space()='Send project created email']";
    public static String checkboxSendProject="//label[normalize-space()='Send project created email']";
    public static String butotnSave="//button[normalize-space()='Save']";

    public static void main(String[] args) {

    }

}

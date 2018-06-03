package AppModule;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.List;
import pageObjects.menu_link;
import utility.Constant;
import utility.ExcelUtils;
import pageObjects.NewPatient;;


public class Patient_registeration {

	//=====================
	
	// Create a new instance of the Firefox driver
private static WebDriver driver = null;
	
	//public static void main(String[] args) throws Exception {
		
		
		public static void Execute(WebDriver driver) throws Exception {
	
		
	
//public static void Execute(WebDriver driver) throws Exception {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		   String xl = Constant.Path_TestData + Constant.File_TestData;

	       String Sheet = "Patient_Reg";
	       

	       int rowCount = ExcelUtils.getRowCount(xl, Sheet);
	       int colCount = ExcelUtils.getColCount(xl, Sheet);
	      System.out.println("Number of rows"+rowCount);
	       
	       ExcelUtils.setExcelFile(xl, Sheet);

	       
	     
	      
		for (int i=1;i<rowCount;i++)

		{
		
			
			
		String sPrefix=ExcelUtils.getCellData_patinet(i, 1);
		
		 String sPatientName=ExcelUtils.getCellData_patinet(i, 2);
		 String sGuardian=ExcelUtils.getCellData_patinet(i, 3);
		 String sDOB=ExcelUtils.getCellData_patinet(i, 4);
		String sGender=ExcelUtils.getCellData_patinet(i, 5);
		String sBlood=ExcelUtils.getCellData_patinet(i, 6);
		 String sAgeYear=ExcelUtils.getCellData_patinet(i, 7);
		 String sAgeMonth=ExcelUtils.getCellData_patinet(i, 8);
		 String sMobile=ExcelUtils.getCellData_patinet(i, 9);
		 String sEmail=ExcelUtils.getCellData_patinet(i, 10);
		 
		 
		 String sUsername=ExcelUtils.getCellData_patinet(i, 11);
		 
		 String sAdds=ExcelUtils.getCellData_patinet(i, 12);
		 String sPhone=ExcelUtils.getCellData_patinet(i, 13);
		 String sState=ExcelUtils.getCellData_patinet(i, 14);
		 String sCity=ExcelUtils.getCellData_patinet(i, 15);
		
		 
		 
	
		 
		
		 
		NewPatient.Button_Patient_Reg(driver).click();
		
		// fill the patient registration data if label "New Patient Registration" displays 
		
		String Actual_Lable="New Patient Registratio";
		String Real_Label=NewPatient.Lal_Heading(driver).getText();
		 
		 Assert.assertEquals(Actual_Lable, Real_Label);
		 
		 
		NewPatient.Dropdown_Prefix(driver).sendKeys(sPrefix);
		Thread.sleep(2000);
	     
		NewPatient.Txt_Patient_Name(driver).sendKeys(sPatientName);
		NewPatient.Txt_Gurdian(driver).sendKeys(sGuardian);
		NewPatient.Txt_DOB(driver).sendKeys(sDOB);
		NewPatient.Gender(driver, sGender);
		NewPatient.DropDown_BloodGroup(driver).sendKeys(sBlood);
		//System.out.println(NewPatient.DropDown_BloodGroup(driver).getText());
		Thread.sleep(2000);
		NewPatient.Txt_Age(driver).sendKeys(sAgeYear);
		Thread.sleep(2000);
		NewPatient.Dropdown_Month(driver).sendKeys(sAgeMonth);
		Thread.sleep(2000);
		NewPatient.Txt_Mobile(driver).sendKeys(sMobile);
		System.out.println(NewPatient.Txt_Mobile(driver).getText());
		 
		//System.out.println();
		Thread.sleep(6000);
		//NewPatient.CheckBox_Username(driver).click();
		
		NewPatient.Txt_Email(driver).sendKeys(sEmail);
		
		Thread.sleep(2000);
		//NewPatient.Txt_User_name(driver).sendKeys(sUsername);
		Thread.sleep(2000);
		NewPatient.Txt_Adds(driver).sendKeys(sAdds);
		NewPatient.Txt_Phone(driver).sendKeys(sPhone);
		NewPatient.Dropdown_State(driver).sendKeys(sState);
		//System.out.println(NewPatient.Dropdown_State(driver).getText());
		//String city=NewPatient.Dropdown_City(driver).getText();
		
				Thread.sleep(2000);
				NewPatient.Dropdown_City(driver).sendKeys(sCity);
				Thread.sleep(2000);
				NewPatient.Button_Save_make_appointmnet(driver).click();
				menu_link.link_PracticeManager(driver).click();
				   Thread.sleep(2000);
				   //menu_link.link_Appointments(driver).click();
				   Thread.sleep(2000);
				  menu_link.link_PatientManager(driver).click();
				   Thread.sleep(2000);
				 // NewPatient.Button_Patient_Reg(driver).click();
				
				
		
		 
}
}
}
//}
package AppModule;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import pageObjects.Home_Page;
import pageObjects.Search_Patient_Page;

public class Create_Appointment {
	
	private static final String FileUtils = null;

	public static void Execute(WebDriver driver) throws Exception {
		
	//	public void Newappointmnet Execute (WebDriver driver)throws Exception  {
		
		
		
	
		
		String msg =driver.getTitle();
		
		System.out.println(msg);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
	    wait.until(ExpectedConditions.titleContains("ll"));
		
		 String xl = Constant.Path_TestData + Constant.File_TestData;

	       String Sheet = "Date";

	       int rowCount = ExcelUtils.getRowCount(xl, Sheet);
	       int colCount = ExcelUtils.getColCount(xl, Sheet);
	   
	       
	       System.out.println("Number of Rows "+rowCount);
	       System.out.println("Number of Columns "+colCount);
	       ExcelUtils.setExcelFile(xl, Sheet);

	       
	     
	       for (int i=1;i<=rowCount;i++)

	       { 
	    	   
	    	   //System.out.println("HI");
	  

	    	   Thread.sleep(2000);
		
			   
			String Year=ExcelUtils.getCellData(i,1);
			
			//System.out.println(Year);
		    String Month=ExcelUtils.getCellData(i,2);
		   // System.out.println(Month);
		    String Day=ExcelUtils.getCellData(i,3);
		   // System.out.println(Day);
		    String Time=ExcelUtils.getCellData(i,4);
		  //  System.out.println(Time);
		    String Mobile=ExcelUtils.getCellData(i,5);
		    String Chief_Compliant=ExcelUtils.getCellData(i,6);
		    
		  /*  String Year="2019";
		    String Month="Jul";
		    String Day="16";*/
		    
		   // driver.findElement(By.xpath("//*[@id='AppointmentDate']")).click();
		    
		    
		    
		    
		    Thread.sleep(2000);
		    Home_Page.Txt_Appointment_Date(driver).click();
			   
			   Thread.sleep(2000);
			    
			  //  WebElement month =  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
			   
			   WebElement year =Home_Page.DropDown_Year(driver);
			    
			   
			  // System.out.println(year.getText());
			    Select yearCombo = new Select(year);
			    yearCombo.selectByVisibleText(Year);
			    
			    Thread.sleep(2000);
			    
			    
			    WebElement month =  Home_Page.DropDown_Month(driver);
			    
			    //System.out.println(month.getText());
			    
			    Select monthCombo = new Select(month);
			    
			    Thread.sleep(2000);
			 
			 	 monthCombo.selectByVisibleText(Month);  
			    
			    Thread.sleep(2000);

		
			   
			    
			    Thread.sleep(2000);
			    
			    
			  
			  driver.findElement(By.linkText(Day)).click();


			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.linkText(Time)).click();
			    
			  Search_Patient_Page.Button_Search_Pat_appt(driver).click();
			  Thread.sleep(2000);
			  Search_Patient_Page.Txt_MobileNo(driver).sendKeys(Mobile);
			  Thread.sleep(2000);
			  
			  Search_Patient_Page.Button_Search_create_appt(driver).click();
			  Thread.sleep(2000);
			  Search_Patient_Page.Button_CreateAppt_Icon(driver).click();
			  Thread.sleep(2000);
			  Search_Patient_Page.Txt_ief_compliant(driver).sendKeys(Chief_Compliant);
			  Thread.sleep(2000);
			  Search_Patient_Page.Button_Schedule(driver).click();
			  Thread.sleep(2000);
			  Search_Patient_Page.Button_Close(driver).click();
			  Thread.sleep(2000);
			 // Home_Page.Txt_Appointment_Date(driver).click();
			  
			  //  Logout.Execute(driver);
			  //  LogIn_Page.btn_DoctorLogin(driver).click();
			    //driver.quit();
	}
			    // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
			     
			    /* Home_Page.img_ProFile(driver).click();
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			     Home_Page.btn_Logout(driver).click();*/
			    // driver.quit();

}
}

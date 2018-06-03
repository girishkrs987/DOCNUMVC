package Framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import AppModule.Create_Appointment;
import AppModule.Login_In;
import AppModule.Logout;
import AppModule.Menu_Submenu_Links;
import AppModule.Search_Patient;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
public class TestNG_Demo {

	
	@Test(priority=2,description="Will verify the appintment create functions")
	 

	    public void testDAtePicker() throws Exception{

	        //DAte and Time to be set in textbox

	        String dateTime ="12/07/2014 2:00 PM";

	      //  WebDriver driver = new FirefoxDriver();

	      //  driver.manage().window().maximize();
	        
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Girish\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			
			capabilities.setBrowserName("firefox");
			 capabilities.setVersion("47.0.1");
			capabilities.setCapability("marionette", false);
	        capabilities.acceptInsecureCerts();
	      // WebDriver driver = new FirefoxDriver();
	        WebDriver driver = new FirefoxDriver(capabilities); 
	        
	        //driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
			//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	   
	   //driver = new FirefoxDriver();
	    Thread.sleep(2000);
	   driver.get(Constant.URL);
	   Thread.sleep(2000);
	   
	   
	   Login_In.Execute( driver);
	   Thread.sleep(2000);
	   
	   
	   //  date selection logic 
	   
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Date");
	   Thread.sleep(2000);
	   
	   Create_Appointment.Execute(driver);
	   
	   System.out.println("Appointment has been created sucessfully");
	   
	   Logout.Execute(driver);
	   
	   driver.quit();
	   
	        }
	    
	
	// search patient test case 
	
	@Test(priority=1,description="Will verify the search patient functions")
	
    public void searcpatient() throws Exception{
	
		
DOMConfigurator.configure("log4j.xml");
		
		// Create a new instance of the Firefox driver
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Girish\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			
			capabilities.setBrowserName("firefox");
			 capabilities.setVersion("47.0.1");
			capabilities.setCapability("marionette", false);
	        capabilities.acceptInsecureCerts();
	      // WebDriver driver = new FirefoxDriver();
	        WebDriver driver = new FirefoxDriver(capabilities); 
		
		
	        
	        
	      
		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
   
   //driver = new FirefoxDriver();
    Thread.sleep(2000);
   driver.get(Constant.URL);
   Log.info("DOCNU Application Opened");
   
   
   Thread.sleep(2000);
     
      
    
  // Use page Object library now
  
   Login_In.Execute( driver);
   Log.info("Login function suessful");
    
    // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
   Thread.sleep(6000);
   
   Menu_Submenu_Links.Execute(driver);
   
   Log.info("Click submenu functions");
   
   ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Patient_Reg");
   
   Log.info("fetch data from excel");
   
   Search_Patient.Execute(driver);
   
   Log.info("Search Patient function sucessful");
   
   
   Logout.Execute(driver);
   
   driver.quit();
   
	}
	
	
	
}

package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import AppModule.Login_In;
import AppModule.Logout;
import AppModule.Menu_Submenu_Links;
import utility.Constant;
import utility.ExcelUtils;
import utility.Firefox_Webdriver;
import AppModule.Patient_registeration;
import pageObjects.LogIn_Page;

public class First_Test_Case {
	/*private static final Webdriver Webdriver_mozilla = null;*/
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		
		
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
   Thread.sleep(2000);
     
      
    
  // Use page Object library now
  
   Login_In.Execute( driver);
    
    // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
   Thread.sleep(6000);
   
   Menu_Submenu_Links.Execute(driver);
    
    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Patient_Reg");
  //ExcelUtils.setExcelFile("xl","Sheet");
 // Thread.sleep(2000);
  Patient_registeration.Execute(driver);
    // Logout.Execute(driver);
 // System.out.println(" Logout Successfully");
     
   //  ExcelUtils.setCellData("Pass", 1, 3);
	        

   

   
	     driver.quit();
	}
	    // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	     
	    /* Home_Page.img_ProFile(driver).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Home_Page.btn_Logout(driver).click();*/
	    // driver.quit();
}


	
	

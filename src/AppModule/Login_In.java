package AppModule;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import AppModule.Logout;
public class Login_In {
	
	
	
private static final String FileUtils = null;

public static void Execute(WebDriver driver) throws Exception {
	
	
	
		
	 String xl = Constant.Path_TestData + Constant.File_TestData;

       String Sheet = "Sheet1";

       int rowCount = ExcelUtils.getRowCount(xl, Sheet);
   
       
       System.out.println(rowCount);
       
       ExcelUtils.setExcelFile(xl, Sheet);

       
     
       for (int i=1;i<=rowCount;i++)

       { 
    	   
    	   System.out.println("HI");
  

    	   Thread.sleep(2000);
   
		String sUsername=ExcelUtils.getCellData(1,1);
	    String sPassword=ExcelUtils.getCellData(1,2);
	    
	    System.out.println(sUsername);
	    
	    System.out.println(sPassword);
	  //public void Login (String sUsername,String sPassword) {
	  
	       
		   LogIn_Page.btn_DoctorLogin(driver).click();
		   
	 
		  // driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		   
		  Thread.sleep(6000);
		   LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
		 
		   
		   LogIn_Page.txtbx_PasWord(driver).sendKeys(sPassword);
		     
		     
		     //Thread.sleep(2000);
		     LogIn_Page.btn_DLogin(driver).click();  
		     
		     Thread.sleep(2000);
		     
		  //  Logout.Execute(driver);
		  //  LogIn_Page.btn_DoctorLogin(driver).click();
		    //driver.quit();
}
		    // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		  /*   
		     Home_Page.img_ProFile(driver).click();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     Home_Page.btn_Logout(driver).click();*/
		    // driver.quit();
	}

}


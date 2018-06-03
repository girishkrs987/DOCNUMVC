package Framework;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import AppModule.Create_Appointment;
import AppModule.Login_In;
import utility.Constant;
import utility.ExcelUtils;
import utility.Date;

public class New_Appointment {

    @Test

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
   
        }
    
   


   
    

}
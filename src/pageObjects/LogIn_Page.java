package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogIn_Page {

	 private static WebElement element = null;
		
		public static WebElement btn_DoctorLogin(WebDriver driver){
			 
	      element = driver.findElement(By.xpath("//*[@id='main-navbar']/div[1]/nav/div/a[2]"));
	        
	
	        return element;
	        
	  
	        
	      
	        }

	
		
		public static WebElement txtbx_UserName(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='UserName']"));

	        return element;

	        }
		public static WebElement txtbx_PasWord(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='DocLoginpassword']"));

	        return element;

	        }
		
		public static WebElement btn_DLogin(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='DoctorLogin']"));

	        return element;

	        }
		
}

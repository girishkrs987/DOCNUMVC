package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menu_link {
	
	 private static WebElement element = null;
		
		public static WebElement link_PracticeManager(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='navigation']/li[6]/a"));

	        return element;
	      //*[@id='navigation']/li[6]/a

	        }
		
		
		
		
		public static WebElement link_Appointments(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='navigation']/li[6]/ul/li[1]/a"));

	        return element;

	        }
		public static WebElement link_PatientManager(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='navigation']/li[6]/ul/li[2]/a"));

	        return element;

	        }

}
//*[@id='content']/div/div[2]/div/section/div[1]/a
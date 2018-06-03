package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Date {
	
	private static WebDriver driver = null;
	
	
	
	 public static void SetDate(String Month, String Year, String Date) throws Exception{
	 	   
	 	   try {
	    
	 		   
	 		   System.out.println(Month+","+ Year+""+Date);
	 		   
	 		   
	 		  driver.findElement(By.xpath("//*[@id='AppointmentDate']")).click();
	   
	   Thread.sleep(2000);
	    
	    WebElement month =  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
	    
	    Select monthCombo = new Select(month);
	 
	 	 monthCombo.selectByVisibleText("Jun");  
	    
	    Thread.sleep(2000);

	    WebElement year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));
	    Select yearCombo = new Select(year);
	    yearCombo.selectByVisibleText("2018");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("15")).click();
	    
	 	   } catch (Exception e){

	 			throw (e);

	 		}
	   
	    }

}

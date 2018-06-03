package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	private static WebElement element = null;
	
	public static WebElement img_ProFile(WebDriver driver){
		 
        element = driver.findElement(By.xpath(".//*[@id='header']/header/ul[2]/li[1]/a/img"));

        return element;

        }
	
	public static WebElement btn_Logout(WebDriver driver){
		 
        element = driver.findElement(By.xpath(".//*[@id='userMenu']/li[3]/a"));

        return element;

        }
	
	public static WebElement Txt_Appointment_Date(WebDriver driver){
		 
        element = driver.findElement(By.xpath(".//*[@id='AppointmentDate']"));

        return element;

        }
	
	
	//[@id='ui-datepicker-div']/div/div/select[1]
	
	public static WebElement DropDown_Year(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));

        return element;

        }
	public static WebElement DropDown_Month(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));

        return element;

        }
	
	public static WebElement Cell_Day(WebDriver driver){
		 
        //element = driver.findElement(By.xpath("/*[@id='ui-datepicker-div']/div/div/select[1]"));
		element =  driver.findElement(By.linkText("9"));
        return element;

        }
	
	public static WebElement Cell_Time(WebDriver driver){
		 
        //element = driver.findElement(By.xpath("/*[@id='ui-datepicker-div']/div/div/select[1]"));
		element =  driver.findElement(By.linkText("9"));
        return element;

        }

}

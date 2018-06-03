package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Patient_Page {
	
private static WebElement element = null;
	
	public static WebElement Txt_MobileNo(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='Mobile']"));

        return element;

        }
	
	

	public static WebElement Grid_MobileNo(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='PDetails']/tbody/tr/td[4]"));

        return element;

        }
	
	public static WebElement Button_Search(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='PatSearch']/div/div[2]/div[1]/div[5]/div/div/div[2]/input"));

        return element;

        } 
	
	public static WebElement Button_Search_Pat_appt(WebDriver driver){
		 
        element = driver.findElement(By.xpath(".//*[@id='CnfBooking']/div/div/div[2]/a[1]"));

        return element;

        }
	
	public static WebElement Button_Search_create_appt(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/section/div[2]/form/div/div[2]/div[1]/div[6]/div/div/div[2]/input"));

        return element;

        }
	
	public static WebElement Button_CreateAppt_Icon(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='tblepatient']/tbody/tr/td[7]/a"));

        return element;

        }
	
	public static WebElement Txt_ief_compliant(WebDriver driver){
		 
        element = driver.findElement(By.xpath(".//*[@id='ChiefComplaint']"));

        return element;

        }
	
	public static WebElement Button_Schedule(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='CreateAppontmentForm']/div[5]/div/div/input"));

        return element;

        }
	
	public static WebElement Button_Close(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='BookingConformation']/div/div/div[3]/div/a[2]"));

        return element;
      //*[@id='BookingConformation']/div/div/div[3]/a[2]"
      //*[@id='BookingConformation']/div/div/div[3]/div/a[2]
        }
}

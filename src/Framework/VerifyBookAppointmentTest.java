package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerifyBookAppointmentTest {
	
	WebDriver driver;
	

  @Test
  public void SetUp(String Username,String Password) {
   // Password
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://beta.docnu.com/");
	
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='main-navbar']/div[1]/nav/div/a[1])"))).build().perform();
	
	
	driver.findElement(By.xpath("//*[@id='main-navbar']/div[1]/nav/div/a[1])")).click();
	
	driver.findElement(By.id("patientusername")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);	
	driver.findElement(By.id("PatientLogin")).click();
	
	
  }
  
  @Test
  public void TearDown() {
	  
	  driver.quit();
  }
  
}

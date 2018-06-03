package AppModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

public class Logout {

	
	public static void Execute(WebDriver driver) throws InterruptedException

	{
	    Home_Page.img_ProFile(driver).click();
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Home_Page.btn_Logout(driver).click();
	   // driver.quit();
	}
}

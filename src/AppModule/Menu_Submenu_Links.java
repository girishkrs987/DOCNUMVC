package AppModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.menu_link;

public class Menu_Submenu_Links {
	
public static void Execute(WebDriver driver) throws InterruptedException {
		
		
	 Thread.sleep(2000);
		   
		   menu_link.link_PracticeManager(driver).click();
		   Thread.sleep(2000);
		  // menu_link.link_Appointments(driver).click();
		   Thread.sleep(2000);
		   menu_link.link_PatientManager(driver).click();


}
}

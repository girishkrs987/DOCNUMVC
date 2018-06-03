package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefox_Webdriver {

	//private static WebDriver driver = null;
	public static void Execute(WebDriver driver) throws Exception {
		
	
		// Create a new instance of the Firefox driver
		
				 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Girish\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
					
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					
					capabilities.setBrowserName("firefox");
					 capabilities.setVersion("47.0.1");
					capabilities.setCapability("marionette", false);
			        capabilities.acceptInsecureCerts();
			      //WebDriver driver = new FirefoxDriver();
			           WebDriver driver1 = new FirefoxDriver(capabilities); 
				
			     
		
	}
}

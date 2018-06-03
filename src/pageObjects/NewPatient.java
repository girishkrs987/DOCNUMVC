package pageObjects;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List; 

public class NewPatient {
	
	private static WebElement element = null;
	
	public static WebElement Button_Patient_Reg(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/section/div[1]/a"));

        return element;

        }
	
	
	
	
	public static WebElement Dropdown_Prefix(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='Prefix']"));

        return element;

        }
	public static WebElement Txt_Patient_Name(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='FirstName']"));

        return element;

        }
	
	
	//===========
	private static WebDriver driver = null;
	
	
	//public static WebElement Gender(String GenderType) {
	public static  WebElement Gender(WebDriver driver,String UserInput) {	
		
	
	// get all the radio buttons by similar id or xpath and store in List    
		List<WebElement> radiobuttons = driver.findElements(By.id("Gender"));
		
	String test="0";
	if(UserInput.toString().equals("Male")) {
		test="1";
	}else if(UserInput.toString().equals("Female")) {
		test="2";
	}
	else if(UserInput.toString().equals("Thirdgender")) {
		test="3";
	}
	
	System.out.println(test);
	System.out.println(UserInput);
		
		 for(WebElement radiobutton: radiobuttons) { 

			    if(radiobutton.getAttribute("value").equals(test))
			        radiobutton.click();
			}
		
	
		return element;
	}
		
	
	
	public static WebElement Txt_Age(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='PatientAge']"));

        return element;

        }

	public static WebElement Dropdown_Month(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='Month']"));

        return element;

        }
	
	public static WebElement Txt_User_name(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='UserName']"));

        return element;

        }
	public static WebElement Dropdown_City(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='City']"));

        return element;

        }
	public static WebElement Button_Save_make_appointmnet(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='BtnAppointment']"));

        return element;

        }
	
	public static WebElement Txt_Gurdian(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='ParentsName']"));

        return element;

        }
	
	public static WebElement Txt_DOB(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='DOB']"));

        return element;

        }
	
	public static WebElement DropDown_BloodGroup(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='BloodGroup']"));

        return element;

        }
	
	
	public static WebElement Txt_Mobile(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='MobileNo']"));

        return element;

        }
	
	public static WebElement Txt_Email(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='email']"));

        return element;

        }
	
	public static WebElement Txt_Adds(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='address']"));

        return element;

        }
	
	public static WebElement Txt_Phone(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='phone']"));

        return element;

        }
	
	public static WebElement Dropdown_State(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='State']"));

        return element;

        }
	
	public static WebElement CheckBox_Username(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='chkbxMobile']"));

        return element;

        }
	
	public static WebElement Txt_DOB_Test(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='DOB']"));

        return element;

        }
	
	public static WebElement Lal_Heading(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/h1"));

        return element;

        }
	/*public static WebElement lbl_PatName(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='PatName']"));

        return element;

        }*/
}

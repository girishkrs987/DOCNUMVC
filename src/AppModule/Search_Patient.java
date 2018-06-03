package AppModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.Search_Patient_Page;
import utility.Constant;
import utility.ExcelUtils;

public interface Search_Patient {
	
	
	 static WebDriver driver = null;
	
	//public static void main(String[] args) throws Exception {
		
		
		public static void Execute(WebDriver driver) throws Exception {
	
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			   String xl = Constant.Path_TestData + Constant.File_TestData;

		       String Sheet = "Patient_Reg";
		       

		       int rowCount = ExcelUtils.getRowCount(xl, Sheet);
		       int colCount = ExcelUtils.getColCount(xl, Sheet);
		      System.out.println("Number of rows"+rowCount);
		       
		       ExcelUtils.setExcelFile(xl, Sheet);

		       
		     
		      
			for (int i=1;i<rowCount;i++)

			{
			
				
				
		    String sMobile=ExcelUtils.getCellData_patinet(i, 9);
			Search_Patient_Page.Txt_MobileNo(driver).sendKeys(sMobile);
			
			Thread.sleep(2000);
			
			Search_Patient_Page.Button_Search(driver).click();
			
			
			String Expected_Value=Search_Patient_Page.Grid_MobileNo(driver).getText();
			
			
			System.out.println(Expected_Value);
			
			
			
			Thread.sleep(2000);
			String Acutal_Value=Search_Patient_Page.Grid_MobileNo(driver).getText();
			
			//verify the condition of using registered moble no or not
			
			Assert.assertEquals(Acutal_Value, Expected_Value);
			
		//	System.out.println("Actual Value "+Acutal_Value+"Expected Value"+Expected_Value );
			
			Menu_Submenu_Links.Execute(driver);
			}
			
			System.out.println("Search Patient test has pass");
}
}
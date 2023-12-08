package src.javaPackage;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
@Test
@SuppressWarnings("unused")
public class module_docBulk_MetadataUpload {




	private static String getChromePrefs() {
		String downloadPath = "path/to/download/directory"; // Change to your preferred download directory
		return "{\"download.default_directory\":\"" + downloadPath + "\",\"download.prompt_for_download\":false}";}
	public void module_docBulk_MetadataUpload() throws InterruptedException, AWTException, IOException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", getChromePrefs());
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://10.11.144.178:8107/home/login/1/");
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Logining with credential..");
		WebElement email1 = driver.findElement(By.id("eud"));
		email1.isDisplayed();
		email1.isEnabled();		
		//email1.sendKeys("arputhamalar.v@tcs.com"); 1999002
		email1.sendKeys("1999002");
		//pssword
		System.out.println("Entering password..");
		WebElement password1 = driver.findElement(By.id("epd"));
		password1.isDisplayed();
		password1.isEnabled();		
		password1.sendKeys("Tcs#1234");


		//signin button
		WebElement button1 = driver.findElement(By.id("login"));
		button1.isDisplayed();
		button1.isEnabled();	
		button1.click();
		Thread.sleep(3000);
		System.out.println("opening homepge..");


		/////////////hovering over documents
		//manage document
		//				System.out.println("Hover Document..");
		//				WebElement Document_module = driver.findElement(By.id("doc-nav")); 			
		//				Actions act = new Actions(driver);
		//				act.moveToElement(Document_module).perform();
		////example_explicit wait				
		//				WebDriverWait wait1 = new WebDriverWait(driver,30);
		//				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"doc-nav\"]/ul/li[3]/a")));
		//				driver.findElement(By.xpath("//*[@id=\"doc-nav\"]/ul/li[3]/a")).click();


		//scenario_1_Filters

		//Business_Area
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/button/span")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();  			
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/button/span")).click();


		//Business_Role

		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/button/span")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[3]/div/a")).click();  			
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/button/span")).click();


		//product xpath alone

		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/button/span")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[3]/div/a")).click();  			
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[1]/div/span[2]/button")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[3]/div/span/span/div/button/span")).click();	

		//Restriction			


		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/button/span")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[3]/div/a")).click();  			
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[4]/div/span/span/div/button/span")).click();


		//Document_type

		//				WebElement doc_type= driver.findElement(By.id("grpid-srch"));
		//				doc_type.click();
		//				Actions action = new Actions(driver);
		//				action.moveToElement(doc_type);
		//				driver.findElement(By.xpath("//*[@id=\"grpid-srch\"]/option[2]")).click();
		//				driver.findElement(By.xpath("//*[@id=\"grpid-srch\"]/option[5]")).click();
		//			
		//Document Extension

		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/button/span")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[3]/div/a")).click();  			
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
		//				driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[1]/div[2]/div[6]/div/span/span/div/button/span")).click();

		//start_date


		//				driver.findElement(By.id("startDate")).click();

		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/span")).click();			

		//				@SuppressWarnings("unused")
		////				JavascriptExecutor page_scroll = (JavascriptExecutor) driver;
		////				page_scroll.executeScript(null, null)

		//				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/span")).sendKeys("21/04/2020")	;
		//				driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();				
		//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		//				driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
		//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();  //month
		//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[9]")).click();  //choice september month
		//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click(); // year
		//				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[9]")).click();  //2020


		//			
		//				driver.findElement(By.id("audit-srch")).click(); 
		//				Thread.sleep(3000);
		//				driver.findElement(By.xpath("//*[@id=\"audit-srch\"]/option[2]")).click(); 
		//				driver.findElement(By.xpath("//*[@id=\"audit-srch\"]/option[3]")).click(); 
		//			
		//				driver.findElement(By.id("save-fav-filter")).click(); 
		//				Thread.sleep(3000);
		//				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[6]/div/div[2]/button/span")).click(); 
		//				Thread.sleep(3000);
		//			
		//				driver.findElement(By.id("filterdoc")).click(); 
		//				Thread.sleep(3000);

		//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div[2]")).click(); 
		//					 Thread.sleep(2000);
		//					 String file_path = "C:\\Users\\1925566\\Downloads\\MetaDataTemplate_6Nov2023";		   
		//					   StringSelection selection = new StringSelection( file_path);
		//			//UPLOAD FILE-->TOOLtip
		//					   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		   
		//					   Thread.sleep(3000); 
		//		     

		//ctrl+v operation 	 --robot Class keyboard actions    

		//					     Robot robot = new Robot();


		//virtual keypad press      
		//					     robot.keyPress(KeyEvent.VK_CONTROL);
		//					     robot.keyPress(KeyEvent.VK_V);
		//					     Thread.sleep(3000); 
		//					     robot.keyRelease(KeyEvent.VK_V);
		//					     robot.keyRelease(KeyEvent.VK_CONTROL);
		//					     Thread.sleep(3000); 
		//					     robot.keyPress(KeyEvent.VK_ENTER);
		//					     robot.keyRelease(KeyEvent.VK_ENTER);
		//					     
		//					     Thread.sleep(3000); 
		//				     
		//					 driver.findElement(By.id("bulkdataupload-file")).click(); 
		//					 Thread.sleep(3000); 
		//					 driver.findElement(By.id("previewdata")).click(); //preview	
		//					  Thread.sleep(3000); 
		//					 driver.findElement(By.id("error-report")).click(); //errror-report
		//					 Thread.sleep(3000); 
		//					 driver.findElement(By.id("edit-blkupload")).click();  //save-changes
		//					 Thread.sleep(3000); 
		//					 driver.findElement(By.id("confirm-blkupload")).click();  //confirm upload
		//					 Thread.sleep(3000); 
		//					 driver.findElement(By.id("confirm-blkdata-upload")).click(); 
		//					 Thread.sleep(3000); 
		//				 driver.findElement(By.id("//*[@id=\"metaDataConfirmUploadBody\"]/div[2]/div/div/button/span")).click();  //cancel


		/////////////////////////////// NEGATIVE --CASE			////////////////////////////////
/**
 * 
 *Negative Test cases 
 *For Document module
 *Capturing the error messages
 *Screen shot of Failed test cases
 * 
 * 
 **/
 
		/////////////hovering over documents
		//manage document
		System.out.println("Hover Document..");
		WebElement Document_module = driver.findElement(By.id("doc-nav")); 			
		Actions act = new Actions(driver);
		act.moveToElement(Document_module).perform();
		//example_explicit wait				
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"doc-nav\"]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"doc-nav\"]/ul/li[1]/a")).click();
	


//		//version_column
//		//		OPEN
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[4]/div/span/span")).click();
//		Thread.sleep(2000); 			     
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[4]/div[2]/input")).clear();
//		Thread.sleep(1000);
//		//CLOSE
//				driver.findElement(By.id("closeVersionmodal")).click();
//				Thread.sleep(2000);
		

//Excel_read

//	FileInputStream fs = new FileInputStream("C:\\BFSI_test\\automation\\doc_dataentry.xlsx");
//		//Creating a workbook
//		XSSFWorkbook workbook = new XSSFWorkbook(fs);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		for(int i=0; i <=7 ; i++) {
//			int version=(int) sheet.getRow(i).getCell(0).getNumericCellValue();
//		//	String password2=sheet.getRow(i).getCell(1).getStringCellValue();
//			driver.findElement(By.id("version-id-suggested")).sendKeys(String.valueOf(version));
//		// driver.findElement(By.id("epd")).sendKeys(password2);
//		//	driver.findElement(By.id("login")).click();
//			Thread.sleep(4000);
//			driver.findElement(By.id("version-id-suggested")).clear();}


				
//////Tag_column
				
			
				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tblDocuments\"]/tbody/tr/td[5]/div/span/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tag-name-btn\"]")).click();
				Thread.sleep(1000);		
				Date current_date = new Date();
				String current_date1= current_date.toString().replace("  ", "-").replace(":", "-");
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(screenshotFile, new File("C:\\BFSI_test\\automation\\error_ss\\"+current_date1+".png"));  //save_image			
				FileUtils.copyFile(screenshotFile, new File("C:\\BFSI_test\\automation\\error_ss\\add_tag.png"));
				driver.findElement(By.id("tag-name")).sendKeys("new comment");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tag-name-btn\"]")).click();
				driver.findElement(By.id("tag-name")).sendKeys("new comment"); // same tag error
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tag-name-btn\"]")).click();
				Thread.sleep(1000);
				String errormsg=driver.findElement(By.id("tagMsg")).getText();
				
				System.out.println(errormsg);
				File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile1, new File("C:\\BFSI_test\\automation\\error_ss\\already_exst.png"));
				
		
//				String errormsg1=driver.findElement(By.id("tag-add")).getText();
//				System.out.println(errormsg1);
//				File screenshotFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(screenshotFile2, new File("C:\\BFSI_test\\automation\\error_ss\\save_btn.png"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

		}


	}








	





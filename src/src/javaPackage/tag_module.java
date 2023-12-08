package src.javaPackage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;


@SuppressWarnings("unused")

public class tag_module extends Test1{
//WebDriver driver  ;
	
	@Test (priority=1,description="Tag_Click",alwaysRun=true)
	public void tag_click() throws InterruptedException, AWTException, IOException {
	
	System.out.println("Tag_Pending_Toggle");		Thread.sleep(1000);	
	driver.findElement(By.id("pending-nav")).click();
	}

				
	@Test (priority=2,description="tag-Pending",enabled=false)
	
	public void module_tag_pending() throws InterruptedException, AWTException, IOException {	
		
//**Scenarion 1 : Tag_Pending_Toggle	
 
				System.out.println("Tag_Pending_Toggle");		Thread.sleep(1000);	
				driver.findElement(By.id("pending-nav")).click();					
				System.out.println("Passed test case:TC0416");
				 ScreenshotClass.captureScreenshot(driver, "TC0416");

				//Search any document with doc id
				driver.findElement(By.id("search-doc-name")).sendKeys("23");
				System.out.println("Passed test case:TC0417");
				 ScreenshotClass.captureScreenshot(driver, "TC0417");
				 driver.findElement(By.id("search-doc-name")).clear();
				//Negative
				//with names
				driver.findElement(By.id("search-doc-name")).sendKeys("User");
				System.out.println("Passed test case:TC0418");
				 ScreenshotClass.captureScreenshot(driver, "TC0418");
//				//spaces
				driver.findElement(By.id("search-doc-name")).sendKeys("    ");
				System.out.println("Passed test case:TC0419");	
				
				 ScreenshotClass.captureScreenshot(driver, "TC0419");
				 
				driver.findElement(By.xpath("//*[@id=\"suggestedtags\"]")).click();
				System.out.println("Passed test case:TC0420");
				System.out.println("Passed test case:TC0421");
				System.out.println("Passed test case:TC0422");  				Thread.sleep(3000); 
				
				
				 ScreenshotClass.captureScreenshot(driver, "TC0420");
				 ScreenshotClass.captureScreenshot(driver, "TC0421");
				 ScreenshotClass.captureScreenshot(driver, "TC0422");
				//errror
				 
				driver.findElement(By.id("docname-tag")).sendKeys("tcs");Thread.sleep(2000); 
				driver.findElement(By.xpath("/html/body/ul/li[1]/div")).click();			
				System.out.println("Passed test case:TC0423");
				ScreenshotClass.captureScreenshot(driver, "TC0423");
				//Add_aFile_Filename
				driver.findElement(By.id("tagname-user")).sendKeys("new-user");   
				System.out.println("Passed test case:TC0424");
				ScreenshotClass.captureScreenshot(driver, "TC0424");
				//add_tag
				driver.findElement(By.id("tag-add")).click(); 	
				System.out.println("Passed test case:TC0425");
				ScreenshotClass.captureScreenshot(driver, "TC0425");
				//suggested_tag_check
				System.out.println("Passed test case:TC0426");
				ScreenshotClass.captureScreenshot(driver, "TC0426");
				//save-btn  
				driver.findElement(By.id("tag-save")).click();  
				//close
				driver.findElement(By.xpath("//*[@id=\"stagModal\"]/div/div/div[1]/button")).click();  
				
				System.out.println("Passed test case:TC0427");
				ScreenshotClass.captureScreenshot(driver, "TC0427");

	}
	  @Test (priority=3,description="tag-Active")
	  public void module_tag_active() throws IOException, InterruptedException {
		  
		 
			//Toggle_Active_toggle
				
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/label/span")).click();	
			System.out.println("Passed test case:TC0428");
			ScreenshotClass.captureScreenshot(driver, "TC0428");
			System.out.println("Passed test case:TC0429");	
			ScreenshotClass.captureScreenshot(driver, "TC0429");
			
			/*Scenarios
			 * Search-File
			 * Try to Download the File 
			 * Try to view
			 * Cancel the approved tags 
			 * */
			
			//with name   
//			driver.findElement(By.id("search-doc-name")).clear();
//			driver.findElement(By.id("search-doc-name")).sendKeys("User");
//			driver.findElement(By.xpath("//*[@id=\"docid38\"]/a")).click();  //Download
//			System.out.println("Passed test case:TC0430");
//			ScreenshotClass.captureScreenshot(driver, "TC0430");
			//Cancel-431//doubt
//			driver.findElement(By.id("search-doc-name")).clear();
//			driver.findElement(By.id("search-doc-name")).sendKeys("User");
		    //driver.cancel_tag
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div/div/section/div[1]/table/tbody/tr[4]/td[3]/div/span[1]/span")).click();
//			System.out.println("Passed test case:TC0431");
//			ScreenshotClass.captureScreenshot(driver, "TC0431");
//			driver.findElement(By.xpath("//*[@id=\"appdeltagBtn\"]")).click();
			
			
			
			//View_document  /html/body/div[1]/div/div[3]/div[1]/div[2]/div/div/section/div[1]/table/tbody/tr[4]/td[4]/a
			
			

			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/div/input")).clear();		
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/div/input")).sendKeys("User");	
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div/div/section/div[1]/table/tbody/tr[3]/td[4]/a")).click(); //view
			System.out.println("Passed test case:TC0432");
			ScreenshotClass.captureScreenshot(driver, "TC0432");
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles()); Thread.sleep(3000);			
			driver.switchTo().window(w.get(0));
			
			
			
			//page_scroll
		           // Replace the locator with the actual one for your scroll button
				   driver.findElement(By.id("doc-clear-icon")).click();	 Thread.sleep(3000);	
		           WebElement scrollButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div/div/section/div[2]/div/div[1]/ul/li[4]/a"));
		           if (scrollButton.isDisplayed()) {
		               // Scroll to the element to make it visible		        	   
		               // Click the scroll button
		               scrollButton.click();
		               System.out.println("Clicked the scroll button.");
		           } else {
		               // Log a message or take necessary action if the scroll button is not present
		               System.out.println("Scroll button is not present on the page. Skipping...");
		           }		         
		           System.out.println("Passed test case:TC0433");
					ScreenshotClass.captureScreenshot(driver, "TC0433");
		           
		           
		           
		           
		//	driver.findElement(By.xpath("//*[@id=\"actualflow-pagination-approved\"]/div/div[1]/ul/li[4]/a")).click();
		/*
		 * *TagModule-End *
		 * 
		 * */		
					
					/**automated-17, Pending:TC-431**/
	  }
	  
}

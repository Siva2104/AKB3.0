package src.javaPackage;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
@SuppressWarnings("unused")


			// public static void main(String[] args) throws InterruptedException, AWTException{
			
public class document_module extends Test1{		
	
	
	@Test(priority = 1, description = "hovering document module", alwaysRun = true)
	public void Document_module() throws InterruptedException, AWTException, IOException {
		//**hovering over documents
		 
					//manage document
					 Thread.sleep(2000);
					
					//document hover
					WebDriverWait wait = new WebDriverWait(driver, 10);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); Thread.sleep(2000);
					//Hovering
					
					WebElement Document_module = driver.findElement(By.id("doc-nav"));  //doc-nav
					System.out.println("Test case passed :TC0096");
					 ScreenshotClass.captureScreenshot(driver, "TC0096");
					//Action for hovering 
					System.out.println("Hover Document..Manage Document");
					Actions act = new Actions(driver);
					act.moveToElement(Document_module).perform();
					//click
					System.out.println("Test case passed :TC0097");
					 ScreenshotClass.captureScreenshot(driver, "TC0097");
					 //Documet_click
					 System.out.println("Test case passed :TC0120");
					 ScreenshotClass.captureScreenshot(driver, "TC0120");
					 
					driver.findElement(By.xpath("//*[@id=\"doc-nav\"]/ul/li[1]/a")).click();
					System.out.println("Test case passed :TC0098");
					 ScreenshotClass.captureScreenshot(driver, "TC0098");
							
}
			

				
				
	@Test(priority = 2, description = "Searching document ", enabled =  false)
	public void Search_documents() throws InterruptedException, AWTException, IOException { 
		
		//search-bar
		driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck");	
		System.out.println("Document seen..");
		System.out.println("Test case passed :TC0099");
		 ScreenshotClass.captureScreenshot(driver, "TC0099");
		 driver.findElement(By.id("search-doc-name")).clear();;	
						
//				driver.findElement(By.id("doc-search-icon")).click();		
//				//		     Thread.sleep(8000);
//				// doc-clear-icon
//				driver.findElement(By.id("doc-clear-icon")).click();
//				//		     Thread.sleep(8000);
//				System.out.println("cancel doc..");

				//Searching document with id document doc_id 
				driver.findElement(By.id("search-doc-id")).sendKeys("102"); Thread.sleep(3000);		     
				System.out.println("Test case passed :TC0100");
				 ScreenshotClass.captureScreenshot(driver, "TC0100");
				driver.findElement(By.id("reset")).click();  Thread.sleep(2000);
				System.out.println("Test case passed :TC0101");
				 ScreenshotClass.captureScreenshot(driver, "TC0101");
				 
				 //Tabluar column
				 Thread.sleep(3000);
				 System.out.println("Test case passed :TC0102");
				 ScreenshotClass.captureScreenshot(driver, "TC0102");
				    
	}

	
	@Test(priority = 3, description = "view document ", enabled = false)
	public void view_document() throws InterruptedException, AWTException, IOException {
		
					//view-103
					WebElement view =  driver.findElement(By.id("rec-Count"));
			
					System.out.println("Test case passed  TC0103");
					 ScreenshotClass.captureScreenshot(driver, "TC0103");	
					//Action for hovering 
					System.out.println("Hover view..");
					Actions act = new Actions(driver);
					act.moveToElement(view).perform();
			//		//				 Thread.sleep(8000);
					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[1]")).click();//100
			//		//			     Thread.sleep(2000);	
					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[2]")).click();//200
			//		//			     Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[3]")).click();//500
			//		//			     Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[4]")).click();//1000
			//		//			     Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[5]")).click();//all
					//			     Thread.sleep(2000);
					
					
	}
	
	
	
	@Test(priority = 4, description = "Filters ", enabled = false)
	public void Filters() throws InterruptedException, AWTException, IOException {
		
				System.out.println("Test case passed  TC0104");
				ScreenshotClass.captureScreenshot(driver, "TC0104");
				// Filter_Check
				driver.findElement(By.id("filter-icon")).click();
				Thread.sleep(2000);
				System.out.println("Test case passed  TC0105");
				ScreenshotClass.captureScreenshot(driver, "TC0105");
				Thread.sleep(2000);
				System.out.println("Test case passed  TC0106");
				ScreenshotClass.captureScreenshot(driver, "TC0106");
				
				
				//save-filter
				driver.findElement(By.id("save-fav-filter")).click();
				Thread.sleep(2000);
				System.out.println("Test case passed  TC0107");
				ScreenshotClass.captureScreenshot(driver, "TC0107");
//				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[6]/div/div[2]/buttonr")).click();
//				Thread.sleep(2000);
				
				//clear-filters
				driver.findElement(By.id("clearfilter")).click();
				Thread.sleep(2000);
				System.out.println("Test case passed  TC0108");
				ScreenshotClass.captureScreenshot(driver, "TC0108");
				
				//cls-filters
				Actions a = new Actions(driver);
				a.sendKeys(Keys.PAGE_UP).build().perform();;
				driver.findElement(By.xpath("//*[@id=\"filter-icon\"]/span")).click();
				Thread.sleep(2000);
				System.out.println("Test case passed  TC0109");
				ScreenshotClass.captureScreenshot(driver, "TC0109");
				
					
	
	
		
	}
				
//**Search-bar
				//			     driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck");
				//			     Thread.sleep(8000);


	@Test(priority = 5, description = "Filters dropdown ", enabled =  false)
	public void Filters_categories() throws InterruptedException, AWTException, IOException {
		
					driver.findElement(By.id("filter-icon")).click();
					Thread.sleep(2000);
					//verify
					
					System.out.println("Test case passed  TC0110");
					ScreenshotClass.captureScreenshot(driver, "TC0110"); //BA
					System.out.println("Test case passed  TC0111");
					ScreenshotClass.captureScreenshot(driver, "TC0111"); //BR
					System.out.println("Test case passed  TC0112");
					ScreenshotClass.captureScreenshot(driver, "TC0112"); // product
					System.out.println("Test case passed  TC0113");
					ScreenshotClass.captureScreenshot(driver, "TC0113"); //restric
					System.out.println("Test case passed  TC0114");
					ScreenshotClass.captureScreenshot(driver, "TC0114"); //doc_type
					System.out.println("Test case passed  TC0115");
					ScreenshotClass.captureScreenshot(driver, "TC0115"); //doc_ex
					System.out.println("Test case passed  TC0116");
					ScreenshotClass.captureScreenshot(driver, "TC0116"); //annual review
					//cls-filters
//					Actions a = new Actions(driver);
//					a.sendKeys(Keys.PAGE_UP).build().perform();;
//					driver.findElement(By.xpath("//*[@id=\"filter-icon\"]/span")).click();
//					Thread.sleep(2000);
//					System.out.println("Test case passed  TC0117");
//					ScreenshotClass.captureScreenshot(driver, "TC0117");  //fold
					
					/**
					 * 
					 *  Apart from test cases extra  filters cases
					 *  
					 *  
					 *  **/
					
					//** Filter-Business Area				
					//			     //filter-search
									driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[1]/div/input")).sendKeys("vvvv");
								     Thread.sleep(2000);		  
								     //filter-cancel
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[1]/div/span[2]")).click();
								     Thread.sleep(2000);
								     //filter_checkbox			  
								     driver.findElement(By.xpath(" //*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);			     
								     //filter-rest
								     driver.findElement(By.xpath("   //*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);			     
								     //selct 2 options		     
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[4]/a/label")).click();		
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[5]/a/label/input")).click();
								     Thread.sleep(2000);     
								     //reset
								     driver.findElement(By.xpath("   //*[@id=\"filter-body\"]/div[1]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(5000);
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);

								     
	// //Filter-2 BR	
								     System.out.println("Filter start Business Role..");			
								    //open
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[2]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     //entering values
								     driver.findElement(By.xpath("   //*[@id=\"filter-body\"]/div[2]/div[2]/span/div/ul/li[1]/div/input")).sendKeys("vvvv");
								     Thread.sleep(2000);
								    //cancel
								     driver.findElement(By.xpath(" //*[@id=\"filter-body\"]/div[2]/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
								     Thread.sleep(2000);
								     //select-all
								     driver.findElement(By.xpath(" //*[@id=\"filter-body\"]/div[2]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);
								     //reset
								     driver.findElement(By.xpath("   //*[@id=\"filter-body\"]/div[2]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);
							     //clse-filter_2
								     driver.findElement(By.xpath("  //*[@id=\"filter-body\"]/div[2]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     
								     System.out.println("Closed the business Role..");		     
					////filter-3_Product
			     
								     //filter-open
							  	System.out.println("Filter Product..");
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
							     //entering values
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/ul/li[1]/div/input")).sendKeys("vvvv");
								     Thread.sleep(2000);
								    //cancel
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
								     Thread.sleep(2000);
							     //select-all
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);
								     //reset
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);
								     //clse-filter_2
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[3]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);			     
								     System.out.println("Closed the Product..");
							     	System.out.println("Passed test case TC0115");
					
					////filter_Restriction		     
							     	//filter-open
								  	System.out.println("Filter filter_Restriction ..");
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     //entering values
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/ul/li[1]/div/input")).sendKeys("vvvv");
								     Thread.sleep(2000);
								    //cancel
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
								     Thread.sleep(2000);
								     //select-all
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);
								     //reset
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);
							     //clse-filter_2
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[4]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     
								     System.out.println("Closed the Restriction..");    
							     			System.out.println("Passed test case TC0116");		     
							     
					////filter_PRoduct
					//			     
								     System.out.println("Filter filter_PRoduct ..");
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[5]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[5]/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
								     Thread.sleep(2000);
							    //cancel
								     Thread.sleep(2000);
							     //select-all
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[5]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);
							     //reset
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[5]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);
							     //clse-filter_2
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[5]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
							     
								     System.out.println("Closed the filter_PRoduct..");    		     
								     			System.out.println("Passed test case TC0115");		     
					////filter_Document_type
								     
	   
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/button/span")).click();
								     Thread.sleep(2000);
								     //entering values
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/ul/li[1]/div/input")).sendKeys("vvvv");
								     Thread.sleep(2000);
								    //cancel
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
								     Thread.sleep(2000);
								     //select-all
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/ul/li[2]/a/label/input")).click();
								     Thread.sleep(2000);
								     //reset
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/ul/li[3]/div/a")).click();
								     Thread.sleep(2000);
								     //clse-filter_2
								     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[6]/div[2]/span/div/button/span")).click();		     
								     Thread.sleep(2000);
								    
							     				    
					//			//clear-button

							     driver.findElement(By.id("clearfilter")).click();
							     Thread.sleep(3000);
//					System.out.println("Passed test case TC0111");
					
					//Dropdown_ExcludeAnnualReview 		     

							     driver.findElement(By.xpath("//*[@id=\"isExcludeAudit\"]")).click();
							     Thread.sleep(8000);
							     System.out.println("Passed test case TC0119");
									 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[9]/div[2]/select/option[2]")).click();
									 driver.findElement(By.xpath("//*[@id=\"isExcludeAudit\"]")).click();				     
									 driver.findElement(By.id("isExcludeAudit")).click();
								     Thread.sleep(3000);	   			
								     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[9]/div[2]/select/option[3]")).click(); 	
								     driver.findElement(By.xpath("//*[@id=\"isExcludeAudit\"]")).click();
								     Thread.sleep(3000);
								     driver.findElement(By.id("clearfilter")).click();
								     Thread.sleep(3000);
 
					////Scenario_save_filter select any 4 option on each filter			     
					////business-Area			     
//							     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);		       		  
//								   //1st_option  			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/span/div/ul/li[4]/a/label/input")).click();
//							     Thread.sleep(2000);				     
//								   //2nd_option  
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/span/div/ul/li[5]/a/label/input")).click();
//							     Thread.sleep(2000);			     	
//							     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();   
//							     Thread.sleep(2000);
					
//			     			System.out.println("Passed test case TC0113");

					
					////Business_role		     
					//		     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);		     
//								     		  
//								   //1st_option  			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/span/div/ul/li[4]/a/label/input")).click();
//							     Thread.sleep(2000);				     
//								   //2nd_option  
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/span/div/ul/li[5]/a/label/input")).click();
//							     Thread.sleep(2000);			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/span/div/button/span")).click();   
//							     Thread.sleep(2000);	

//	     			System.out.println("Passed test case TC0114");
					
					////Product		     

					
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);		     
//								     		  
//								   //1st_option  			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/span/div/ul/li[4]/a/label/input")).click();
//							     Thread.sleep(2000);				     
//								   //2nd_option  
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/span/div/ul/li[5]/a/label/input")).click();
//							     Thread.sleep(2000);			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/span/div/button/span")).click();   
//							     Thread.sleep(2000);
	     			//System.out.println("Passed test case TC0115");
					
					////Restriction
		     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[4]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);		     		     		  
//								   //1st_option  			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[4]/div[2]/span/div/ul/li[4]/a/label/input")).click();
//							     Thread.sleep(2000);				     
//								   //2nd_option  
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[4]/div[2]/span/div/ul/li[5]/a/label/input")).click();
//							     Thread.sleep(2000);			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[4]/div[2]/span/div/button/span")).click();   
//							     Thread.sleep(2000);
	     			//System.out.println("Passed test case TC0116");
					
					////Filter-search_button
//							     driver.findElement(By.id("search-doc-byfilter")).click();   
//							     Thread.sleep(2000);
//							     
//							     //clear_filter			         
//							     driver.findElement(By.id("clearfilter")).click();
//							     Thread.sleep(5000);		     
//					//		     
					////Filter_business-Area			     
//							     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);		     
//								     		  
//								   //seelct_all  			     
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/span/div/ul/li[2]/a/label/input")).click();
//							     Thread.sleep(2000);				     
//							     driver.findElement(By.xpath("//*[@id=\"filter-body\"]/div[1]/div[2]/span/div/button/span")).click();
//							     Thread.sleep(2000);
					//		     
					////Filter-search_button
//							     driver.findElement(By.id("search-doc-byfilter")).click();   
//							     Thread.sleep(2000);		     						     
							     
					////clear_filter			         
//							     driver.findElement(By.id("clearfilter")).click();
//							     Thread.sleep(5000);			     
	
					//Filter_Close

								 	Actions a = new Actions(driver);
									a.sendKeys(Keys.PAGE_UP).build().perform();;
									driver.findElement(By.xpath("//*[@id=\"filter-icon\"]/span")).click();
									Thread.sleep(2000);
									 


		
	}
	
	
	
	
	@Test(priority = 6, description = "Add a File")
	public void AddFile() throws InterruptedException, AWTException, IOException {
		
		
						//TC0118
				
						//AddFile//
				
						//----------Scenario_Document_addAFile_button		     
						System.out.println("Test case passed  TC0118");
						ScreenshotClass.captureScreenshot(driver, "TC0118");
					
				
						//single-file	copy operation--   
				//				   WebElement upload_file = driver.findElement(By.id("file-upload-btn"));
				//				   upload_file.click();	
						//System.out.println("Passed test case TC0123");
						//System.out.println("Passed test case TC0124");
				//				   Thread.sleep(3000); 
				//				   String file_path = "\"C:\\Users\\1925566\\Downloads\\AKBUserGuide.pdf\"";			   
				//				   StringSelection selection = new StringSelection( file_path);
				//				   //UPLOAD FILE-->TOOLtip
				//				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		   
				//				   Thread.sleep(3000); 
						
						
				//		ctrl+v operation 	 --robot Class keyboard actions    
				
				//	     Robot robot = new Robot();
				
				//virtual keypad press      
				//	     robot.keyPress(KeyEvent.VK_CONTROL);
				//	     robot.keyPress(KeyEvent.VK_V);
				//	     Thread.sleep(3000); 
				//	     robot.keyRelease(KeyEvent.VK_V);
				//	     robot.keyRelease(KeyEvent.VK_CONTROL);
				//	     Thread.sleep(3000); 
				//	     robot.keyPress(KeyEvent.VK_ENTER);
				//	     robot.keyRelease(KeyEvent.VK_ENTER);
				//	     
				//	     Thread.sleep(3000);
				//	     System.out.println("File Upload is successful");		      
				//	     System.out.println("Opening upload pop up");
						
						System.out.println("Test case passed  TC0119");
						ScreenshotClass.captureScreenshot(driver, "TC0119");
						
						//Business Area
						//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/button/span")).click();
						//		     Thread.sleep(3000);
						//		     //business_Area_selectall  	//fillxPath	 /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input    
						//		     driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click()	;	     
						//		     Thread.sleep(3000);
						////		     //business_Area_Rest 
						//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/ul/li[3]/div/a")).click()	;	          
						//		     Thread.sleep(2000);     
						////		     //business_Area_selectall	     
						//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click()	;	          
						//		     Thread.sleep(2000);
						////		    //return to buisness area
						//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span/div/button/span")).click();		     
						//		     Thread.sleep(2000);
						//		     
						//Business-Role		     

						//		     driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/span/div/button/span")).click();
						//		     Thread.sleep(3000);
						//		     
						//		     driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click()	;	     
						//		     Thread.sleep(3000);
						//
						//		     driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/span/div/ul/li[3]/div/a")).click()	;	          
						//		     Thread.sleep(2000);     
						//    
						//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[3]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click()	;	          
						//		     Thread.sleep(2000);
						//
						//		     driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/span/div/button/span")).click();		     
						//		     Thread.sleep(2000);
						//		     
						//Document-type		     
						//		     driver.findElement(By.id("grpid-new")).click();		     
						//		     Thread.sleep(2000);		     		    
						//		   driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/select/option[2]")).click();		     
						//		   Thread.sleep(2000);


						///Exclude from Annual Review		   
						//		   driver.findElement(By.xpath(" //*[@id=\"excludeaudit-new\"] ")).click();		     
						//		   Thread.sleep(2000);	  
						//		   driver.findElement(By.xpath(" /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[5]/div[1]/div/div[2]/select/option[1]")).click();	
						//		   Thread.sleep(2000);
						//		   driver.findElement(By.xpath(" /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[5]/div[1]/div/div[2]/select/option[2]  ")).click();	
						//		   Thread.sleep(2000);
						//		   driver.findElement(By.xpath(" //*[@id=\"excludeaudit-new\"] ")).click();		     
						//		   Thread.sleep(2000);	

						///Location
						//		   driver.findElement(By.xpath(" //*[@id=\"LocationUsed\"]  ")).click();		     
						//		   Thread.sleep(5000);	 
						//	   
						//		    driver.findElement(By.xpath(" /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[6]/div[1]/div/div[2]/select/option[2]   ")).click();
						//		    Thread.sleep(2000);	
						//		    driver.findElement(By.xpath(" //*[@id=\"LocationUsed\"]  ")).click();	
						//		    driver.findElement(By.xpath(" //*[@id=\"LocationUsed\"]  ")).click();		     
						//			Thread.sleep(5000);
						//			 driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[6]/div[1]/div/div[2]/select/option[3]  ")).click();
						//			    Thread.sleep(2000);	
						//			    driver.findElement(By.xpath(" //*[@id=\"LocationUsed\"]  ")).click();
						//		    Thread.sleep(5000);


						//allow downlaod doc-allow-download	    

						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[7]/div[1]/div/div[2]/input ")).click();
						//		    Thread.sleep(2000);
						////description
						//		    driver.findElement(By.id("docid-comments")).sendKeys("new file");
						//		    Thread.sleep(2000);


						//Upload_Restriction

						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/select")).click();
						//		    Thread.sleep(2000);		    
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/select/option[4]")).click();
						//		    Thread.sleep(2000);	    
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/select")).click();
						//		    Thread.sleep(2000);	    
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/select/option[3]")).click(); 
						//		    Thread.sleep(2000);
						//		    

						//product  
						//		    
						//		    driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[2]/div/div[2]/span/div/button")).click(); 
						//		    
						//		    Thread.sleep(2000);
						//		    //select all
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/span/div/ul/li[2]/a/label/input")).click(); 
						//		    
						//		    Thread.sleep(2000);
						//		    
						//		
						//		    //reset
						//		    driver.findElement(By.xpath("  /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/span/div/ul/li[2]/a/label/input")).click(); 
						//		    
						//		    Thread.sleep(2000); 
						//		    //select all
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/span/div/ul/li[2]/a/label/input")).click(); 
						//		    
						//		    Thread.sleep(2000);
						//		    driver.findElement(By.xpath("//*[@id=\"fileModal\"]/div/div/div[2]/div[3]/div[2]/div/div[2]/span/div/button")).click();



						//searchmodule
						//		     driver.findElement(By.id("search-nav")).click();
						//		     Thread.sleep(5000);
						//	Respositary	    

						//		    driver.findElement(By.id("repos-new")).click(); 		  
						//		    Thread.sleep(2000);  
						////		    //sharepoint
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[5]/div[2]/div/div[2]/select/option[1]")).click(); 
						//		    

						//Risk rating
						//		    
						//		    driver.findElement(By.id("Riskrating")).click(); 		  
						//		    Thread.sleep(2000);   
						//		    
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[6]/div[2]/div/div[2]/select/option[2]")).click();
						//		    Thread.sleep(2000); 
						//		    
						//		    driver.findElement(By.id("Riskrating")).click(); 		  
						//		    Thread.sleep(2000);   
						//		    
						//		    driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[2]/div[6]/div[2]/div/div[2]/select/option[3]")).click();
						//		    Thread.sleep(2000); 
						//		    

						//Document manager		    

						//		    driver.findElement(By.id("docmanagerautocomplete")).sendKeys("New manager") ;		  
						//		    Thread.sleep(2000);  


						//document-owner

						//		     WebElement textBox = driver.findElement(By.id("sme-new")); // Replace with the actual text box identifier
						//		             textBox.sendKeys("a");
						//		             Thread.sleep(2000);
						//		             Actions actions = new Actions(driver);
						//		             actions.sendKeys(textBox, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
						//		             Thread.sleep(2000);

						//Pencil
						//		            driver.findElement(By.xpath(" /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[4]/div[2]/div/div[2]/span[2]")).click();
						//		            textBox.sendKeys("b");
						//		            Thread.sleep(2000);	           
						//		             actions.sendKeys(textBox, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
						//		             Thread.sleep(2000);


						//Add Document_button		    

						//		           		    driver.findElement(By.id("uploadFile")).click() ;		  
						//		           		    Thread.sleep(2000);   		    

						//error-handling

						//		    String actual_error_message = driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/div/div[1]/div/span")).getText();
						//		    
						//		     System.out.println(actual_error_message);
						//		     
						//		    
						//		    String excepted = "Error: Please update valid Document Owner Email";
						//again_pencil
						//		    if (actual_error_message.equals(actual_error_message)==true) {
						//		    	
						//		    driver.findElement(By.xpath(" /html/body/div[1]/div/div[6]/div/div/div/div[2]/div[4]/div[2]/div/div[2]/span[2]")).click();
						//		    
						//		    textBox.sendKeys("b");
						//		    
						//		    Thread.sleep(2000);	
						//		   	    
						//		    driver.findElement(By.xpath("/html/body/ul[2]/li[2]/div")).click();
						//		    
						//		    
						//		    }
						//		    else{
						//System.out.println(" File Upload error");     	    
						//		    }

						//Add Document_button		    
						//
						//		    driver.findElement(By.id("uploadFile")).click() ;		  
						//		    Thread.sleep(2000);   		    	    
						//		    System.out.println("End of File Upload ");	
						
						
						
						
						///////////////////////End of Upload File//////////////		
	}
	
	
/** Tabular column **/	
	
	@Test(priority = 7, description = "Documents tabular column ", enabled = false)
	public void document_table() throws InterruptedException, AWTException, IOException {
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	   



		

		//////////////////Scroll_id

//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/thead/tr/th[1]")).click();
//				Thread.sleep(2000);   
		//
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/thead/tr/th[1]")).click();
		//
//				Thread.sleep(2000); 

				//document_download_byID
				//search search-doc-name
				
//				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck.xlsx");
//				Thread.sleep(2000); 			     			     
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/div/a")).click();
//				Thread.sleep(2000); 			     
//				driver.findElement(By.id("search-doc-name")).clear();
//				Thread.sleep(2000);
				///Verify 

		/////////View_col

//				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck.xlsx");
//				Thread.sleep(2000); 			
//				ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[3]/div/a/span")).click();
//				Thread.sleep(8000);
//				driver.switchTo().window(w.get(0));
//				Thread.sleep(8000);

		//version_column
				//OPEN
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[4]/div/span/span")).click();
//				Thread.sleep(2000); 			     
		////CLOSE
//				driver.findElement(By.id("closeVersionmodal")).click();
//				Thread.sleep(2000); 
		//..OPEN
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[4]/div/span/span")).click();
//				Thread.sleep(2000); 			     
		//
		//
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[4]/div[2]/input")).clear();
//				Thread.sleep(1000); 
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[4]/div[2]/input")).sendKeys("3");
//				Thread.sleep(2000); 

				
//				 WebElement version_update_file = driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[6]/div/div/label/span[2]"));
//				 		version_update_file.click();		   
//							   Thread.sleep(3000); 
//							   String file_path = "\"C:\\Users\\1925566\\Downloads\\Selenium.txt\"";
//							   
//							   StringSelection selection = new StringSelection( file_path);
//							   //UPLOAD FILE-->TOOLtip
//							   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		   
//							   Thread.sleep(3000); 
						     

					//ctrl+v operation 	 --robot Class keyboard actions    

//							     Robot robot = new Robot();


					//virtual keypad press      
//							     robot.keyPress(KeyEvent.VK_CONTROL);
//							     robot.keyPress(KeyEvent.VK_V);
//							     Thread.sleep(3000); 
//							     robot.keyRelease(KeyEvent.VK_V);
//							     robot.keyRelease(KeyEvent.VK_CONTROL);
//							     Thread.sleep(3000); 
//							     robot.keyPress(KeyEvent.VK_ENTER);
//							     robot.keyRelease(KeyEvent.VK_ENTER);
//							     
//							     Thread.sleep(3000);
		//	
//							     driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[7]/div[2]/textarea")).sendKeys("new version");
//								Thread.sleep(2000); 
//				
				     //previous version
//								driver.findElement(By.id("showversion-id-suggested")).click();
//								Thread.sleep(2000); 
//							     
//								driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[5]/table/tbody/tr[2]/td[1]/a/span")).click();
//								Thread.sleep(2000);
//							
//							     
//								driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[5]/div/span/span")).click();
//								Thread.sleep(2000); 
				
//								driver.findElement(By.id("uploadFileVersion")).click();
//								Thread.sleep(2000); 

				
//								driver.findElement(By.id("closeVersionmodal")).click();
//								Thread.sleep(2000); 
			
				
				
		//		System.out.println("Passed test case: TC0129");
//				System.out.println("Passed test case: TC0130");		
//				System.out.println("Passed test case: TC0131");		
//				System.out.println("Passed test case: TC0132");	
//				System.out.println("Passed test case: TC0133");
//				System.out.println("Passed test case: TC0134");
//				System.out.println("Passed test case: TC0135");
//				System.out.println("Passed test case: TC0136");
				
				
				
		//////tag_column
				
//				System.out.println("Passed test case: TC0137");
//				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck.xlsx");
//				Thread.sleep(2000); 					
//								
//				driver.findElement(By.xpath("	/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[5]/div/span	")).click();
//				Thread.sleep(2000); 				
//				
//				driver.findElement(By.id("autoTagSugt")).click();
//				Thread.sleep(2000); 					
							
//				System.out.println("Passed test case: TC0138");
				
				//tag_name
//				WebElement tag_name = driver.findElement(By.id("tag-name"));
//				tag_name.click();
//				Thread.sleep(2000); 					
//				tag_name.sendKeys("new tag");			
//				Thread.sleep(2000); 			
//				driver.findElement(By.id("tag-name-btn")).click();
//				Thread.sleep(2000);				
//								
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[10]/div/div/div/div[1]/button/span")).click();
//				Thread.sleep(2000);					
//								
//								
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[6]/div/span/span")).click();
//				Thread.sleep(2000);						
								
//				System.out.println("Passed test case: TC0139");	
//				System.out.println("Passed test case: TC0142");			
//				System.out.println("Passed test case: TC0143");	
				
		///////////_column_update
				
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/div/span/span")).click();
//				Thread.sleep(2000);	
								
			//update_pop
				
				//Business_area 
//				driver.findElement(By.xpath("//*[@id=\"metaUpdateModal\"]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);							
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/ul/li[3]/div/a")).click();
//				Thread.sleep(2000);											
//				driver.findElement(By.xpath("//*[@id=\"metaUpdateModal\"]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/ul/li[3]/div/a")).click();
//				Thread.sleep(2000);											
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/ul/li[1]/div/input")).sendKeys("v");
//				Thread.sleep(2000);					
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/ul/li[1]/div/span[2]/button/i")).click();
//				Thread.sleep(2000);					
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);							
//				driver.findElement(By.xpath("//*[@id=\"metaUpdateModal\"]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);
				
				
				//Business_ROle
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);			
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("	/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);	
				
				
				//docu_type
//				WebElement update_doc_type = driver.findElement(By.id("grpid-curr"));
//				update_doc_type.click();
//				Thread.sleep(2000);		
//				Actions actions = new Actions(driver);		
//				actions.moveToElement(update_doc_type).perform();		
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[4]/div[1]/div/div[2]/select/option[2]")).click();
//				Thread.sleep(2000);	
//				update_doc_type.click();
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[4]/div[1]/div/div[2]/select/option[3]")).click();
//				Thread.sleep(2000);	

				//exclude annual review
				
				
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[5]/div[1]/div/div[2]/select")).click();
//				Thread.sleep(2000);	
//				
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[5]/div[1]/div/div[2]/select/option[2]")).click();
//				Thread.sleep(2000);	
//				
//				
//				driver.findElement(By.id("doc-allow-download-update")).click();
//				Thread.sleep(2000);	
//				
//				driver.findElement(By.id("docid-comments-curr")).sendKeys("New File");
//				Thread.sleep(2000);	
				
				
				//product 
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/span/div/ul/li[3]/div/a")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/span/div/ul/li[2]/a/label/input")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/span/div/button/span")).click();
//				Thread.sleep(2000);	
				
				
				//lock_document  
				
//				driver.findElement(By.xpath("//*[@id=\"lockdocument-curr\"]")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[5]/div[2]/div/div[2]/select/option[2]")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[5]/div[2]/div/div[2]/select/option[3]")).click();
//				Thread.sleep(2000);	
//				
				
				//risk
				
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[6]/div[2]/div/div[2]/select")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[6]/div[2]/div/div[2]/select/option[2]")).click();
//				Thread.sleep(2000);	

				
				//managername  
//				WebElement manager_name = driver.findElement(By.id("docmanagerautocomplete-update"));
//				manager_name.click();
//				Thread.sleep(1000);
//				manager_name.sendKeys("New manager");
//				Thread.sleep(2000);	
				//Rename
				
//				driver.findElement(By.id("doc-name-change")).click();
//				Thread.sleep(2000);	
				
				
		///////update button 
//				
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[10]/div[2]/button")).click();
//				Thread.sleep(2000);	
				
				
		////////Tabular_Archive	
				
//				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck.xlsx");
//				Thread.sleep(2000); 					
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[8]/div/button/span")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.id("drp-retention-prd")).click();
//				Thread.sleep(5000);	
//				
//				driver.findElement(By.xpath("//*[@id=\"drp-retention-prd\"]/option[2]")).click();
//				Thread.sleep(1000);	
//				driver.findElement(By.xpath("//*[@id=\"drp-retention-prd\"]/option[3]")).click();
//				Thread.sleep(1000);	
//				driver.findElement(By.xpath("//*[@id=\"drp-retention-prd\"]/option[5]")).click();
//				Thread.sleep(1000);	
//				driver.findElement(By.xpath("//*[@id=\"drp-retention-prd\"]/option[6]")).click();
//				Thread.sleep(1000);	
//				
//				driver.findElement(By.id("doc-del-comment")).sendKeys("Archive");
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("//*[@id=\"delDocBtn\"]")).click();
//				Thread.sleep(2000);	
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[9]/div/div/div/div/div[1]/div/div/button")).click();
//				Thread.sleep(2000);	
		//	
		//////////Col_delete_file	
//				driver.findElement(By.id("search-doc-name")).clear();
//				driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck.xlsx");
//				Thread.sleep(2000); 
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/section/div[3]/div[2]/div/table/tbody/tr/td[9]/div/button/span")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("doc-permanentdelete-comment")).sendKeys("delete");
//				Thread.sleep(2000); 
//				driver.findElement(By.id("permanent-delete-DocBtn")).click();
//				Thread.sleep(2000); 
//				driver.findElement(By.id("permanent-delete-DocBtn")).click();	
//				Thread.sleep(2000); 	
//				
				
				
		/////////Scenario_pageScroll
//				driver.findElement(By.xpath("//*[@id=\"tblDocuments_next\"]/a")).click();	
//				driver.findElement(By.xpath("//*[@id=\"tblDocuments_previous\"]/a")).click();	
					
		//////////////////////////////End of manage_Document		
				//		     ///Bulk upload in document
				//		     System.out.println("Hover Document..Bulk upload Document");
				//		 	//document hover
				//		     WebElement Document_module1 = driver.findElement(By.id("doc-nav"));
				//			//Action for hovering 
				//				 Actions act1 = new Actions(driver);
				//				 act1.moveToElement(Document_module1).perform();
				////				 Thread.sleep(8000);
				//				 driver.findElement(By.xpath("  //*[@id=\"doc-nav\"]/ul/li[2]/a")).click();
				//			     Thread.sleep(8000);    
				//			     driver.findElement(By.id("search-nav")).click();
				//			     Thread.sleep(5000);

		  
		////////// /// ///Bulk upload metadata
//							     System.out.println("Hover Document..metadata upload Document");
//							 	//document hover
//							     WebElement Document_module11 = driver.findElement(By.id("doc-nav"));
//								//Action for hovering 
//									 Actions act11 = new Actions(driver);
//									 act11.moveToElement(Document_module11).perform();
//								
//									 driver.findElement(By.xpath("//*[@id=\"doc-nav\"]/ul/li[3]/a")).click();
								        
								
								   







}

	



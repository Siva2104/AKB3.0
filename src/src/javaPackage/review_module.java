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


public class review_module {
	


	public void review_module() throws InterruptedException, AWTException, IOException {


						
							System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
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
							Thread.sleep(1000);
							System.out.println("opening homepge..");
							
							
							
							
							
/*
 * 
 * 
 * *hovering over Review *
 * 
 * 
 * 
 * 
 * */
							
							
							
				//manage document
			        System.out.println("Hover Review..");
				    WebElement Document_module = driver.findElement(By.id("annreview-nav")); 			
//					Actions act = new Actions(driver);
//					act.moveToElement(Document_module).perform();
				////example_explicit wait				
//					WebDriverWait wait1 = new WebDriverWait(driver,30);
//					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/ul/li[1]/a"))); Thread.sleep(2000);
//					driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/ul/li[1]/a")).click();
												
							
	//**Search-Bar						
//					driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck");	
//					System.out.println("Document seen..");									
//					driver.findElement(By.id("doc-search-icon")).click();		
//					driver.findElement(By.id("doc-clear-icon")).click();
//					System.out.println("cancel doc..");		
//							
	//**Pending-toggle					
							
//					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[5]/label/span")).click();		
//					System.out.println("pending Off");			
//					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[5]/label/span")).click();			
//					System.out.println("pending ON");	
							
	//Document-id 					
							
//					driver.findElement(By.id("search-doc-id")).sendKeys("22");		
//					driver.findElement(By.id("search-doc-id")).clear();
					
	//**Take button				
					
//					driver.findElement(By.id("rec-Count")).click();
//					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[2]")).click();Thread.sleep(2000);
//					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[3]")).click(); Thread.sleep(2000);
//					driver.findElement(By.xpath("//*[@id=\"rec-Count\"]/option[5]")).click();Thread.sleep(2000);
//					driver.findElement(By.id("rec-Count")).click();
					
    //**Filters					
					
//					driver.findElement(By.id("show-advanced-search")).click();	
				
					
	//**Filters_BusinessArea				
					
//					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div[2]/div[1]/div[1]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div[2]/div[1]/div[1]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[1]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[1]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div[2]/div[1]/div[1]/div/span/span/div/button/span")).click();		
					
	//**Filters_BusinessRole				
					
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/ul/li[1]/div/span[2]/button")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[2]/div/span/span/div/button/span")).click();
					
   //**Filters_PRoduct					
					
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[3]/div/span/span/div/button/span")).click();

                    
  //**Filters_Restriction					
					
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[4]/div/span/span/div/button/span")).click();			
 //**Document_type					
					
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[5]/div/span/span/div/button/span")).click();				
                    
                                 
//**Document_Extension					
					
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div[6]/div/span/span/div/button/span")).click();
                    
                    
  //**Start Date 
                    
//                    driver.findElement(By.id("annrev-Stdatepicker")).click();   Thread.sleep(1000);
//                    driver.findElement(By.xpath("/html/body/div[2]/div/a[1]")).click();      Thread.sleep(1000);
//                    driver.findElement(By.xpath(" /html/body/div[2]/div/a[2]")).click();    Thread.sleep(1000);
//                    driver.findElement(By.xpath("/html/body/div[2]/div/div/select[1]")).click();   Thread.sleep(1000);  //Month
//                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[4]")).click();   Thread.sleep(1000); // Month_april
//                    driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")).click();    Thread.sleep(1000);  //Year  
//                    driver.findElement(By.xpath(" //*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[8]")).click();  Thread.sleep(1000); //Year_2020
//                    driver.findElement(By.xpath("    /html/body/div[2]/table/tbody/tr[4]/td[6]/a")).click();  Thread.sleep(1000); //Date
                
  //** End Date                 
                    
//                    driver.findElement(By.id("annrev-enddatepicker")).click();   Thread.sleep(1000);
//                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();      Thread.sleep(1000);
//                    driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();    Thread.sleep(1000);
//                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();   Thread.sleep(1000);  //Month
//                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[12]")).click();   Thread.sleep(1000); // Month_dec
//                    driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")).click();    Thread.sleep(1000);  //Year  
//                    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[4]/a")).click();  Thread.sleep(1000); //Date   15
                 
  //** Filter Search                  
                    
//                    driver.findElement(By.id("search-annrev-byfilter")).click();  Thread.sleep(1000);
                   
        //Save filter            
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[2]/div[3]/div[3]/div/div[2]/button")).click();  Thread.sleep(1000);
//                    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[6]/div/div[2]/button")).click();  Thread.sleep(1000);
       //Clear filter             
         
//                    driver.findElement(By.id("clearfilter")).click();  Thread.sleep(1000);
       //Close Filter         
//                    driver.findElement(By.id("hide-search")).click();  Thread.sleep(1000);
                    
                    
                    
 //** Sort By                   
                    
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[2]/button[1]")).click();      Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[2]/button[2]")).click();  Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[3]/button[1]")).click();  Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[3]/button[2]")).click();  Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[4]/button[1]")).click();  Thread.sleep(1000);
//					driver.findElement(By.xpath("//*[@id=\"sort-div\"]/span[4]/button[2]")).click();  
                    
                    
                    
//					driver.findElement(By.id("search-doc-name")).sendKeys("UserBulkTemplateCheck");	   Thread.sleep(1000);              
//                    
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div/section/div[1]/table/tbody/tr[2]/td[9]/span")).click()	;   Thread.sleep(1000);
//				
//					driver.findElement(By.id("annrev-date-comment")).sendKeys("New comment");Thread.sleep(1000);
//                    
//					driver.findElement(By.id("changedate")).click();
                    
                    
                    
                    
                    
                    
                    
                    
    //**End of Annual Review **/
					
					
	/*
	 * 
	 * 
	 * 
	 * * Start of Bulk Upload Annual Review*
	 * 
	 * 
	 * 
	 * */				
					
								
					Actions act_2 = new Actions(driver);
					act_2.moveToElement(Document_module).perform();
				////example_explicit wait				
					WebDriverWait wait1 = new WebDriverWait(driver,30);
					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/ul/li[2]/a"))); Thread.sleep(2000);
					driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[4]/ul/li[2]/a")).click();
                    
                    
  //** Filters_ POPUP
					
//** Business Area				
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/span/span/div/button/span")).click();
       
                    
  //** Business- Role                 
                    
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/span/span/div/button/span")).click();
         
 //**Product                
                    
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/span/span/div/button/span")).click();     
                    
                    
//**Restrictions                   
                    
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/span/span/div/button/span")).click();                      
                    
                    
//**Document-Type              /html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/button/span     
                    
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/span/span/div/button/span")).click();                              
//** Document-Extension              
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/button/span")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[3]/div/a")).click();  		
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[1]/div/input")).sendKeys("v");
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[1]/div/span[2]/button/i")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/ul/li[2]/a/label/input")).click();
//					driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/span/span/div/button/span")).click(); 
                    
 //** Start Date
					
//                  driver.findElement(By.id("startDate")).click();   Thread.sleep(1000);
//                  driver.findElement(By.xpath(" //*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();   Thread.sleep(1000);
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]]")).click();      Thread.sleep(1000);
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();    Thread.sleep(1000);
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();   Thread.sleep(1000);  //Month
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[4]")).click();   Thread.sleep(1000); // Month_april
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();    Thread.sleep(1000);  //Year  
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[5]")).click();  Thread.sleep(1000); //Year_2020
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();  Thread.sleep(1000); //Date
                    
 //** End Date
                  
//                  driver.findElement(By.xpath("//*[@id=\"endDate\"]	")).click();   Thread.sleep(1000);
//                  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();   Thread.sleep(1000);
//               
//                  driver.findElement(By.xpath("//*[@id=\"save-fav-filter\"]")).click(); Thread.sleep(1000);
//                  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[6]/div/div[2]/button")).click(); Thread.sleep(1000);              
//                  driver.findElement(By.xpath("//*[@id=\"filterdoc\"]")).click(); 
                  
 //Download-Template with pending annaual review
//                  driver.findElement(By.id("downloadExistingTemplate")).click(); 
//                  driver.findElement(By.id("downloadEmptyTemplate")).click(); 
                  
//** Upload   
                  
							driver.findElement(By.xpath("//*[@id=\"main-content maindiv\"]/div[2]/div/div[1]/div/div[2]")).click(); 
							 Thread.sleep(2000);
							 String file_path = "C:\\Users\\1925566\\Downloads\\Pending_AnnualReview_Template_2023_11_10";		   
							   StringSelection selection = new StringSelection( file_path);
							   //UPLOAD FILE-->TOOLtip
							   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		   
							   Thread.sleep(3000); 		     

		//ctrl+v operation 	 --robot Class keyboard actions    

							     Robot robot = new Robot();


		//virtual keypad press      
							     robot.keyPress(KeyEvent.VK_CONTROL);
							     robot.keyPress(KeyEvent.VK_V); Thread.sleep(3000); 
							     robot.keyRelease(KeyEvent.VK_V);
							     robot.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(3000); 
							     robot.keyPress(KeyEvent.VK_ENTER);
							     robot.keyRelease(KeyEvent.VK_ENTER);	  Thread.sleep(3000); 
							
                  
						     driver.findElement(By.id("bulkannreviewupload-file")).click(); Thread.sleep(2000);
						     driver.findElement(By.id("previewdata")).click(); 
						     driver.findElement(By.xpath("//*[@id=\"bulkdataid\"]/tr/th[1]")).click(); 
						     driver.findElement(By.xpath("//*[@id=\"bulkdataid\"]/tr/th[2]")).click(); 
						     driver.findElement(By.xpath("//*[@id=\"bulkdataid\"]/tr/th[3]")).click(); 
						     driver.findElement(By.xpath("//*[@id=\"bulkdataid\"]/tr/th[4]")).click(); Thread.sleep(2000);

						     
						     driver.findElement(By.id("edit-blkupload")).click();   Thread.sleep(2000);   //Save chnages

						     
						     driver.findElement(By.id("error-report")).click();  //Error Report
						     
						     driver.findElement(By.xpath("//*[@id=\"hide-message\"]/span")).click(); 
						    
//						     driver.findElement(By.id("confirm-blkannreview")).click(); 
							   
						     
						     
						     
//**End of Review Module //**						     
						     
						     
						     
						     
						     
						     
						     
						     
						     
}
}

	

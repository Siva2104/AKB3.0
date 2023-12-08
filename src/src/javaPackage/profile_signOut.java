package src.javaPackage;
import org.apache.commons.io.FileUtils;


import org.apache.poi.ss.usermodel.Cell;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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





@SuppressWarnings("unused")

public class profile_signOut extends Test1 {
	
	
	/*
	* 
	* 
	* * Profile*
	* 
	* 
	* */	
	
	@Test (priority=1,description="Clicking the Profile", alwaysRun = true)
	public void profile() throws InterruptedException, AWTException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[7]/a/span[2]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[7]/a/span[2]")).click();
		Thread.sleep(2000);
		System.out.println("Test case : TC0603");
		ScreenshotClass.captureScreenshot(driver, "TC0603");
		
		
	}

	   @Test (priority=2,description="Profile-Change_Password ")
	public void review_module_ChangePassword() throws InterruptedException, AWTException, IOException {					
						

				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[7]/div/div[2]/span")).click();
				System.out.println("Test case :604");
				ScreenshotClass.captureScreenshot(driver, "TC0604");
				//605
				driver.findElement(By.id("current-pd")).sendKeys("   ");
				driver.findElement(By.id("current-pd")).clear(); Thread.sleep(2000);
				System.out.println("Test case : TC0605");	
				ScreenshotClass.captureScreenshot(driver, "TC0605");
				
				//Mismatch
				driver.findElement(By.id("current-pd")).sendKeys("Tcs#1234");
				driver.findElement(By.xpath("//*[@id=\"pd\"]")).sendKeys("Tcs#12345");
				driver.findElement(By.id("pd-again")).sendKeys("Tcs#1234");				
				System.out.println("Test case : TC0606");	
				ScreenshotClass.captureScreenshot(driver, "TC0606");
				System.out.println("Test case : TC0607");	
				ScreenshotClass.captureScreenshot(driver, "TC0607");
				
				//Correct_Password_
				driver.findElement(By.xpath("//*[@id=\"pd\"]")).sendKeys("Tcs#12345");
				driver.findElement(By.id("pd-again")).sendKeys("Tcs#12345");				
				driver.findElement(By.id("cpd")).click(); //chnage password
				System.out.println("Test case :TC0608");	
				ScreenshotClass.captureScreenshot(driver, "TC0608");
				
				driver.findElement(By.id("cpdc")).click();//cancel
				System.out.println("Test case : TC0609");
				ScreenshotClass.captureScreenshot(driver, "TC0609");
	}
	
	   @Test (priority=3,description="Profile-Update")
		public void review_module_update() throws InterruptedException, AWTException, IOException {																																														
									driver.findElement(By.id("loggedIn-name")).click();	 Thread.sleep(2000);								
										driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[7]/div/div[3]/span")).click();
										System.out.println("Test case : TC0610");
										ScreenshotClass.captureScreenshot(driver, "TC0610");										
										//Empty spaces			
										driver.findElement(By.id("ln")).clear();
										driver.findElement(By.id("ln")).sendKeys("    ");
										System.out.println("Test case :TC0611");
										ScreenshotClass.captureScreenshot(driver, "TC0611");						
										//Special character
										driver.findElement(By.id("ln")).clear();
										driver.findElement(By.id("ln")).sendKeys("@#$%^&*");
										Thread.sleep(2000);
										System.out.println("Test case :TC0612");
										ScreenshotClass.captureScreenshot(driver, "TC0612");
										
										//update_btn					
										driver.findElement(By.id("ln")).clear();
										driver.findElement(By.id("ln")).sendKeys("BFS");
										driver.findElement(By.id("upd-profile")).click();				
										System.out.println("Test case :TC0613");
										ScreenshotClass.captureScreenshot(driver, "TC0613");
										//cancel-btn
										driver.findElement(By.id("cpdc")).click();
										System.out.println("Test case :TC0614");
										ScreenshotClass.captureScreenshot(driver, "TC0614");	
										
										System.out.println("Test case :TC0621");
										ScreenshotClass.captureScreenshot(driver, "TC0621");
										
										
		}			
/*
* 
* 
* * SignOut*
* 
* 
* */
		
@AfterTest 
		public void Signout() throws InterruptedException, AWTException, IOException {
	
			
					driver.findElement(By.id("signOutBtn")).click();	Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"signOutModal\"]/div/div/div[3]/button[2]")).click(); //cancel
					driver.findElement(By.id("signOutBtn")).click();	Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"signOutProceed\"]")).click(); 
					//confirm				
					System.out.println("Test case :TC015");
					ScreenshotClass.captureScreenshot(driver, "TC0615");
					System.out.println("Test case :TC016");
					ScreenshotClass.captureScreenshot(driver, "TC0616");
					System.out.println("Test case :TC017");
					ScreenshotClass.captureScreenshot(driver, "TC0617");
					System.out.println("Test case :TC018");
					ScreenshotClass.captureScreenshot(driver, "TC0618");

	
}
			
		
		

		
		
}
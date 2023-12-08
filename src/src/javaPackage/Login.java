package src.javaPackage;

import java.awt.AWTException;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
@SuppressWarnings("unused")


public class Login {

	// public static void main(String[] args) throws InterruptedException, AWTException{
	@SuppressWarnings("resource")
	@Test 
	public void Login() throws InterruptedException, AWTException, IOException {		
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		//			driver.wait(2000);
		// Launch Website


		driver.get("https://10.11.144.178:8107/home/login/1/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("User able to see the login page");

		System.out.println(" Passed test cases TC0001 & TC002");
		
		//** Read data from Excel 
		
		
		FileInputStream fs = new FileInputStream("C:\\BFSI_test\\automation\\login_test.xlsx");
		//Creating a workbook   (String.valueOf(version))
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i=1; i <=6 ; i++) {

			String username2=sheet.getRow(i).getCell(0).getStringCellValue();;
			System.out.println(username2);
		
			String password1=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password1);
			driver.findElement(By.id("eud")).sendKeys(String.valueOf(username2));
			driver.findElement(By.id("epd")).sendKeys(password1);
			driver.findElement(By.id("login")).click();
			
			Thread.sleep(4000);
			
			System.out.println(username2 + " "+ password1);
			
			driver.findElement(By.id("eud")).clear();
			driver.findElement(By.id("epd")).clear();
			
	
			//Getting error message from the application and printing it on the console
//			String ErrorMsg4=driver.findElement(By.id("msglogin")).getText();
//			System.out.println("Scenario 5 Invalid Credentials");
//			System.out.println(ErrorMsg4);
//			Thread.sleep(8000);
//			sheet.getRow(i).createCell(2).setCellValue(ErrorMsg4);
		
//			System.out.println(" Passed Test case TC0003 & TC0004");
		
		}

		//Entering valid credential
		
		int username2=(int) sheet.getRow(7).getCell(0).getNumericCellValue();
		System.out.println(username2);	
		String password1=sheet.getRow(7).getCell(1).getStringCellValue();
		System.out.println(password1);
		driver.findElement(By.id("eud")).sendKeys(String.valueOf(username2));
		driver.findElement(By.id("epd")).sendKeys(password1);
		driver.findElement(By.id("login")).click();	
		
		System.out.println("Entering the valid credentials" + username2 + "and" +  password1);
		
		
	
		//signin button
//		WebElement button1 = driver.findElement(By.id("login"));
//		button1.isDisplayed();
//		button1.isEnabled();	
//		button1.click();
//		Thread.sleep(3000);
//		System.out.println("opening homepge.. TC0002");

		/*
		 * 
		 * 
		 * 
		 * * SIGN UP BUTTON  *
		 * 
		 * 
		 * 
		 */


		//public class signup {
//			 public static void main(String[] args) throws InterruptedException{
//					
//					System.setProperty(
//							"webdriver.chrome.driver",
//							"C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//					// Instantiate a ChromeDriver class.
//					WebDriver driver = new ChromeDriver();
		//
//					// Maximize the browser
//					driver.manage().window().maximize();
////					driver.wait(2000);
//					// Launch Website
		//	
//					driver.get("https://10.11.144.178:8107/home/login/1/");
//					driver.findElement(By.id("signUp")).click();
//					
//					System.out.println("Passed test case TC00016 & TC00015");
					
		
//					driver.findElement(By.id("signIn")).click();
					
		//      System.out.println("Passed test case TC00022");
		
//					driver.findElement(By.id("ud")).sendKeys("siva@tcs.com");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("fn")).sendKeys("siva");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("ln")).sendKeys("TCS");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("utitle")).sendKeys("Author");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("pd")).sendKeys("Tcs#1234");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("pd-again")).sendKeys("Tcs#1234");
//					Thread.sleep(3000);//any name"
//					driver.findElement(By.id("register")).click();
//					Thread.sleep(3000);
//					
//					driver.findElement(By.id("signIn")).click();
//					Thread.sleep(3000);
//			
		
//      System.out.println("Passed test case TC00024");
		
		
		//}
		//}

		

		/*
		 * 
		 * 
		 * 
		 * * FORGOT BUTTON *
		 * 
		 * 
		 * 
		 * 
		 * */


		//public class forgot {
//			 @SuppressWarnings("unused")
//			public static void main(String[] args) throws InterruptedException{
//					
//					System.setProperty(
//							"webdriver.chrome.driver",
//							"C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//					// Instantiate a ChromeDriver class.
//					WebDriver driver = new ChromeDriver();
		//
//					// Maximize the browser
//					driver.manage().window().maximize();
////					driver.wait(2000);
//					// Launch Website
		//	
//					driver.get("https://10.11.144.178:8107/home/login/1/");
////					@SuppressWarnings("unused")
//					System.out.println("Clicking forgot..");
//					WebElement forgot = driver.findElement(By.id("fgpd"));
//					Thread.sleep(1000);
//					forgot.click();
//					WebElement Change_pwd = driver.findElement(By.id("fgpd-confirm"));
//					Change_pwd.click();
//					Thread.sleep(1000);
//					
//					
//					System.out.println("Entering email..");
//					WebElement email1 = driver.findElement(By.id("eud"));
//					email1.isDisplayed();
//					email1.isEnabled();		
//					email1.sendKeys("arputhamalar.v@tcs.com");	
//					Thread.sleep(1000);
//					
//					
//					System.out.println("Entering password..");
//					WebElement password1 = driver.findElement(By.id("epd"));
//					password1.isDisplayed();
//					password1.isEnabled();		
//					password1.sendKeys("Tcs#1234");
//					Thread.sleep(1000);
//					
//					System.out.println("Clicking sigout..");
//					WebElement button1 = driver.findElement(By.id("login"));
//					button1.isDisplayed();
//					button1.isEnabled();	
//					button1.click();
//					Thread.sleep(1000);
//					
		
//		System.out.println(" Passed Test Case TC0008..");
//					
		//}
		//}


	}}



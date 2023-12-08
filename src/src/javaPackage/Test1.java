package src.javaPackage;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
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

public class Test1 {
protected WebDriver driver  ;


	
	@BeforeTest (alwaysRun = true , description="Lauching the Browser")
	public void browser() throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://10.11.144.178:8107/home/login/1/");
		driver.manage().window().maximize();
		
		System.out.println("Lauching Browser");
		FileInputStream fs = new FileInputStream("C:\\BFSI_test\\automation\\login_test.xlsx");
		//Creating a workbook   (String.valueOf(version))
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int username2=(int) sheet.getRow(7).getCell(0).getNumericCellValue();
		System.out.println(username2);	
		String password1=sheet.getRow(7).getCell(1).getStringCellValue();
		System.out.println(password1);
		
		driver.findElement(By.id("eud")).sendKeys(String.valueOf(username2));
		driver.findElement(By.id("epd")).sendKeys(password1);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.findElement(By.id("login")).click();	
		
	}
	
}

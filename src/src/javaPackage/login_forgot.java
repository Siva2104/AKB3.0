package src.javaPackage;
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
@SuppressWarnings("unused")

public class login_forgot {
@SuppressWarnings("unused")
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
//		driver.wait(2000);
		// Launch Website

		driver.get("https://10.11.144.178:8107/home/login/1/");
//		@SuppressWarnings("unused")
		System.out.println("Clicking forgot..");
		WebElement forgot = driver.findElement(By.id("fgpd"));
		Thread.sleep(1000);
		forgot.click();
		WebElement Change_pwd = driver.findElement(By.id("fgpd-confirm"));
		Change_pwd.click();
		Thread.sleep(1000);
		
		
		System.out.println("Entering email..");
		WebElement email1 = driver.findElement(By.id("eud"));
		email1.isDisplayed();
		email1.isEnabled();		
		email1.sendKeys("arputhamalar.v@tcs.com");	
		Thread.sleep(1000);
		
		
		System.out.println("Entering password..");
		WebElement password1 = driver.findElement(By.id("epd"));
		password1.isDisplayed();
		password1.isEnabled();		
		password1.sendKeys("Tcs#1234");
		Thread.sleep(1000);
		
		System.out.println("Clicking sigout..");
		WebElement button1 = driver.findElement(By.id("login"));
		button1.isDisplayed();
		button1.isEnabled();	
		button1.click();
		Thread.sleep(1000);
		
		
}
}

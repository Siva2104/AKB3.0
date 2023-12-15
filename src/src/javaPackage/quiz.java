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

@SuppressWarnings("unused")
public class quiz extends Test1 {


	@Test(priority = 1, description = "Opening_Collaboration", alwaysRun = true)
	public void collaboration_module() throws InterruptedException, AWTException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement forum_module = driver.findElement(By.id("collaboration-nav")); // doc-nav
		Actions act = new Actions(driver);
		act.moveToElement(forum_module).perform();
		driver.findElement(By.id("quiz-nav")).click();

		System.out.println("Test case :TC0484");
		 ScreenshotClass.captureScreenshot(driver, "TC0484"); Thread.sleep(2000);
		 //Search_quiz
//		driver.findElement(By.id("search-assessmentconfig-name")).sendKeys("test");
//		Thread.sleep(3000);
//		System.out.println("Test case :TC0485");
//		 ScreenshotClass.captureScreenshot(driver, "TC0485");
//		driver.findElement(By.id("search-assessmentconfig-name")).clear();
//		System.out.println("Test case :TC0486");
//		 ScreenshotClass.captureScreenshot(driver, "TC0486");
//		System.out.println("Test case :TC0487");
//		 ScreenshotClass.captureScreenshot(driver, "TC0487");
	}

	@Test(priority = 2, description = "Quiz",enabled = false)
	public void Quiz() throws InterruptedException, AWTException, IOException {

		WebElement quiz_module = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[8]/a"));
		// driver.findElement(By.xpath("//*[@id=\"collaboration-nav\"]/a")).click();
		// Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(quiz_module).perform();
		driver.findElement(By.xpath("//*[@id=\"quiz-nav\"]/a")).click();
		System.out.println("Found the Quiz");

		/*
		 * Scenario: Click on Quiz and complete Pending Quiz minimum for 5 questions
		 */

		for (int i = 0; i <= 20; i++) {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/section/div[1]/table/tbody/tr/td[8]/center/a/span"))
					.click();
			break;
		}

		System.out.println("Taking the First Quiz");

		// First-question
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/input[3]"))
				.click();
		//save-btn
		
//		driver.findElement(By.id("savequestion")).click(); Thread.sleep(2000);
//		WebElement msg=driver.findElement(By.xpath("//*[@id=\"lastUpdatedMessage\"]"));
//		String text=msg.getText();
//		if (msg.isEnabled() && text.contains("Registration completed successfully"))
//		{ 
//		    System.out.println(" Quiz answers saved successfully.");
//		}else{
//		    System.out.println("Quiz is saved");
//		}
		
//		System.out.println("Test case :TC0523");
//		 ScreenshotClass.captureScreenshot(driver, "TC0523");
		
		
		
		
		// clicking Next buttons
		driver.findElement(By.xpath("//*[@id=\"actualflow-pagination\"]/div/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		// 2
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/input[3]"))
				.click();
		

		driver.findElement(By.xpath("//*[@id=\"actualflow-pagination\"]/div/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		// 3
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/input[3]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"actualflow-pagination\"]/div/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		// 4
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/input[3]"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"actualflow-pagination\"]/div/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		// 5
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/input[3]"))
				.click();
		System.out.println("End of quiz");
		
		//submit
//		driver.findElement(By.xpath(
//				"/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div[2]/div[3]/div/button[2]"))
//				.click();
//		System.out.println("Test case :TC0488");
//		ScreenshotClass.captureScreenshot(driver, "TC0488");
		
		System.out.println("Test case :TC0487");
		ScreenshotClass.captureScreenshot(driver, "TC0487");
		
		System.out.println("Test case :TC0489");
		ScreenshotClass.captureScreenshot(driver, "TC0489");
		System.out.println("Test case :TC0490");
		ScreenshotClass.captureScreenshot(driver, "TC0490");
	
		
		//submit-btn
		System.out.println("Test case :TC0521");
		ScreenshotClass.captureScreenshot(driver, "TC0521");

	}

	@Test(priority = 3, description = "Start Discussion")
	
	public void Discussion_forum() throws InterruptedException, AWTException, IOException {

		// Start a new forum
		driver.findElement(By.id("AddDiscussion")).click();
		/* POP-ip */
		// _FillingNew_Forum
		driver.findElement(By.id("user-actual-id")).sendKeys("New");
		driver.findElement(By.id("txtQuestion1")).sendKeys("good");
		// ba
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/button/span"))
				.click();
		// select-ALL
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/ul/li[2]/a/label/input"))
				.click();
		Thread.sleep(1000);
		// clear
		driver.findElement(By
				.xpath("/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/ul/li[3]/div/a"))
				.click();
		Thread.sleep(1000);
		// selct-all
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/ul/li[2]/a/label/input"))
				.click();
		Thread.sleep(1000);
		// search-bar
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/ul/li[1]/div/input"))
				.sendKeys("New");
		Thread.sleep(1000);
		// clear
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/ul/li[1]/div/span[2]/button/i"))
				.click();
		Thread.sleep(1000);
		// cls
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[2]/div[2]/span/div/button/span"))
				.click();
		// SLA
		driver.findElement(By.id("intake-priority")).click();

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div[2]/div[3]/div[3]/div[2]/select/option[3]"))
				.click();
		// random-date
		WebElement DateBox = driver.findElement(By.id("priority-datepicker"));
		DateBox.click();
		List<WebElement> dates = driver.findElements(By.id("priority-datepicker"));
		// Select a random date
		Random random = new Random();
		int randomIndex = random.nextInt(dates.size());
		dates.get(randomIndex).click();
		DateBox.sendKeys(Keys.ENTER);
//		driver.findElement(By.id("AddPost")).click(); // draft
//		driver.findElement(By.id("cancelBtn")).click(); // cancel
		driver.findElement(By.id("CreatePost")).click(); // Publish
		System.out.println("New post created");
		
		
		
	}

	
	
	@Test(priority = 4, description = "Status",enabled=false)
	public void Status() throws InterruptedException, AWTException, IOException {
		
		WebElement status = driver.findElement(By.id("category")); 
		status.click();  
		driver.findElement(By.xpath("//*[@id=\"category\"]/option[2]"));
		status.click();
		driver.findElement(By.xpath("//*[@id=\"category\"]/option[3]"));  
		status.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/section/div[1]/div[2]/select/option[1]"));
		
		//Random name search
		WebElement searchInput = driver.findElement(By.id("search-discussion-name"));
		char randomLetter = getRandomLetter();
	       searchInput.sendKeys(String.valueOf(randomLetter));
	       searchInput.clear();
	       // Verify if the search input is cleared
	       if (searchInput.getAttribute("value").isEmpty()) {
	           System.out.println("Search input cleared successfully.");
	       } else {
	           System.out.println("Search input is not cleared.");
	       }
	       Thread.sleep(2000);
	       searchInput.sendKeys(Keys.BACK_SPACE);
	       searchInput.sendKeys("n");       
	       driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/section/div[2]/table/tbody/tr[1]/td[2]/a")).click();
	       JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	       javascriptExecutor.executeScript("history.back()");
	  
	  //edit discussion     
//       for (int i=1; i<=20; i++) {
//	    	   
//	    	 WebElement topic_name= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/section/div[2]/table/tbody/tr["+ i + "]/td[6]/button/span"));
//	       WebElement topic_name= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/section/div[2]/table/tbody/tr[1]/td[6]/button/span"));
//	    	   topic_name.click();
//	    	   break;
//       }
//	       
    
	}
	
	   private static char getRandomLetter() {
	       Random random = new Random();
	       return (char) ('a' + random.nextInt(26));
	   }
	
	
	
	   @Test(priority = 5, description = "My_queue",enabled=false)
		public void My_queue() throws InterruptedException, AWTException, IOException {
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a")).click();
	   }
	
	   @Test(priority = 6, description = "pending_action",enabled=false)
		public void pending_action() throws InterruptedException, AWTException, IOException {
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[3]/a")).click();
	   }
	
	   @Test(priority = 7, description = "my_discussion",enabled=false)
		public void my_discussion() throws InterruptedException, AWTException, IOException {
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[1]/a")).click();
	   }
	
	
	   @Test(priority = 8, description = "My_queue",enabled=false)
		public void admin_tag() throws InterruptedException, AWTException, IOException {
		   
		   driver.findElement(By.id("admin-nav")).click();
		   System.out.println("Test case :TC0525");
			ScreenshotClass.captureScreenshot(driver, "TC0525");
	   }
	   
	
	
	
	
	
	
	
	
/** Verify the completed quiz - TC0491
 * Colur verification - TC0492
 * verify the Percentage - TC0522
 *  TC0524
 *  
 *  **/	
	
	
	
	
	
	
	
}

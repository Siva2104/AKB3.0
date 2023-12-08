package src.javaPackage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.testng.ITestResult;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("unused")

public class ScreenshotClass {
   public static void captureScreenshot(WebDriver driver, String testCaseName) {
       try {
           // Capture screenshot
           File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           // Specify the parent folder path where you want to save the screenshots
           String parentFolderPath = "C:\\BFSI_test\\automation\\PASS\\Quiz_module\\";
           // Create a folder based on the test case name
           String folderPath = parentFolderPath + testCaseName + "\\";
           new File(folderPath).mkdirs(); // Create folder if not exists

           String fileName = testCaseName + ".png";
           // Construct the full file path
           String filePath = folderPath + fileName;
           // Copy the screenshot file to the specified folder with the constructed file name
           FileUtils.copyFile(screenshotFile, new File(filePath));
           System.out.println("Screenshot captured and saved: " + filePath);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
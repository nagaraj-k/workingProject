package com.testng;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();

		/*WebElement browseBtn = driver.findElement(By.linkText("some-file.txt"));

		Actions action = new Actions(driver);
		action.moveToElement(browseBtn).click().build().perform();*/

		String downFolder = "./downloadHere/some-file.txt";

		String downloadable = "https://the-internet.herokuapp.com/download/some-file.txt";

		String aitPath = "./ait1/aitScript.exe";
		
		String[] cmd= {aitPath,downFolder,downloadable}; 
		
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(5000);
		File file=new File(downFolder);
//		boolean res=file.exists();
		Assert.assertTrue(file.exists());
		
	
		
		/*
		 * Thread.sleep(5000); String aitPath="./ait1/aitScript.exe";
		 * 
		 * String filePath="D:\\dat1.txt";
		 * 
		 * String[] cmd= {aitPath,filePath}; Runtime.getRuntime().exec(cmd);
		 */

//		Thread.sleep(5000);
		/*Robot robot = new Robot();
		robot.delay(5000);
		StringSelection path = new StringSelection("D:\\dummy.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
*/
		Thread.sleep(5000);
//		driver.quit();
	}

}

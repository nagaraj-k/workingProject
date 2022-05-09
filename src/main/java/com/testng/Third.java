
package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Third {
	WebDriver driver;
	@Test
	@Parameters({"url1","email"})
	public void display(String url,String email) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("HELL may i come in");
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(email+Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	
		
	}


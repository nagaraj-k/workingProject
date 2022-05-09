package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class second {
	WebDriver driver;
	@Test
	@Parameters({"browser","url","q"})
	public void display(String browser,String url,String q) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("HELL may i come in");
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(q+Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	
		
	}


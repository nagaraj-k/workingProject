package com.testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class first {
	WebDriver driver;
	
	@BeforeMethod
	public void show()
	{
		System.out.println("hello i m before");
	}
	@Test(expectedExceptions=NumberFormatException.class)
	@Parameters("q")
	public void thismethod(String q)
	{
		//if(browser.equals("chrome"))
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		//else
		//	{System.out.println("Install driver");
		//	System.exit(0);}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("i m in test");
		driver.get("http://google.com");
		//String title = driver.getTitle();
		//Assert.assertEquals(title, "facebook");
		driver.findElement(By.className("gLFyf")).clear();
		driver.findElement(By.className("gLFyf")).sendKeys(q);
		driver.findElement(By.className("gLFyf")).submit();
		//int a = 10/0;
		//System.out.println(a);
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("i m after method ");
		driver.close();
	}
}

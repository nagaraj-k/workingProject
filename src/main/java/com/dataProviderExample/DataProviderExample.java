package com.dataProviderExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com");
	}
	
	
	@DataProvider
	public Iterator<Object[]> dataFromExcel()
	{
		ArrayList<Object[]> dataFinally = com.excel.utility.ForExcel.getdata();
		return dataFinally.iterator();
		
	}
	
	@Test(dataProvider="dataFromExcel")
	public void facebookLoginPage(String username, String password)
	{
		driver.findElement(By.name("email")).clear();
		WebElement we = driver.findElement(By.name("email"));
		we.sendKeys(username);
		System.out.println();
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
	@AfterMethod
	public void closing()
	{
		driver.quit();
	}
	
	
	

}

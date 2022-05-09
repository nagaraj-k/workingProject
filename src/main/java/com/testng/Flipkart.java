package com.testng;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	}
  @Test
  public void flipkart() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("flipkart"+Keys.ENTER);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//ancestor::div[@class='_2QfC02']//child::button[contains(@class,'_2KpZ6l')]")).click();
	 //   Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@class='YUhWwv']")).click();
	  Thread.sleep(5000);
	  driver.navigate().back(); 
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles"+Keys.ENTER);
	  Thread.sleep(5000);//_1AtVbE col-12-12
	  List <WebElement> lmo = driver.findElements(By.xpath("//*[@class='_1AtVbE col-12-12']"));
	  for(int i=2;i<lmo.size();i++)
	  {
		  System.out.println( lmo.get(i).getText());//driver.findElement(By.xpath("//*[contains(@class,'_1AtVbE')]//div[@class='_4rR01T']")).getText());
		 // System.out.println( driver.findElement(By.xpath("//*[contains(@class,'_1AtVbE')]//div[@class='_30jeq3 _1_WHN1']")).getText()); 
		  System.out.println("******************");
	  }
	  
	 
	 
	  //driver.findElement(By.xpath("//*[@class='_3dsJAO' and text()='Remove']")).click();
	  //Thread.sleep(5000);
	 // driver.switchTo().defaultContent();
	  
  }
  
//  @AfterMethod
//  public void teardown()
//  {
//	  driver.quit();
//  }
}

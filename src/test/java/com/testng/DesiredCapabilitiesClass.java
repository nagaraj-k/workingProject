/**
 * 
 */
package com.testng;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author nagaraj
 *
 */
public class DesiredCapabilitiesClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		
//		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions optns=new ChromeOptions();
//		optns.addArguments("--headless");
		optns.addArguments("--start-maximized");
		dc.setCapability(ChromeOptions.CAPABILITY, optns);
//		optns.merge(dc);
//		dc.merge(optns);
		WebDriver driver = new ChromeDriver(dc);
		String un="admin";
		String ps="admin";
		driver.get("https://"+un+":"+ps+"@"+"the-internet.herokuapp.com/download_secure");

	}

}

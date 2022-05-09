package DataDrivenApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUtility.xls_Reader;

public class DataDriven {

	public static void main(String[] args) throws InterruptedException {
		
		xls_Reader reader = new xls_Reader("C:\\Users\\nagaraj\\eclipse-workspace\\testng\\src\\main\\java\\com\\testdata\\Book1.xlsx");
		int rowCount=reader.getRowCount("testdata");
		
		//reader.removeColumn("testdata",3);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		for(int row=2;row<=rowCount;row++)
		{
		String username=reader.getCellData("testdata", "username", row);
		System.out.print(username+"\t");
		
		String password=reader.getCellData("testdata", "password", row);
		System.out.println(password);
		
	driver.findElement(By.name("email")).clear();
		WebElement we = driver.findElement(By.name("email"));
		we.sendKeys(username);
		System.out.println();
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
		
		//reader.setCellData("testdata", "Result", row, "PASS");
		
		Thread.sleep(2000);

		}
		System.out.println(reader.getCellRowNum("testdata","username","leo"));
		driver.close();
	}

}

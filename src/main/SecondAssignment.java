package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondAssignment {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		
		if (browser.equals("chrome")) {			
		
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();  //INVOKE THE CHROME BROWSER
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver","E:\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else 
			System.out.println("please select one browser");
		
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.findElement( By.linkText("2")).click();
		
		
		
		
		System.out.println("7th row 5th value : "+driver.findElement( By.xpath("//section//table//tr[7]/td[6]")).getText());
		
		driver.quit();

	}

}

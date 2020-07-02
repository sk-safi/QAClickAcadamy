package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
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
		else 
			System.out.println("please select one browser");
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); //HIT THE DESIRED URL
		//LOOSLY COUOLING --> INTERFACE,INHERITANCE,POLYMORPHISM
		//TIGHTLY COUPLING
		
		
		System.out.println(driver.getTitle());
		//System.out.println();
		By by = By.id("autocomplete");
		
		WebElement elem = driver.findElement(by);
		
		elem.sendKeys("Hello....");
		
		driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.linkText("REST API")).click();
		
		driver.quit();
		
		
		
		
	}

}

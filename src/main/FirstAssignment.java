package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAssignment {
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
		
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		System.out.println(driver.getTitle());
		
		
		By by = By.className("redius");
		
		WebElement elem = driver.findElement(by);
		
		elem.sendKeys("hello......");
		
		driver.findElement(By.className("")).click();
		
	}

}

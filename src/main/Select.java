package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class Select 
{

	public static void main(String[] args) throws InterruptedException 
	{
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
		
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());  
	    System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
	    Thread.sleep(1000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

	}

}
package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag
{

	public static void main(String[] args)
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
		
		
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");    		
		WebElement From=driver.findElement(By.xpath("//div[@id='column-a']"));	
     		
		WebElement To=driver.findElement(By.xpath("//div[@id='column-b']"));					
  		
		Actions act=new Actions(driver);					
		
		act.dragAndDrop(From, To).build().perform();


	}

}

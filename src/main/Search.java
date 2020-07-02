package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Search 
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
		
		
		
		driver.get(" https://www.cleartrip.com/");
		
		
		driver.findElement(By.id("FromTag")).sendKeys("Kolkata");
		
		
		driver.findElement(By.id("ToTag")).sendKeys("Hyderabad");
		
		
		driver.findElement(By.id("DepartDate")).sendKeys("25/8/2020");
		
		
		Select s = new Select(driver.findElement(By.name("childs")));
		s.selectByVisibleText("4");
		Select b = new Select(driver.findElement(By.name("infants")));
		
		
		b.selectByVisibleText("1");
		driver.findElement(By.id("SearchBtn")).click();
		
		
		System.out.println(driver.findElement(By.xpath("(//strong[@class='resultsCount'])[1]")).getText());

	}

}
package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Main 
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
		
		
		
		driver.get(" https://www.seleniumeasy.com/test/table-pagination-demo.html");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		driver.get("https://the-internet.herokuapp.com/secure"); 
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		driver.findElement(By.className("button secondary radius")).click();
		driver.findElement(By.xpath("(//*[@class='page_link'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[7]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[1]/th[6]")).getText());
		//System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[2]/td[6]")).getText());
	}

}
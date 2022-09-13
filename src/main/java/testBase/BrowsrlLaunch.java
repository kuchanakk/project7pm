package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowsrlLaunch {

	
	protected static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		
	//String browser ="chrome";
	
	if(browser.equals("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("http://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		
	}else if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}else if(browser .equals("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("http://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}
	
	
	
		
		
		
		
	}
	
	
	
	
	
}

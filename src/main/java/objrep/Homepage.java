package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage  {
	
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public static WebElement popularitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
	}
	
	
	public static WebElement tabletlink() {
		
		return driver.findElement(By.id("details_16"));
	}
	
	public static WebElement laptoplink() {
		
		return driver.findElement(By.id("details_10"));
	}
	
	public static WebElement spklink() {
		
		return driver.findElement(By.id("details_21"));
	}
	
}

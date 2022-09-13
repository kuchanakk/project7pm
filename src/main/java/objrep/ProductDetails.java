package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails {
	
	
	
	static WebDriver driver;
	public ProductDetails(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public static WebElement productdetails() {
		
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}

}

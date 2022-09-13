package seleniumprojectnew;

import org.openqa.selenium.WebDriver;

import testBase.BrowsrlLaunch;

public class BrowserL extends BrowsrlLaunch{

	//static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowsrlLaunch bl=new BrowsrlLaunch();
		bl.launchBrowser("firefox");
		String t1=driver.getTitle();
		System.out.println(t1);
		
		
	}

}

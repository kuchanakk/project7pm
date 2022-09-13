package popItems;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Extentrep;
import commonmethods.ScreenShot;
import exceldata.Exceldatadrivern;
import objrep.Homepage;
import objrep.ProductDetails;
import testBase.BrowsrlLaunch;

public class PopularItemsTest extends BrowsrlLaunch{
	static Homepage hp;
	static ProductDetails product;
	static ScreenShot sc;
	static Exceldatadrivern excel;
	static BrowsrlLaunch bl;
	static Extentrep ext;
	
	@BeforeTest
	public static void Starttest() {
		
		System.out.println("*********TEST STARTED*********");
		 ext= new Extentrep();
		 ext.extentsetup();
	}
	
	@BeforeMethod
	public static void openbrowser() {
		
		 bl = new BrowsrlLaunch();
		bl.launchBrowser("firefox");
	}
	
	
	@Test
	public static void tablettest() throws InterruptedException, IOException {
		
		 hp = new Homepage(driver);
		 product= new ProductDetails(driver);
		 sc = new ScreenShot();
		Thread.sleep(10000);
		
		hp.popularitems().click();
		hp.tabletlink().click();
		String tabletactualtext=product.productdetails().getText();
		 excel = new Exceldatadrivern();
		String tabletexpectedtext=excel.readdata(1, 0);
		
		if(tabletactualtext.contains(tabletexpectedtext)) {
			
			excel.writedata(1, 1, "valid data");
			ext.pass();
			
		}else {
			
			excel.writedata(1, 1, "invalid data");
			sc.scshot();
			ext.fail();
		}
		
		
		
	}
	
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		
		hp = new Homepage(driver);
		 product= new ProductDetails(driver);
		Thread.sleep(10000);
		hp.popularitems().click();
		hp.laptoplink().click();
		String actuallaptoptext=product.productdetails().getText();
		String expectedlaptoptext=excel.readdata(2, 0);
		
		if(actuallaptoptext.contains(expectedlaptoptext)) {
			excel.writedata(2, 1, "valid data");
			ext.pass();
		}else {
			
			excel.writedata(2, 1, "invalid data");
			sc.scshot();
			ext.fail();
		}
		
	}
	
	@Test
	public static void spktest() throws InterruptedException, IOException {
		
		hp = new Homepage(driver);
		 product= new ProductDetails(driver);
		Thread.sleep(10000);
		
		hp.popularitems().click();
		hp.spklink().click();
		String actualspkrtext=product.productdetails().getText();
		String expectedspkrtest=excel.readdata(3, 0);
		
		if(actualspkrtext.contains(expectedspkrtest)) {
			
			excel.writedata(3, 1, "valid data");
			
			ext.pass();
		}else {
			
			excel.writedata(3, 1, "invalid data");
			sc.scshot();
			ext.fail();
		}
		
		
	}
	
	
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	
	@AfterTest
public static void endtest() {
	
	System.out.println("****Test Ended****");
	ext.genrep();
}
	
	
	
}

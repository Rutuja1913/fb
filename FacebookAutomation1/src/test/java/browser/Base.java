package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
		
	public static WebDriver openChromeBrowser()
	{	
	System.setProperty("webdriver.chrome.driver","D:\\imp\\velocity notes\\automation testing\\chrome\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{	
	System.setProperty("webdriver.gecko.driver","D:\\imp\\velocity notes\\automation testing\\chrome\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	return driver;
	}
	
	public static WebDriver openOperaBrowser()
	{	
	System.setProperty("webdriver.opera.driver","D:\\imp\\velocity notes\\automation testing\\chrome\\New folder\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	WebDriver driver= new OperaDriver();
	return driver;
	}
}

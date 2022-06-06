package tastPack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Base;
import pomClass.ApplicationHeader;
import pomClass.LoginPage;

public class TestClass {

	
		WebDriver driver;
		LoginPage loginPage;
		ApplicationHeader applicationHeader;
		SoftAssert soft;
		
		@Parameters("browser")
		
		@BeforeTest
		public void launchBrowser(String browserName)
		{
			if(browserName.equals("Chrome"))
			{
			driver=Base.openChromeBrowser();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
			
			if(browserName.equals("Firefox"))
			{
			driver=Base.openFirefoxBrowser();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
			
			if(browserName.equals("Opera"))
			{
			driver=Base.openOperaBrowser();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
		}
		
		@BeforeClass
		public void createPOMObject()
		{
			loginPage=new LoginPage(driver);
			applicationHeader=new ApplicationHeader(driver);
			soft=new SoftAssert();
		}
		
		
		@BeforeMethod
		public void loginToApplication() throws InterruptedException 
		{
			driver.get("https://www.facebook.com/");	
			
			loginPage.sendUserName();
			loginPage.sendPassword();
			loginPage.clickOnLoginButton();
		
			
		}
		
		@Test
		public void verifyHomeButton() throws InterruptedException 
		{
			    applicationHeader.clickOnHome();
		        String url=driver.getCurrentUrl();
		        System.out.println(url); 
		        Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println(title);
				soft.assertEquals(url,"https://www.facebook.com/?sk=welcome");
				soft.assertEquals(title,"(1) Facebook");
				soft.assertAll();
		}
		
		@Test
		public void verifyfriendsButton() throws InterruptedException
		{
			    applicationHeader.clickOnFriends();	
			    Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println(title);
				soft.assertEquals(url,"https://www.facebook.com/friends");
				soft.assertEquals(title,"(1) Friends | Facebook");
				soft.assertAll();
		}
		
		@AfterMethod
		public void logout()
		{
			applicationHeader.clickOnYourProfile();
			applicationHeader.clickOnLogOut();
		}
		
		@AfterClass
		public void clearobjects()
		{
			loginPage=null;
			applicationHeader=null;
		}
		
		
		
		@AfterTest
		public void closedBrowser()
		{
			driver.close();
			driver=null;
			System.gc();   //garbage collector
		}
		
	
	
}

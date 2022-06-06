package tastPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@BeforeClass
	public void beforeClass() {
    System.out.println("before class1");
	}
     
	@BeforeMethod
	public void beforeMethod() {
    System.out.println("before Method1");
	}
	
	@Test
	public void testA() {
    System.out.println("testA");
	}
	
	@Test
	public void testB() {
    System.out.println("testB");
	}
	
	@AfterMethod
	public void afterMethod() {
    System.out.println("after method1");
	}
	
	@AfterClass
	public void afterClass() {
    System.out.println("after class1");
	}
}

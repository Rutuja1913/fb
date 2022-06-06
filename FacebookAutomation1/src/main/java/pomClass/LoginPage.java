package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement logIn;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void sendUserName() {
		userName.sendKeys("8975429294");
	}
	public void sendPassword() {
		password.sendKeys("rutuja1913");
	}
	public void clickOnLoginButton() {
		logIn.click();
	}

}

package pomflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement logIn;
	
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
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

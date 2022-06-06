package pominstagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement logIn;
	
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sendUserName() {
		userName.sendKeys("_rutuja.kadam_");
	}
	public void sendPassword() {
		password.sendKeys("rutuja1913");
	}
	public void clickOnLoginButton() {
		logIn.click();
	}
	
}

package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="//span[contains(text(),'Rutuja Kadam')]")
	private WebElement rutujaKadam;
	
	@FindBy(xpath="(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[2]")
	private WebElement friends;
	
	@FindBy(xpath="(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[3]")
	private WebElement groups;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sendUserName() {
		rutujaKadam.click();
	}
	public void sendPassword() {
		friends.click();
	}
	public void clickOnLoginButton() {
		groups.click();
	}
	

}

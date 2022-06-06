package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	@FindBy(xpath="(//span[contains(@class,'l9j0dhe7')])[1]")
	private WebElement home;
	
	@FindBy(xpath="(//span[contains(@class,'l9j0dhe7')])[2]")
	private WebElement friends;
	
	@FindBy(xpath="(//span[contains(@class,'l9j0dhe7')])[3]")
	private WebElement groups;
	
	@FindBy(xpath="//div[@aria-label='Your profile']")
	private WebElement yourProfile;
	
	@FindBy(xpath="(//i[@class='hu5pjgll lzf7d6o1'])[5]")
	private WebElement logOut;
	
	WebDriver driver;
	
	public ApplicationHeader(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clickOnHome() {
		home.click();
	}
	public void clickOnFriends() {
		friends.click();
	}
	public void clickOnGroups() {
		groups.click();
	}
	public void clickOnYourProfile() {
		yourProfile.click();
	}
	public void clickOnLogOut() {
		logOut.click();
	}


}

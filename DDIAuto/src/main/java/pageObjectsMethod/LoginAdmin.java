package pageObjectsMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class LoginAdmin{

	@FindBy(id = "username")
	WebElement adusername;

	@FindBy(id = "login")
	WebElement adpassword;

	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement adsignin;

	private WebDriver driver;

	public WebElement getUsername() {
		return adusername;
	}

	public WebElement getPassword() {
		return adpassword;
	}

	public WebElement getLoginBtn() {
		return adsignin;
	}
	
//	public AdactinLoginPage() {
//		PageFactory.initElements(driver, this);	
//	}
	
	public LoginAdmin(WebDriver fdriver) {
		this.driver = fdriver;
		PageFactory.initElements(driver, this);
	}
	public void enterCredentials(String name, String pass) {
		adusername.sendKeys(name);
		adpassword.sendKeys(pass);
		adsignin.click();
	}
}

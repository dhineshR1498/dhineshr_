package pageObjectsMethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingFlowAdmin {

	
	@FindBy(xpath = "//span[text()='Stores']")
	public static WebElement storesClick;
	
	@FindBy(xpath = "//body//li[@id=\"menu-magento-backend-stores\"]//li[@class=\"item-configuration    level-2\"]//a//span[contains(text(),'Configuration')]")
	public static WebElement configurationClick;
	
	@FindBy(xpath = "//div[@id=\"system_config_tabs\"]//div//strong[contains(text(),'Sales')]")
	public static WebElement salesClick;
	
	@FindBy(xpath = "//div[@id=\"system_config_tabs\"]//ul//a//span[contains(text(),'Shipping Methods')]")
	public static WebElement shipMethodClick;
	  
	@FindBy(xpath = "//select[@id = \"carriers_fedex_active\"]")
	public static WebElement enabledDropdown;
	
	@FindBy(xpath = "//select[@id = \"carriers_fedex_active\"]//option[contains(text(),'Yes')]")
	public static WebElement yesEnabled;
}

package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver = null;
	public Properties properties = null;

	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;	
	}
	@BeforeSuite
	public void driverInitialisation() throws IOException {

		loadPropertyFile();

		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverLocation");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void launchAdminURL() throws IOException, InterruptedException {

		String url1 = properties.getProperty("adminURL");
		driver.get(url1);
	}
	@AfterMethod
	public void launchTabFE() throws IOException, InterruptedException {

		driver.switchTo().newWindow(WindowType.TAB);
		String url2 = properties.getProperty("frontendURL");
		driver.get(url2);
	}
}
//@AfterSuite
//public void closeBrowser() {
//driver.quit();
//}



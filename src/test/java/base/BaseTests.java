package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTests {
	private WebDriver driver;
	protected HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		homepage = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

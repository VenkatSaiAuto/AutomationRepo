package com.mckinsey.pips_ui.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public WebDriver driver=null;
	
	/**
	 * initiate chrome Driver
	 */
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://pips2dev.intranet.mckinsey.com/home");
	}
	
	/**
	 * Closing Driver.
	 */
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

package com.mckinsey.pips_ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practisetest {
	
	public WebDriver driver=null;
	@Test(priority = 1)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pips2dev.intranet.mckinsey.com/home");
		driver.quit();
	}
	
}

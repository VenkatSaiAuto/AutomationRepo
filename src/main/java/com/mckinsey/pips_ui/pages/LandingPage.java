package com.mckinsey.pips_ui.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page for Landingpage/homePage
 * @author Venkata Palleti
 *
 */
public class LandingPage {
	public  WebDriver driver=null;
	public static final By searchInput=By.name("searchInput");
	public static final By submitButton=By.xpath("//button[contains(text(),'Submit')]");
	public static final By footerLogo=By.className("footer_logo");
	public static final By cmpName=By.name("companyName");
	public static final By tkrSymbol=By.name("tickerSymbol");
	public static final By comments=By.name("comments");

public LandingPage(WebDriver driver) throws IOException {
		this.driver = driver;		
	}
	
	public void searchBoxMicroEntry(String search) {		
		driver.findElement(searchInput).click();
		driver.findElement(searchInput).sendKeys(search);
		driver.findElement(searchInput).sendKeys((Keys.ENTER));
		driver.findElement(searchInput).sendKeys("n");
		driver.findElement(searchInput).sendKeys((Keys.ENTER));
		}
	
	public boolean verifySubmitBtnIsEnabled(){		
		return driver.findElement(submitButton).isEnabled();
	}
	

	public void enterCompanyName() throws InterruptedException {		
		driver.findElement(cmpName).click();
		Thread.sleep(4000);
		driver.findElement(cmpName).sendKeys("INTEL");
		Thread.sleep(3000);
	}
	
	public void deleteCompanyName() throws InterruptedException {
		driver.findElement(cmpName).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
	}

	public void enterTikerSymbol() throws InterruptedException {
		driver.findElement(tkrSymbol).click();
		Thread.sleep(4000);
		driver.findElement(tkrSymbol).sendKeys("INTEL");
		Thread.sleep(3000);
	}
	
	public void deleteTickerSymbol() throws InterruptedException {
		driver.findElement(tkrSymbol).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(3000);
	}
	
	public void enterComments() throws InterruptedException {
		driver.findElement(comments).click();
		Thread.sleep(4000);
		driver.findElement(comments).sendKeys("INTEL");
		Thread.sleep(3000);
		}
}

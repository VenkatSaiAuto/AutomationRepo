package com.mckinsey.pips_ui;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mckinsey.pips_ui.base.TestBase;
import com.mckinsey.pips_ui.pages.LandingPage;

/**
 * 
 * @author Venkata Palleti
 *
 */
public class SubmitBtn_Test extends TestBase {
	LandingPage landingPage=null;
	
	@Test(priority = 1)
	public void enterSearchData() throws InterruptedException {
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.searchBoxMicroEntry("micro");
	}

    @Test(dependsOnMethods="enterSearchData")
 	public void verifySubmitBtnEnable_Test() throws InterruptedException  {	
		Assert.assertFalse(landingPage.verifySubmitBtnIsEnabled(), "The submit button is disabled");		
		landingPage.enterCompanyName();
		Assert.assertTrue(landingPage.verifySubmitBtnIsEnabled(), "The submit button is enabled");
	}

	@Test(priority = 3)
	public void submitButtonDisable_Test() throws InterruptedException {
		landingPage.deleteCompanyName();		
		Assert.assertFalse(landingPage.verifySubmitBtnIsEnabled(), "The submit button is disabled");
	}

	
	@Test(priority = 4)
	public void submitBtnEnableTickerSymbol_Test() throws InterruptedException {
		landingPage.enterTikerSymbol();
		Thread.sleep(3000);
		Assert.assertTrue(landingPage.verifySubmitBtnIsEnabled(), "The submit button is enabled");
		Thread.sleep(3000);
	}
	
	@Test(priority = 5)
	public void submitBtnDisableTickerSymbol_Test() throws InterruptedException {
		landingPage.deleteTickerSymbol();
		Thread.sleep(3000);
		Assert.assertFalse(landingPage.verifySubmitBtnIsEnabled(), "The submit button is disabled");

	}


	@Test(priority = 6)
	public void SubmitBtnDisableComments() throws InterruptedException {
	    landingPage.enterComments(); 
		Assert.assertFalse(landingPage.verifySubmitBtnIsEnabled(), "The submit button is enabled");
		Thread.sleep(3000);

	}

	
}

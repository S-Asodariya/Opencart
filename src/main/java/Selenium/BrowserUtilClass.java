package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilClass {

	// Initilize browser 
	WebDriver driver;
	
	public WebDriver initBrowser(String browserName) {
		System.out.println("Browsername:"+ browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass right browser....");
			throw new BrowserException("INVALID BROWSER===");
			
		}
		return driver;
	}
	
	//lunch browser
	public void lunchBrowser(String url) {
		if( url.indexOf("http")!=0|| url.length()==0 )
			throw new BrowserException("http(s)missing in url");
		driver.get(url);
	}
	
	//get page titile 
	public String pageTitle() {
		return driver.getTitle();
	}
	
	//get page url
	
	public String pageURL() {
		return driver.getCurrentUrl();
	}
	
	//quit browser
	public void quitBrowser() {
		driver.quit();
	}
	
	
	//close browser
	public void closeBrowser() {
		driver.close();
	}
}

package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String args[]) {
		//open browesr
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//validate title actual vs expected
		if(title.equals("Your Store")) {
			System.out.println("Correct title --- PASS");
		}
		else {
			System.out.println("Incorrect title ---FAIL");
		}
		
		//close browser
		driver.quit();
	}
}

package Selenium;

public class NaveenWebsite {

	public static void main(String[] args) {
		
		BrowserUtilClass brUtil = new BrowserUtilClass();
		brUtil.initBrowser("chrome");
		
		brUtil.lunchBrowser("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		String title = brUtil.pageTitle();
		System.out.println(title);
		if(title.equals(title)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		
		
		System.out.println(brUtil.pageURL());
		
		
		brUtil.quitBrowser();
	}

}

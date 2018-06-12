package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {
	public static void main(String[] args) throws InterruptedException {
//		Test Case 2: verify url
//		1. Open chrome
//		2. go to url www.cybertekschool.com
//		3. Verify url contains
//			Expected: cybertekschool
//		4. naviage to google.com
//		5.	verify url contains google
//		
//		6. go to url www.cybertekschool.com
//		7. Verify url contains
//			Expected: cybertekschool
//		8. naviage to google.com
//		9.	verify url contains google
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		// navigate().to() == get();
		driver.navigate().to("http://www.cybertekschool.com");
		
		String expected = "cybertekschool";
		
		// getCurrentUrl() --> gets the url of the current tab
		String actual = driver.getCurrentUrl();
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t"+expected);
			System.out.println("Actual:\t"+actual);
		}
		
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);

		// navigate().back(); --> goes back to previous page
		driver.navigate().back();
		Thread.sleep(1000);

		// navigate().forward() --> goes forward in browsing history
		driver.navigate().forward();
		Thread.sleep(1000);

		// navigate().refresh()  --> refreshed the current page
		driver.navigate().refresh();
		Thread.sleep(1000);

		
		
	}
}

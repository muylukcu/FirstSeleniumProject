package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {
	public static void main(String[] args) {
		// 1. Open chrome
		System.setProperty("webdriver.chrome.driver",
				"/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		// 2. go to url www.google.com
		// get() --> goes to a website
		driver.get("http://google.com");

		// 3. Verify title
		// Expected: Google
		String expected = "Google";
		// getTitle() --> gets the title of the tab
		String actual = driver.getTitle();
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t"+expected);
			System.out.println("Actual:\t"+actual);
		}
	}
}

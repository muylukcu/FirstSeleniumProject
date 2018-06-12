package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherANotherTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(2000);
		
		// closes the current tab
//		driver.close();
		
		driver.quit();
	}
}

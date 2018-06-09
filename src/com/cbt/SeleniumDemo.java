package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://amazon.com");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://cybertekschool.com");
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://ebay.com");
	}
}

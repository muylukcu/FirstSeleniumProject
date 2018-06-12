package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		
		// findElement --> finds element on a page
		// By.name("userName")   --> how to find it
		// sendKeys()  --> types on element
		Thread.sleep(2000);
		driver.findElement(By.name("usr")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		// click()  --> clicks
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String expected = "welcome";
		String actual = driver.getTitle();
		if (actual.contains(expected)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t"+expected);
			System.out.println("Actual:\t"+actual);

		}
		
	}
}

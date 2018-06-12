package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeHoursAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/cybertekschool/Documents/SeleniumDependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://etsy.com");
		driver.manage().window().fullscreen();
		
		System.out.println("Title ->" + driver.getTitle());
		System.out.println("URL -> " + driver.getCurrentUrl());
		
		driver.findElement(By.id("search-query")).sendKeys("Wooden Spoon");
		driver.findElement(By.cssSelector(".btn btn-primary")).click();
		
		
		
		
	}
}

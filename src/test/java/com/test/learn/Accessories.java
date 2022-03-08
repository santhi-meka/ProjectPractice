package com.test.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accessories {
	WebDriver driver;
	@Test
	public void Battery() {
		//THis is for demo
		//WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
		WebElement accessories = driver.findElement(By.xpath("//div[@id='nav-menu-1279478']/ul/li[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(accessories).build().perform();
		WebElement battery = driver.findElement(By.xpath("//a[contains(text(),'Battery')]"));

		action.moveToElement(battery).build().perform();
		battery.click();


		driver.findElement(By.xpath("//div[@id='facets']/div[3]/h6/a")).click();

		driver.findElement(By.xpath("//div[@id='facets']/div[3]/ul/li/a")).click();
	}

}

package com.test.learn;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobiles {
	WebDriver driver;
  @Test
  public void WorkFlow1() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.axiomtelecom.com/?fbclid=IwAR0186UFhkHwuDNPpWfXtbhiNjvEuoi4bjbbsfqvNOsBcGBWdp6EVPyXemY");
 WebElement mobile = driver.findElement(By.xpath("//a[@class='dropdown-toggle mobiles']"));
  
  Actions action = new Actions(driver);
  action.moveToElement(mobile).build().perform();
  
  //Select mobiles = new Select(driver.findElement(By.xpath("//a[@class='dropdown-toggle mobiles']")));
    //       mobiles.selectByVisibleText("Apple");
  
 WebElement apple = driver.findElement(By.xpath("//a[contains(text(),'Apple')]"));
  
  
  action.moveToElement(apple).build().perform();
  apple.click();
   
  driver.findElement(By.xpath("//div[@id='facet-price_range']/ul/li[3]")).click();
  
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
	for (int i = 0; i <= 6; i++) {
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);

	}
	for (int i = 0; i <= 6; i++) {
		js.executeScript("window.scrollBy(0,-250)");
	}
	
	
	driver.findElement(By.xpath("//div[@class='variant-image']/a")).click();
	
	//driver.findElement(By.xpath("//div[@id='iamavailable']/span/form/input[3]")).click();
	
	driver.findElement(By.xpath("//div[@id='catalog-options']/ul[2]/li[3]")).click();
	
	
	
	
	driver.findElement(By.xpath("//a[contains(text(),'specification')]")).click();
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	for (int i = 0; i <= 8; i++) {
		js2.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		
		

	}
	
  }
}

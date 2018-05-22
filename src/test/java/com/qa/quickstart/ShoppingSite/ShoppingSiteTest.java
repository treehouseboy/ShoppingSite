package com.qa.quickstart.ShoppingSite;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteTest {

	WebDriver driver;
	WebElement checkElement;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDev\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void dressTest() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		assertEquals("Printed Summer Dress", checkElement.getText());
	}
	
//	@Test
//	public void findDressTest() {
//		
//		element = driver.findElements(dress class name)
//		element2 = null
//		for(WebElement a : element)
//			if(a.gettext.equals("desiredstring"))
//				element2 = a
//				
//				assertEquals("desiredstring", element2)
//		
//		
//	}

	@After
	public void teardown() {
		driver.quit();
	}

}

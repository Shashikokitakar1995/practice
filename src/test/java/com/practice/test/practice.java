package com.practice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice 
{
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://facebook.com/");
		  driver.quit();
		
	}

}

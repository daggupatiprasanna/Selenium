package com.project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLauncher 
{

	
	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
		//System.getProperty("webdriver.chrome.driver","chrome driver.exe path");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//WebDriverManager.firefoxdriver().setup();
		//System.getProperty("webdriver.chrome.driver","firefox driver.exe path");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.in/");

	}

}

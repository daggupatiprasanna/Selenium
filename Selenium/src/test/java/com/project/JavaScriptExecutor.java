package com.project;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='prasu'");
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeScript("document.getElementById('u_0_5_IO').scrollIntoView()");
		
		js.executeScript("window.scrollTo(0,200)");
		
		driver.manage().timeouts().getPageLoadTimeout();
		
	}

}

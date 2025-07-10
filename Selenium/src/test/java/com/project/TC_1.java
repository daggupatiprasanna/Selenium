package com.project;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class TC_1 extends BaseClass
{
	
	public static void main(String[] args) throws Exception 
	{		
		init();
		
		browserLaunch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Set<String> WindowHandles = driver.getWindowHandles();
		for(String h:WindowHandles){
			System.out.println(h);
			}
		System.out.println(driver.getTitle());
		
		/*driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		driver.quit();*/
		
		String text = driver.findElement(By.linkText("Cart")).getText();
		System.out.println(text);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		
		driver.quit();
		
		
	}
}

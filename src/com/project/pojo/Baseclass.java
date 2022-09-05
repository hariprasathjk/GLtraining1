package com.project.pojo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Baseclass {
	public static WebDriver driver;
	public static void  getbrowser(String type) 
	
	{
		try {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
				 driver=new ChromeDriver();
				}
			else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver.exe");
				 driver=new FirefoxDriver();
				}
			driver.manage().window().maximize();
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
 
	public static void clickonelement(WebElement element) {
		 try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	 
	 public static  void inputvalueelement(WebElement element,String text) {
		 try {
			
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 }
	 public static void dropdownselect(WebElement element , String value,String type) {
		 
		 try {
			Select sc=new Select(element);
			 if (type.equalsIgnoreCase("byIndex")) {
				 int index = Integer.parseInt(value);
				 sc.selectByIndex(index);
				 }
			 else if (type.equalsIgnoreCase("byvalue")) {
				 sc.selectByValue(value);
				
			}
			 else if (type.equalsIgnoreCase("byvisibletext")) {
				 sc.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}
public static void dropdown_deselect(WebElement element, String value,String type) {
	try {
		Select sc=new Select(element);
		 if (type.equalsIgnoreCase("byIndex")) {
			 int index = Integer.parseInt(value);
			 sc.deselectByIndex(index);;
			 }
		 else if (type.equalsIgnoreCase("byvalue")) {
			 sc.deselectByValue(value);;
			
		}
		 else if (type.equalsIgnoreCase("byvisibletext")) {
			 sc.deselectByVisibleText(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}	
public static void takescreenshot (String path) {
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileUtils.copyFile(source, destination);
	} catch (WebDriverException e) {
	e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	 }}
 
	
public static void  geturl(String url) {
	
	try {
		driver.get(url);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
public static void frames(String type,String value ) {
	if (type.equalsIgnoreCase("index")) {
		driver.switchTo().frame(Integer.parseInt(value));
		}
		else if (type.equalsIgnoreCase("id")||type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
			
		}}

public static void implict(int time,TimeUnit unit) {
	try {
		driver.manage().timeouts().implicitlyWait(time, unit);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
public static void movetoelement(WebElement element) {
	
	try {
		new Actions(driver).moveToElement(element).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}



















	
}




	 
		 
		 
		
		
		 
		  
		

		
	
	


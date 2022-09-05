package com.project.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
	private WebElement dress;

	public Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}
	

}

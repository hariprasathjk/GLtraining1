package com.project.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quickview {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@title='Printed Summer Dress'])[1]")
	private WebElement quick;
	public quickview(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getQuick() {
		return quick;
	}

}

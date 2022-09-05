package com.project.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer {
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
	private WebElement summer;
	public Summer(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSummer() {
		return summer;
	}

}

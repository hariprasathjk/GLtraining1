package com.project.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectingitemsspec {
	public WebDriver driver;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement qty;
	public WebElement getQty() {
		return qty;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	@FindBy(xpath = "//*[@id=\"group_1\"]")
	private WebElement size;
	@FindBy(id = "color_14")
	private WebElement color;
	@FindBy(id = "add_to_cart")
	private WebElement addtocart;
	public Selectingitemsspec(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}
	
	

}

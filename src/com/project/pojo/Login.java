package com.project.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.copy.Baseclass;

public class Login  extends Baseclass{
	public WebDriver driver;
	@FindBy(id = "email")
	private WebElement email;
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span" )
	private WebElement signin;
	
	

}

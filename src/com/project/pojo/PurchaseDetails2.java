package com.project.pojo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseDetails2 extends Baseclass{

	private static String value;

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
getbrowser("chrome");
		
geturl("http://automationpractice.com/index.php");
		
implict(30, TimeUnit.SECONDS);
		

		
        Sign_in sn=new Sign_in(driver);
		clickonelement(sn.getSignin());
		
		Login ln=new Login(driver);
		inputvalueelement(ln.getEmail(), "hariprasathj42@gmail.com");
        inputvalueelement(ln.getPassword(),"harsha" );
        clickonelement(ln.getSignin());
        
        Dresses d=new Dresses(driver);
        clickonelement(d.getDress());
		
		Summer su=new Summer(driver);
		clickonelement(su.getSummer());

		WebElement quick = driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[1]"));
		clickonelement(quick);
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Printed Summer Dress'])[1]")));
		
	    driver.switchTo().frame(0);
	    Selectingitemsspec ss=new Selectingitemsspec(driver);
        clickonelement(ss.getQty());
        dropdownselect(ss.getSize(), "byvalue", "2");
		clickonelement(ss.getColor());
        clickonelement(ss.getAddtocart());
frames("default", value);

		WebElement prcd1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
				clickonelement(prcd1);

		WebElement procd2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		clickonelement(procd2);

		WebElement procd3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		clickonelement(procd3);
		
		WebElement agree = driver.findElement(By.id("uniform-cgv"));
	    clickonelement(agree);
	    
		WebElement procd4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		clickonelement(procd4);

		WebElement check = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickonelement(check);

		WebElement orderconform = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		clickonelement(orderconform);

		WebElement backto = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickonelement(backto);

		
		takescreenshot("C:\\Users\\Suriya prasath j\\eclipse-workspace\\MiniProject\\screenshot2\\purchase.png");
		
		WebElement returnhome = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[15]"));
		clickonelement(returnhome);
		
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		movetoelement(women);
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		clickonelement(tshirt);
		
		WebElement sleeve = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[1]"));
		clickonelement(sleeve);
		Thread.sleep(5000);
		
		frames("index", "0");
		
		WebElement qty = driver.findElement(By.xpath("(//a[@class='btn btn-default button-plus product_quantity_up'])[1]"));
		clickonelement(qty);
		
		WebElement sizE = driver.findElement(By.id("group_1"));
		dropdownselect(sizE, "byvalue", "3");
		
		
		WebElement colr2 = driver.findElement(By.id("color_14"));
		clickonelement(colr2);
		
		WebElement cart2 = driver.findElement(By.id("add_to_cart"));
		clickonelement(cart2);
		frames("default", value);
		
		WebElement pd1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonelement(pd1);
		
		WebElement pd2 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		clickonelement(pd2);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement ag2 = driver.findElement(By.id("uniform-cgv"));
		clickonelement(ag2);

		
		WebElement pd3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		clickonelement(pd3);
		
		WebElement bankwre = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickonelement(bankwre);
		
		WebElement cfmorder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickonelement(cfmorder);
		
		WebElement bkorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickonelement(bkorder);
		
		takescreenshot("C:\\\\Users\\\\Suriya prasath j\\\\eclipse-workspace\\\\MiniProject\\\\screenshot2\\\\purchase2.png");
		
		WebElement hm2 = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[17]"));
		clickonelement(hm2);
		
		
		
		
		
	}

}

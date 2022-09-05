package com.automation.baseclass.copy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseDetails2 extends Baseclass{

	private static String value;

	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	
getbrowser("chrome");
		//driver.get("http://automationpractice.com/index.php");
geturl("http://automationpractice.com/index.php");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
implict(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		//signin.click();
		clickonelement(signin);

		WebElement mail = driver.findElement(By.id("email"));
		//mail.sendKeys("hariprasathj42@gmail.com");
		inputvalueelement(mail, "hariprasathj42@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		//password.sendKeys("harsha");
		inputvalueelement(password,"harsha" );

		WebElement inn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		//inn.click();
		clickonelement(inn);

		WebElement dress = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		//dress.click();
		clickonelement(dress);
		
		WebElement summer = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a"));
		//summer.click();
		clickonelement(summer);

		WebElement quick = driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[1]"));
		//quick.click();
		clickonelement(quick);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Printed Summer Dress'])[1]")));
	
		//driver.switchTo().frame(0);
		frames("index","0" );

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		//plus.click();
		clickonelement(plus);

		WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		//Select sc = new Select(size);
		//sc.selectByValue("2");
		dropdownselect(size, "byvalue", "2");
		
		WebElement colour = driver.findElement(By.id("color_14"));
		//colour.click();
		clickonelement(colour);

		WebElement addcart = driver.findElement(By.id("add_to_cart"));
		//addcart.click();
		clickonelement(addcart);

		//driver.switchTo().defaultContent();
		frames("default", value);

		WebElement prcd1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		//prcd1.click();
		clickonelement(prcd1);

		WebElement procd2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		//procd2.click();
		clickonelement(procd2);

		WebElement procd3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		//procd3.click();
clickonelement(procd3);
		WebElement agree = driver.findElement(By.id("uniform-cgv"));
		//agree.click();
clickonelement(agree);
		WebElement procd4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		//procd4.click();
		clickonelement(procd4);

		WebElement check = driver.findElement(By.xpath("//a[@class='cheque']"));
		//check.click();
		clickonelement(check);

		WebElement orderconform = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		//orderconform.click();
		clickonelement(orderconform);

		WebElement backto = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		//backto.click();
		clickonelement(backto);

		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(org".openqa.selenium.OutputType.FILE);
		//File destination = new File("C:\\Users\\Suriya prasath j\\eclipse-workspace\\MiniProject\\screenshot2\\purchase.png");
		//FileUtils.copyFile(source, destination);
		takescreenshot("C:\\Users\\Suriya prasath j\\eclipse-workspace\\MiniProject\\screenshot2\\purchase.png");
		
		WebElement returnhome = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[15]"));
		//returnhome.click();
		clickonelement(returnhome);
		
		//Actions ac=new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		//ac.moveToElement(women).build().perform();
		
movetoelement(women);
		
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		//tshirt.click();
		clickonelement(tshirt);
		
		WebElement sleeve = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[1]"));
		//sleeve.click();
		clickonelement(sleeve);
		Thread.sleep(5000);
		
		//driver.switchTo().frame(0);
		frames("index", "0");
		
		WebElement qty = driver.findElement(By.xpath("(//a[@class='btn btn-default button-plus product_quantity_up'])[1]"));
		//qty.click();
		clickonelement(qty);
		
		WebElement sizE = driver.findElement(By.id("group_1"));
		//Select sc1=new Select(sizE);
		//sc1.selectByValue("3");
		dropdownselect(sizE, "byvalue", "3");
		
		
		WebElement colr2 = driver.findElement(By.id("color_14"));
		//colr2.click();
		clickonelement(colr2);
		
		WebElement cart2 = driver.findElement(By.id("add_to_cart"));
		//cart2.click();
		clickonelement(cart2);
		
		//driver.switchTo().defaultContent();
		frames("default", value);
		
		
		WebElement pd1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		//pd1.click();
		clickonelement(pd1);
		
		WebElement pd2 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		//pd2.click();
		clickonelement(pd2);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement ag2 = driver.findElement(By.id("uniform-cgv"));
		//ag2.click();
		clickonelement(ag2);

		
		WebElement pd3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		//pd3.click();
		clickonelement(pd3);
		
		WebElement bankwre = driver.findElement(By.xpath("//a[@class='bankwire']"));
		//bankwre.click();
		clickonelement(bankwre);
		
		WebElement cfmorder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		//cfmorder.click();
		clickonelement(cfmorder);
		
		WebElement bkorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		//bkorder.click();
		clickonelement(bkorder);
		
		//TakesScreenshot ts1 = (TakesScreenshot) driver;
		//File sou= ts1.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		//File dest = new File("C:\\Users\\Suriya prasath j\\eclipse-workspace\\MiniProject\\screenshot2\\purchase2.png");
		//FileUtils.copyFile(sou, dest);
		takescreenshot("C:\\\\Users\\\\Suriya prasath j\\\\eclipse-workspace\\\\MiniProject\\\\screenshot2\\\\purchase2.png");
		
		WebElement hm2 = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[17]"));
		//hm2.click();
		clickonelement(hm2);
		
		
		
		
		
	}

}

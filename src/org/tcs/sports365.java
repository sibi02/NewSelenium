package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumutilities.SeleiniumBaseClass;

public class sports365 extends SeleiniumBaseClass {
	public static void main(String[] args) {
		Seleniumchromelaunch();
//		seleniumFirefoxlaunch();
		
		seleniumLoadurl("https://www.sports365.in/");
		
		driver.manage().window().maximize();
		
		seleniumTitle();
		
		
		Actions a = new Actions(driver);
		WebElement rocket = driver.findElement(By.xpath("//span[text()='Racket Sports']"));
		a.moveToElement(rocket).perform();
		driver.navigate().refresh();
		
		
		
		WebElement rac = driver.findElement(By.xpath("(//span[text()='Tennis'])[2]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", rac);
		seleniumJavaBtn(rac);
		driver.close();
		
	}
}

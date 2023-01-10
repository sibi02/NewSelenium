package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumutilities.SeleiniumBaseClass;

public class OtherSample extends SeleiniumBaseClass {
	public static void main(String[] args) {
		Seleniumchromelaunch();
		
		seleniumLoadurl("https://demo.guru99.com/test/drag_drop.html");
		
		seleniumTitle();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		seleniumMax();
		
		WebElement creditamnt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amount1 = driver.findElement(By.id("amt7"));
		WebElement amount2 = driver.findElement(By.id("amt8"));
		WebElement ban = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bandrag = driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
		WebElement sal = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement saldrag = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(creditamnt, amount1).perform();
		a.dragAndDrop(creditamnt, amount2).perform();
		a.dragAndDrop(ban, bandrag).perform();
		a.dragAndDrop(sal, saldrag).perform();
		
		driver.quit();
	}
	
}

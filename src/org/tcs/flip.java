package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumutilities.SeleiniumBaseClass;

public class flip extends SeleiniumBaseClass{
	public static void main(String[] args) throws InterruptedException {
		Seleniumchromelaunch();
		seleniumLoadurl("https://www.flipkart.com/");
		seleniumTitle();
		seleniumMax();
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//a[text()='Login']"));
		seleniumClick(a);
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		b.sendKeys("soisdhoqiechc");
		
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		seleniumJavaSpTxtuser(c, "8976542130");
		
	}
}

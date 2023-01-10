package org.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.seleniumutilities.SeleiniumBaseClass;

public class Sample extends SeleiniumBaseClass{
	public static void main(String[] args) throws InterruptedException {
		
//		Seleniumchromelaunch();
//		
//		seleniumLoadurl("https://www.zara.com/in/");
//		
//		driver.manage().window().maximize();
//		
//		seleniumTitle();
//		
//		 WebElement menu = driver.findElement(By.cssSelector("span[class=layout-header-search-bar__text]"));
//		    Actions a = new Actions(driver);
//		    a.doubleClick(menu).perform();
//		 	
//		WebElement trend = driver.findElement(By.xpath("(//button[@class='search-products-view__trends-item-btn'])[1]"));
//		trend.click();
//		
//		driver.findElement(By.xpath("//button[@class='filters__button']")).click();
//		driver.findElement(By.xpath("(//div[@class='form-input filters-panel-group__value'])[7]")).click();
//		
//		
//		Thread.sleep(5000);
//		driver.close();
//		
//		String[] array= new String[] {"a","b","c"};
//		List<String> li1 = Arrays.asList(array);
//		List<String> li2 = new ArrayList<String>(Arrays.asList(array));
//		List<String> li3 = new ArrayList<>(Arrays.asList("a", new String("b"),"c"));
//		
//		System.out.println(li1.equals(li2));
//		System.out.println(li1.equals(li3));
		
		
		
		Seleniumchromelaunch();
		seleniumLoadurl("https://www.crazysales.com.au/");
		
		WebElement div = driver.findElement(By.xpath("//a[text()='Help']"));
		System.out.println(div.getCssValue("font-weight"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

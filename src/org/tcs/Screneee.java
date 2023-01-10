package org.tcs;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screneee {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIBI\\eclipse-workspace\\Selenium\\drivers\\chromedriver v-94.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		
		List<WebElement> rows = table.findElements(By.tagName("//tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> datas = row.findElements(By.tagName("//td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement heading = datas.get(j);
				String text = heading.getText();
				System.out.println(text);
			}
			
		}
	}
}
